import java.applet.Applet;
import java.awt.Graphics;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Five Point Star
 *	Project Description: a.	This program is 
 *  intended to generate a 5 pointed star
 *  based on a set of x and y arrays. The 
 *  drawPolygon method then draws a polygon, 
 *  in this case a 5 pointed star, on the applet.
 * 
 **/

public class Star_2 extends Applet{
	public void init(){		// Init method
		this.setSize(500, 500);		// Set the size of the applet
	}	// End of init method
	public void paint(Graphics g){	// Paint method

		int xPos[] = {250, 100, 400, 100, 400};		// XPos array for the 5 pointed star
		int yPos[] = {0, 400, 200, 200, 400};		// YPos array for the 5 pointed star
		
		g.drawPolygon(xPos, yPos, 5);	// Draws the polygon
	} // End of paint method
}	// End of the star_2 Class
