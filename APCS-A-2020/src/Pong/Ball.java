package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int hei) {
		super(x,y, wid, hei);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int hei, Color col) {
		super(x,y, wid, hei, col);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int hei, Color col, int xVel, int yVel) {
		super(x,y, wid, hei, col);
		xSpeed = xVel;
		ySpeed = yVel;
	}
	
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location


      setX(getX()+xSpeed);
      setY(getY()+ySpeed);

		//draw the ball at its new location
      draw(window, super.getColor());
   }
   
	public boolean equals(Object obj)
	{




		return false;
	}   

   //add the get methods

   //add a toString() method
	public String toString() {
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
}