package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Car  
{
	JFrame car_frame ;
	
	public void show_car()
	{
		car_frame = new JFrame ();
		car_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 0));
		panel.setBounds(0, 0, 258, 548);
		car_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(259, 0, 682, 548);
		car_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("SUV");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBackground(new Color(153, 0, 0));
		btnNewButton.setBounds(247, 105, 162, 56);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SEDAN");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(153, 0, 0));
		btnNewButton_1.setBounds(247, 265, 162, 56);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Hatchback");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_2.setBackground(new Color(153, 0, 0));
		btnNewButton_2.setBounds(247, 409, 162, 56);
		panel_1.add(btnNewButton_2);
		car_frame.setSize(955, 585);
	}
	
	public static void main(String[] args)
	{
		Car cr = new Car();
		cr.show_car();
	}

	

}
