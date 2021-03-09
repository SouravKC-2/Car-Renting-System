package car_rent;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class look 
{

	public JFrame car_booking ;
	public void show()
	{
		car_booking = new JFrame();
		car_booking.setSize(700, 500);
		car_booking.setVisible(true);
	}
	public void Visible()
	{
		car_booking.setVisible(true);
	}
	public static void main(String[] args) {
		look l =new look();
		l.show();
		l.Visible();
	}

}
