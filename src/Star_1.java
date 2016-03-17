import java.applet.Applet;
import java.awt.Graphics;


/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Ten Pointed Star
 *	Project Description: a.	This program is 
 *  intended to generate a 10 pointed star
 *  based on a set of x and y arrays. The 
 *  drawPolygon method then draws a polygon, 
 *  in this case a 10 pointed star, on the applet.
 * 
 **/

public class Star_1 extends Applet{
	public void init(){		// Start of the init Method
		this.setSize(500, 500);		// Sets Screen Size
	}	// End of init method
	public void paint(Graphics g){	// Start of the paint method

		int xPos[] = {250, 220, 100, 200, 175, 250, 320, 300, 400, 280};	// X Position Array for polygon to be drawn
		int yPos[] = {0, 150, 150, 250, 400, 310, 400, 250, 150, 150};		// Y Positions array for polygon to be drawn

		g.drawPolygon(xPos, yPos, 10);	// Draws the polygon 
	}// End of the paint method
}	// End of the Star_1 class
