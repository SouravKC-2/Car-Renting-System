package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Driver
{
    JFrame driver_frame ;
	JButton date_button , location_button ;
	JTextField pickup_textfield , drop_textfield , pick_date ;
	JLabel pickup_label , drop_label ;
    JPanel p ;
    ArrayList<String> driver_array = new ArrayList<String>();
    ArrayList<String> pickup_array = new ArrayList<String>();
	ArrayList<String> drop_array = new ArrayList<String>();
	ArrayList<String> pickup_date_array = new ArrayList<String>();
	ArrayList<String> drop_date_array = new ArrayList<String>();
	int I=0;
	private JTextField drop_date;

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
			
			pick_date = new JTextField();
			pick_date.setBounds(509, 350, 96, 19);
			driver_frame.getContentPane().add(pick_date);
			pick_date.setColumns(10);
			
			drop_date = new JTextField();
			drop_date.setBounds(509, 412, 96, 19);
			driver_frame.getContentPane().add(drop_date);
			drop_date.setColumns(10);
			
			JButton btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(driver_frame,"You have accepted the booking");
					//JOptionPane.showMessageDialog(driver_frame, "You will pick up"+name_array.get(I)+"on "+pickup_array.get(I));
					
				}
			});
			btnNewButton.setBounds(550, 499, 85, 21);
			driver_frame.getContentPane().add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("New button");
			btnNewButton_1.setBounds(682, 499, 85, 21);
			driver_frame.getContentPane().add(btnNewButton_1);
			driver_frame.setVisible(true);
			
			Car_Booking c =new Car_Booking();
			pickup_array =c.pickup_array;
			drop_array=c.drop_array;
			pickup_date_array = c.pickup_date_array;
			drop_date_array =c.drop_date_array;
            
			location_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						pickup_textfield.setText(pickup_array.get(I));
						drop_textfield.setText(drop_array.get(I));
				}
			});
			
			date_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	                            pick_date.setText(pickup_array.get(I));
	                            drop_date.setText(drop_array.get(I));
				}
			});
			I=I+1;
	         
	}
	
	public static void main(String[] args) 
	{
		Driver d =new Driver();
		d.Location();		
	}
}