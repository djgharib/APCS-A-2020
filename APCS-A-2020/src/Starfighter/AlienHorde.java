package Starfighter;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {
	private List<Alien> aliens;

	public AlienHorde() {
		aliens = new ArrayList<Alien>(0);
	}

	public void add(Alien al) {
		aliens.add(al);
	}

	public void drawEmAll(Graphics window) {
		if (aliens.size() > 0) {
			for (Alien a : aliens) {
				a.draw(window);
			}
		}
	}

	public void moveEmAll() {
	}

	public void removeDeadOnes(List<Ammo> shots) {
		for (int i = 0; i < aliens.size(); i++) {
			if (shots.size() > 0) {
				for (int j = 0; j < shots.size(); j++) {
					if (shots.get(j).didCollide(aliens.get(i))) {
						aliens.remove(i);
						i = 0;
						break;
					}
				}
			}
		}
	}

	public String toString() {
		return "";
	}
}
