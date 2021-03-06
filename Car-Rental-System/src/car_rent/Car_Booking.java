package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Car_Booking 
{

	JFrame carbooking_frame ;
	
	public void book_car()
	{
		carbooking_frame = new JFrame();
		carbooking_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 0));
		panel.setBounds(0, 0, 262, 548);
		carbooking_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(260, 0, 681, 548);
		carbooking_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Scorpio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBackground(new Color(153, 0, 0));
		btnNewButton.setBounds(210, 138, 169, 51);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Fortuner");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(153, 0, 0));
		btnNewButton_1.setBounds(210, 273, 162, 51);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Hector");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_2.setBackground(new Color(153, 0, 0));
		btnNewButton_2.setBounds(210, 424, 169, 51);
		panel_1.add(btnNewButton_2);
		carbooking_frame.setSize(955, 585);
	}
	
	public static void main(String[] args)
	{
		Car_Booking cb = new Car_Booking();
	    cb.book_car();
	}


}
