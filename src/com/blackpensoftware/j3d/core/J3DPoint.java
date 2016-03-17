package com.blackpensoftware.j3d.core;

public class J3DPoint {
	
	private static int xPos;	/** Variable for xPos **/
	private static int yPos;	/** Variable for yPos **/
	
	public void setXPos(int x){		/** Sets the x Position for the J3DPoint **/
		J3DPoint.xPos += x;
	}	/** End of the setXPos method **/
	
	public int getXPos(){	/** gets the x Position for the J3DPoint **/
		return xPos;	
	}	/** End of the getXPos method **/
	
	public void setYPos(int y){		/** Sets the y Position for the J3DPoint **/
		J3DPoint.yPos += y;
	}	/** End of the setYPos method **/
	
	public int getYPos(){	/** gets the y Position for the J3DPoint **/
		return yPos;
	}	/** End of the getYPos method **/
}
