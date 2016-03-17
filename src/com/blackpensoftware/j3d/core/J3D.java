package com.blackpensoftware.j3d.core;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class J3D {
	
	private static Color fillColor = Color.BLACK;	/** Creates the variable for fill color and also sets it to a default black **/
	
	public static void draw3DRect(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer){		/** draw3DRect method that will be used to create 3D rectangles or squares **/
		g.setColor(fillColor);	// Sets the color of the lines to be drawn // 
		g.drawLine(xPos, yPos, xPos + buffer, yPos + depth);	// Line From Top Left of outer square to top left of inner square // 
		g.drawLine(xPos, yPos, xPos + width, yPos);		// Line from top left to top right of outer square // 
		g.drawLine(xPos, yPos, xPos, yPos + height); 	// Line from top left to bottom left of outer square // 
		g.drawLine(xPos, yPos + height, xPos + buffer, (yPos + height) + depth);	// Line from bottom left of outer square to bottom left of inner square // 
		g.drawLine(xPos + buffer, (yPos + height) + depth, xPos + buffer, yPos + depth);	// Line from bottom left of inner square to top left of inner square // 
		g.drawLine(xPos + buffer, (yPos + height) + depth, (xPos + buffer) + width, (yPos + height) + depth);	// Line from the bottom left of the inner square to the bottom right of the inner square // 
		g.drawLine( (xPos + buffer) + width, (yPos + height) + depth, (xPos + buffer) + width, yPos + depth);	// Line from bottom right of outer cube to top right of outer square // 
		g.drawLine(xPos + width, yPos, (xPos + buffer) + width, yPos + depth);		// Line from top right of outer square to top right of inner square // 
		g.drawLine(xPos + buffer, yPos + depth, (xPos + buffer) + width, yPos + depth);		// Line from top left of inner cube to top right of inner cube // 
	}	/** End of the draw3DRect method **/
	
	public static void draw3DOval(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer){		/** draw3DOval method that will be used to create 3D ovals or circles **/
		
	}	/** End of the draw3DOval method **/	
	
	public static void draw3DPolygon(Graphics g, int[] xPos, int[] yPos, int depth, int buffer, Color outLineColor){	/** draw3DPolygon method that will be used to create 3D polygon **/
		g.setColor(outLineColor);	// Sets the color of the lines to be drawn // 
		
		outterBox:	// Draws the outer box // 
		for(int i = 0; i <= xPos.length - 1; i++){	// Do this the until i is less then or equal to the size of the array called xPos - 1 // 
			if(i == xPos.length - 1){	// if i is equal to the length of the array called xPos - 1 //
				// Do nothing
			}else if(i == 2){	// if i is equal to 2
				// Do nothing
			}else{	// if both of those values are false 
				g.drawLine(xPos[i], yPos[i], xPos[i + 1], yPos[i + 1]);		// Draw a line from the x value of i in (xPos[] x yPos[]) to the value of i + 1 in (xPos[] x yPos[]) // 
			}	// End of if i
		}	// End of for
		
		innerBox:	// Draws the inner box // 
		for(int i = 0; i <= xPos.length - 1; i++){	// Do this the until i is less then or equal to the size of the array called xPos - 1 // 
			if(i == xPos.length - 1){	// if i is equal to the length of the array called xPos - 1 //
				g.drawLine(xPos[i] + buffer, yPos[i] + depth, xPos[0] + buffer, yPos[0] + depth);	// Draw the final connecting line from the first X-Y position to the last X-Y position //
			}else{	// if i != xPos.lenth - 1
				g.drawLine(xPos[i] + buffer, yPos[i] + depth, xPos[i + 1] + buffer, yPos[i + 1] + depth); 	// Draw a line from the x value of i in (xPos[] x yPos[]) to the value of i + 1 in (xPos[] x yPos[]) // 
			}	// End of if i
		}	// End of for loop
		
		drawLines:	// Draws the lines between the boxes
		for(int i = 0; i <= xPos.length - 1; i++){	// Do this the until i is less then or equal to the size of the array called xPos - 1 //
			if(i == 3){
				// Do Nothing	
			}else{ // if i != xPos.lenth - 1
				g.drawLine(xPos[i], yPos[i], xPos[i] + buffer, yPos[i] + depth);  // Draws the corner connection lines for the 3D effect
			} 	// End if if 3
		}	// End of for loop
	}	/** End of the draw3DPolygon method **/	
	
	public static void fill3DRect(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer, Color outlineColor, Color fillColor){		/** fill3DRect method that will be used to create filled 3D rectangles or squares **/
		
		g.setColor(fillColor);
		int[] topXPos = {xPos, xPos + width, (xPos + buffer) + width, xPos + buffer};	// All of the xPos for the top of the cube going Clockwise
		int[] topYPos = {yPos, yPos, yPos + depth, yPos + depth};	// All of the yPos for the top of the cube going Clockwise
		int[] leftXPos = {xPos, xPos + buffer, xPos + buffer, xPos};	// All of the xPos for the left of the cube going Clockwise
		int[] leftYPos = {yPos, yPos + depth, (yPos + depth) + height, yPos + height};	// All of the yPos for the left of the cube going Clockwise
		int[] frontXPos = {xPos + buffer, (xPos + buffer) + width, (xPos + buffer) + width, xPos + buffer};	// All of the xPos for the front of the cube going Clockwise
		int[] frontYPos = {yPos + depth, yPos + depth, (yPos + depth) + height, (yPos + depth) + height};	// All of the xPos for the front of the cube going Clockwise
		
		g.fillPolygon(topXPos, topYPos, 4);	// Fills the polygons with the color at the set x and y points for the top // 
		g.fillPolygon(leftXPos, leftYPos, 4);	// Fills the polygons with the color at the set x and y points for the left // 
		g.fillPolygon(frontXPos, frontYPos, 4);		// Fills the polygons with the color at the set x and y points for the front // 
		
		g.setColor(outlineColor);	// Sets the color of the lines to be drawn // 
		g.drawLine(xPos, yPos, xPos + buffer, yPos + depth);	// Line From Top Left of outer square to top left of inner square // 
		g.drawLine(xPos, yPos, xPos + width, yPos);		// Line from top left to top right of outer square // 
		g.drawLine(xPos, yPos, xPos, yPos + height); 	// Line from top left to bottom left of outer square // 
		g.drawLine(xPos, yPos + height, xPos + buffer, (yPos + height) + depth);	// Line from bottom left of outer square to bottom left of inner square // 
		g.drawLine(xPos + buffer, (yPos + height) + depth, xPos + buffer, yPos + depth);	// Line from bottom left of inner square to top left of inner square // 
		g.drawLine(xPos + buffer, (yPos + height) + depth, (xPos + buffer) + width, (yPos + height) + depth);	// Line from the bottom left of the inner square to the bottom right of the inner square // 
		g.drawLine( (xPos + buffer) + width, (yPos + height) + depth, (xPos + buffer) + width, yPos + depth);	// Line from bottom right of outer cube to top right of outer square // 
		g.drawLine(xPos + width, yPos, (xPos + buffer) + width, yPos + depth);		// Line from top right of outer square to top right of inner square // 
		g.drawLine(xPos + buffer, yPos + depth, (xPos + buffer) + width, yPos + depth);		// Line from top left of inner cube to top right of inner cube // 
		
	}	/** End of the fill3DRect method **/
	
	public static void fill3DOval(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer){		/** fill3DOval method that will be used to create filled 3D ovals or circles **/
		
	}	/** End of the fill3DOval method **/	
	
	public static void fill3DPolygon(Graphics g, int[] xPos, int[] yPos, int depth, int buffer, Color outLineColor, Color fillColor){	/** fill3DPolygon method that will be used to create a filled 3D polygon **/
		g.setColor(fillColor);
		
		int[] leftXPos = {xPos[0], xPos[1], xPos[1] + buffer, xPos[0] + buffer};	// X positions for the left of the polygon //
		int[] leftYPos = {yPos[0], yPos[1], yPos[1] + depth, yPos[0] + depth};		// Y positions for the left of the polygon //
		int[] topXPos = {xPos[1], xPos[1] + buffer, xPos[2] + buffer, xPos[2]};		// X positions for the top of the polygon // 
		int[] topYPos = {yPos[1], yPos[1] + depth, yPos[2] + depth, yPos[2]};		// Y positions for the top of the polygon // 
		int[] frontXPos = { xPos[3], xPos[1], xPos[0] + buffer, xPos[3] + buffer};	// X positions for the top of the polygon // 
		int[] frontYPos = { yPos[3], yPos[1], yPos[0] + depth, yPos[3] + depth};	// Y positions for the top of the polygon // 
		
		g.fillPolygon(leftXPos, leftYPos, 4);	// Fills the left of the polygon //
		g.fillPolygon(topXPos, topYPos, 4);		// Fills the top of the polygon // 
		g.fillPolygon(frontXPos, frontYPos, 4);		// Fills the front of the polygon // 
		
		g.setColor(outLineColor);	// Sets the color of the lines to be drawn // 
		
		outterBox:	// Draws the outer box // 
		for(int i = 0; i <= xPos.length - 1; i++){	// Do this the until i is less then or equal to the size of the array called xPos - 1 // 
			if(i == xPos.length - 1){	// if i is equal to the length of the array called xPos - 1 //
				// Do nothing
			}else if(i == 2){	// if i is equal to 2
				// Do nothing
			}else{	// if both of those values are false 
				g.drawLine(xPos[i], yPos[i], xPos[i + 1], yPos[i + 1]);		// Draw a line from the x value of i in (xPos[] x yPos[]) to the value of i + 1 in (xPos[] x yPos[]) // 
			}	// End of if i
		}	// End of for
		
		innerBox:	// Draws the inner box // 
		for(int i = 0; i <= xPos.length - 1; i++){	// Do this the until i is less then or equal to the size of the array called xPos - 1 // 
			if(i == xPos.length - 1){	// if i is equal to the length of the array called xPos - 1 //
				g.drawLine(xPos[i] + buffer, yPos[i] + depth, xPos[0] + buffer, yPos[0] + depth);	// Draw the final connecting line from the first X-Y position to the last X-Y position //
			}else{	// if i != xPos.lenth - 1
				g.drawLine(xPos[i] + buffer, yPos[i] + depth, xPos[i + 1] + buffer, yPos[i + 1] + depth); 	// Draw a line from the x value of i in (xPos[] x yPos[]) to the value of i + 1 in (xPos[] x yPos[]) // 
			}	// End of if i
		}	// End of for loop
		
		drawLines:	// Draws the lines between the boxes
		for(int i = 0; i <= xPos.length - 1; i++){	// Do this the until i is less then or equal to the size of the array called xPos - 1 //
			if(i == 3){
				// Do Nothing	
			}else{ // if i != xPos.lenth - 1
				g.drawLine(xPos[i], yPos[i], xPos[i] + buffer, yPos[i] + depth);  // Draws the corner connection lines for the 3D effect
			} 	// End if if 3
		}	// End of for loop
	}	/** End of the fill3DPolygon method **/	
	
	public static Color getFillColor(){		/** Gets the fill color of the J3D class **/
		return fillColor;
	}	/** End of the getFillColor method **/	
	
	public static void setFillColor(Color fillColor){	/** Sets the fill color for all of the J3D objects after this method **/
		J3D.fillColor = fillColor;
	}	/** End of the setFillColor method **/	
	
	public static void connectPoint(Graphics g, J3DPoint pointOne, J3DPoint pointTwo){	/** Connects two J3D points together **/
		g.setColor(fillColor);
		g.drawLine(pointOne.getXPos(), pointOne.getYPos(), pointTwo.getXPos(), pointTwo.getYPos());
	}	/** End of the connectPoint method **/
}	/** End of the J3D Class **/	