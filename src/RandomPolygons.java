import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Random Polygons
 *	Project Description: This program is 
 *	intended to generate a set number of 
 *	polygons that are different colors and 
 *	are generated at different x,y points 
 *	they also have a random number of points 
 *	for each polygon.
 * 
 **/

public class RandomPolygons extends Applet{
	Random ran = new Random();	// Creates the Random object to be called in later methods
	public void init(){
		int randRed = ran.nextInt(255);		// Random generator for red
		int randGreen = ran.nextInt(255);	// Random generator for green
		int randBlue = ran.nextInt(255);	// Random generator for blue
		Color bgcolor = new Color(randRed, randGreen, randBlue);	// Creates a background color for the applet
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	// Sets the toolkit to get the screen size
		int width = (int)screenSize.getWidth();		// Gets the width portion of the screen size
		int height = (int)screenSize.getHeight();	// Gets the height portion of the screen size
		this.setSize(new Dimension(width, height));		// sets the width and height of the applet 
		this.setBackground(bgcolor);	// Sets the background color of the applet
	}	// End of init method 
	
	public void paint(Graphics g){
		boolean DebugLog = true;	// Sets if the debug log is on
		int maxpoly = 10;	// Sets the max number of polygons to be drawn
		int minpoly = 10;	// Sets the min number of polygons to be drawn
		int polynumber = ran.nextInt(maxpoly) + minpoly;	// Generates the number of polygons to be drawn
		int polysidesmin = 5;	// Sets the minimum number of polygons points to be generated
		int polysidesmax = 20;	// Sets the max number of polygons	points to be generated
		int[] x_Polygon_Points = null, y_Polygon_Points = null;		// Declares int[] to be used in later code
		
		for(int n = 0; n < polynumber; n++){		// For loop for the number of polygons
			int polysides = ran.nextInt(polysidesmax) + polysidesmin;		// Creates a random value for the number of sides the polygon will have between 3 and 10
			int startX = ran.nextInt(800);			// Creates a random value between 0 and 800 for the x Axis
			int startY = ran.nextInt(800); 			// Creates a random value between 0 and 800 for the y Axis
			
			List<Integer> xPoint_ArrayList = new ArrayList<Integer>();	// Creates an ArrayList for the xPoints to be drawn 
			List<Integer> yPoint_ArrayList = new ArrayList<Integer>();	// Creates an ArrayList for the yPoints to be drawn 
			
			for(int s = 0; s < polysides; s++){		// For loop for number of sides for each of the polygons
				int xPoint = ran.nextInt(200) + (startX - 100);	// Generates a xPoint for the polygon that is within +- 100 from the startX point
				int yPoint = ran.nextInt(200) + (startY - 100);	// Generates a yPoint for the polygon that is within +- 100 from the startY point
				xPoint_ArrayList.add(xPoint);	// Adds the xPoint that was generated to the xPoints ArrayList.
				yPoint_ArrayList.add(yPoint);	// Adds the yPoint that was generated to the yPoints ArrayList.
				
				x_Polygon_Points = new int[xPoint_ArrayList.size()];	// Sets the polygon array to the size of the arraylist that will be copied over
				y_Polygon_Points = new int[yPoint_ArrayList.size()];	// Sets the polygon array to the size of the arraylist to be copied over
				
				for(int i = 0; i < xPoint_ArrayList.size(); i++){	// For loop until i = the size of the array list
					x_Polygon_Points[i] = xPoint_ArrayList.get(i).intValue();	// sets the same position on the int[] to equal the array list
				}	// end of arraylist for loop
				
				for(int i = 0; i < yPoint_ArrayList.size(); i++){	// For loop until i = the size of the array list
					y_Polygon_Points[i] = yPoint_ArrayList.get(i).intValue();	// sets the same position on the int[] to equal the array list
				}// end of arraylist for loop
			
			}	// End of polysides for loop
			
			if(DebugLog){	// If debug log is on print log
				System.out.println("Base X: " + startX + " " + "Base Y: " + startY + " " + "Sides To Be Generated: " + polysides);	// Prints out the base x, y, and number of sides for the polygon
				System.out.println("XPoints Polygon #" + n + " " + xPoint_ArrayList);	// Prints the x points array for the polygon 
				System.out.println("YPoints Polygon #" + n + " " + yPoint_ArrayList + "\n");		// Prints the y points array for the polygon
			}	// End of if Debug Log
		   
			int span = ran.nextInt(200) - 100;		// Creates a random point to be drawn to when the polygon is drawn
			int polyRed = ran.nextInt(255);			// Random value for the red value of the polygon fill color
			int polyGreen = ran.nextInt(255);		// Random value for the green value of the polygon fill color
			int polyBlue = ran.nextInt(255);		// Random value for the blue value of the polygon fill color
			
			Color polyColor = new Color(polyRed, polyGreen, polyBlue); 		// Creates a color for the polygon to be filled with
			Color polyOutline = Color.WHITE;		// Sets the outline color for the polygon
			
			int buffer = 20;		// Number of pixels that the polygon will be outlined
			
			g.setColor(polyColor);	// Sets the fill color of the polygon
			g.fillPolygon(x_Polygon_Points, y_Polygon_Points, xPoint_ArrayList.size());		// Fills and draws the polygon at the array positions
			
			int[] return_xPos = new int[x_Polygon_Points.length]; 	// generates a new int[] with the lenth x_Polygon_points
			int[] return_yPos = new int[y_Polygon_Points.length];	// generates a new int[] with the lenth y_Polygon_points
			
			for(int i = 0; i < x_Polygon_Points.length; i++){	// For loop that adds the x_Poly_points to the return_xPos array
				return_xPos[i] = x_Polygon_Points[i] + buffer;	// Sets the return x position to the polytgon point + buffer
			}// End of poly points lenth loop
			
			for(int i = 0; i < y_Polygon_Points.length; i++){	// For loop that sets the return yPoints to the polypoints
				return_yPos[i] = y_Polygon_Points[i] + buffer;	// Sets the return y position to the polytgon point + buffer
			}// End of poly points lenth loop
			
			g.setColor(polyOutline);	// Sets the color of the outline
			g.drawPolygon(x_Polygon_Points, y_Polygon_Points, xPoint_ArrayList.size());		// Draws the polygon outline
		
		}	// End of polynumber for loop
	}	// End of Paint Method
}	// End of Class