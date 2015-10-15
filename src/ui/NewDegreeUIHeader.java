package ui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import control.Controller;

public class NewDegreeUIHeader extends JFrame {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -3770564991288504650L;
	//Controller
	Controller ctrl;
	
	static String[] undegtypes = { "--- Select one ---", "WPI", "Major", "Minor" };
	// For Degree Window
	JPanel panel5 = new JPanel();
	public JLabel name3 = new JLabel("Name");
	public JTextField namebox3 = new JTextField();
	public JRadioButton degbutt1 = new JRadioButton();
	public JLabel deglabe1 = new JLabel("Undergraduate");
	public JRadioButton degbutt2 = new JRadioButton();
	public JLabel deglabe2 = new JLabel("Graduate");
	public JLabel type1 = new JLabel("Type");
	public JComboBox<String> typebox1 = new JComboBox<String>(undegtypes);
	public JButton cancel5 = new JButton("Cancel");
	public JButton create3 = new JButton("Create");
}
