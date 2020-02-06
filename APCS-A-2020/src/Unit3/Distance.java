package Unit3;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Daniel Gharib
//Date - 2/5/20
//Class - APCSA
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0,0,0,0);
		xOne=0;
		yOne=0;
		xTwo=0;
		yTwo=0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow((xTwo-xOne),2)+Math.pow((yTwo-yOne),2));
		System.out.println("distance == " + String.format("%.3f\n", distance));
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}