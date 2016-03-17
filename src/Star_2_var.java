import java.applet.Applet;
import java.awt.Graphics;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: 5 Pointed Star Variable
 *	Project Description: a.	This program 
 *  is intended to generate a 5 pointed 
 *  star based on a set of x and y arrays. 
 *  The drawPolygon method then draws a 
 *  polygon, in this case a 5 pointed star, 
 *  on the applet. The x and y points are 
 *  all effected by a base number that 
 *  can be used to move the polygon around 
 *  the applet.
 * 
 **/

public class Star_2_var extends Applet{
	public void init(){
		this.setSize(500, 500);		// Sets the size of the applet
	}
	public void paint(Graphics g){
		int startPosition = 600;	// Sets the start position of the polygon
		
		// X Pos array to draw the polygon
		int xPos[] = {startPosition + 150, startPosition, startPosition + 300, startPosition, startPosition + 300};
		// Y Pos array to draw the polygon 
		int yPos[] = {startPosition - 100, startPosition + 300, startPosition + 100, startPosition + 100, startPosition + 300};

		g.drawPolygon(xPos, yPos, 5);	// Draw the 10 stared polygon 
	}	// End of paint method
}	// End of Star_2_var
