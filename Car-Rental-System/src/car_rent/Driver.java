package car_rent;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

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
	private JLabel pick_up_date_label;
	private JLabel drop_date_label;
	private JLabel image_location;
	private JLabel image_date;
	private JLabel exit;
	private JLabel home;
	private JPanel panel;

	public void Location ()
	{
			driver_frame = new JFrame ();
			driver_frame.getContentPane().setBackground(Color.WHITE);
			driver_frame.setSize(1200,700);
			driver_frame.getContentPane().setLayout(null);
			
			p = new JPanel();
			p.setBackground(new Color(178, 34, 34));
			p.setBounds(0, 0, 300, 700);
			driver_frame.getContentPane().add(p);
			p.setLayout(null);
			
			Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
			
			panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(178, 34, 34), 2));
			panel.setBackground(Color.WHITE);
			panel.setBounds(281, 0, 919, 700);
			driver_frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			home = new JLabel("");
			home.setBounds(818, 0, 50, 50);
			panel.add(home);
			home.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				    User u = new User();
				    u.first_page();
				}
			});
			home.setIcon(new ImageIcon("F:\\CRS\\home (2).png"));
			home.setHorizontalAlignment(SwingConstants.CENTER);
			home.setForeground(new Color(178, 34, 34));
			home.setFont(new Font("Tahoma", Font.BOLD, 40));
			
			image_location = new JLabel("");
			image_location.setBounds(99, 191, 50, 69);
			panel.add(image_location);
			image_location.setIcon(new ImageIcon("F:\\CRS\\pin.png"));
			image_location.setFont(new Font("Tahoma", Font.BOLD, 40));
			image_location.setForeground(new Color(178, 34, 34));
			image_location.setHorizontalAlignment(SwingConstants.CENTER);
			
			image_date = new JLabel("");
			image_date.setBounds(99, 434, 50, 50);
			panel.add(image_date);
			image_date.setIcon(new ImageIcon("F:\\CRS\\calendar.png"));
			image_date.setHorizontalAlignment(SwingConstants.CENTER);
			image_date.setForeground(new Color(178, 34, 34));
			image_date.setFont(new Font("Tahoma", Font.BOLD, 40));
			
			exit = new JLabel("X");
			exit.setBounds(869, 0, 50, 50);
			panel.add(exit);
			exit.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				  System.exit(0);
				}
			});
			exit.setHorizontalAlignment(SwingConstants.CENTER);
			exit.setForeground(new Color(178, 34, 34));
			exit.setFont(new Font("Tahoma", Font.BOLD, 40));
			
			location_button = new JButton("Location");
			location_button.setBounds(193, 204, 160, 40);
			panel.add(location_button);
			location_button.setForeground(new Color(178, 34, 34));
			location_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
			location_button.setBackground(Color.WHITE);
			location_button.setBorder(border);
			
			date_button = new JButton("Date");
			date_button.setBounds(193, 434, 160, 40);
			panel.add(date_button);
			date_button.setForeground(new Color(178, 34, 34));
			date_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
			date_button.setBackground(Color.WHITE);
			date_button.setBorder(border);
			
			drop_label = new JLabel("Drop Location");
			drop_label.setBounds(367, 236, 160, 50);
			panel.add(drop_label);
			drop_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
			drop_label.setHorizontalAlignment(SwingConstants.CENTER);
			drop_label.setForeground(new Color(178, 34, 34));
			drop_label.setBackground(Color.WHITE);
			
			pickup_label = new JLabel("Pick-Up Location");
			pickup_label.setBounds(367, 147, 160, 50);
			panel.add(pickup_label);
			pickup_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
			pickup_label.setHorizontalAlignment(SwingConstants.CENTER);
			pickup_label.setForeground(new Color(178, 34, 34));
			pickup_label.setBackground(Color.WHITE);
			
			pickup_textfield = new JTextField();
			pickup_textfield.setBounds(558, 154, 250, 45);
			panel.add(pickup_textfield);
			pickup_textfield.setBackground(Color.WHITE);
			pickup_textfield.setBorder(border);
			pickup_textfield.setColumns(10);
			
			drop_textfield = new JTextField();
			drop_textfield.setBounds(558, 243, 250, 45);
			panel.add(drop_textfield);
			drop_textfield.setBackground(Color.WHITE);
			drop_textfield.setBorder(border);
			drop_textfield.setColumns(10);
			
			JButton back_button = new JButton("Back");
			back_button.setBounds(482, 625, 180, 50);
			panel.add(back_button);
			back_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pickup_textfield.setText(" ");
					drop_textfield.setText(" ");
					pick_date.setText(" ");
					drop_date.setText(" ");
				}
			});
			back_button.setForeground(new Color(178, 34, 34));
			back_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
			back_button.setBackground(Color.WHITE);
			back_button.setBorder(border);
			
			JButton proceed_button = new JButton("Proceed");
			proceed_button.setBounds(688, 625, 180, 50);
			panel.add(proceed_button);
			proceed_button.setForeground(new Color(178, 34, 34));
			proceed_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
			proceed_button.setBackground(Color.WHITE);
			proceed_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(driver_frame,"You have accepted the booking");
					//JOptionPane.showMessageDialog(driver_frame, "You will pick up"+name_array.get(I)+"on "+pickup_array.get(I));
					
				}
			});
			proceed_button.setBorder(border);
			
			drop_date = new JTextField();
			drop_date.setBounds(558, 472, 250, 45);
			panel.add(drop_date);
			drop_date.setBackground(Color.WHITE);
			drop_date.setBorder(border);
			drop_date.setColumns(10);
			
			pick_date = new JTextField();
			pick_date.setBounds(558, 390, 250, 45);
			panel.add(pick_date);
			pick_date.setBackground(Color.WHITE);
			pick_date.setBorder(border);
			pick_date.setColumns(10);
			
			pick_up_date_label = new JLabel("Pick-Up Date");
			pick_up_date_label.setBounds(378, 383, 160, 50);
			panel.add(pick_up_date_label);
			pick_up_date_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
			pick_up_date_label.setHorizontalAlignment(SwingConstants.CENTER);
			pick_up_date_label.setForeground(new Color(178, 34, 34));
			pick_up_date_label.setBackground(Color.WHITE);
			
			drop_date_label = new JLabel("Drop Date");
			drop_date_label.setBounds(378, 465, 160, 50);
			panel.add(drop_date_label);
			drop_date_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
			drop_date_label.setHorizontalAlignment(SwingConstants.CENTER);
			drop_date_label.setForeground(new Color(178, 34, 34));
			drop_date_label.setBackground(Color.WHITE);
			
			date_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	                            pick_date.setText(pickup_array.get(I));
	                            drop_date.setText(drop_array.get(I));
				}
			});
			
			location_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						pickup_textfield.setText(pickup_array.get(I));
						drop_textfield.setText(drop_array.get(I));
				}
			});
			
			Car_Booking c =new Car_Booking();
			this.pickup_array =c.pickup_array;
			this.drop_array=c.drop_array;
			this.pickup_date_array = c.pickup_date_array;
			this.drop_date_array =c.drop_date_array;
			I=I+1;
			
	    driver_frame.setUndecorated(true);
	    driver_frame.setVisible(true);
	         
	}
	
	public static void main(String[] args) 
	{
		Driver d =new Driver();
		d.Location();		
	}
}