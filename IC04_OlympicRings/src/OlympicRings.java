/*
 * Mana Parsi
 * CS A170
 * Februrary 9, 2017
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

// To tell Java you're creating an applet, add "extends JApplet"
public class OlympicRings extends JApplet
{
    //Applets have two methods:
    // 1) init - initialize, set the size of the applet
    // 2) paint - write code for all graphics
    
    public void init()
    {   
        //Define the size of your applet (in pixels)
        //Let's make an applet 300 x 300 pixels
        setSize(600, 300);
        
    }
    
    public void paint(Graphics canvas)
    {
        //To thicken lines:
        Graphics2D canvas2D= (Graphics2D) canvas;
        // Sets the stroke 5 times the thickeness of the default
        canvas2D.setStroke(new BasicStroke(5));
        
        //Let's draw our first olympic ring
        // Everything we draw goes on the canvas
        // Change the color to BLUE:
        canvas.setColor(Color.BLUE);
        canvas.drawOval(10, 10, 100, 100);
        canvas.setColor(Color.YELLOW);
        canvas.drawOval(60, 60, 100, 100);
        canvas.setColor(Color.BLACK);
        canvas.drawOval(120, 10, 100, 100);
        canvas.setColor(Color.GREEN);
        canvas.drawOval(170, 60, 100, 100);
        canvas.setColor(Color.RED);
        canvas.drawOval(230, 10, 100, 100);
    }
    
    

    
}
