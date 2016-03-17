import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Name Polygons
 *	Project Description: a.	This 
 *  program is intended to generate 
 *  four polygons that will make 2 
 *  Initials, B and D, a set of x and y 
 *  arrays will create the appearance of 
 *  the letters. 
 * 
 **/


public class Name extends Applet{
	public void init(){	// Start of init method
		this.setSize(500, 500);		// Sets the size of the applet
	}	// End of init method
	public void paint(Graphics g){	// Start Paint Method

		int xPos_big_B[] = {100, 200, 200, 100};	// Array for xPos of the outer part of the "B"
		int yPos_big_B[] = {100, 100, 200, 200};	// Array for the yPos of outer part of the "B"
		
		int xPos_toprect_B[] = {130, 180, 180, 130};	// Array for the top xPos rectangle for the B
		int yPos_toprect_B[] = {110, 110, 140, 140};	// Array for the top yPos rectangle for the B

		int xPos_bottomrect_B[] = {130, 180, 180, 130};		// Array for the xPos of the bottom rectangle of the B
		int yPos_bottomrect_B[] = {150, 150, 190, 190};		// Array for the yPos of the bottom rectangle of the B
		
		g.fillPolygon(xPos_big_B, yPos_big_B, 4);		// Fills the big B rectangle with color
		g.setColor(Color.WHITE);	// Sets the color to White
		g.fillPolygon(xPos_toprect_B, yPos_toprect_B, 4);	// Fills the top rectangle with color
		g.fillPolygon(xPos_bottomrect_B, yPos_bottomrect_B, 4);	// Fills the bottom rectangle with Color
		
		int xPos_d_outline[] = {300, 400, 400, 300};	// Array for the xPos of the outline of the "D"
		int yPos_d_outline[] = {100, 100, 200, 200};	// Array for the yPos of the outlien of the "D"
		
		int xPos_d_iner[] = {325, 390, 390, 325};	// XPos Array for the inner "D" inline 
		int yPos_d_iner[] = {110, 110, 190, 190}; 	// YPos Array for the inner "D" inline		
		g.setColor(Color.BLACK);	// Sets the color of the outline of the "D"
		g.fillPolygon(xPos_d_outline, yPos_d_outline, 4);	// Draws the outline of the "D"
		g.setColor(Color.WHITE);	// Sets the color of the inline of the "D"
		g.fillPolygon(xPos_d_iner, yPos_d_iner, 4);		// Fills the inner part of the "D"
	}	// End of the paint method
}// End of the Name Class
