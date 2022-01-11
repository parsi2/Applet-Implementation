/*
 * Mana Parsi
 * CS A170
 * Februrary 14, 2017
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;


public class Snowman extends JApplet 
{
		
	public void init()
	{
		setSize(600, 300);
	}

	
	 public void paint(Graphics canvas)
	    {
	        canvas.setColor(Color.BLACK);
	        canvas.drawOval(22, 80, 60, 60);
	        canvas.setColor(Color.BLACK);
	        canvas.drawOval(10, 140, 90, 90);
	        canvas.setColor(Color.BLACK);
	        canvas.drawOval(31, 40, 40, 40);
	        canvas.setColor(Color.BLACK);
	        canvas.fillOval(41, 50, 8, 8);
	        canvas.setColor(Color.BLACK);
	        canvas.fillOval(53, 50, 8, 8);
	        canvas.setColor(Color.BLACK);
	        canvas.drawArc(44, 58, 15, 15, -0, -180);
	    }
}