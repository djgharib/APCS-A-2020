package FinalProject2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class GUI {

	private JFrame frame;
	private File filepath;
	private ArrayList<Object> objectList;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		GUI window = new GUI();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//GUI work here was done with WindowBuilder software for Eclipse
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Person");
		comboBox.setBounds(142, 57, 100, 20);
		frame.getContentPane().add(comboBox);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(64, 88, 256, 381);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel bld_image = new JLabel("");
		bld_image.setIcon(new ImageIcon(GUI.class.getResource("/FinalProject2/img/building3" + ".png")));
		bld_image.setBounds(32, 157, 192, 192);
		panel.add(bld_image);

		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(32, 11, 50, 14);
		panel.add(lblNewLabel);

		JLabel lblOwner = new JLabel("Owner:");
		lblOwner.setBounds(32, 32, 50, 14);
		panel.add(lblOwner);

		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(32, 53, 50, 14);
		panel.add(lblSize);

		JLabel lblConstructionDate = new JLabel("Construction Date:");
		lblConstructionDate.setBounds(32, 76, 125, 14);
		panel.add(lblConstructionDate);
		
		JButton btnNewButton = new JButton("Edit");
		btnNewButton.setBounds(88, 127, 80, 20);
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(384, 88, 256, 381);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel per_image = new JLabel("New label");
		per_image.setIcon(new ImageIcon(GUI.class.getResource("/FinalProject2/img/person2.png")));
		per_image.setBounds(32, 157, 192, 192);
		panel_1.add(per_image);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(32, 11, 50, 14);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Job:");
		lblNewLabel_1_1.setBounds(32, 32, 50, 14);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Height:");
		lblNewLabel_1_2.setBounds(32, 53, 50, 14);
		panel_1.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Date of Birth:");
		lblNewLabel_1_3.setBounds(32, 76, 100, 14);
		panel_1.add(lblNewLabel_1_3);
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.setBounds(88, 127, 80, 20);
		panel_1.add(btnNewButton_1);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("Building");
		comboBox_1.setBounds(462, 57, 100, 20);
		frame.getContentPane().add(comboBox_1);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);

		JMenuItem mntmSave = new JMenuItem("Save");
		objectList.add(new Person("a", "a", 1, 1, "a"));
		mntmSave.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ev) {
		    	  try {
					ReadWrite.write(objectList);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      }
		    });
		mnNewMenu.add(mntmSave);

		JMenuItem mntmLoad = new JMenuItem("Load");
		mntmLoad.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ev) {
		    	  final JFileChooser fc = new JFileChooser("user.dir");
		    	  fc.showOpenDialog(fc);
		    	  filepath = fc.getSelectedFile();
		    	  try {
		    		  objectList = ReadWrite.read(filepath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      }
		    });
		mnNewMenu.add(mntmLoad);
	}
}
