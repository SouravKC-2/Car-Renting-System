package car_rent;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class Manager
{
    
	JFrame manager_frame ;
    JFrame check_frame ;
    JFrame update_details ;
    private JTable table;
    
    ArrayList<String> name_array = new ArrayList<String>();
	ArrayList<String> userid_array = new ArrayList<String>();
	ArrayList<String> password_array = new ArrayList<String>();
	ArrayList<String> role_array = new ArrayList<String>();
	ArrayList<Integer> phone_array = new ArrayList<Integer>();
	 
	public void first()
	{
		   manager_frame = new JFrame();
	       manager_frame.getContentPane().setLayout(null);
	       
	       JPanel panel = new JPanel();
	       panel.setBounds(0, 0, 231, 510);
	       manager_frame.getContentPane().add(panel);
	       panel.setLayout(null);
	       
	       JButton checkdetails_button = new JButton("New button");
	       checkdetails_button.setBounds(357, 113, 85, 21);
	       manager_frame.getContentPane().add(checkdetails_button);
	       
	       JButton update_button = new JButton("New button");
	       update_button.setBounds(357, 211, 85, 21);
	       manager_frame.getContentPane().add(update_button);
	       
	       JButton report_button = new JButton("New button");
	       report_button.setBounds(357, 296, 85, 21);
	       manager_frame.getContentPane().add(report_button);
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
	public void Visible()
	{
		manager_frame.setVisible(true);
	}
}
