package car_rent;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

	public void Location ()
	{
			driver_frame = new JFrame ();
			driver_frame.getContentPane().setBackground(Color.WHITE);
			driver_frame.setSize(1200,700);
			driver_frame.getContentPane().setLayout(null);
			
			p = new JPanel();
			p.setBackground(new Color(178, 34, 34));
			p.setBounds(0, 0, 300, 663);
			driver_frame.getContentPane().add(p);
			
			Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
			
			pickup_label = new JLabel("Pick-Up Location");
			pickup_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
			pickup_label.setHorizontalAlignment(SwingConstants.CENTER);
			pickup_label.setForeground(new Color(178, 34, 34));
			pickup_label.setBackground(Color.WHITE);
			pickup_label.setBounds(679, 141, 160, 50);
			driver_frame.getContentPane().add(pickup_label);
			
			drop_label = new JLabel("Drop Location");
			drop_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
			drop_label.setHorizontalAlignment(SwingConstants.CENTER);
			drop_label.setForeground(new Color(178, 34, 34));
			drop_label.setBackground(Color.WHITE);
			drop_label.setBounds(667, 215, 160, 50);
			driver_frame.getContentPane().add(drop_label);
			
			pickup_textfield = new JTextField();
			pickup_textfield.setBackground(Color.WHITE);
			pickup_textfield.setBounds(863, 148, 250, 45);
			pickup_textfield.setBorder(border);
			driver_frame.getContentPane().add(pickup_textfield);
			pickup_textfield.setColumns(10);
			
			drop_textfield = new JTextField();
			drop_textfield.setBackground(Color.WHITE);
			drop_textfield.setBounds(863, 222, 250, 45);
			drop_textfield.setBorder(border);
			driver_frame.getContentPane().add(drop_textfield);
			drop_textfield.setColumns(10);
			
			location_button = new JButton("Location");
			location_button.setForeground(new Color(178, 34, 34));
			location_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
			location_button.setBackground(Color.WHITE);
			
			location_button.setBounds(477, 178, 160, 40);
			location_button.setBorder(border);
			driver_frame.getContentPane().add(location_button);
			
			date_button = new JButton("Date");
			date_button.setForeground(new Color(178, 34, 34));
			date_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
			date_button.setBackground(Color.WHITE);
			
			date_button.setBounds(477, 374, 160, 40);
			date_button.setBorder(border);
			driver_frame.getContentPane().add(date_button);
			
			pick_date = new JTextField();
			pick_date.setBackground(Color.WHITE);
			pick_date.setBounds(863, 347, 250, 45);
			pick_date.setBorder(border);
			driver_frame.getContentPane().add(pick_date);
			pick_date.setColumns(10);
			
			drop_date = new JTextField();
			drop_date.setBackground(Color.WHITE);
			drop_date.setBounds(863, 425, 250, 45);
			drop_date.setBorder(border);
			driver_frame.getContentPane().add(drop_date);
			drop_date.setColumns(10);
			
			JButton proceed_button = new JButton("Proceed");
			proceed_button.setForeground(new Color(178, 34, 34));
			proceed_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
			proceed_button.setBackground(Color.WHITE);
			proceed_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(driver_frame,"You have accepted the booking");
					//JOptionPane.showMessageDialog(driver_frame, "You will pick up"+name_array.get(I)+"on "+pickup_array.get(I));
					
				}
			});
			proceed_button.setBounds(948, 579, 180, 50);
			proceed_button.setBorder(border);
			driver_frame.getContentPane().add(proceed_button);
			
			JButton back_button = new JButton("Back");
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
			back_button.setBounds(746, 579, 180, 50);
			back_button.setBorder(border);
			driver_frame.getContentPane().add(back_button);
			
			pick_up_date_label = new JLabel("Pick-Up Date");
			pick_up_date_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
			pick_up_date_label.setHorizontalAlignment(SwingConstants.CENTER);
			pick_up_date_label.setForeground(new Color(178, 34, 34));
			pick_up_date_label.setBackground(Color.WHITE);
			pick_up_date_label.setBounds(695, 347, 160, 50);
			driver_frame.getContentPane().add(pick_up_date_label);
			
			drop_date_label = new JLabel("Drop Date");
			drop_date_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
			drop_date_label.setHorizontalAlignment(SwingConstants.CENTER);
			drop_date_label.setForeground(new Color(178, 34, 34));
			drop_date_label.setBackground(Color.WHITE);
			drop_date_label.setBounds(695, 418, 160, 50);
			driver_frame.getContentPane().add(drop_date_label);
			
			image_location = new JLabel("");
			image_location.setIcon(new ImageIcon("F:\\CRS\\pin.png"));
			image_location.setFont(new Font("Tahoma", Font.BOLD, 40));
			image_location.setForeground(new Color(178, 34, 34));
			image_location.setHorizontalAlignment(SwingConstants.CENTER);
			image_location.setBounds(379, 167, 50, 69);
			driver_frame.getContentPane().add(image_location);
			
			image_date = new JLabel("");
			image_date.setIcon(new ImageIcon("F:\\CRS\\calendar.png"));
			image_date.setHorizontalAlignment(SwingConstants.CENTER);
			image_date.setForeground(new Color(178, 34, 34));
			image_date.setFont(new Font("Tahoma", Font.BOLD, 40));
			image_date.setBounds(391, 374, 50, 50);
			driver_frame.getContentPane().add(image_date);
			
			exit = new JLabel("X");
			exit.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				  System.exit(0);
				}
			});
			exit.setHorizontalAlignment(SwingConstants.CENTER);
			exit.setForeground(new Color(178, 34, 34));
			exit.setFont(new Font("Tahoma", Font.BOLD, 40));
			exit.setBounds(1136, 0, 50, 50);
			driver_frame.getContentPane().add(exit);
			
			home = new JLabel("");
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
			home.setBounds(1078, 0, 50, 50);
			driver_frame.getContentPane().add(home);
			driver_frame.setVisible(true);
			
			Car_Booking c =new Car_Booking();
			this.pickup_array =c.pickup_array;
			this.drop_array=c.drop_array;
			this.pickup_date_array = c.pickup_date_array;
			this.drop_date_array =c.drop_date_array;
            
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