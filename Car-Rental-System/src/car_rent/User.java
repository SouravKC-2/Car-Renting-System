package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class User 
{
	String[] userid_array = new String[10];
	String[] password_array = new String[10] ;
	String[] name_array = new String[10] ;
	String[] role = new String[10];
	int[] phone_array = new int[10] ;
	int I = 0;
	
	
                           /***** LOGIN FRAME *****/
	JFrame login_frame ;
	JLabel login_userid, login_pwd , login_role ;
	JTextField userid_text , pwd_text , role_txt ;
	JButton login_button , login_back ;
	
	
	
	
	JFrame first_page;
	
	
	                     /***** REGISTER FRAME *****/
	JFrame register_frame;
	JLabel register_name , register_userid , register_pwd , role_label ;
	JTextField name_txt , phone_txt , register_userid_txt , register_pwd_txt ;
	JButton register_button , register_b1 ;
	
	
	                                               /********** FIRST PAGE FUNCTION **********/
	/*public void first_page()
	 {
		 first_page = new JFrame ();
		 //first_page.setResizable(false);
		 first_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 first_page.getContentPane().setBackground(Color.WHITE);
		 first_page.setSize(955, 585);
		 first_page.getContentPane().setLayout(null);
		 first_page.setVisible(true);
		 
		 JPanel panel = new JPanel();
		 panel.setBackground(new Color(153, 0, 0));
		 panel.setBounds(0, 0, 312, 548);
		 first_page.getContentPane().add(panel);
		 panel.setLayout(null);
		 
		 JLabel c = new JLabel("New label");
		 c.setBounds(423, 357, 45, 13);
		 panel.add(c);
		 
		 JPanel panel_1 = new JPanel();
		 panel_1.setBackground(new Color(255, 255, 255));
		 panel_1.setBounds(313, 0, 628, 548);
		 first_page.getContentPane().add(panel_1);
		 panel_1.setLayout(null);
		 
		 JButton first_login = new JButton("LogIn");
		 first_login.setBackground(new Color(153, 0, 0));
		 first_login.setFont(new Font("Arial", Font.BOLD, 22));
		 first_login.setBounds(121, 243, 159, 52);
		 panel_1.add(first_login);
		 
		 JButton first_register = new JButton("Register");
		 first_register.setBackground(new Color(153, 0, 0));
		 first_register.setFont(new Font("Arial", Font.BOLD, 22));
		 first_register.setBounds(355, 244, 159, 52);
		 panel_1.add(first_register);
		 first_register.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		first_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 		register_frame.setVisible(true);
		 		}
		 });
		 first_login.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	        first_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	        login_frame.setVisible(true);
		 	}
		 });
	 }
	
	
	                        /********** LOGIN FUNCTION **********/
	public void login()
	{
		login_frame = new JFrame ();
		login_frame.getContentPane().setBackground(Color.WHITE);
		login_frame.setSize(955, 585);
		login_frame.getContentPane().setLayout(null);
		login_frame.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 0));
		panel.setBounds(0, 0, 284, 548);
		login_frame.getContentPane().add(panel);
		
		login_userid = new JLabel("User Id");
		login_userid.setFont(new Font("Arial", Font.PLAIN, 18));
		login_userid.setBounds(324, 116, 82, 44);
		login_frame.getContentPane().add(login_userid);
		
		JLabel login_pwd = new JLabel("Password\r\n");
		login_pwd.setFont(new Font("Arial", Font.PLAIN, 18));
		login_pwd.setBounds(324, 238, 82, 36);
		login_frame.getContentPane().add(login_pwd);
		
		userid_text = new JTextField();
		userid_text.setBounds(434, 115, 303, 51);
		login_frame.getContentPane().add(userid_text);
		userid_text.setColumns(10);
		
		pwd_text = new JPasswordField();
		pwd_text.setBounds(434, 236, 303, 51);
		login_frame.getContentPane().add(pwd_text);
		
		login_button = new JButton("LogIn");
		login_button.setBackground(new Color(153, 0, 0));
		login_button.setForeground(new Color(0, 0, 0));
		login_button.setFont(new Font("Arial", Font.BOLD, 20));
		
		login_button.setBounds(592, 470, 108, 44);
		login_frame.getContentPane().add(login_button);
		
	    login_back = new JButton("Back");
	    login_back.setBackground(new Color(153, 0, 0));
	    login_back.setFont(new Font("Arial", Font.BOLD, 20));
	    login_back.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	        first_page.setVisible(true);
	    	}
	    });
	    login_back.setBounds(790, 470, 108, 44);
		login_frame.getContentPane().add(login_back);
		
		login_role = new JLabel("Role");
		login_role.setFont(new Font("Arial", Font.PLAIN, 18));
		login_role.setBounds(334, 374, 60, 30);
		login_frame.getContentPane().add(login_role);
		
		role_txt = new JTextField();
		role_txt.setBounds(447, 366, 290, 51);
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
				
				for(int i=0;i<10;i++)
				{
					if(userid_array[I]==str_userid && password_array[I]==str_pwd && role[I]==str_role)
					{
						/*switch(str_role)
						{
					     	case "Customer" :
							     Customer cr = new Customer();
						     	 login_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                 cr.setVisible(true);
                                 break;
						   case "Driver" :
							     Driver d= new Driver();
						         login_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
							     d.setVisible(true);
							     break;
					       case "Manager" :
						     	 Manager m = new Manager();
						     	 login_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
						     	 m.show();
						         break;
						
						}*/
							
								
					}
					
				}
			}
		});
		
		
	    }
                             	  /********** REGISTER FUNCTION **********/
	/*public void register()
	{
		register_frame = new JFrame ();
		register_frame.getContentPane().setBackground(Color.WHITE);
		register_frame.setSize(955, 585);
		register_frame.setVisible(false);
		register_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 263, 548);
		panel.setBackground(new Color(153, 0, 0));
		register_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JRadioButton customer_radio = new JRadioButton("Customer");
		customer_radio.setBackground(new Color(211, 211, 211));
		customer_radio.setFont(new Font("Arial", Font.PLAIN, 18));
		customer_radio.setBounds(724, 173, 133, 30);
		register_frame.getContentPane().add(customer_radio);
		
		JRadioButton manager_radio = new JRadioButton("Manager");
		manager_radio.setBackground(new Color(211, 211, 211));
		manager_radio.setFont(new Font("Arial", Font.PLAIN, 18));
		manager_radio.setBounds(724, 311, 121, 30);
		register_frame.getContentPane().add(manager_radio);
		
		ButtonGroup group = new ButtonGroup ();
		group.add(customer_radio);
		group.add(manager_radio);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(262, 0, 679, 548);
		register_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		name_txt = new JTextField();
		name_txt.setBounds(159, 81, 179, 39);
		panel_1.add(name_txt);
		name_txt.setColumns(10);
		
		register_name = new JLabel("Name\r\n");
		register_name.setFont(new Font("Arial", Font.PLAIN, 18));
		register_name.setBounds(40, 90, 157, 17);
		panel_1.add(register_name);
		
		phone_txt = new JTextField();
		phone_txt.setBounds(159, 206, 179, 39);
		panel_1.add(phone_txt);
		phone_txt.setColumns(10);
		
	    register_userid = new JLabel(" User Id");
	    register_userid.setBounds(40, 206, 157, 26);
	    panel_1.add(register_userid);
	    register_userid.setFont(new Font("Arial", Font.PLAIN, 18));
	    register_userid.setForeground(new Color(0, 0, 0));
	    
	    register_userid_txt = new JTextField();
	    register_userid_txt.setBounds(159, 320, 179, 39);
	    panel_1.add(register_userid_txt);
	    register_userid_txt.setColumns(10);
	    
	    register_pwd = new JLabel("Password");
	    register_pwd.setBounds(40, 321, 174, 32);
	    panel_1.add(register_pwd);
	    register_pwd.setFont(new Font("Arial", Font.PLAIN, 18));
	    
	    register_pwd_txt = new JTextField();
	    register_pwd_txt.setBounds(159, 423, 179, 39);
	    panel_1.add(register_pwd_txt);
	    register_pwd_txt.setColumns(10);
	    
	    JLabel lblNewLabel = new JLabel(" Phone\r\n Number");
	    lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
	    lblNewLabel.setBounds(21, 412, 227, 56);
	    panel_1.add(lblNewLabel);
	    
	    role_label = new JLabel("Select Your Role");
	    role_label.setBounds(447, 124, 186, 30);
	    panel_1.add(role_label);
	    role_label.setFont(new Font("Arial", Font.BOLD, 20));
	    
	    JRadioButton driver_radio = new JRadioButton("Driver");
	    driver_radio.setBackground(new Color(211, 211, 211));
	    driver_radio.setBounds(467, 243, 122, 26);
	    panel_1.add(driver_radio);
	    driver_radio.setFont(new Font("Arial", Font.PLAIN, 18));
	    group.add(driver_radio);
	    
	    register_b1 = new JButton("Back");
	    register_b1.setBackground(new Color(153, 0, 0));
	    register_b1.setBounds(530, 494, 103, 43);
	    panel_1.add(register_b1);
	    register_b1.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    register_button = new JButton("Register");
	    register_button.setBackground(new Color(153, 0, 0));
	    register_button.setBounds(313, 494, 133, 43);
	    panel_1.add(register_button);
	    register_button.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    
	    register_button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		String str_name = name_txt.getText();
	    		String str_userid = register_userid_txt.getText();
	    		String str_pwd_register = register_pwd_txt.getText();
	    	//	int n_phone = phone_txt.getText();    //error
	    		
	    		name_array[I] = str_name ;
	    	//	phone_array[I] = n_phone ;            //error
	    		userid_array[I] = str_userid ;
	    		password_array[I] = str_pwd_register ;
	    	    if (e.getSource()==customer_radio)
	    	    {
	    	    	role[I] = "Customer";
	    	    }
	    	    else if (e.getSource()==driver_radio)
	    	    {
	    	    	role[I]= "Driver";
	    	    	
	    	    }
	    	    else
	    	    	role[I] = "Manager";
	    		I++ ;
	    		
	    		register_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    		login_frame.setVisible(true);
	    		
	    	}
	    });
	    register_b1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                    first_page.setVisible(true);
	    	}
	    });
		
		
	  }
	                 /********** MAIN BODY FOR USER CLASS **********/
	public static void main(String[] args) 
	{
		User u = new User();
	   u.first_page();
	    u.register();
	   u.login();
	    }    
  }  //end of User Class
