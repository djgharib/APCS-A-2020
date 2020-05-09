package WinterScene;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class WinterScenePanel extends JPanel implements Runnable {
	private List<AbstractShape> shapes;
	private AbstractShape sMan;
	private AbstractShape snowflake;
	private AbstractShape tree;

	public WinterScenePanel() {
		setVisible(true);
		// refer shapes to a new ArrayList of AbstractShape
		shapes = new ArrayList<AbstractShape>();
		// populate the list with 50 unique snowflakes
		for (int i = 0; i < 50; i++) {
			int xpos = (int) ((Math.random() * (1210 - 40) + 40));
			int ypos = (int) ((Math.random() * (890 - 40) + 40));
			shapes.add(new FancySnowFlake(xpos, ypos, 20, 20));
		}
		// instantiate a snowman
		tree = new Tree(200,750,75,600, Color.green.darker().darker());
		sMan = new SnowMan(1000, 450, 200, 200);
		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		window.setColor(Color.BLUE);
		window.fillRect(0, 0, getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
		window.setFont(new Font("TAHOMA", Font.BOLD, 18));
		window.drawString("MAKE A WINTER SCENE!", 40, 40);

		// make the snowman appear
		sMan.draw(window);
		tree.draw(window);
		// make the snowflakes appear and move down the screen
		for (AbstractShape s : shapes) {
			// check to see if any of the snowflakes need to be reset to the top of the screen
			if (s.getYPos() > 1210) {
				s.setYPos(40);
				s.setXPos((int) ((Math.random() * (1210 - 40) + 40)));
			} else {
				s.moveAndDraw(window);
			}
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(35);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}