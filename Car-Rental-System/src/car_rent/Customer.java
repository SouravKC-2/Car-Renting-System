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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(-11, 0, 247, 443);
		customer_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(234, 0, 351, 443);
		customer_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Book a Ride");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(93, 36, 158, 62);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Update Booking");
		btnNewButton.setBounds(93, 130, 158, 69);
		panel_1.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Payment");
		btnNewButton_1.setBounds(93, 241, 158, 62);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Give Feedback");
		btnNewButton_3.setBounds(102, 340, 149, 55);
		panel_1.add(btnNewButton_3);
		
	}

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) 
	{
	       
	}
}
