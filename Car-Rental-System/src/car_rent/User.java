package car_rent;

import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class User 
{
	                        /************************************************************ General Details ************************************************************/
	ArrayList<String> name_array = new ArrayList<String>();
	ArrayList<String> userid_array = new ArrayList<String>();
	ArrayList<String> password_array = new ArrayList<String>();
	ArrayList<String> role_array = new ArrayList<String>();
	ArrayList<Integer> phone_array = new ArrayList<Integer>();
	
	/*public String[] pick_up = new String[10];    //For Car Class and Car Booking Class
	public String[] drop = new String[10];
	public String[] date = new String[10];*/
	
                           /***** LOGIN FRAME *****/
	JFrame login_frame ;
	JLabel login_userid, login_pwd , login_role ;
	JTextField userid_text , pwd_text , role_txt ;
	JButton login_button , login_back ;
	
	
	
	
	JFrame user_page;
	
	
	                     /***** REGISTER FRAME *****/
	JFrame register_frame;
	JLabel register_name , register_phone , register_userid , register_pwd , role_label ;
	JTextField name_txt , phone_txt , register_userid_txt , register_pwd_txt ;
	JButton register_button , register_b1 ;
	private JLabel image_register;
	
	
	                                               /********** FIRST PAGE FUNCTION **********/
	public void first_page()
	 {
		
		 user_page = new JFrame ();
		 user_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 user_page.getContentPane().setBackground(Color.WHITE);
		 user_page.setSize(1200, 700);
		 //first_page.setBorder(border);
		 user_page.getContentPane().setLayout(null);
		 
		 user_page.setUndecorated(true);
		 user_page.setVisible(true);
		 
		 JPanel panel = new JPanel();
		 panel.setBackground(new Color(178, 34, 34));
		 panel.setBounds(0, 0, 1200, 539);
		 user_page.getContentPane().add(panel);
		 panel.setLayout(null);
		 
		 JLabel c = new JLabel("CAR RENTING SYSTEM");
		 c.setForeground(Color.WHITE);
		 c.setFont(new Font("Tahoma", Font.PLAIN, 50));
		 c.setHorizontalAlignment(SwingConstants.CENTER);
		 c.setBounds(322, 329, 600, 200);
		 panel.add(c);
		 
		 JLabel close = new JLabel("X");
		 close.setForeground(Color.WHITE);
		 close.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 	   System.exit(0);
		 	}
		 });
		 close.setHorizontalAlignment(SwingConstants.CENTER);
		 close.setFont(new Font("Tahoma", Font.BOLD, 25));
		 close.setBounds(1150, 0, 50, 50);
		 panel.add(close);
		 
		 Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		 
		 JLabel car_image = new JLabel("");
		 car_image.setIcon(new ImageIcon("E:\\Downloads\\car (1).png"));
		 car_image.setHorizontalAlignment(SwingConstants.CENTER);
		 car_image.setBounds(409, 61, 314, 294);
		 panel.add(car_image);
		 
		 JButton first_login = new JButton("LOGIN");
		 first_login.setOpaque(true);
		 first_login.setForeground(new Color(178, 34, 34));
		 first_login.setBackground(Color.WHITE);
		 first_login.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 first_login.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	        user_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	        login_frame.setVisible(true);
		 	}
		 });
		 first_login.setBounds(370, 591, 200, 60);
		 first_login.setBorder(border);
		 user_page.getContentPane().add(first_login);
		 
		 JButton first_register = new JButton("REGISTER");
		 first_register.setBackground(Color.WHITE);
		 first_register.setForeground(new Color(178, 34, 34));
		 first_register.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 first_register.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		user_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 		register_frame.setVisible(true);
		 		}
		 });
		 first_register.setBounds(693, 591, 200, 60);
		 first_register.setBorder(border);
		 user_page.getContentPane().add(first_register);
		 
		// JLabel image1 = new JLabel();
		 
	 }
	
	
	                        /********** LOGIN FUNCTION **********/
	public void login()
	{
		login_frame = new JFrame ();
		login_frame.getContentPane().setBackground(Color.WHITE);
		login_frame.setSize(1200, 700);
		login_frame.getContentPane().setLayout(null);
		login_frame.setUndecorated(true);
		login_frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 300, 700);
		login_frame.getContentPane().add(panel);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		login_userid = new JLabel("User ID");
		login_userid.setForeground(new Color(178, 34, 34));
		login_userid.setFont(new Font("Tahoma", Font.PLAIN, 25));
		login_userid.setHorizontalAlignment(SwingConstants.CENTER);
		login_userid.setBounds(460, 51, 215, 50);
		login_userid.setBorder(border);
		login_frame.getContentPane().add(login_userid);
		
		JLabel login_pwd = new JLabel("Password");
		login_pwd.setForeground(new Color(178, 34, 34));
		login_pwd.setFont(new Font("Tahoma", Font.PLAIN, 25));
		login_pwd.setHorizontalAlignment(SwingConstants.CENTER);
		login_pwd.setBounds(460, 240, 215, 50);
		login_pwd.setBorder(border);
		login_frame.getContentPane().add(login_pwd);
		
		userid_text = new JTextField();
		userid_text.setBounds(460, 131, 450, 50);
		userid_text.setBorder(border);
		login_frame.getContentPane().add(userid_text);
		userid_text.setColumns(10);
		
		pwd_text = new JPasswordField();
		pwd_text.setBounds(460, 321, 450, 50);
		pwd_text.setBorder(border);
		login_frame.getContentPane().add(pwd_text);
		
		login_button = new JButton("Login");
		login_button.setBackground(Color.WHITE);
		login_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		login_button.setForeground(new Color(178, 34, 34));
		
		login_button.setBounds(933, 586, 200,60);
		login_frame.getContentPane().add(login_button);
		
	    login_back = new JButton("Back");
	    login_back.setBackground(Color.WHITE);
	    login_back.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    login_back.setForeground(new Color(178, 34, 34));
	    login_back.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	        user_page.setVisible(true);
	    	}
	    });
	    login_back.setBounds(718, 586, 200,60);
	    login_back.setBorder(border);
		login_frame.getContentPane().add(login_back);
		
		login_role = new JLabel("Role");
		login_role.setForeground(new Color(178, 34, 34));
		login_role.setFont(new Font("Tahoma", Font.PLAIN, 25));
		login_role.setHorizontalAlignment(SwingConstants.CENTER);
		login_role.setBounds(472, 418, 215,50);
		login_role.setBorder(border);
		login_frame.getContentPane().add(login_role);
		
		role_txt = new JTextField();
		role_txt.setBounds(472, 500, 450, 50);
		role_txt.setBorder(border);
		login_frame.getContentPane().add(role_txt);
		role_txt.setColumns(10);
		//login_frame.setVisible(true);
		
		login_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String str_userid = userid_text.getText();
				String str_pwd = pwd_text.getText();
				String str_role = role_txt.getText();
				if(userid_array.contains(str_userid)  &&  password_array.contains(str_pwd)  &&  role_array.contains(str_role)==true )
				{
					if(str_role.equals("Customer"))
					{
						Customer cr =new Customer();
						cr.Visible();
					}
					else if(str_role.equals("Driver"))
					{
						Driver dr = new Driver();
						dr.Location();
					}
					else 
					{
						Manager ma =new Manager();
						ma.Visible();
					}
							
								
					}
					
				
			}
		});
		 JLabel exit = new JLabel("X");
		 exit.setForeground(new Color(178, 34, 34));
		 login_frame.getContentPane().add(exit);
		 exit.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 	   System.exit(0);
		 	}
		 });
		 exit.setHorizontalAlignment(SwingConstants.CENTER);
		 exit.setFont(new Font("Tahoma", Font.BOLD, 25));
		 exit.setBounds(1136, 0, 50, 50);
		 
		 JLabel image_userid = new JLabel("");
		 image_userid.setIcon(new ImageIcon("F:\\CRS\\round-account-button-with-user-inside (2).png"));
		 image_userid.setHorizontalAlignment(SwingConstants.CENTER);
		 image_userid.setBounds(381, 51, 64, 63);
		 login_frame.getContentPane().add(image_userid);
		 
		 JLabel image_lock = new JLabel("");
		 image_lock.setIcon(new ImageIcon("F:\\CRS\\padlock (1).png"));
		 image_lock.setHorizontalAlignment(SwingConstants.CENTER);
		 image_lock.setBounds(381, 228, 64, 63);
		 login_frame.getContentPane().add(image_lock);
		 
		 JLabel image_role = new JLabel("");
		 image_role.setIcon(new ImageIcon("F:\\CRS\\scrum.png"));
		 image_role.setHorizontalAlignment(SwingConstants.CENTER);
		 image_role.setBounds(381, 419, 64, 63);
		 login_frame.getContentPane().add(image_role);
		
	    }
                             	  /********** REGISTER FUNCTION **********/
	public void register()
	{
		register_frame = new JFrame ();
		register_frame.getContentPane().setBackground(Color.WHITE);
		register_frame.setSize(1200,700);
		register_frame.getContentPane().setLayout(null);
		register_frame.setUndecorated(true);
		register_frame.setVisible(false);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 300, 700);
		register_frame.getContentPane().add(panel);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		
		register_name = new JLabel("Name");
		register_name.setForeground(new Color(178, 34, 34));
		register_name.setHorizontalAlignment(SwingConstants.CENTER);
		register_name.setFont(new Font("Tahoma", Font.PLAIN, 25));
		register_name.setBounds(273, 144, 200, 50);
		register_name.setBorder(border);
		register_frame.getContentPane().add(register_name);
		
		register_phone = new JLabel("Phone Number");
		register_phone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		register_phone.setForeground(new Color(178, 34, 34));
		register_phone.setHorizontalAlignment(SwingConstants.CENTER);
		register_phone.setBounds(273, 316, 200, 50);
		register_phone.setBorder(border);
		register_frame.getContentPane().add(register_phone);
		
	    register_userid = new JLabel("Password");
	    register_userid.setHorizontalAlignment(SwingConstants.CENTER);
	    register_userid.setForeground(new Color(178, 34, 34));
	    register_userid.setFont(new Font("Tahoma", Font.PLAIN, 25));
		register_userid.setBounds(751, 144, 200, 50);
		register_userid.setBorder(border);
		register_frame.getContentPane().add(register_userid);
		
		register_pwd = new JLabel("User ID");
		register_pwd.setHorizontalAlignment(SwingConstants.CENTER);
		register_pwd.setFont(new Font("Tahoma", Font.PLAIN, 25));
		register_pwd.setForeground(new Color(178, 34, 34));
		register_pwd.setBounds(273, 468, 200, 50);
		register_pwd.setBorder(border);
		register_frame.getContentPane().add(register_pwd);
		
		register_button = new JButton("Register");
		register_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		register_button.setForeground(new Color(178, 34, 34));
		register_button.setBackground(Color.WHITE);
		register_button.setBounds(956, 584, 180, 50);
		register_button.setBorder(border);
		register_frame.getContentPane().add(register_button);
		
		register_b1 = new JButton("Back");
		register_b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		register_b1.setForeground(new Color(178, 34, 34));
		register_b1.setBackground(Color.WHITE);
		register_b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                user_page.setVisible(true);
			}
		});
		register_b1.setBounds(754, 584, 180, 50);
		register_b1.setBorder(border);
		register_frame.getContentPane().add(register_b1);
		
		name_txt = new JTextField();
		name_txt.setBounds(273, 218, 300, 50);
		name_txt.setBorder(border);
		register_frame.getContentPane().add(name_txt);
		name_txt.setColumns(10);
		
		phone_txt = new JTextField();
		phone_txt.setBounds(751, 218, 300, 50);
		phone_txt.setBorder(border);
		register_frame.getContentPane().add(phone_txt);
		phone_txt.setColumns(10);
		
		register_userid_txt = new JTextField();
		register_userid_txt.setBounds(273, 390, 300, 50);
		register_userid_txt.setBorder(border);
		register_frame.getContentPane().add(register_userid_txt);
		register_userid_txt.setColumns(10);
		
		register_pwd_txt = new JTextField();
		register_pwd_txt.setBounds(273, 546, 300, 50);
		register_pwd_txt.setBorder(border);
		register_frame.getContentPane().add(register_pwd_txt);
		register_pwd_txt.setColumns(10);
		
		
		JRadioButton customer_radio = new JRadioButton("New radio button");
		customer_radio.setBackground(Color.WHITE);
		customer_radio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		customer_radio.setForeground(new Color(178, 34, 34));
		customer_radio.setHorizontalAlignment(SwingConstants.CENTER);
		customer_radio.setBounds(794, 498, 180, 40);
		register_frame.getContentPane().add(customer_radio);
		
		JRadioButton driver_radio = new JRadioButton("New radio button");
		driver_radio.setBackground(Color.WHITE);
		driver_radio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		driver_radio.setHorizontalAlignment(SwingConstants.CENTER);
		driver_radio.setForeground(new Color(178, 34, 34));
		driver_radio.setBounds(794, 372, 180, 40);
		register_frame.getContentPane().add(driver_radio);
		
		JRadioButton manager_radio = new JRadioButton("New radio button");
		manager_radio.setBackground(Color.WHITE);
		manager_radio.setForeground(new Color(178, 34, 34));
		manager_radio.setHorizontalAlignment(SwingConstants.CENTER);
		manager_radio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		manager_radio.setBounds(794, 433, 180, 40);
		register_frame.getContentPane().add(manager_radio);
		
		role_label = new JLabel("Role");
		role_label.setHorizontalAlignment(SwingConstants.CENTER);
		role_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		role_label.setForeground(new Color(178, 34, 34));
		role_label.setBounds(751, 316, 200, 50);
		role_label.setBorder(border);
		register_frame.getContentPane().add(role_label);
		
		ButtonGroup group = new ButtonGroup ();
		group.add(customer_radio);
		group.add(manager_radio);
		group.add(driver_radio);
		
		register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str_name = name_txt.getText();
				String str_userid = register_userid_txt.getText();
				String str_pwd_register = register_pwd_txt.getText();
			    String n_phone = phone_txt.getText();  
				int phone =Integer.parseInt(n_phone);
			    
				name_array.add(str_name);
				userid_array.add(str_userid);
				password_array.add(str_pwd_register);
				phone_array.add(phone);
			    if (customer_radio.isSelected())
			    {
			        role_array.add("Customer");
			    }
			    else if (driver_radio.isSelected())
			    {
			    	role_array.add("Driver");
			    }
			    else
			    {
			    	role_array.add("Manager");
			       }
				
				register_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				login_frame.setVisible(true);
				
			}
		});		
		 JLabel exit = new JLabel("X");
		 exit.setForeground(new Color(178, 34, 34));
		 register_frame.getContentPane().add(exit);
		 exit.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 	   System.exit(0);
		 	}
		 });
		 exit.setHorizontalAlignment(SwingConstants.CENTER);
		 exit.setFont(new Font("Tahoma", Font.BOLD, 25));
		 exit.setBounds(1138, 0, 50, 50);
		 
		 image_register = new JLabel("");
		 image_register.setIcon(new ImageIcon("F:\\CRS\\stamped.png"));
		 image_register.setHorizontalAlignment(SwingConstants.CENTER);
		 image_register.setBounds(246, 31, 103, 83);
		 register_frame.getContentPane().add(image_register);
		
	  }
	                 /********** MAIN BODY FOR USER CLASS **********/
	public static void main(String[] args) 
	{
		User u = new User();
	   u.first_page();
	    u.register();
	     u.login();
	      
  }  //end of User Class
}