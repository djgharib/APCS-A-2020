package Pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Paddle() {
		super(10, 10);
		speed = 5;
	}

	// add the other Paddle constructors
	public Paddle(int x, int y) {
		super(x, y);
		speed = 5;
	}

	public Paddle(int x, int y, int spd) {
		super(x, y);
		speed = spd;
	}

	public Paddle(int x, int y, int wid, int hei) {
		super(x, y, wid, hei);
		speed = 5;
	}

	public Paddle(int x, int y, int wid, int hei, int spd) {
		super(x, y, wid, hei);
		speed = spd;
	}

	public Paddle(int x, int y, int wid, int hei, Color col, int spd) {
		super(x, y, wid, hei, col);
		speed = spd;
	}

	public Paddle(int x, int y, int wid, int hei, Color col) {
		super(x, y, wid, hei, col);
		speed = 5;
	}

	public void moveUpAndDraw(Graphics window) {
		draw(window, Color.white);

		setY(getY() - speed);

		draw(window, Color.black);
	}

	public void moveDownAndDraw(Graphics window) {
		draw(window, Color.white);

		setY(getY() + speed);

		draw(window, Color.black);
	}

	// add get methods
	public int getSpeed() {
		return speed;
	}

	// add a toString() method
	public String toString() {
		return super.toString() + " " + speed;
	}
}