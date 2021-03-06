package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Driver
{
    JFrame driver_frame ;
	JButton date_button , location_button ;
	JTextField pickup_textfield , drop_textfield , date_textfield ;
	JLabel pickup_label , drop_label ;
    JPanel p ;
	

	public void Location ()
	{
		
			driver_frame = new JFrame ();
			driver_frame.setSize(864, 581);
			driver_frame.getContentPane().setLayout(null);
			
			p = new JPanel();
			p.setBounds(0, 0, 218, 544);
			driver_frame.getContentPane().add(p);
			
			pickup_label = new JLabel("New label");
			pickup_label.setBounds(462, 131, 45, 13);
			driver_frame.getContentPane().add(pickup_label);
			
			drop_label = new JLabel("New label");
			drop_label.setBounds(462, 217, 45, 13);
			driver_frame.getContentPane().add(drop_label);
			
			pickup_textfield = new JTextField();
			pickup_textfield.setBounds(591, 131, 96, 19);
			driver_frame.getContentPane().add(pickup_textfield);
			pickup_textfield.setColumns(10);
			
			drop_textfield = new JTextField();
			drop_textfield.setBounds(591, 214, 96, 19);
			driver_frame.getContentPane().add(drop_textfield);
			drop_textfield.setColumns(10);
			
			location_button = new JButton("New button");
			location_button.setBounds(278, 178, 85, 21);
			driver_frame.getContentPane().add(location_button);
			
			date_button = new JButton("New button");
			date_button.setBounds(291, 389, 85, 21);
			driver_frame.getContentPane().add(date_button);
			
			date_textfield = new JTextField();
			date_textfield.setBounds(462, 390, 96, 19);
			driver_frame.getContentPane().add(date_textfield);
			date_textfield.setColumns(10);
			driver_frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		Driver d =new Driver();
		d.Location();
		
	}

}
