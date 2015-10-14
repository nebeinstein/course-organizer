package display;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NewRequirementUIHeader extends JFrame {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -9021610646915124211L;
	// For Requirement Window
	static JPanel panel6 = new JPanel();
	static JLabel name4 = new JLabel("Name");
	static JTextField namebox4 = new JTextField();
	static JLabel deg1 = new JLabel("Degree");
	static JRadioButton degbutt3 = new JRadioButton();
	static JLabel deglabe3 = new JLabel("Undergraduate");
	static JRadioButton degbutt4 = new JRadioButton();
	static JLabel deglabe4 = new JLabel("Graduate");
	static JComboBox<String> degbox1 = new JComboBox<String>();
	static JLabel credits2 = new JLabel("Credits");
	static JTextField creditsbox2 = new JTextField();
	static JLabel reqcourses = new JLabel("Required Courses");
	static JTextArea reqbox = new JTextArea();
	static JScrollPane reqscrollpane = new JScrollPane(reqbox);
	static JLabel courses1 = new JLabel("Courses");
	static JTextArea coursebox1 = new JTextArea();
	static JScrollPane coursescrollpane = new JScrollPane(coursebox1);
	JButton browse2 = new JButton("Browse");
	JButton cancel6 = new JButton("Cancel");
	JButton create4 = new JButton("Create");

	// static JButton[] underbutts = new JButton[Main.undergrads.length];
	// static JButton[] gradbutts = new JButton[Main.grads.length];
}
