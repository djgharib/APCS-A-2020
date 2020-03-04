package Shape;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel {
	public ShapePanel() {
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window);
	}

	/*
	 * All of your test code should be placed in paint.
	 */
	public void paint(Graphics window) {
		window.setColor(Color.WHITE);
		window.fillRect(0, 0, getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
		window.setFont(new Font("TAHOMA", Font.BOLD, 18));
		window.drawString("CREATE YOUR OWN SHAPE!", 40, 40);

		// make a Shape
		// draw the Shape
		Shape test = new Shape(200, 200, 200, 200, Color.green, 0, 0);
		window.setColor(Color.DARK_GRAY);
		window.fillRect(125, 200, 50, 200);
		window.fillOval(100, 100, 100, 100);
		window.fillRect(50, 225, 200, 20);
		window.fillRect(125, 400, 20, 150);
		window.fillRect(155, 400, 20, 150);

	}
}