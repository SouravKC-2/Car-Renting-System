package car_rent;

import javax.swing.*;
import javax.swing.border.Border;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class Manager
{
    
	JFrame manager_frame ;
    JFrame check_frame ;
    JFrame update_details ;
    // private JTable table;
    
    ArrayList<String> name_array = new ArrayList<String>();
	ArrayList<String> userid_array = new ArrayList<String>();
	ArrayList<String> password_array = new ArrayList<String>();
	ArrayList<String> role_array = new ArrayList<String>();
	ArrayList<Integer> phone_array = new ArrayList<Integer>();
	 
	public void first()
	{
		   manager_frame = new JFrame();
		   manager_frame.getContentPane().setBackground(Color.WHITE);
	       manager_frame.getContentPane().setLayout(null);
	       manager_frame.setSize(1200, 700);
	       
	       JPanel panel = new JPanel();
	       panel.setBackground(new Color(178, 34, 34));
	       panel.setBounds(0, 0, 300, 700);
	       manager_frame.getContentPane().add(panel);
	       panel.setLayout(null);
	       
	       Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
	       
	       JPanel panel_1 = new JPanel();
	       panel_1.setBackground(Color.WHITE);
	       panel_1.setBorder(new LineBorder(new Color(178, 34, 34), 2));
	       panel_1.setBounds(272, 0, 928, 700);
	       manager_frame.getContentPane().add(panel_1);
	       panel_1.setLayout(null);
	       
	       JButton report_button = new JButton("View Report");
	       report_button.setBounds(326, 528, 300, 50);
	       panel_1.add(report_button);
	       report_button.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       	}
	       });
	       report_button.setBackground(Color.WHITE);
	       report_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
	       report_button.setForeground(new Color(178, 34, 34));
	       report_button.setBorder(border);
	       
	       JButton update_button = new JButton("Update Details");
	       update_button.setBounds(326, 367, 300, 50);
	       panel_1.add(update_button);
	       update_button.setBackground(Color.WHITE);
	       update_button.setForeground(new Color(178, 34, 34));
	       update_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
	       update_button.setBorder(border);
	       
	       JButton checkdetails_button = new JButton("Check Customer Details");
	       checkdetails_button.setBounds(326, 202, 300, 50);
	       panel_1.add(checkdetails_button);
	       checkdetails_button.setBackground(Color.WHITE);
	       checkdetails_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
	       checkdetails_button.setForeground(new Color(178, 34, 34));
	       checkdetails_button.setBorder(border);
	       
	       JLabel image_check = new JLabel("");
	       image_check.setBounds(211, 202, 50, 50);
	       panel_1.add(image_check);
	       image_check.setIcon(new ImageIcon("F:\\CRS\\checked.png"));
	       image_check.setFont(new Font("Tahoma", Font.BOLD, 40));
	       image_check.setBackground(Color.WHITE);
	       image_check.setForeground(new Color(178, 34, 34));
	       image_check.setHorizontalAlignment(SwingConstants.CENTER);
	       
	       JLabel image_update = new JLabel("");
	       image_update.setBounds(211, 367, 50, 50);
	       panel_1.add(image_update);
	       image_update.setIcon(new ImageIcon("F:\\CRS\\refresh-button.png"));
	       image_update.setHorizontalAlignment(SwingConstants.CENTER);
	       image_update.setForeground(new Color(178, 34, 34));
	       image_update.setFont(new Font("Tahoma", Font.BOLD, 40));
	       image_update.setBackground(Color.WHITE);
	       
	       JLabel image_report = new JLabel("");
	       image_report.setBounds(211, 528, 50, 50);
	       panel_1.add(image_report);
	       image_report.setIcon(new ImageIcon("F:\\CRS\\profit-report.png"));
	       image_report.setHorizontalAlignment(SwingConstants.CENTER);
	       image_report.setForeground(new Color(178, 34, 34));
	       image_report.setFont(new Font("Tahoma", Font.BOLD, 40));
	       image_report.setBackground(Color.WHITE);
	       
	       JLabel home = new JLabel("");
	       home.setBounds(821, 0, 50, 50);
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
	       home.setFont(new Font("Tahoma", Font.BOLD, 40));
	       home.setBackground(Color.WHITE);
	       
	       JLabel exit = new JLabel("X");
	       exit.setBounds(878, 0, 50, 50);
	       panel_1.add(exit);
	       exit.addMouseListener(new MouseAdapter() {
	       	@Override
	       	public void mouseClicked(MouseEvent e) {
	       		System.exit(0);
	       	}
	       });
	       exit.setHorizontalAlignment(SwingConstants.CENTER);
	       exit.setForeground(new Color(178, 34, 34));
	       exit.setFont(new Font("Tahoma", Font.BOLD, 40));
	       exit.setBackground(Color.WHITE);
	       
	       
	       manager_frame.setUndecorated(true);
	       manager_frame.setVisible(true);
	   }
                  /***** CHECK DETAILS FUNCTION *****/	
   /* public void check()
    {
    	User u1 = new User();
    	//name_array = u1.name_array;
    	//role = u1.role;
    	//userid_array = u1.userid_array;
    //	int j = u1.I;
    	check_frame = new JFrame ();
    	check_frame.setSize(800,500);
    	check_frame.getContentPane().setLayout(null);
    	
    	JPanel panel = new JPanel();
    	panel.setBounds(10, 10, 766, 443);
    	check_frame.getContentPane().add(panel);
    	panel.setLayout(null);
    	
    	//table = new JTable(row,columns);
    	table.setBounds(105, 85, 513, 307);
    	panel.add(table);
    	check_frame.setVisible(true);
    	
    	User u = new User();
    	name_array = u.name_array;
    	userid_array = u.userid_array;
    	phone_array = u.phone_array ;
    	
    	String[] header = {"No.","Name","User ID","Phone Number"};
    	//Object[][] data = {name_array,userid_array,phone_array};
    	
    	ArrayList<String> name = new ArrayList<String>();
    	
    	for(int a=0 ; a<name_array.size(); a++)
    	{
    		name.add(name_array.get(a));
    	   }
        Object data[] = name.toArray();
        
    	
    	DefaultTableModel model = new DefaultTableModel();
    	table = new JTable(model);
    	
    	
    	for (int i =0; i<name_array.size();i++) {
           //  String index = i+1;
         //   String name = name_array.get(i);
           // String userid = userid_array.get(i);
           //String phone = phone_array.get(i);
           // String time = medList.get(i);
           
           // Component data = {index , name , userid };
           // table.add(data);
            
            //Object[] data = {index,medicine, dose, date, time};         
            //table.addRow(data);
            }	
    }*/
	public static void main(String[] args)
	{
	       Manager m =new Manager();
	       //System.out.println(j);
	       m.first();
	       //m.check();
	  
	}
	
}
