package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Driver 
{
	JFrame driver_frame ;

	public void location()
	{
		driver_frame = new JFrame ();
		driver_frame.getContentPane().setBackground(Color.WHITE);
		driver_frame.setSize(955, 585);
		driver_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 0));
		panel.setBounds(0, 0, 279, 548);
		driver_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(276, 0, 665, 548);
		driver_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(new Color(153, 0, 0));
		btnNewButton.setBounds(345, 106, 89, 23);
		panel_1.add(btnNewButton);
		driver_frame.setVisible(false);
		
	   }

	
	public static void main(String[] args) 
	{
		Driver d =new Driver();
		d.location();
	       }



    }  // End of DRIVER CLASS
