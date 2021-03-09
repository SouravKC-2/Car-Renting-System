package car_rent;

import javax.swing.*;
import javax.swing.border.Border;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		carbooking_frame.getContentPane().setBackground(Color.WHITE);
		carbooking_frame.getContentPane().setLayout(null);
		carbooking_frame.setSize(1200,700);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 300, 663);
		carbooking_frame.getContentPane().add(panel);
		carbooking_frame.setVisible(true);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		JLabel pickup_label = new JLabel("Pick-Up Location");
		pickup_label.setHorizontalAlignment(SwingConstants.CENTER);
		pickup_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pickup_label.setBackground(Color.WHITE);
		pickup_label.setBounds(489, 127, 215, 50);
		carbooking_frame.getContentPane().add(pickup_label);
		
		JLabel drop_label = new JLabel("Drop Location");
		drop_label.setHorizontalAlignment(SwingConstants.CENTER);
		drop_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		drop_label.setBackground(Color.WHITE);
		drop_label.setBounds(472, 233, 215, 50);
		carbooking_frame.getContentPane().add(drop_label);
		
		pickup_textfield = new JTextField();
		pickup_textfield.setBounds(761, 140, 300, 50);
		pickup_textfield.setBorder(border);
		carbooking_frame.getContentPane().add(pickup_textfield);
		pickup_textfield.setColumns(10);
		
		drop_textfield = new JTextField();
		drop_textfield.setBounds(761, 233, 300, 50);
		drop_textfield.setBorder(border);
		carbooking_frame.getContentPane().add(drop_textfield);
		drop_textfield.setColumns(10);
		
		JLabel pickup_date_label = new JLabel("Pick-Up Date");
		pickup_date_label.setHorizontalAlignment(SwingConstants.CENTER);
		pickup_date_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pickup_date_label.setBackground(Color.WHITE);
		pickup_date_label.setBounds(472, 339, 215, 50);
		carbooking_frame.getContentPane().add(pickup_date_label);
		
		JLabel drop_date_label = new JLabel("Drop Date");
		drop_date_label.setHorizontalAlignment(SwingConstants.CENTER);
		drop_date_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		drop_date_label.setBackground(Color.WHITE);
		drop_date_label.setBounds(472, 455, 215, 50);
		carbooking_frame.getContentPane().add(drop_date_label);
		
		JDateChooser pickup_date = new JDateChooser();
		pickup_date.setBounds(761, 339, 300, 50);
		pickup_date.setDateFormatString("dd-MMMM-yyyy");
		pickup_date.setBorder(border);
		carbooking_frame.getContentPane().add(pickup_date);

		JDateChooser drop_date = new JDateChooser();
		drop_date.setBounds(761, 455, 300, 50);
		drop_date.setBorder(border);
		carbooking_frame.getContentPane().add(drop_date);
		drop_date.setDateFormatString("dd-MMMM-yyyy");	
		
		JButton proceed_button = new JButton("Proceed");
		proceed_button.setForeground(new Color(178, 34, 34));
		proceed_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		proceed_button.setBackground(Color.WHITE);
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
		
		proceed_button.setBounds(959, 581, 180, 50);
		proceed_button.setBorder(border);
		carbooking_frame.getContentPane().add(proceed_button);
		
		JButton back_button = new JButton("Back");
		back_button.setForeground(new Color(178, 34, 34));
		back_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		back_button.setBackground(Color.WHITE);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      Car c =new Car();
			      c.Visible();
			}
		});
		back_button.setBounds(729, 581, 180, 50);
		back_button.setBorder(border);
		carbooking_frame.getContentPane().add(back_button);
		
		JLabel image_location = new JLabel("");
		image_location.setIcon(new ImageIcon("E:\\Downloads\\pin.png"));
		image_location.setHorizontalAlignment(SwingConstants.CENTER);
		image_location.setBounds(417, 174, 58, 70);
		carbooking_frame.getContentPane().add(image_location);
		
		JLabel image_date = new JLabel("");
		image_date.setIcon(new ImageIcon("E:\\Downloads\\calendar.png"));
		image_date.setHorizontalAlignment(SwingConstants.CENTER);
		image_date.setBounds(417, 398, 58, 50);
		carbooking_frame.getContentPane().add(image_date);
		
		JLabel home = new JLabel("");
		home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				User u =new User();
				u.first_page();
			}
		});
		home.setIcon(new ImageIcon("E:\\Downloads\\home (4).png"));
		home.setForeground(new Color(178, 34, 34));
		home.setHorizontalAlignment(SwingConstants.CENTER);
		home.setBounds(1077, 0, 50, 50);
		carbooking_frame.getContentPane().add(home);
		
		JLabel exit = new JLabel("X");
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exit.setFont(new Font("Tahoma", Font.BOLD, 40));
		exit.setForeground(new Color(178, 34, 34));
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		exit.setBounds(1128, 0, 58, 50);
		carbooking_frame.getContentPane().add(exit);
		//carbooking_frame.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		Car_Booking c = new Car_Booking();
	    c.book_car();
	}
}
