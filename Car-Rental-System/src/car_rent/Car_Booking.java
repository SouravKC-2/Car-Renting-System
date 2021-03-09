package car_rent;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class Car_Booking 
{   
	public JFrame carbooking_frame ;
	public JTextField pickup_textfield;
	public JTextField drop_textfield;
	
	ArrayList<String> pickup_array = new ArrayList<String>();
	ArrayList<String> drop_array = new ArrayList<String>();
	ArrayList<String> pickup_date_array = new ArrayList<String>();
	ArrayList<String> drop_date_array = new ArrayList<String>();
	
	public void book_car()
	{
		carbooking_frame = new JFrame();
		carbooking_frame.getContentPane().setLayout(null);
		carbooking_frame.setSize(828, 597);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 74, 10, 10);
		carbooking_frame.getContentPane().add(panel);
		carbooking_frame.setVisible(true);
		
		JLabel pickup_label = new JLabel("New label");
		pickup_label.setBounds(288, 121, 45, 13);
		carbooking_frame.getContentPane().add(pickup_label);
		
		JLabel drop_label = new JLabel("New label");
		drop_label.setBounds(288, 220, 45, 13);
		carbooking_frame.getContentPane().add(drop_label);
		
		pickup_textfield = new JTextField();
		pickup_textfield.setBounds(413, 118, 155, 38);
		carbooking_frame.getContentPane().add(pickup_textfield);
		pickup_textfield.setColumns(10);
		
		drop_textfield = new JTextField();
		drop_textfield.setBounds(413, 217, 164, 38);
		carbooking_frame.getContentPane().add(drop_textfield);
		drop_textfield.setColumns(10);
		
		JLabel date_label = new JLabel("New label");
		date_label.setBounds(228, 400, 45, 13);
		carbooking_frame.getContentPane().add(date_label);
		
		JLabel pickup_date_label = new JLabel("New label");
		pickup_date_label.setBounds(318, 365, 45, 13);
		carbooking_frame.getContentPane().add(pickup_date_label);
		
		JLabel drop_date_label = new JLabel("New label");
		drop_date_label.setBounds(318, 467, 45, 13);
		carbooking_frame.getContentPane().add(drop_date_label);
		
		JDateChooser pickup_date = new JDateChooser();
		pickup_date.setBounds(413, 346, 178, 38);
		pickup_date.setDateFormatString("dd-MMMM-yyyy");
		carbooking_frame.getContentPane().add(pickup_date);

		JDateChooser drop_date = new JDateChooser();
		drop_date.setBounds(414, 430, 172, 38);
		carbooking_frame.getContentPane().add(drop_date);
		drop_date.setDateFormatString("dd-MMMM-yyyy");	
		
		JButton proceed_button = new JButton("New button");
		proceed_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			         pickup_array.add(pickup_textfield.getText());
			         drop_array.add(drop_textfield.getText());
			         String p =pickup_date.getDateFormatString();
			         String d = drop_date.getDateFormatString();
			         pickup_date_array.add(p);
			         drop_date_array.add(d);
			         JOptionPane.showMessageDialog(carbooking_frame,"Booking Successfull");
			}
		});
		
		proceed_button.setBounds(505, 497, 85, 21);
		carbooking_frame.getContentPane().add(proceed_button);
		
		JButton back_button = new JButton("New button");
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      Car c =new Car();
			      c.Visible();
			}
		});
		back_button.setBounds(611, 497, 85, 21);
		carbooking_frame.getContentPane().add(back_button);
		//carbooking_frame.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		Car_Booking c = new Car_Booking();
	    c.book_car();
	}
}
