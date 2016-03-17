import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;


public class Random_Lines extends Applet{
	public void init(){
		Color bgColor = Color.BLACK;	// Color variable for the background color
		this.setBackground(bgColor);	// Set the background to the background color
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the toolkit
		int width = (int)screenSize.getWidth();		// Makes an int for the width of the screen 
		int height = (int)screenSize.getHeight();	// Makes an int for the height of the screen
		this.setSize(new Dimension(width, height));	// Sets the width and height to the applet
	}// End of init method
	
	public void paint(Graphics g){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the toolkit
		int width = (int)screenSize.getWidth();		// Makes an int for the width of the screen 
		int height = (int)screenSize.getHeight();	// Makes an int for the height of the screen
		Random ran = new Random();		// Random Call
		int max_lines = 4;	// Max number of lines to be drawn
		int min_lines = 4;	// Min number of lines to be drawn
		int number_of_lines = ran.nextInt(max_lines) + min_lines;	// Randomly sets the number of sides to be drawn between max and min _lines
			
		int x_point_1, y_point_1, x_point_2 = 0, y_point_2 = 0, start_x, start_y;	// Int declaration
		x_point_1 = ran.nextInt(width);		// Generates a x point between 0 and the width
		y_point_1 = ran.nextInt(height);	// Generates a y point between 0 and the height 
		start_x = ran.nextInt(width);		// Randomly generates the starting point x between 0 and the width
		start_y = ran.nextInt(height);		// Randomly generates the starting point y between 0 and the height
		
		for(int i = 0; i <= number_of_lines; i++){ 		// For loop for number of lines
			int red = ran.nextInt(255);		// Generates a random red color value
			int green = ran.nextInt(255);	// Generates a random green color value
			int blue = ran.nextInt(255);	// Generates a random blue color value
			
			Color linecolor = new Color(red, green, blue);	// Generates the Color from the color values
			g.setColor(linecolor);	// Sets the graphics color to the color that was generated 
				
			x_point_2 = ran.nextInt(width);		// Generates a x point from 0 to the width of the applet
			y_point_2 = ran.nextInt(height);	// Generates a y point from 0 to the height of the applet
			
			if(i == 0){		// Check to see if the loop is generating the first line
				g.drawLine(start_x, start_y, x_point_2, y_point_2);		// Draws a line from the first x,y point to the x_2, y_2
				x_point_1 = x_point_2;	// Sets the x_1 to the value of the x_2
				y_point_1 = y_point_2;	// Sets the y_1 to the value of the y_2
			}else if(i == number_of_lines){		// checks if the loop is generating the last line
				g.drawLine(x_point_1, y_point_1, start_x, start_y);		// Draws the line from the the end point of the prev. line to the start line
			}else{	// if none of those are true
				g.drawLine(x_point_1, y_point_1, x_point_2, y_point_2);		// Draw a line from the end point of the prev. line to a random x, y
				x_point_1 = x_point_2;	// sets the x_1 value to the value of x_2
				y_point_1 = y_point_2;	// sets the y_1 value to the value of y_2
			}	// End of else 
		}// End of for number of lines
	}// End of paint Method
}// End of Class
