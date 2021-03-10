package car_rent;

import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.LineBorder;


public class User 
{
	                                      /****************************** General Details *************************************/
	ArrayList<String> name_array = new ArrayList<String>();
	ArrayList<String> userid_array = new ArrayList<String>();
	ArrayList<String> password_array = new ArrayList<String>();
	ArrayList<String> role_array = new ArrayList<String>();
	ArrayList<String> dob_array = new ArrayList<String>();
                                                      /**************** LOGIN FRAME Details *******************/
	JFrame login_frame ;
	JLabel login_userid, login_pwd , login_role ;
	JTextField userid_text , pwd_text , role_txt ;
	JButton login_button , login_back ;
	
	JFrame user_page;
	                                                 /************** REGISTER FRAME Details ****************/
	JFrame register_frame;
	JLabel register_name , register_phone , register_userid , register_pwd , role_label ;
	JTextField name_txt , register_pwd_txt , register_userid_txt ;
	JButton register_button , register_b1 ;
	private JLabel image_register;
	private JPanel panel_1;
	private JPanel panel_2;
	
	                                                /****************** FIRST PAGE FUNCTION **************/
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
		 panel.setBorder(new LineBorder(new Color(178, 34, 34), 2));
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
		 close.setFont(new Font("Tahoma", Font.BOLD, 40));
		 close.setBounds(1150, 0, 50, 50);
		 panel.add(close);
		 
		 Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
		 
		 JLabel car_image = new JLabel("");
		 car_image.setIcon(new ImageIcon("E:\\Downloads\\car (1).png"));
		 car_image.setHorizontalAlignment(SwingConstants.CENTER);
		 car_image.setBounds(471, 91, 314, 294);
		 panel.add(car_image);
		 
		 JPanel panel_1 = new JPanel();
		 panel_1.setBorder(new LineBorder(new Color(178, 34, 34), 2));
		 panel_1.setBackground(Color.WHITE);
		 panel_1.setBounds(0, 514, 1200, 186);
		 user_page.getContentPane().add(panel_1);
		 panel_1.setLayout(null);
		 
