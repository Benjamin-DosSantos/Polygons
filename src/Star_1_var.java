import java.applet.Applet;
import java.awt.Graphics;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: 10 Pointed Star with variables
 *	Project Description: a.	This program 
 *  is intended to generate a 10 pointed 
 *  star based on a set of x and y arrays. 
 *  The drawPolygon method then draws a 
 *  polygon, in this case a 10 pointed star, 
 *  on the applet. The x and y points are 
 *  all effected by a base number that 
 *  can be used to move the polygon around 
 *  the applet.
 * 
 **/

public class Star_1_var extends Applet{
	public void init(){
		this.setSize(500, 500);		// Sets the size of the frame 
	}	// End of the init method
	public void paint(Graphics g){

		int startPosition = 600;	// Set the position for the polygon to be drawn at 
		
		// X Pos array for the star to be drawn 
		int xPos[] = {startPosition + 150, startPosition + 120, startPosition, startPosition + 100, startPosition + 75, startPosition + 150, startPosition + 220, startPosition + 200, startPosition + 300, startPosition + 180};
		// Y Pos array for the star to be drawn 
		int yPos[] = {startPosition - 100, startPosition + 50, startPosition + 50, startPosition + 150, startPosition + 300, startPosition + 210, startPosition + 300, startPosition + 150, startPosition + 50, startPosition + 50};

		g.drawPolygon(xPos, yPos, 10);	// Draws the 5 point star 
	}	// End of the paint method
}	// End of the class
