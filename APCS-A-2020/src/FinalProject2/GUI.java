package FinalProject2;

import javax.swing.*;

public class GUI {
	public static void main(String args[]) {
		JMenu menu;
		JMenuItem a1, a2;
		JFrame a = new JFrame("Example");
		menu = new JMenu("File");
		JMenuBar m1 = new JMenuBar();
		a1 = new JMenuItem("Save");
		a2 = new JMenuItem("Load");
		menu.add(a1);
		menu.add(a2);
		m1.add(menu);
		a.setJMenuBar(m1);
		a.setSize(720, 540);
		a.setLayout(null);
		a.setVisible(true);
	}
}
