package FinalProject2;

import javax.swing.*;

public class GUI {
	public static void main(String args[]) {
		JFrame frame = new JFrame("ObjectDatabase");
		JMenu menu;
		JMenuItem save, load;
		JMenuBar menu1 = new JMenuBar();
		menu = new JMenu("File");
		save = new JMenuItem("Save");
		load = new JMenuItem("Load");
		menu.add(save);
		menu.add(load);
		frame.setJMenuBar(menu1);
		frame.setSize(720, 540);
		frame.setVisible(true);
	}
}
