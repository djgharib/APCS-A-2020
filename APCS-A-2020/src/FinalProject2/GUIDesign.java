package FinalProject2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
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

public class GUIDesign {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIDesign window = new GUIDesign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Person");
		comboBox.setBounds(142, 57, 100, 20);
		frame.getContentPane().add(comboBox);

		JPanel panel = new JPanel();
		panel.setBounds(64, 88, 256, 381);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel show_image = new JLabel("New label");
		show_image.setIcon(new ImageIcon(GUIDesign.class.getResource("/FinalProject2/img/building1.png")));
		show_image.setBounds(32, 157, 192, 192);
		panel.add(show_image);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(32, 11, 46, 14);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(384, 88, 256, 381);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("Building");
		comboBox_1.setBounds(462, 57, 100, 20);
		frame.getContentPane().add(comboBox_1);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmLoad = new JMenuItem("Load");
		mnNewMenu.add(mntmLoad);
	}
}
