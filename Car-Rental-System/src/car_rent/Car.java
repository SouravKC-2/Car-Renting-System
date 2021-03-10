package car_rent;

import javax.swing.*;
import javax.swing.border.Border;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class Car  
{
	public JFrame car_frame , sedan_frame , suv_frame , hatchback_frame ;
	public int n=0;
	ArrayList<String> car_select = new ArrayList<String>(); 
	                                               /***** SHOW CAR PAGE ******/
	public void show_car()
	{
		car_frame = new JFrame ();
		car_frame.getContentPane().setBackground(Color.WHITE);
		car_frame.setSize(1200,700);
		car_frame.getContentPane().setLayout(null);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 300, 700);
		car_frame.getContentPane().add(panel);
		panel.setBackground(new Color(178, 34, 34));
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(178, 34, 34), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(296, 0, 904, 700);
		car_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton sedan_button = new JButton("Sedan");
		sedan_button.setBounds(348, 213, 200, 70);
		panel_1.add(sedan_button);
		sedan_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sedan_button.setForeground(new Color(178, 34, 34));
		sedan_button.setBackground(Color.WHITE);
		sedan_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			       car_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    
			       sedan();
			}
		});
		sedan_button.setBorder(border);
		
		JButton hatchback_button = new JButton("Hatchback");
		hatchback_button.setBounds(348, 368, 200, 70);
		panel_1.add(hatchback_button);
		hatchback_button.setForeground(new Color(178, 34, 34));
		hatchback_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		hatchback_button.setBackground(Color.WHITE);
		hatchback_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				car_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				hatchback();
				//hatchback_frame.setVisible(true);
			}
		});
		hatchback_button.setBorder(border);
		
		JButton suv_button = new JButton("SUV");
		suv_button.setBounds(348, 517, 200, 70);
		panel_1.add(suv_button);
		suv_button.setForeground(new Color(178, 34, 34));
		suv_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		suv_button.setBackground(Color.WHITE);
		suv_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				car_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				suv();
				//suv_frame.setVisible(true);
			}
		});
		suv_button.setBorder(border);
		
		JLabel choose_label = new JLabel("Choose a Car");
		choose_label.setBounds(332, 54, 212, 99);
		panel_1.add(choose_label);
		choose_label.setBackground(Color.WHITE);
		choose_label.setForeground(new Color(178, 34, 34));
		choose_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		choose_label.setHorizontalAlignment(SwingConstants.CENTER);
		choose_label.setBorder(border);
		
		JLabel image_suv = new JLabel("");
		image_suv.setBounds(185, 517, 114, 70);
		panel_1.add(image_suv);
		image_suv.setIcon(new ImageIcon("F:\\CRS\\all-terrain-vehicle.png"));
		image_suv.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel image_hatchback = new JLabel("");
		image_hatchback.setBounds(172, 368, 114, 70);
		panel_1.add(image_hatchback);
		image_hatchback.setIcon(new ImageIcon("F:\\CRS\\car-of-hatchback-model.png"));
		image_hatchback.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel home = new JLabel("");
		home.setBounds(794, 0, 50, 50);
		panel_1.add(home);
		home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				User u =new User();
				car_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				u.first_page();
			}
		});
		home.setIcon(new ImageIcon("E:\\Downloads\\home (2).png"));
		home.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel exit = new JLabel("X");
		exit.setBounds(854, 0, 50, 50);
		panel_1.add(exit);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exit.setForeground(new Color(178, 34, 34));
		exit.setFont(new Font("Tahoma", Font.BOLD, 40));
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel image_sedan = new JLabel("");
		image_sedan.setBounds(172, 213, 114, 70);
		panel_1.add(image_sedan);
		image_sedan.setIcon(new ImageIcon("F:\\CRS\\sedan-car-model.png"));
		image_sedan.setHorizontalAlignment(SwingConstants.CENTER);
		car_frame.setUndecorated(true);
		car_frame.setVisible(true);
	    }
                                       	/*** SEDAN FUNCTION ***/
     public void sedan()
	 {
		sedan_frame = new JFrame ();
		sedan_frame.getContentPane().setBackground(Color.WHITE);
		sedan_frame.setSize(1200,700);
		sedan_frame.getContentPane().setLayout(null);
		sedan_frame.setUndecorated(true);
		sedan_frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 300, 700);
		sedan_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(178, 34, 34), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(267, 0, 933, 700);
		sedan_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton city_radiobutton = new JRadioButton("Honda City");
		city_radiobutton.setBounds(338, 199, 180, 60);
		panel_1.add(city_radiobutton);
		city_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		city_radiobutton.setForeground(new Color(178, 34, 34));
		city_radiobutton.setBackground(Color.WHITE);
		
		
		JRadioButton verna_radiobutton = new JRadioButton("Hyundai Verna");
		verna_radiobutton.setBounds(337, 309, 245, 60);
		panel_1.add(verna_radiobutton);
		verna_radiobutton.setForeground(new Color(178, 34, 34));
		verna_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verna_radiobutton.setBackground(Color.WHITE);
		
		
		JRadioButton ciaz_radiobutton = new JRadioButton("Maruti Ciaz");
		ciaz_radiobutton.setBounds(338, 426, 180, 60);
		panel_1.add(ciaz_radiobutton);
		ciaz_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ciaz_radiobutton.setForeground(new Color(178, 34, 34));
		ciaz_radiobutton.setBackground(Color.WHITE);
		
		
		JButton back_button = new JButton("Back");
		back_button.setBounds(520, 622, 180, 50);
		panel_1.add(back_button);
		back_button.setForeground(new Color(178, 34, 34));
		back_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		back_button.setBackground(Color.WHITE);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			             sedan_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			             show_car();
			             //car_frame.setVisible(true);
			}
		});
		back_button.setBorder(border);
		
		JButton proceed_button = new JButton("Proceed");
		proceed_button.setBounds(726, 622, 180, 50);
		panel_1.add(proceed_button);
		proceed_button.setForeground(new Color(178, 34, 34));
		proceed_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		proceed_button.setBackground(Color.WHITE);
		proceed_button.setBorder(border);
		
		JLabel home = new JLabel("");
		home.setBounds(823, 0, 50, 50);
		panel_1.add(home);
		home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				User u = new User();
				u.first_page();
			}
		});
		home.setIcon(new ImageIcon("F:\\CRS\\home (2).png"));
		home.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel exit = new JLabel("X");
		exit.setBounds(883, 0, 50, 50);
		panel_1.add(exit);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exit.setForeground(new Color(178, 34, 34));
		exit.setFont(new Font("Tahoma", Font.BOLD, 40));
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel choose_label = new JLabel("Choose :");
		choose_label.setBounds(325, 115, 215, 50);
		panel_1.add(choose_label);
		choose_label.setForeground(new Color(178, 34, 34));
		choose_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		choose_label.setHorizontalAlignment(SwingConstants.CENTER);
		choose_label.setBackground(Color.WHITE);
		choose_label.setBorder(border);
		//sedan_frame.setVisible(true);
		
		proceed_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(city_radiobutton.isSelected())
				{
					car_select.add("Honda City") ;
					sedan_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if (verna_radiobutton.isSelected())
				{
					car_select.add("Hyundai Verna");
					sedan_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else
				{
					car_select.add("Suzuki Ciaz");
					sedan_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				Car_Booking cb2 = new Car_Booking();
				cb2.book_car();
			}
		});
		
		
		
		ButtonGroup group =new ButtonGroup();
		group.add(city_radiobutton);
		group.add(ciaz_radiobutton);
		group.add(verna_radiobutton);
	}
	                                      /*** SUV FUNCTION ***/
	public void suv()
	{
		suv_frame = new JFrame ();
		suv_frame.getContentPane().setBackground(Color.WHITE);
		suv_frame.setSize(1200,700);
		suv_frame.getContentPane().setLayout(null);
		suv_frame.setUndecorated(true);
		suv_frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(178, 34, 34));
		panel.setForeground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 300, 700);
		suv_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(178, 34, 34), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(265, 0, 935, 700);
		suv_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton proceed_button = new JButton("Proceed");
		proceed_button.setBounds(719, 623, 180, 50);
		panel_1.add(proceed_button);
		proceed_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		proceed_button.setForeground(new Color(178, 34, 34));
		proceed_button.setBackground(Color.WHITE);
		proceed_button.setBorder(border);
		
		JButton back_button = new JButton("Back");
		back_button.setBounds(511, 623, 180, 50);
		panel_1.add(back_button);
		back_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		back_button.setForeground(new Color(178, 34, 34));
		back_button.setBackground(Color.WHITE);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			             suv_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			             show_car();
			             //car_frame.setVisible(true);
			}
		});
		back_button.setBorder(border);
		
		JRadioButton safari_radiobutton = new JRadioButton("Tata Safari");
		safari_radiobutton.setBounds(367, 419, 180, 60);
		panel_1.add(safari_radiobutton);
		safari_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		safari_radiobutton.setForeground(new Color(178, 34, 34));
		safari_radiobutton.setBackground(Color.WHITE);
		
		
		JRadioButton fortuner_radiobutton = new JRadioButton("Toyoto Fortuner");
		fortuner_radiobutton.setBounds(367, 319, 218, 60);
		panel_1.add(fortuner_radiobutton);
		fortuner_radiobutton.setForeground(new Color(178, 34, 34));
		fortuner_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		fortuner_radiobutton.setBackground(Color.WHITE);
		
		
		JRadioButton scorpio_radiobutton = new JRadioButton("Mahindra Scorpio");
		scorpio_radiobutton.setBounds(367, 218, 218, 60);
		panel_1.add(scorpio_radiobutton);
		scorpio_radiobutton.setForeground(new Color(178, 34, 34));
		scorpio_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		scorpio_radiobutton.setBackground(Color.WHITE);
		
		
		JLabel choose_button = new JLabel("Choose :");
		choose_button.setBounds(336, 98, 249, 75);
		panel_1.add(choose_button);
		choose_button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		choose_button.setForeground(new Color(178, 34, 34));
		choose_button.setHorizontalAlignment(SwingConstants.CENTER);
		choose_button.setBackground(Color.WHITE);
		
		JLabel home = new JLabel("");
		home.setBounds(825, 0, 50, 50);
		panel_1.add(home);
		home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				User u =new User();
				u.first_page();
			}
		});
		home.setIcon(new ImageIcon("F:\\CRS\\home (2).png"));
		home.setHorizontalAlignment(SwingConstants.CENTER);
		home.setForeground(new Color(178, 34, 34));
		
		JLabel exit = new JLabel("X");
		exit.setBounds(885, 0, 50, 50);
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
		//suv_frame.setVisible(true);
		
		
		proceed_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(scorpio_radiobutton.isSelected())
				{
					car_select.add("Mahindra Scorpio") ;
					suv_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if (fortuner_radiobutton.isSelected())
				{
					car_select.add("Toyota Fortuner");
					suv_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else
				{
					car_select.add("Tata Safari");
					suv_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				Car_Booking cb1 = new Car_Booking();
				cb1.book_car();
			}
		});
	
		ButtonGroup group =new ButtonGroup();
		group.add(safari_radiobutton);
		group.add(scorpio_radiobutton);
		group.add(fortuner_radiobutton);
     	}
                                                 	/***** HATCHBACK FUNCTION *****/
	public void hatchback()
	{
		hatchback_frame= new JFrame ();
		hatchback_frame.getContentPane().setBackground(Color.WHITE);
		hatchback_frame.setSize(1200,700);
		hatchback_frame.getContentPane().setLayout(null);
		hatchback_frame.setUndecorated(true);
		hatchback_frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 300, 700);
		hatchback_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(178, 34, 34), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(275, 0, 925, 700);
		hatchback_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton i20_radiobutton = new JRadioButton("Hyundai i20");
		i20_radiobutton.setBounds(331, 229, 180, 60);
		panel_1.add(i20_radiobutton);
		i20_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		i20_radiobutton.setForeground(new Color(178, 34, 34));
		i20_radiobutton.setBackground(Color.WHITE);
		
		
		JRadioButton swift_radiobutton = new JRadioButton("Maruti Swift");
		swift_radiobutton.setBounds(331, 323, 180, 60);
		panel_1.add(swift_radiobutton);
		swift_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		swift_radiobutton.setForeground(new Color(178, 34, 34));
		swift_radiobutton.setBackground(Color.WHITE);
		
		
		JRadioButton baleno_radiobutton = new JRadioButton("Maruti Baleno");
		baleno_radiobutton.setBounds(331, 415, 180, 60);
		panel_1.add(baleno_radiobutton);
		baleno_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		baleno_radiobutton.setForeground(new Color(178, 34, 34));
		baleno_radiobutton.setBackground(Color.WHITE);
		
		
		JButton back_button = new JButton("Back");
		back_button.setBounds(498, 625, 180, 50);
		panel_1.add(back_button);
		back_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		back_button.setForeground(new Color(178, 34, 34));
		back_button.setBackground(Color.WHITE);
		
		JButton proceed_button = new JButton("Proceed");
		proceed_button.setBounds(703, 625, 180, 50);
		panel_1.add(proceed_button);
		proceed_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		proceed_button.setForeground(new Color(178, 34, 34));
		proceed_button.setBackground(Color.WHITE);
		proceed_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i20_radiobutton.isSelected())
				{
					car_select.add("Hyundai i20") ;
					hatchback_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if (swift_radiobutton.isSelected())
				{
					car_select.add("Maruti Swift");
					hatchback_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else
				{
					car_select.add("Maruti Baleno");
					hatchback_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
			Car_Booking cb3 = new Car_Booking();
			cb3.book_car();
			}
		});
		proceed_button.setBorder(border);
		
		JLabel choose_button = new JLabel("Choose :");
		choose_button.setBounds(330, 130, 215, 50);
		panel_1.add(choose_button);
		choose_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		choose_button.setForeground(new Color(178, 34, 34));
		choose_button.setHorizontalAlignment(SwingConstants.CENTER);
		choose_button.setBackground(Color.WHITE);
		choose_button.setBorder(border);
		
		JLabel exit = new JLabel("X");
		exit.setBounds(874, 0, 51, 50);
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
		
		JLabel home = new JLabel("");
		home.setBounds(823, 0, 50, 50);
		panel_1.add(home);
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
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			             hatchback_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			             show_car();
			             //car_frame.setVisible(true);
			}
		});
	   
		//hatchback_frame.setVisible(true);
	    
		ButtonGroup group =new ButtonGroup();
		group.add(baleno_radiobutton);
		group.add(swift_radiobutton);
		group.add(i20_radiobutton);
	}
	/**/
	public void Visible()
	{
		car_frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Car c = new Car();
	   c.show_car();
		//c.sedan();
	//	c.suv();
	//	c.hatchback();
	}
}
