package car_rent;

import javax.swing.*;
import javax.swing.border.Border;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 300, 700);
		car_frame.getContentPane().add(panel);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		JButton hatchback_button = new JButton("Hatchback");
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
		hatchback_button.setBounds(638, 333, 200, 70);
		hatchback_button.setBorder(border);
		car_frame.getContentPane().add(hatchback_button);
		
		JButton sedan_button = new JButton("Sedan");
		sedan_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		sedan_button.setForeground(new Color(178, 34, 34));
		sedan_button.setBackground(Color.WHITE);
		sedan_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			       car_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    
			       sedan();
			}
		});
		
		sedan_button.setBounds(638, 169, 200, 70);
		sedan_button.setBorder(border);
		car_frame.getContentPane().add(sedan_button);
		
		JButton suv_button = new JButton("SUV");
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
		suv_button.setBounds(638, 477, 200, 70);
		suv_button.setBorder(border);
		car_frame.getContentPane().add(suv_button);
		
		JLabel choose_label = new JLabel("Choose a Car");
		choose_label.setBackground(Color.WHITE);
		choose_label.setForeground(new Color(178, 34, 34));
		choose_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		choose_label.setHorizontalAlignment(SwingConstants.CENTER);
		choose_label.setBounds(620, 35, 212, 99);
		choose_label.setBorder(border);
		car_frame.getContentPane().add(choose_label);
		
		JLabel image_sedan = new JLabel("");
		image_sedan.setIcon(new ImageIcon("F:\\CRS\\sedan-car-model.png"));
		image_sedan.setHorizontalAlignment(SwingConstants.CENTER);
		image_sedan.setBounds(478, 169, 114, 70);
		car_frame.getContentPane().add(image_sedan);
		
		JLabel image_hatchback = new JLabel("");
		image_hatchback.setIcon(new ImageIcon("F:\\CRS\\car-of-hatchback-model.png"));
		image_hatchback.setHorizontalAlignment(SwingConstants.CENTER);
		image_hatchback.setBounds(478, 333, 114, 70);
		car_frame.getContentPane().add(image_hatchback);
		
		JLabel image_suv = new JLabel("");
		image_suv.setIcon(new ImageIcon("F:\\CRS\\all-terrain-vehicle.png"));
		image_suv.setHorizontalAlignment(SwingConstants.CENTER);
		image_suv.setBounds(478, 477, 114, 70);
		car_frame.getContentPane().add(image_suv);
		
		JLabel exit = new JLabel("X");
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exit.setForeground(new Color(178, 34, 34));
		exit.setFont(new Font("Tahoma", Font.BOLD, 40));
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		exit.setBounds(1136, 0, 50, 50);
		car_frame.getContentPane().add(exit);
		
		JLabel home = new JLabel("");
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
		home.setBounds(1076, 0, 50, 50);
		car_frame.getContentPane().add(home);
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
		panel.setBounds(0, 0, 300, 663);
		sedan_frame.getContentPane().add(panel);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		JButton proceed_button = new JButton("Proceed");
		proceed_button.setForeground(new Color(178, 34, 34));
		proceed_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		proceed_button.setBackground(Color.WHITE);
		proceed_button.setBounds(951, 580, 180, 50);
		proceed_button.setBorder(border);
		sedan_frame.getContentPane().add(proceed_button);
		
		JButton back_button = new JButton("Back");
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
		back_button.setBounds(707, 580, 180, 50);
		back_button.setBorder(border);
		sedan_frame.getContentPane().add(back_button);
		
		JRadioButton city_radiobutton = new JRadioButton("Honda City");
		city_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		city_radiobutton.setForeground(new Color(178, 34, 34));
		city_radiobutton.setBackground(Color.WHITE);
		city_radiobutton.setBounds(553, 208, 180, 60);
		sedan_frame.getContentPane().add(city_radiobutton);
		
		JRadioButton verna_radiobutton = new JRadioButton("Hyundai Verna");
		verna_radiobutton.setForeground(new Color(178, 34, 34));
		verna_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verna_radiobutton.setBackground(Color.WHITE);
		verna_radiobutton.setBounds(553, 332, 245, 60);
		sedan_frame.getContentPane().add(verna_radiobutton);
		
		JRadioButton ciaz_radiobutton = new JRadioButton("Maruti Ciaz");
		ciaz_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ciaz_radiobutton.setForeground(new Color(178, 34, 34));
		ciaz_radiobutton.setBackground(Color.WHITE);
		ciaz_radiobutton.setBounds(553, 422, 180, 60);
		sedan_frame.getContentPane().add(ciaz_radiobutton);
		
		JLabel choose_label = new JLabel("Choose :");
		choose_label.setForeground(new Color(178, 34, 34));
		choose_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		choose_label.setHorizontalAlignment(SwingConstants.CENTER);
		choose_label.setBackground(Color.WHITE);
		choose_label.setBounds(518, 80, 215, 60);
		choose_label.setBorder(border);
		sedan_frame.getContentPane().add(choose_label);
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
	    group.add(verna_radiobutton);
	    group.add(ciaz_radiobutton);
	    
	    JLabel exit = new JLabel("X");
	    exit.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		System.exit(0);
	    	}
	    });
	    exit.setForeground(new Color(178, 34, 34));
	    exit.setFont(new Font("Tahoma", Font.BOLD, 40));
	    exit.setHorizontalAlignment(SwingConstants.CENTER);
	    exit.setBounds(1136, 0, 50, 50);
	    sedan_frame.getContentPane().add(exit);
	    
	    JLabel home = new JLabel("");
	    home.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		User u = new User();
	    		u.first_page();
	    	}
	    });
	    home.setIcon(new ImageIcon("F:\\CRS\\home (2).png"));
	    home.setHorizontalAlignment(SwingConstants.CENTER);
	    home.setBounds(1081, 0, 50, 50);
	    sedan_frame.getContentPane().add(home);
	    
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
		panel.setBounds(0, 0, 300, 663);
		suv_frame.getContentPane().add(panel);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		JRadioButton scorpio_radiobutton = new JRadioButton("Mahindra Scorpio");
		scorpio_radiobutton.setForeground(new Color(178, 34, 34));
		scorpio_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		scorpio_radiobutton.setBackground(Color.WHITE);
		scorpio_radiobutton.setBounds(594, 179, 218, 60);
		suv_frame.getContentPane().add(scorpio_radiobutton);
		
		JRadioButton fortuner_radiobutton = new JRadioButton("Toyoto Fortuner");
		fortuner_radiobutton.setForeground(new Color(178, 34, 34));
		fortuner_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		fortuner_radiobutton.setBackground(Color.WHITE);
		fortuner_radiobutton.setBounds(594, 296, 218, 60);
		suv_frame.getContentPane().add(fortuner_radiobutton);
		
		JRadioButton safari_radiobutton = new JRadioButton("Tata Safari");
		safari_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		safari_radiobutton.setForeground(new Color(178, 34, 34));
		safari_radiobutton.setBackground(Color.WHITE);
		safari_radiobutton.setBounds(594, 410, 180, 60);
		suv_frame.getContentPane().add(safari_radiobutton);
		
		JButton proceed_button = new JButton("Proceed");
		proceed_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		proceed_button.setForeground(new Color(178, 34, 34));
		proceed_button.setBackground(Color.WHITE);
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
		proceed_button.setBounds(963, 573, 180, 50);
		proceed_button.setBorder(border);
		suv_frame.getContentPane().add(proceed_button);
		
		JButton back_button = new JButton("Back");
		back_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		back_button.setForeground(new Color(178, 34, 34));
		back_button.setBackground(Color.WHITE);
		back_button.setBounds(743, 573, 180, 50);
		suv_frame.getContentPane().add(back_button);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			             suv_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			             show_car();
			             //car_frame.setVisible(true);
			}
		});
		
		JLabel choose_button = new JLabel("Choose :");
		choose_button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		choose_button.setForeground(new Color(178, 34, 34));
		choose_button.setHorizontalAlignment(SwingConstants.CENTER);
		choose_button.setBackground(Color.WHITE);
		choose_button.setBounds(563, 83, 249, 75);
		back_button.setBorder(border);
		suv_frame.getContentPane().add(choose_button);
		//suv_frame.setVisible(true);
	
		ButtonGroup group =new ButtonGroup();
	    group.add(scorpio_radiobutton);
	    group.add(fortuner_radiobutton);
	    group.add(safari_radiobutton);
	    
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
	    exit.setBounds(1136, 0, 50, 50);
	    suv_frame.getContentPane().add(exit);
	    
	    JLabel home = new JLabel("");
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
	    home.setBounds(1076, 0, 50, 50);
	    suv_frame.getContentPane().add(home);
	    
	    
		
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
		panel.setBounds(0, 0, 300, 663);
		hatchback_frame.getContentPane().add(panel);
	
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		JRadioButton i20_radiobutton = new JRadioButton("Hyundai i20");
		i20_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		i20_radiobutton.setForeground(new Color(178, 34, 34));
		i20_radiobutton.setBackground(Color.WHITE);
		i20_radiobutton.setBounds(659, 187, 180, 60);
		hatchback_frame.getContentPane().add(i20_radiobutton);
		
		JRadioButton swift_radiobutton = new JRadioButton("Maruti Swift");
		swift_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		swift_radiobutton.setForeground(new Color(178, 34, 34));
		swift_radiobutton.setBackground(Color.WHITE);
		swift_radiobutton.setBounds(659, 304, 180, 60);
		hatchback_frame.getContentPane().add(swift_radiobutton);
		
		JRadioButton baleno_radiobutton = new JRadioButton("Maruti Baleno");
		baleno_radiobutton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		baleno_radiobutton.setForeground(new Color(178, 34, 34));
		baleno_radiobutton.setBackground(Color.WHITE);
		baleno_radiobutton.setBounds(659, 422, 180, 60);
		hatchback_frame.getContentPane().add(baleno_radiobutton);
		
		JButton proceed_button = new JButton("Proceed");
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
		proceed_button.setBounds(940, 579, 180, 50);
		proceed_button.setBorder(border);
		hatchback_frame.getContentPane().add(proceed_button);
		
		JButton back_button = new JButton("Back");
		back_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		back_button.setForeground(new Color(178, 34, 34));
		back_button.setBackground(Color.WHITE);
		back_button.setBounds(718, 579, 180, 50);
		hatchback_frame.getContentPane().add(back_button);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			             hatchback_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			             show_car();
			             //car_frame.setVisible(true);
			}
		});
		
		JLabel choose_button = new JLabel("Choose :");
		choose_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		choose_button.setForeground(new Color(178, 34, 34));
		choose_button.setHorizontalAlignment(SwingConstants.CENTER);
		choose_button.setBackground(Color.WHITE);
		choose_button.setBounds(636, 82, 215, 50);
		choose_button.setBorder(border);
		hatchback_frame.getContentPane().add(choose_button);
		//hatchback_frame.setVisible(true);
	    
		ButtonGroup group =new ButtonGroup();
	    group.add(i20_radiobutton);
	    group.add(swift_radiobutton);
	    group.add(baleno_radiobutton);
	    
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
	    exit.setBounds(1135, 0, 51, 50);
	    hatchback_frame.getContentPane().add(exit);
	    
	    JLabel home = new JLabel("");
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
	    home.setBounds(1081, 0, 50, 50);
	    hatchback_frame.getContentPane().add(home);
	    
	   
		
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
		//c.suv();
		//c.hatchback();
	}
}
