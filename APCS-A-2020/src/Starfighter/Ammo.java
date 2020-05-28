package Starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private Image image;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x,y,10);
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		speed = s;
		try
		{
			URL url = getClass().getResource("ammo.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("ammo.jpg not found");
		}
		
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	
	
	public void move( String direction )
	{
		int xPos = this.getX();
		int yPos = this.getY();
		if(direction.equals("LEFT")) {
			xPos-=speed;
			this.setX(xPos);
		}
		if(direction.equals("RIGHT")) {
			xPos+=speed;
			this.setX(xPos);
		}
		if(direction.equals("UP")) {
			yPos-=speed;
			this.setY(yPos);
		}
		if(direction.equals("DOWN")) {
			yPos+=speed;
			this.setY(yPos);
		}
	}

	public String toString()
	{
		return "";
	}
}
