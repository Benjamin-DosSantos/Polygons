import java.applet.Applet;
import java.awt.Graphics;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Name polygon with variables
 *	Project Description: a.	This 
 *  program is intended to generate 
 *  four polygons that will make 2 
 *  Initials, B and D, a set of x and y 
 *  arrays will create the appearance of 
 *  the letters. The x and y arrays are base 
 *  off a base x and y point that allow for 
 *  the letters to be moved around the applet. 
 * 
 **/

public class Name_var extends Applet{
	public void init(){
		this.setSize(500, 500);		// Set Applet Size
	}
	public void paint(Graphics g){
		int startPosition = 600;	// Start position for polygons to be generated

		int xPos_big_B[] = {startPosition, startPosition + 100, startPosition + 100, startPosition}; 	// X position array for the B with the start position factored in 
		int yPos_big_B[] = {startPosition, startPosition, startPosition + 100, startPosition + 100};	// Y position array for the B with the start position factored in 
		
		int xPos_toprect_B[] = {startPosition + 30, startPosition + 80, startPosition + 80, startPosition + 30};	// X position array for the top rectangle of the B with the start position factored in 
		int yPos_toprect_B[] = {startPosition + 10, startPosition + 10, startPosition + 40, startPosition + 40};	// Y position array for the top rectangle of the B with the start position factored in 

		int xPos_bottomrect_B[] = {startPosition + 30, startPosition + 80, startPosition + 80, startPosition + 30};		// X position array for the Bottom rectangle of the B with the start position factored in 
		int yPos_bottomrect_B[] = {startPosition + 50, startPosition + 50, startPosition + 90, startPosition + 90};		// Y position array for the Bottom rectangle of the B with the start position factored in 
		
		g.drawPolygon(xPos_big_B, yPos_big_B, 4);	// Draws the polygon outline for the B
		g.drawPolygon(xPos_toprect_B, yPos_toprect_B, 4);	// Draws the polygon outline for the top rectangle of the B
		g.drawPolygon(xPos_bottomrect_B, yPos_bottomrect_B, 4);	// Draws the polygon outline for top rectangle the B
		
		int xPos_d_outline[] = {startPosition + 200, startPosition + 300, startPosition + 300, startPosition + 200};	// X position array for the outline of the D with the start point factored in 
		int yPos_d_outline[] = {startPosition, startPosition, startPosition + 100, startPosition + 100};				// Y position array for the outline of the D with the start point factored in 
		
		int xPos_d_iner[] = {startPosition + 225, startPosition + 290, startPosition + 290, startPosition + 225};	// X position array for the inline of the D with the start point factored in 
		int yPos_d_iner[] = {startPosition + 10, startPosition + 10, startPosition + 90, startPosition + 90};		// Y position array for the inline of the D with the start point factored in 
		
		g.drawPolygon(xPos_d_outline, yPos_d_outline, 4);	// Draws the outline of the D
		g.drawPolygon(xPos_d_iner, yPos_d_iner, 4);		// Draws the inline of the D
	}	// End Of Paint Method
}	// End of Name_var Class
