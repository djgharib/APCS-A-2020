package WinterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class FancySnowFlake extends AbstractShape
{
   public FancySnowFlake(int x, int y, int w, int h, int xspd, int yspd)
   {
	   
	   super(x, y, w, h, Color.WHITE, xspd, yspd);
   }

   public void draw(Graphics window)
   {
	   window.setColor(Color.WHITE);
	   window.drawOval(getXPos()-getWidth()/2,getYPos()-getWidth()/2,getWidth(),getHeight());
	   int xPoly1[] = {getXPos()-getWidth(), getXPos()+getWidth(), getXPos(), getXPos()};
	   int yPoly1[] = {getYPos()-getHeight()/4, getYPos()+getHeight()/4, getYPos()-getHeight(), getYPos()+getHeight()};
	   Polygon poly1 = new Polygon(xPoly1, yPoly1, 4);
	   window.drawPolygon(poly1);
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}


