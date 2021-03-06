package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Car_Booking 
{   
	public int num;
	JFrame carbooking_frame ;
	
	public void book_car()
	{
		carbooking_frame = new JFrame();
		carbooking_frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Car_Booking cb = new Car_Booking();
	    cb.book_car();
	}


}
