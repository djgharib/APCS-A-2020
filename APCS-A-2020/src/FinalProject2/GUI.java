package FinalProject2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
	private JFrame mainFrame;
	private JPanel controlPanel;
	private JMenu topBar;
	private JMenuItem save, load;

	public GUI() {
		prepareGUI();
	}

	public static void main(String[] args) {
		GUI viewerGUI = new GUI();
		viewerGUI.topBar();
		viewerGUI.leftSide();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Object Database Viewer");
		mainFrame.setSize(720, 540);
		mainFrame.setLayout(new GridLayout(3, 1));
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(controlPanel);
		mainFrame.setVisible(true);
	}

	private void topBar() {
		topBar = new JMenu("File");
		JMenuBar menuBar = new JMenuBar();
		save = new JMenuItem("Save");
		load = new JMenuItem("Load");
		topBar.add(save);
		topBar.add(load);
		menuBar.add(topBar);
		mainFrame.setJMenuBar(menuBar);
		mainFrame.setVisible(true);
	}
	
	private void leftSide() {
		String courses[] = { "Person","Building"};
		JComboBox comboBox = new JComboBox(courses);
		comboBox.setBounds(40,40,40,20);
		mainFrame.add(comboBox);
		mainFrame.setVisible(true);
	}

}