import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Random Polygons
 *	Project Description:  This program 
 *	is intended to generate a set number 
 *	of polygons that all are the same but 
 *	are different colors and are generated 
 *	at different x,y points.
 * 
 **/


public class RandomPoly extends Applet{

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the toolkit
	int width = (int)screenSize.getWidth();		// Makes an int for the width of the screen 
	int height = (int)screenSize.getHeight();	// Makes an int for the height of the screen
	
	public void init(){
		this.setSize(width, height);	// Sets the size of the applet
	}
	public void paint(Graphics g){

		int polys_to_be_generated = 100;	// Number of polygons to be generated
		
		for(int i = 0; i <= polys_to_be_generated; i++){	// For loop that generates the polygons
			Random ran = new Random();	// Random object 
			int startPosX = ran.nextInt(width);		// random variable form 0 to the screen width
			int startPosY = ran.nextInt(height);	// random variable form 0 to the screen height
			int colorRed = ran.nextInt(255);		// Random color variable for the red of the color of the polygon
			int colorGreen = ran.nextInt(255);		// Random green of the polygon
			int colorBlue = ran.nextInt(255);		// Random blue of the polygon
			Color starColor = new Color(colorRed, colorBlue, colorGreen);	// Creates the polygon color
			drawPoly(g, startPosX, startPosY, starColor);	// Calls the drawPoly method that draws the polygon with a color or not
		}	// End of for loop
	}	// End of paint method
	
	
	public void drawPoly(Graphics g, int startPositionX, int startPositionY){	// Polygon drawn without color
		// xPos array for poly to be drawn 
		int xPos[] = {startPositionX + 150, startPositionX + 120, startPositionX, startPositionX + 100, startPositionX + 75, startPositionX + 150, startPositionX + 220, startPositionX + 200, startPositionX + 300, startPositionX + 180};
		// yPos array for poly to be drawn
		int yPos[] = {startPositionY - 100, startPositionY + 50, startPositionY + 50, startPositionY + 150, startPositionY + 300, startPositionY + 210, startPositionY + 300, startPositionY + 150, startPositionY + 50, startPositionY + 50};

		g.drawPolygon(xPos, yPos, 10);	// Draws the polygon
	}	// End of drawPoly
	
	
	public void drawPoly(Graphics g, int startPositionX, int startPositionY, Color fillColor){	// Polygon drawn with color
		// xPos array for poly to be drawn 
		int xPos[] = {startPositionX + 150, startPositionX + 120, startPositionX, startPositionX + 100, startPositionX + 75, startPositionX + 150, startPositionX + 220, startPositionX + 200, startPositionX + 300, startPositionX + 180};
		// yPos array for poly to be drawn
		int yPos[] = {startPositionY - 100, startPositionY + 50, startPositionY + 50, startPositionY + 150, startPositionY + 300, startPositionY + 210, startPositionY + 300, startPositionY + 150, startPositionY + 50, startPositionY + 50};

		g.setColor(fillColor);		// Sets the color of the polygon to be drawn 
		g.fillPolygon(xPos, yPos, 10);	// Fills a polygon that is to be drawn
	
	}	// End of drawPoly
}	// End of RandomPoly Class