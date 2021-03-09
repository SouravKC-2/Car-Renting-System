package car_rent;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	     
	     Border border = BorderFactory.createLineBorder(new Color(178, 34, 34));
	     
	     JButton car_book_button = new JButton("Book a Ride");
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
	     car_book_button.setBounds(659, 145, 200, 60);
	     car_book_button.setBorder(border);
	     customer_frame.getContentPane().add(car_book_button);
	     
	     JButton update_button = new JButton("Update");
	     update_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
	     update_button.setForeground(new Color(178, 34, 34));
	     update_button.setBackground(Color.WHITE);
	     update_button.setBounds(659, 284, 200, 60);
	     update_button.setBorder(border);
	     customer_frame.getContentPane().add(update_button);
	     
	     JButton payment_button = new JButton("Payment");
	     payment_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
	     payment_button.setForeground(new Color(178, 34, 34));
	     payment_button.setBackground(Color.WHITE);
	     payment_button.setBounds(659, 413, 200, 60);
	     payment_button.setBorder(border);
	     customer_frame.getContentPane().add(payment_button);
	     
	     JButton feedback_button = new JButton("Feedback");
	     feedback_button.setForeground(new Color(178, 34, 34));
	     feedback_button.setFont(new Font("Tahoma", Font.PLAIN, 25));
	     feedback_button.setBackground(Color.WHITE);
	     feedback_button.setBounds(659, 538, 200, 60);
	     feedback_button.setBorder(border);
	     customer_frame.getContentPane().add(feedback_button);
	     
	     JLabel lblNewLabel = new JLabel("X");
	     lblNewLabel.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent e) {
	     		System.exit(0);
	     	}
	     });
	     lblNewLabel.setForeground(new Color(178, 34, 34));
	     lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	     lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
	     lblNewLabel.setBounds(1136, 0, 50, 50);
	     customer_frame.getContentPane().add(lblNewLabel);
	     
	     JLabel image_book = new JLabel("");
	     image_book.setIcon(new ImageIcon("F:\\CRS\\jeep.png"));
	     image_book.setHorizontalAlignment(SwingConstants.CENTER);
	     image_book.setBounds(570, 145, 62, 60);
	     customer_frame.getContentPane().add(image_book);
	     
	     JLabel image_update = new JLabel("");
	     image_update.setIcon(new ImageIcon("F:\\CRS\\updated.png"));
	     image_update.setHorizontalAlignment(SwingConstants.CENTER);
	     image_update.setBounds(587, 284, 62, 60);
	     customer_frame.getContentPane().add(image_update);
	     
	     JLabel image_payment = new JLabel("");
	     image_payment.setIcon(new ImageIcon("F:\\CRS\\money.png"));
	     image_payment.setHorizontalAlignment(SwingConstants.CENTER);
	     image_payment.setBounds(570, 413, 62, 60);
	     customer_frame.getContentPane().add(image_payment);
	     
	     JLabel image_feedback = new JLabel("");
	     image_feedback.setIcon(new ImageIcon("F:\\CRS\\rating.png"));
	     image_feedback.setHorizontalAlignment(SwingConstants.CENTER);
	     image_feedback.setBounds(570, 538, 62, 60);
	     customer_frame.getContentPane().add(image_feedback);
	     
	     JLabel lblNewLabel_1 = new JLabel("");
	     lblNewLabel_1.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent e) {
	     		User u =new User();
	     		customer_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	     		u.first_page();
	     	}
	     });
	     lblNewLabel_1.setIcon(new ImageIcon("E:\\Downloads\\homepage (1).png"));
	     lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	     lblNewLabel_1.setBounds(1076, 0, 50, 50);
	     customer_frame.getContentPane().add(lblNewLabel_1);
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
