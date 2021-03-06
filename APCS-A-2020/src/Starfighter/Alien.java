package Starfighter;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing {
	private int speed;
	private Image image;

	public Alien() {
		this(0, 0, 30, 30, 0);
	}

	public Alien(int x, int y) {
		super(x, y);
		try {
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("alien.jpg not found");
		}
	}

	public Alien(int x, int y, int s) {
		super(x, y);
		speed = s;
		try {
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("alien.jpg not found");
		}
	}

	public Alien(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
		try {
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("alien.jpg not found");
		}
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void move(String direction) {
		int xPos = this.getX();
		int yPos = this.getY();
		if (direction.equals("LEFT")) {
			xPos -= speed;
			this.setX(xPos);
		}
		if (direction.equals("RIGHT")) {
			xPos += speed;
			this.setX(xPos);
		}
		if (direction.equals("UP")) {
			yPos -= speed;
			this.setY(yPos);
		}
		if (direction.equals("DOWN")) {
			yPos += speed;
			this.setY(yPos);
		}
	}

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

	public String toString() {
		return "";
	}
}
