package Pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.black;
	}

	// add other Block constructors - x , y , width, height, color
	public Block(int x, int y, Color col) {
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = col;
	}

	public Block(int x, int y) {
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = Color.black;
	}

	public Block(int x, int y, int wid, int hei) {
		xPos = x;
		yPos = y;
		width = wid;
		height = hei;
		color = Color.black;
	}

	public Block(int x, int y, int wid, int hei, Color col) {
		xPos = x;
		yPos = y;
		width = wid;
		height = hei;
		color = col;
	}

	// add the other set methods

	public void setColor(Color col) {

	}

	public void draw(Graphics window) {
		// uncomment after you write the set and get methods
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		Block temp = (Block) obj;

		if (temp.getX() != xPos) {
			return false;
		}

		else if (temp.getY() != yPos) {
			return false;
		}

		else if (temp.getWidth() != width) {
			return false;
		}

		else if (temp.getHeight() != height) {
			return false;
		}

		else if (temp.getColor() != color) {
			return false;
		}

		else {
			return true;
		}
	}

	// add the other get methods
	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	// add a toString() method - x , y , width, height, color
	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}

	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
		
	}

	public void setX(int x) {
		xPos = x;
		
	}

	public void setY(int y) {
		yPos = y;
		
	}
	
	public void setWidth(int wid) {
		width = wid;
	}
	
	public void setHeight(int hei) {
		height = hei;
	}
}