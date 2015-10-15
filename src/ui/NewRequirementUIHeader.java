package ui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import control.Controller;

public class NewRequirementUIHeader extends JFrame {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -9021610646915124211L;
	// Controller
	Controller ctrl;

	// For Requirement Window
	JPanel panel6 = new JPanel();
	public JLabel name4 = new JLabel("Name");
	public JTextField namebox4 = new JTextField();
	public JLabel deg1 = new JLabel("Degree");
	public JRadioButton degbutt3 = new JRadioButton();
	public JLabel deglabe3 = new JLabel("Undergraduate");
	public JRadioButton degbutt4 = new JRadioButton();
	public JLabel deglabe4 = new JLabel("Graduate");
	public JComboBox<String> degbox1 = new JComboBox<String>();
	public JLabel credits2 = new JLabel("Credits");
	public JTextField creditsbox2 = new JTextField();
	public JLabel reqcourses = new JLabel("Required Courses");
	public JTextArea reqbox = new JTextArea();
	public JScrollPane reqscrollpane = new JScrollPane(reqbox);
	public JLabel courses1 = new JLabel("Courses");
	public JTextArea coursebox1 = new JTextArea();
	public JScrollPane coursescrollpane = new JScrollPane(coursebox1);
	public JButton browse2 = new JButton("Browse");
	public JButton cancel6 = new JButton("Cancel");
	public JButton create4 = new JButton("Create");

	// static JButton[] underbutts = new JButton[Main.undergrads.length];
	// static JButton[] gradbutts = new JButton[Main.grads.length];
}
