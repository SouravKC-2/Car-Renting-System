package car_rent;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class User 
{
	                        /************************************************************ General Details ************************************************************/
	static ArrayList<String> name_array = new ArrayList<String>();
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
	
	
	
	
	JFrame first_page;
	
	
	                     /***** REGISTER FRAME *****/
	JFrame register_frame;
	JLabel register_name , register_phone , register_userid , register_pwd , role_label ;
	JTextField name_txt , phone_txt , register_userid_txt , register_pwd_txt ;
	JButton register_button , register_b1 ;
	
	
	                                               /********** FIRST PAGE FUNCTION **********/
	public void first_page()
	 {
		 first_page = new JFrame ();
		 //first_page.setResizable(false);
		 first_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 first_page.getContentPane().setBackground(Color.WHITE);
		 first_page.setSize(800, 600);
		 first_page.getContentPane().setLayout(null);
		 first_page.setVisible(true);
		 
		 JPanel panel = new JPanel();
		 panel.setBackground(Color.CYAN);
		 panel.setBounds(0, 0, 968, 404);
		 first_page.getContentPane().add(panel);
		 panel.setLayout(null);
		 
		 JLabel c = new JLabel("New label");
		 c.setBounds(423, 357, 45, 13);
		 panel.add(c);
		 
		 JButton first_login = new JButton("New button");
		 first_login.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	        first_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	        login_frame.setVisible(true);
		 	}
		 });
		 first_login.setBounds(313, 456, 85, 21);
		 first_page.getContentPane().add(first_login);
		 
		 JButton first_register = new JButton("New button");
		 first_register.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		first_page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 		register_frame.setVisible(true);
		 		}
		 });
		 first_register.setBounds(537, 456, 85, 21);
		 first_page.getContentPane().add(first_register);
		 
		 for(String i : name_array)
	    	System.out.println(i);
		 for(int i=0; i< name_array.size() ; i++)
		 {
			 System.out.println(" ");
			 System.out.println(name_array.get(i));
		 }
	 }
	
	
	                        /********** LOGIN FUNCTION **********/
	public void login()
	{
		login_frame = new JFrame ();
		login_frame.getContentPane().setBackground(Color.WHITE);
		login_frame.setSize(955, 622);
		login_frame.getContentPane().setLayout(null);
		//login_frame.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 284, 585);
		login_frame.getContentPane().add(panel);
		
		login_userid = new JLabel("New label");
		login_userid.setBounds(341, 74, 82, 44);
		login_frame.getContentPane().add(login_userid);
		
		JLabel login_pwd = new JLabel("New label");
		login_pwd.setBounds(341, 222, 82, 36);
		login_frame.getContentPane().add(login_pwd);
		
		userid_text = new JTextField();
		userid_text.setBounds(401, 138, 303, 51);
		login_frame.getContentPane().add(userid_text);
		userid_text.setColumns(10);
		
		pwd_text = new JPasswordField();
		pwd_text.setBounds(401, 285, 303, 44);
		login_frame.getContentPane().add(pwd_text);
		
		login_button = new JButton("New button");
		
		login_button.setBounds(596, 509, 108, 44);
		login_frame.getContentPane().add(login_button);
		
	    login_back = new JButton("New button");
	    login_back.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	        first_page.setVisible(true);
	    	}
	    });
	    login_back.setBounds(736, 504, 108, 44);
		login_frame.getContentPane().add(login_back);
		
		login_role = new JLabel("New label");
		login_role.setBounds(341, 368, 45, 13);
		login_frame.getContentPane().add(login_role);
		
		role_txt = new JTextField();
		role_txt.setBounds(410, 405, 96, 19);
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
		
		
	    }
                             	  /********** REGISTER FUNCTION **********/
	public void register()
	{
		register_frame = new JFrame ();
		register_frame.getContentPane().setBackground(Color.WHITE);
		register_frame.setSize(955, 585);
		register_frame.getContentPane().setLayout(null);
		register_frame.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(165, 42, 42));
		panel.setBounds(0, 0, 223, 548);
		register_frame.getContentPane().add(panel);
		
		register_name = new JLabel("New label");
		register_name.setBounds(263, 45, 45, 13);
		register_frame.getContentPane().add(register_name);
		
		register_phone = new JLabel("New label");
		register_phone.setBounds(263, 156, 45, 13);
		register_frame.getContentPane().add(register_phone);
		
	    register_userid = new JLabel("New label");
		register_userid.setBounds(263, 272, 45, 13);
		register_frame.getContentPane().add(register_userid);
		
		register_pwd = new JLabel("New label");
		register_pwd.setBounds(263, 378, 45, 13);
		register_frame.getContentPane().add(register_pwd);
		
		register_button = new JButton("New button");
		register_button.setBounds(573, 494, 85, 21);
		register_frame.getContentPane().add(register_button);
		
		register_b1 = new JButton("New button");
		register_b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                first_page.setVisible(true);
			}
		});
		register_b1.setBounds(724, 494, 85, 21);
		register_frame.getContentPane().add(register_b1);
		
		name_txt = new JTextField();
		name_txt.setBounds(317, 98, 96, 19);
		register_frame.getContentPane().add(name_txt);
		name_txt.setColumns(10);
		
		phone_txt = new JTextField();
		phone_txt.setBounds(317, 206, 96, 19);
		register_frame.getContentPane().add(phone_txt);
		phone_txt.setColumns(10);
		
		register_userid_txt = new JTextField();
		register_userid_txt.setBounds(317, 324, 96, 19);
		register_frame.getContentPane().add(register_userid_txt);
		register_userid_txt.setColumns(10);
		
		register_pwd_txt = new JTextField();
		register_pwd_txt.setBounds(317, 423, 96, 19);
		register_frame.getContentPane().add(register_pwd_txt);
		register_pwd_txt.setColumns(10);
		
		
		JRadioButton customer_radio = new JRadioButton("New radio button");
		customer_radio.setBounds(724, 173, 103, 21);
		register_frame.getContentPane().add(customer_radio);
		
		JRadioButton driver_radio = new JRadioButton("New radio button");
		driver_radio.setBounds(724, 243, 103, 21);
		register_frame.getContentPane().add(driver_radio);
		
		JRadioButton manager_radio = new JRadioButton("New radio button");
		manager_radio.setBounds(724, 311, 103, 21);
		register_frame.getContentPane().add(manager_radio);
		
		role_label = new JLabel("New label");
		role_label.setBounds(724, 124, 66, 13);
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
			    //int n_phone = phone_txt.getText();    //error
				
				name_array.add(str_name);
				userid_array.add(str_userid);
				password_array.add(str_pwd_register);
			    if (customer_radio.isSelected())
			    {
			    	//role[I] = customer_radio.getText();
			        role_array.add("Customer");
			    }
			    else if (driver_radio.isSelected())
			    {
			    	//role[I]= driver_radio.getText();
			    	role_array.add("Driver");
			    }
			    else
			    {
			    	// role[I]= manager_radio.getText();
			    	role_array.add("Manager");
			       }
				
				register_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				login_frame.setVisible(true);
				
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
	    for(String i : name_array)
	    	System.out.println(i);
	    }    
  }  //end of User Class
