package car_rent;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class Customer 
{

	JFrame customer_frame ;
	
	Customer ()
	{
		 customer_frame = new JFrame ();
		 customer_frame.getContentPane().setBackground(Color.WHITE);
	     customer_frame.setSize(1200,700);
	     customer_frame.getContentPane().setLayout(null);
	     
	     JPanel panel = new JPanel();
	     panel.setBackground(new Color(178, 34, 34));
	     panel.setBounds(0, 0, 300, 700);
	     customer_frame.getContentPane().add(panel);
	     panel.setLayout(null);
	     
	     Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
	      
	      JPanel panel_1 = new JPanel();
	      panel_1.setBorder(new LineBorder(new Color(178, 34, 34), 2));
	      panel_1.setBackground(Color.WHITE);
	      panel_1.setBounds(272, 0, 928, 700);
	      customer_frame.getContentPane().add(panel_1);
	      panel_1.setLayout(null);
	      
	      JButton feedback_button = new JButton("Feedback");
	      feedback_button.setBounds(348, 506, 200, 60);
	      panel_1.add(feedback_button);
	      feedback_button.setForeground(new Color(178, 34, 34));
	      feedback_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
	      feedback_button.setBackground(Color.WHITE);
	      feedback_button.setBorder(border);
	      
	      JButton payment_button = new JButton("Payment");
	      payment_button.setBounds(348, 396, 200, 60);
	      panel_1.add(payment_button);
	      payment_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
	      payment_button.setForeground(new Color(178, 34, 34));
	      payment_button.setBackground(Color.WHITE);
	      payment_button.setBorder(border);
	      
	      JLabel image_book = new JLabel("");
	      image_book.setBounds(276, 159, 50, 50);
	      panel_1.add(image_book);
	      image_book.setIcon(new ImageIcon("F:\\CRS\\jeep.png"));
	      image_book.setHorizontalAlignment(SwingConstants.CENTER);
	      
	      JButton update_button = new JButton("Update");
	      update_button.setBounds(348, 278, 200, 60);
	      panel_1.add(update_button);
	      
	       update_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
	       update_button.setForeground(new Color(178, 34, 34));
	       update_button.setBackground(Color.WHITE);
	       update_button.setBorder(border);
	       
	       JButton car_book_button = new JButton("Book a Ride");
	       car_book_button.setBounds(348, 159, 200, 60);
	       panel_1.add(car_book_button);
	       car_book_button.setForeground(new Color(178, 34, 34));
	       car_book_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
	       car_book_button.setBackground(Color.WHITE);
	       car_book_button.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       	           customer_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	       	           Car c1 = new Car();
	       	           c1.show_car();
	       	}
	       });
	       car_book_button.setBorder(border);
	       
	       JLabel image_update = new JLabel("");
	       image_update.setBounds(276, 278, 62, 50);
	       panel_1.add(image_update);
	       image_update.setIcon(new ImageIcon("F:\\CRS\\updated.png"));
	       image_update.setHorizontalAlignment(SwingConstants.CENTER);
	       
	       JLabel image_payment = new JLabel("");
	       image_payment.setBounds(265, 396, 62, 60);
	       panel_1.add(image_payment);
	       image_payment.setIcon(new ImageIcon("F:\\CRS\\money.png"));
	       image_payment.setHorizontalAlignment(SwingConstants.CENTER);
	       
	       JLabel image_feedback = new JLabel("");
	       image_feedback.setBounds(264, 506, 62, 60);
	       panel_1.add(image_feedback);
	       image_feedback.setIcon(new ImageIcon("F:\\CRS\\rating.png"));
	       image_feedback.setHorizontalAlignment(SwingConstants.CENTER);
	       
	       JLabel home = new JLabel("");
	       home.setBounds(822, 0, 50, 50);
	       panel_1.add(home);
	       home.addMouseListener(new MouseAdapter() {
	       	@Override
	       	public void mouseClicked(MouseEvent e) {
	       		User u =new User();
	       		customer_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	       		u.first_page();
	       	}
	       });
	       home.setIcon(new ImageIcon("F:\\CRS\\home (2).png"));
	       home.setHorizontalAlignment(SwingConstants.CENTER);
	       
	       JLabel exit = new JLabel("X");
	       exit.setBounds(878, 0, 50, 50);
	       panel_1.add(exit);
	       exit.addMouseListener(new MouseAdapter() {
	       	@Override
	       	public void mouseClicked(MouseEvent e) {
	       		System.exit(0);
	       	}
	       });
	       exit.setForeground(new Color(178, 34, 34));
	       exit.setHorizontalAlignment(SwingConstants.CENTER);
	       exit.setFont(new Font("Tahoma", Font.BOLD, 40));
	     
	     
	     customer_frame.setUndecorated(true);
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
