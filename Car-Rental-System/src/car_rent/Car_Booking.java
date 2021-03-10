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
import javax.swing.border.LineBorder;

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
		panel.setBounds(0, 0, 300, 700);
		carbooking_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
				
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(178, 34, 34), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(267, 0, 933, 700);
		carbooking_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
				
	    JLabel pickup_label = new JLabel("Pick-Up Location");
				pickup_label.setBounds(283, 137, 215, 50);
				panel_1.add(pickup_label);
				pickup_label.setHorizontalAlignment(SwingConstants.CENTER);
				pickup_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
				pickup_label.setBackground(Color.WHITE);
				
				JLabel drop_label = new JLabel("Drop Location");
				drop_label.setBounds(271, 233, 215, 50);
				panel_1.add(drop_label);
				drop_label.setHorizontalAlignment(SwingConstants.CENTER);
				drop_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
				drop_label.setBackground(Color.WHITE);
				
				JLabel pickup_date_label = new JLabel("Pick-Up Date");
				pickup_date_label.setBounds(293, 403, 215, 50);
				panel_1.add(pickup_date_label);
				pickup_date_label.setHorizontalAlignment(SwingConstants.CENTER);
				pickup_date_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
				pickup_date_label.setBackground(Color.WHITE);
				
				JLabel drop_date_label = new JLabel("Drop Date");
				drop_date_label.setBounds(283, 493, 215, 50);
				panel_1.add(drop_date_label);
				drop_date_label.setHorizontalAlignment(SwingConstants.CENTER);
				drop_date_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
				drop_date_label.setBackground(Color.WHITE);
				
				JButton proceed_button = new JButton("Proceed");
				proceed_button.setBounds(710, 615, 180, 50);
				panel_1.add(proceed_button);
				proceed_button.setForeground(new Color(178, 34, 34));
				proceed_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
				proceed_button.setBackground(Color.WHITE);
			
				proceed_button.setBorder(border);
				
				JButton back_button = new JButton("Back");
				back_button.setBounds(495, 615, 180, 50);
				panel_1.add(back_button);
				back_button.setForeground(new Color(178, 34, 34));
				back_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
				back_button.setBackground(Color.WHITE);
				back_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					      Car c =new Car();
					      c.show_car();
					}
				});
				back_button.setBorder(border);
				
				JDateChooser pickup_date = new JDateChooser();
				pickup_date.setBounds(518, 403, 300, 50);
				panel_1.add(pickup_date);
				pickup_date.setDateFormatString("dd-MMMM-yyyy");
				pickup_date.setBorder(border);
				
						JDateChooser drop_date = new JDateChooser();
						drop_date.setBounds(518, 493, 300, 50);
						panel_1.add(drop_date);
						drop_date.setBorder(border);
						drop_date.setDateFormatString("dd-MMMM-yyyy");	
						
						pickup_textfield = new JTextField();
						pickup_textfield.setBounds(518, 137, 300, 50);
						panel_1.add(pickup_textfield);
						pickup_textfield.setBorder(border);
						pickup_textfield.setColumns(10);
						
						drop_textfield = new JTextField();
						drop_textfield.setBounds(518, 233, 300, 50);
						panel_1.add(drop_textfield);
						drop_textfield.setBorder(border);
						drop_textfield.setColumns(10);
						
						JLabel home = new JLabel("");
						home.setBounds(827, 0, 50, 50);
						panel_1.add(home);
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
						
						JLabel exit = new JLabel("X");
						exit.setBounds(875, 0, 58, 50);
						panel_1.add(exit);
						exit.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								System.exit(0);
							}
						});
						exit.setFont(new Font("Tahoma", Font.BOLD, 40));
						exit.setForeground(new Color(178, 34, 34));
						exit.setHorizontalAlignment(SwingConstants.CENTER);
						
						JLabel image_location = new JLabel("");
						image_location.setBounds(201, 175, 58, 70);
						panel_1.add(image_location);
						image_location.setIcon(new ImageIcon("E:\\Downloads\\pin.png"));
						image_location.setHorizontalAlignment(SwingConstants.CENTER);
						
						JLabel image_date = new JLabel("");
						image_date.setBounds(201, 449, 58, 50);
						panel_1.add(image_date);
						image_date.setIcon(new ImageIcon("E:\\Downloads\\calendar.png"));
						image_date.setHorizontalAlignment(SwingConstants.CENTER);
						
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
		
		carbooking_frame.setUndecorated(true);
		carbooking_frame.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		Car_Booking c = new Car_Booking();
	    c.book_car();
	}
}
