package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Customer 
{

	JFrame customer_frame ;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	Customer ()
	{
		customer_frame = new JFrame ();
		customer_frame.getContentPane().setLayout(null);
		customer_frame.setSize(955, 585);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 0));
		panel.setBounds(0, 0, 320, 548);
		customer_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(318, 0, 623, 548);
		customer_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Book a Ride");
		btnNewButton_2.setBackground(new Color(153, 0, 0));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(105, 136, 158, 62);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Update Booking");
		btnNewButton.setBackground(new Color(153, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(372, 133, 186, 62);
		panel_1.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Payment");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(153, 0, 0));
		btnNewButton_1.setBounds(105, 335, 158, 62);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Give Feedback");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_3.setBackground(new Color(153, 0, 0));
		btnNewButton_3.setBounds(392, 339, 166, 55);
		panel_1.add(btnNewButton_3);
		
	}

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) 
	{
	       
	}
}
