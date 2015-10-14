package display;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NewDegreeUIHeader extends JFrame {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -3770564991288504650L;
	static String[] undegtypes = { "--- Select one ---", "WPI", "Major", "Minor" };
	// For Degree Window
	static JPanel panel5 = new JPanel();
	static JLabel name3 = new JLabel("Name");
	static JTextField namebox3 = new JTextField();
	static JRadioButton degbutt1 = new JRadioButton();
	static JLabel deglabe1 = new JLabel("Undergraduate");
	static JRadioButton degbutt2 = new JRadioButton();
	static JLabel deglabe2 = new JLabel("Graduate");
	static JLabel type1 = new JLabel("Type");
	static JComboBox<String> typebox1 = new JComboBox<String>(undegtypes);
	JButton cancel5 = new JButton("Cancel");
	JButton create3 = new JButton("Create");
}
