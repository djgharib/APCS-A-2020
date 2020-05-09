  
package WinterScene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Tree extends AbstractShape{
	public Tree (int x, int y, int w, int h, Color c) {
		super(x,y,w,h,c);
	}
	public void draw(Graphics window){
		window.setColor(Color.orange.darker());
		window.fillRect(getXPos(), getYPos(), getWidth(), (getHeight()/4));
		
		int xPoly1[] = {getXPos()-getWidth(), getXPos()+2*getWidth(), getXPos()+getWidth()/2};
		int yPoly1[] = {getYPos(), getYPos(), getYPos()-getHeight()};
		Polygon poly1 = new Polygon(xPoly1, yPoly1, 3);
		window.setColor(getColor());
		window.fillPolygon(poly1);
		/*Polygon p = new Polygon();
		p.addPoint(-2*getWidth() + getXPos(), getYPos() - getHeight()/100);
		p.addPoint(getXPos() + 3*getWidth(), getYPos() - getHeight()/100);
		p.addPoint(getXPos() + getWidth()/2, getYPos() - getHeight());
		window.setColor(getColor());
		window.fillPolygon(p);*/
	}
	public void moveAndDraw(Graphics window){
		draw(window); 
	}
}