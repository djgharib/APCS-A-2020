package WinterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class FancySnowFlake extends AbstractShape
{
   public FancySnowFlake(int x, int y, int w, int h )
   {
	   
	   super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
	   window.setColor(Color.WHITE);
	   window.fillOval(getXPos(),getYPos(),getWidth(),getHeight());
	   window.fillOval(getXPos()+25,getYPos()-3*getHeight()/4,3*getWidth()/4,3*getHeight()/4);
	   window.fillOval(getXPos()-25,getYPos()+getHeight(),5*getWidth()/4,5*getHeight()/4);
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}


