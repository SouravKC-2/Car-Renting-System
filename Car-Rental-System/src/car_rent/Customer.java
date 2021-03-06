package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Customer 
{

	JFrame customer_frame ;
	
	Customer ()
	{
		 customer_frame = new JFrame ();
	     customer_frame.setSize(800, 500);
	     customer_frame.getContentPane().setLayout(null);
	     
	     JPanel panel = new JPanel();
	     panel.setBounds(0, 0, 196, 463);
	     customer_frame.getContentPane().add(panel);
	     
	     JButton car_book_button = new JButton("New button");
	     car_book_button.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	     	           customer_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	     	           Car c1 = new Car();
	     	           c1.Visible();
	     	}
	     });
	     car_book_button.setBounds(408, 119, 85, 21);
	     customer_frame.getContentPane().add(car_book_button);
	     
	     JButton update_button = new JButton("New button");
	     update_button.setBounds(408, 219, 85, 21);
	     customer_frame.getContentPane().add(update_button);
	     
	     JButton cancel_button = new JButton("New button");
	     cancel_button.setBounds(408, 311, 85, 21);
	     customer_frame.getContentPane().add(cancel_button);
	     
	     JButton feedback_button = new JButton("New button");
	     feedback_button.setBounds(408, 403, 85, 21);
	     customer_frame.getContentPane().add(feedback_button);
	     customer_frame.setVisible(true);
	}

	
	public static void main(String[] args) 
	{
	       Customer c =new Customer ();
	}
	public void Visible()
	{
		customer_frame.setVisible(true);
	}
}
