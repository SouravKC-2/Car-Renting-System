package car_rent;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Car  
{
	JFrame car_frame , sedan_frame , suv_frame , hatchback_frame ;
	public int n=0;
	ArrayList<String> car_select = new ArrayList<String>(); 
	                                               /***** SHOW CAR PAGE ******/
	public void show_car()
	{
		car_frame = new JFrame ();
		car_frame.setSize(935,546);
		car_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 278, 509);
		car_frame.getContentPane().add(panel);
		
		JButton hatchback_button = new JButton("New button");
		hatchback_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				car_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				hatchback_frame.setVisible(true);
			}
		});
		hatchback_button.setBounds(587, 298, 85, 21);
		car_frame.getContentPane().add(hatchback_button);
		
		JButton sedan_button = new JButton("New button");
		sedan_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			       car_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    
				   sedan_frame.setVisible(true);
			}
		});
		
		sedan_button.setBounds(587, 167, 85, 21);
		car_frame.getContentPane().add(sedan_button);
		
		JButton suv_button = new JButton("New button");
		suv_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				car_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				suv_frame.setVisible(true);
			}
		});
		suv_button.setBounds(587, 420, 85, 21);
		car_frame.getContentPane().add(suv_button);
		
		JLabel choose_label = new JLabel("New label");
		choose_label.setBounds(360, 268, 45, 13);
		car_frame.getContentPane().add(choose_label);
		car_frame.setVisible(true);
	    }
                                       	/*** SEDAN FUNCTION ***/
	public void sedan()
	{
		sedan_frame = new JFrame ();
		sedan_frame.setSize(700, 500);
		sedan_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 204, 443);
		sedan_frame.getContentPane().add(panel);
		
		JButton proceed_button = new JButton("New button");
		
		proceed_button.setBounds(401, 418, 85, 21);
		sedan_frame.getContentPane().add(proceed_button);
		
		JButton back_button = new JButton("New button");
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			             sedan_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			             car_frame.setVisible(true);
			}
		});
		back_button.setBounds(536, 418, 85, 21);
		sedan_frame.getContentPane().add(back_button);
		
		JRadioButton city_radiobutton = new JRadioButton("New radio button");
		city_radiobutton.setBounds(364, 146, 103, 21);
		sedan_frame.getContentPane().add(city_radiobutton);
		
		JRadioButton verna_radiobutton = new JRadioButton("New radio button");
		verna_radiobutton.setBounds(364, 221, 103, 21);
		sedan_frame.getContentPane().add(verna_radiobutton);
		
		JRadioButton ciaz_radiobutton = new JRadioButton("New radio button");
		ciaz_radiobutton.setBounds(364, 314, 103, 21);
		sedan_frame.getContentPane().add(ciaz_radiobutton);
		
		JLabel choose_label = new JLabel("New label");
		choose_label.setBounds(273, 78, 45, 13);
		sedan_frame.getContentPane().add(choose_label);
		//sedan_frame.setVisible(true);
		
		proceed_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(city_radiobutton.isSelected())
				{
					car_select.add("Honda City") ;
					sedan_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if (verna_radiobutton.isSelected())
				{
					car_select.add("Hyundai Verna");
					sedan_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else
				{
					car_select.add("Suzuki Ciaz");
					sedan_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				Car_Booking cb2 = new Car_Booking();
				cb2.book_car();
			}
		});
		
		ButtonGroup group =new ButtonGroup();
	    group.add(city_radiobutton);
	    group.add(verna_radiobutton);
	    group.add(ciaz_radiobutton);
	}
	                                      /*** SUV FUNCTION ***/
	public void suv()
	{
		suv_frame = new JFrame ();
		suv_frame.setSize(700, 500);
		suv_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 206, 453);
		suv_frame.getContentPane().add(panel);
		
		JRadioButton scorpio_radiobutton = new JRadioButton("New radio button");
		scorpio_radiobutton.setBounds(357, 125, 103, 21);
		suv_frame.getContentPane().add(scorpio_radiobutton);
		
		JRadioButton fortuner_radiobutton = new JRadioButton("New radio button");
		fortuner_radiobutton.setBounds(357, 201, 103, 21);
		suv_frame.getContentPane().add(fortuner_radiobutton);
		
		JRadioButton safari_radiobutton = new JRadioButton("New radio button");
		safari_radiobutton.setBounds(357, 280, 103, 21);
		suv_frame.getContentPane().add(safari_radiobutton);
		
		JButton proceed_button = new JButton("New button");
		proceed_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(scorpio_radiobutton.isSelected())
				{
					car_select.add("Mahindra Scorpio") ;
					suv_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if (fortuner_radiobutton.isSelected())
				{
					car_select.add("Toyota Fortuner");
					suv_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else
				{
					car_select.add("Tata Safari");
					suv_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				Car_Booking cb1 = new Car_Booking();
				cb1.book_car();
			}
		});
		proceed_button.setBounds(397, 405, 85, 21);
		suv_frame.getContentPane().add(proceed_button);
		
		JButton back_button = new JButton("New button");
		back_button.setBounds(537, 405, 85, 21);
		suv_frame.getContentPane().add(back_button);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			             suv_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			             car_frame.setVisible(true);
			}
		});
		
		JLabel choose_button = new JLabel("New label");
		choose_button.setBounds(255, 68, 45, 13);
		suv_frame.getContentPane().add(choose_button);
		//suv_frame.setVisible(true);
	
		ButtonGroup group =new ButtonGroup();
	    group.add(scorpio_radiobutton);
	    group.add(fortuner_radiobutton);
	    group.add(safari_radiobutton);
		
     	}
                                                 	/***** HATCHBACK FUNCTION *****/
	public void hatchback()
	{
		hatchback_frame= new JFrame ();
		hatchback_frame.setSize(801, 558);
		hatchback_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 221, 511);
		hatchback_frame.getContentPane().add(panel);
		
		JRadioButton i20_radiobutton = new JRadioButton("New radio button");
		i20_radiobutton.setBounds(431, 139, 103, 21);
		hatchback_frame.getContentPane().add(i20_radiobutton);
		
		JRadioButton swift_radiobutton = new JRadioButton("New radio button");
		swift_radiobutton.setBounds(431, 239, 103, 21);
		hatchback_frame.getContentPane().add(swift_radiobutton);
		
		JRadioButton baleno_radiobutton = new JRadioButton("New radio button");
		baleno_radiobutton.setBounds(431, 338, 103, 21);
		hatchback_frame.getContentPane().add(baleno_radiobutton);
		
		JButton proceed_button = new JButton("New button");
		proceed_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i20_radiobutton.isSelected())
				{
					car_select.add("Hyundai i20") ;
					hatchback_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if (swift_radiobutton.isSelected())
				{
					car_select.add("Maruti Swift");
					hatchback_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else
				{
					car_select.add("Maruti Baleno");
					hatchback_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
			Car_Booking cb3 = new Car_Booking();
			cb3.book_car();
			}
		});
		proceed_button.setBounds(505, 470, 85, 21);
		hatchback_frame.getContentPane().add(proceed_button);
		
		JButton back_button = new JButton("New button");
		back_button.setBounds(641, 470, 85, 21);
		hatchback_frame.getContentPane().add(back_button);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			             hatchback_frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			             car_frame.setVisible(true);
			}
		});
		
		JLabel choose_button = new JLabel("New label");
		choose_button.setBounds(306, 76, 45, 13);
		hatchback_frame.getContentPane().add(choose_button);
		//hatchback_frame.setVisible(true);
	    
		ButtonGroup group =new ButtonGroup();
	    group.add(i20_radiobutton);
	    group.add(swift_radiobutton);
	    group.add(baleno_radiobutton);
		
	}
	public void Visible()
	{
		car_frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Car c = new Car();
	    c.show_car();
		c.sedan();
		c.suv();
		c.hatchback();
	}
}
