package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager
{
    
	JFrame manager_frame ;
    JFrame check_frame ;
    JFrame update_details ;
	 
	public void first()
	{
		   manager_frame = new JFrame();
	       manager_frame.getContentPane().setLayout(null);
	       manager_frame.setSize(955, 585);
	       
	       JPanel panel = new JPanel();
	       panel.setBackground(new Color(153, 0, 0));
	       panel.setBounds(0, 0, 295, 548);
	       manager_frame.getContentPane().add(panel);
	       panel.setLayout(null);
	       
	       JPanel panel_1 = new JPanel();
	       panel_1.setBackground(new Color(255, 255, 255));
	       panel_1.setBounds(293, 0, 648, 548);
	       manager_frame.getContentPane().add(panel_1);
	       panel_1.setLayout(null);
	       
	       JButton update_button = new JButton("Update");
	       update_button.setBackground(new Color(153, 0, 0));
	       update_button.setFont(new Font("Arial", Font.BOLD, 18));
	       update_button.setBounds(258, 251, 139, 46);
	       panel_1.add(update_button);
	       
	       JButton checkdetails_button = new JButton("CheckDetails");
	       checkdetails_button.setBackground(new Color(153, 0, 0));
	       checkdetails_button.setBounds(29, 251, 169, 46);
	       panel_1.add(checkdetails_button);
	       checkdetails_button.setFont(new Font("Arial", Font.BOLD, 18));
	       
	       JButton report_button = new JButton("Report\r\n");
	       report_button.setBackground(new Color(153, 0, 0));
	       report_button.setBounds(451, 251, 126, 46);
	       panel_1.add(report_button);
	       report_button.setFont(new Font("Arial", Font.BOLD, 18));
	       manager_frame.setVisible(true);
	   }
	
    public void check()
    {
    	
    }
	
	public static void main(String[] args)
	{
	       Manager ma =new Manager();
	       ma.first();
	
         }
}