		 JButton first_login = new JButton("LOGIN");
		 first_login.setBounds(306, 84, 200, 60);
		 panel_1.add(first_login);
		 first_login.setOpaque(true);
		 first_login.setForeground(new Color(178, 34, 34));
		 first_login.setBackground(Color.WHITE);
		 first_login.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 first_login.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	        user_page.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 	        login();
		 	        // login_frame.setVisible(true);
		 	}
		 });
		 first_login.setBorder(new LineBorder(new Color(178, 34, 34)));
		 
		 JButton first_register = new JButton("REGISTER");
		 first_register.setBounds(697, 84, 200, 60);
		 panel_1.add(first_register);
		 first_register.setBackground(Color.WHITE);
		 first_register.setForeground(new Color(178, 34, 34));
		 first_register.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 first_register.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		user_page.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 		register();
		 		//register_frame.setVisible(true);
		 		}
		 });
		 first_register.setBorder(border);
		 
		// JLabel image1 = new JLabel();
		 
	 }
	
                                                       /*************** LOGIN FUNCTION ***************/
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
		panel.setLayout(null);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
	    
	    panel_2 = new JPanel();
	    panel_2.setBorder(new LineBorder(new Color(178, 34, 34), 2));
	    panel_2.setBackground(Color.WHITE);
	    panel_2.setBounds(281, 0, 919, 700);
	    login_frame.getContentPane().add(panel_2);
	    panel_2.setLayout(null);
	    JLabel exit = new JLabel("X");
	    exit.setBounds(869, 0, 50, 50);
	    panel_2.add(exit);
	    exit.setForeground(new Color(178, 34, 34));
	    exit.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    	   System.exit(0);
	    	}
	    });
	    exit.setHorizontalAlignment(SwingConstants.CENTER);
	    exit.setFont(new Font("Tahoma", Font.BOLD, 40));
	    
	    login_userid = new JLabel("User ID");
	    login_userid.setBounds(133, 61, 215, 50);
	    panel_2.add(login_userid);
	    login_userid.setForeground(new Color(178, 34, 34));
	    login_userid.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    login_userid.setHorizontalAlignment(SwingConstants.CENTER);
	    login_userid.setBorder(border);
	    
	    userid_text = new JTextField();
	    userid_text.setBounds(133, 121, 450, 50);
	    panel_2.add(userid_text);
	    userid_text.setBorder(border);
	    userid_text.setColumns(10);
	    
	    JLabel login_pwd_1 = new JLabel("Password");
	    login_pwd_1.setBounds(133, 237, 215, 50);
	    panel_2.add(login_pwd_1);
	    login_pwd_1.setForeground(new Color(178, 34, 34));
	    login_pwd_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    login_pwd_1.setHorizontalAlignment(SwingConstants.CENTER);
	    login_pwd_1.setBorder(border);
	    
	    pwd_text = new JPasswordField();
	    pwd_text.setBounds(133, 301, 450, 50);
	    panel_2.add(pwd_text);
	    pwd_text.setBorder(border);
	    
	    login_role = new JLabel("Role");
	    login_role.setBounds(133, 405, 215, 50);
	    panel_2.add(login_role);
	    login_role.setForeground(new Color(178, 34, 34));
	    login_role.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    login_role.setHorizontalAlignment(SwingConstants.CENTER);
	    login_role.setBorder(border);
	    
	    role_txt = new JTextField();
	    role_txt.setBounds(133, 470, 450, 50);
	    panel_2.add(role_txt);
	    role_txt.setBorder(border);
	    role_txt.setColumns(10);
	    
	    login_button = new JButton("Login");
	    login_button.setBounds(654, 605, 200, 60);
	    panel_2.add(login_button);
	    login_button.setBackground(Color.WHITE);
	    login_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    login_button.setForeground(new Color(178, 34, 34));
	    
	    login_back = new JButton("Back");
	    login_back.setBounds(420, 605, 200, 60);
	    panel_2.add(login_back);
	    login_back.setBackground(Color.WHITE);
	    login_back.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    login_back.setForeground(new Color(178, 34, 34));
	    login_back.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	        login_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    	        user_page.setVisible(true);
	    	}
	    });
	    login_back.setBorder(border);
	    
	    JLabel image_userid = new JLabel("");
	    image_userid.setBounds(48, 61, 64, 63);
	    panel_2.add(image_userid);
	    image_userid.setIcon(new ImageIcon("F:\\CRS\\round-account-button-with-user-inside (2).png"));
	    image_userid.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    JLabel image_lock = new JLabel("");
	    image_lock.setBounds(48, 236, 64, 63);
	    panel_2.add(image_lock);
	    image_lock.setIcon(new ImageIcon("F:\\CRS\\padlock (1).png"));
	    image_lock.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    JLabel image_role = new JLabel("");
	    image_role.setBounds(48, 405, 64, 63);
	    panel_2.add(image_role);
	    image_role.setIcon(new ImageIcon("F:\\CRS\\scrum.png"));
	    image_role.setHorizontalAlignment(SwingConstants.CENTER);
	    //login_frame.setVisible(true);
	    
	    login_button.addActionListener(new ActionListener() 
	    {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		String str_userid = userid_text.getText();
	    		String str_pwd = pwd_text.getText();
	    		String str_role = role_txt.getText();
	    		if( str_userid==" " || str_pwd ==" " || str_role==" ")
	    		{
	    			JOptionPane.showMessageDialog(login_frame, "Fill All the Details");
	    		}
	    		else
	    		{
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
		    			else if(str_role.equals("Manager"))
		    			{
		    				Manager ma =new Manager();
		    				ma.first();
		    			   }
		    			else
		    			{
		    				JOptionPane.showMessageDialog(login_frame, "Invalid Login Details");
		         			}
		    								
		    			}
	    		    }
	    				
	    	}
	    });
		
		
		
	    }
	                                              /*************** REGISTER FUNCTION ***************/
	public void register()
	{
		register_frame = new JFrame ();
		register_frame.getContentPane().setBackground(Color.WHITE);
		register_frame.setSize(1200,700);
		register_frame.getContentPane().setLayout(null);
		register_frame.setUndecorated(true);
		register_frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 300, 700);
		register_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
	    
	    panel_1 = new JPanel();
	    panel_1.setBorder(new LineBorder(new Color(178, 34, 34), 2));
	    panel_1.setBackground(Color.WHITE);
	    panel_1.setBounds(276, 0, 924, 700);
	    register_frame.getContentPane().add(panel_1);
	    panel_1.setLayout(null);
	    
	    register_phone = new JLabel("Date of Birth");
	    register_phone.setBounds(62, 310, 200, 50);
	    panel_1.add(register_phone);
	    register_phone.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    register_phone.setForeground(new Color(178, 34, 34));
	    register_phone.setHorizontalAlignment(SwingConstants.CENTER);
	    register_phone.setBorder(border);
	    
	    register_pwd = new JLabel("User ID");
	    register_pwd.setBounds(494, 137, 200, 50);
	    panel_1.add(register_pwd);
	    register_pwd.setHorizontalAlignment(SwingConstants.CENTER);
	    register_pwd.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    register_pwd.setForeground(new Color(178, 34, 34));
	    register_pwd.setBorder(border);
	    
	    JRadioButton driver_radio = new JRadioButton("Driver");
	    driver_radio.setBounds(510, 527, 180, 40);
	    panel_1.add(driver_radio);
	    driver_radio.setBackground(Color.WHITE);
	    driver_radio.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    driver_radio.setForeground(new Color(178, 34, 34));
	   
	    
	    
	    JRadioButton customer_radio = new JRadioButton("Customer");
	    customer_radio.setBounds(510, 395, 180, 40);
	    panel_1.add(customer_radio);
	    customer_radio.setBackground(Color.WHITE);
	    customer_radio.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    customer_radio.setForeground(new Color(178, 34, 34));
	    
	    
	    JRadioButton manager_radio = new JRadioButton("Manager");
	    manager_radio.setBounds(510, 460, 180, 40);
	    panel_1.add(manager_radio);
	    manager_radio.setBackground(Color.WHITE);
	    manager_radio.setForeground(new Color(178, 34, 34));
	    manager_radio.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    
	    
	    register_b1 = new JButton("Back");
	    register_b1.setBounds(472, 628, 180, 50);
	    panel_1.add(register_b1);
	    register_b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    register_b1.setForeground(new Color(178, 34, 34));
	    register_b1.setBackground(Color.WHITE);
	    register_b1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		        login_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	                    user_page.setVisible(true);
	    	}
	    });
	    register_b1.setBorder(border);
	    
	    register_button = new JButton("Register");
	    register_button.setBounds(689, 628, 180, 50);
	    panel_1.add(register_button);
	    register_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    register_button.setForeground(new Color(178, 34, 34));
	    register_button.setBackground(Color.WHITE);
	    register_button.setBorder(border);
	    
	     register_userid_txt = new JTextField();
	     register_userid_txt.setBounds(494, 224, 300, 50);
	     panel_1.add(register_userid_txt);
	     register_userid_txt.setColumns(10);
	     register_userid_txt.setBorder(border);
	     
	     register_pwd_txt = new JTextField();
	     register_pwd_txt.setBounds(62, 574, 300, 50);
	     panel_1.add(register_pwd_txt);
	     register_pwd_txt.setBorder(border);
	     register_pwd_txt.setColumns(10);
	     
	      JDateChooser dob = new JDateChooser();
	      dob.setBounds(62, 395, 300, 50);
	      panel_1.add(dob);
	      dob.setBorder(border);
	      dob.setDateFormatString("dd-MMMM-yyyy");
	      
	      name_txt = new JTextField();
	      name_txt.setBounds(62, 224, 300, 50);
	      panel_1.add(name_txt);
	      name_txt.setBorder(border);
	      name_txt.setColumns(10);
	      
	      register_name = new JLabel("Name");
	      register_name.setBounds(62, 137, 200, 50);
	      panel_1.add(register_name);
	      register_name.setForeground(new Color(178, 34, 34));
	      register_name.setHorizontalAlignment(SwingConstants.CENTER);
	      register_name.setFont(new Font("Tahoma", Font.PLAIN, 25));
	      register_name.setBorder(border);
	      
	      image_register = new JLabel("");
	      image_register.setBounds(43, 10, 103, 83);
	      panel_1.add(image_register);
	      image_register.setIcon(new ImageIcon("F:\\CRS\\stamped.png"));
	      image_register.setHorizontalAlignment(SwingConstants.CENTER);
	      JLabel exit = new JLabel("X");
	      exit.setBounds(874, 0, 50, 50);
	      panel_1.add(exit);
	      exit.setForeground(new Color(178, 34, 34));
	      exit.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      	   System.exit(0);
	      	}
	      });
	      exit.setHorizontalAlignment(SwingConstants.CENTER);
	      exit.setFont(new Font("Tahoma", Font.BOLD, 40));
	      
	    register_userid = new JLabel("Password");
	    register_userid.setBounds(62, 483, 200, 50);
	    panel_1.add(register_userid);
	    register_userid.setHorizontalAlignment(SwingConstants.CENTER);
	    register_userid.setForeground(new Color(178, 34, 34));
	    register_userid.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    register_userid.setBorder(border);
	    
	    role_label = new JLabel("Role");
	    role_label.setBounds(494, 310, 200, 50);
	    panel_1.add(role_label);
	    role_label.setHorizontalAlignment(SwingConstants.CENTER);
	    role_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    role_label.setForeground(new Color(178, 34, 34));
	    role_label.setBorder(border);
	    
	    register_button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		
	    		
	    		String str_name = name_txt.getText();
	    		String str_userid = register_userid_txt.getText();
	    		String str_pwd_register = register_pwd_txt.getText();
	    	    String date = dob.getDateFormatString();
	    		if(str_name==" " || str_userid==" "|| str_pwd_register==" "|| date== " ")
	    		{
	    			JOptionPane.showMessageDialog(register_frame,"Please Fill All the Details");
	    		}
	    		else
	    		{
	    			name_array.add(str_name);
		    		userid_array.add(str_userid);
		    		password_array.add(str_pwd_register);
		    		dob_array.add(date);
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
		    		login();
	    		   }
	    	   
	     	   }
	      });		
		
		
		
		ButtonGroup group = new ButtonGroup ();
		group.add(customer_radio);
		group.add(manager_radio);
		group.add(driver_radio);
		 
		
	  }
	                                     /**************** MAIN BODY OF USER CLASS ***************/
	public static void main(String[] args) 
	{
		User u = new User();
	    u.first_page();
	     // u.register();
	  // u.login();
	      
  }  //end of User Class
}