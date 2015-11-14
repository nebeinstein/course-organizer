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

public class NewProfUIHeader extends JFrame {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -2077696753089985409L;
	// Controller
	Controller ctrl;

	// For prof window
	JPanel profPanel = new JPanel();
	public JLabel nameLabel = new JLabel("Name");
	public static JTextField nameBox = new JTextField();
	public JLabel officeLabel = new JLabel("Office");
	public static JTextField officeBox = new JTextField();
	public JLabel phoneLabel = new JLabel("Phone");
	public static JTextField phoneBox = new JTextField();
	public JLabel faxLabel = new JLabel("Fax");
	public static JTextField faxBox = new JTextField();
	public JLabel emailLabel = new JLabel("Email");
	public static JTextField emailBox = new JTextField();
	public JLabel departmentLabel = new JLabel("Department");
	public static JComboBox<String> departmentBox = new JComboBox<String>(MainUIHeader.deps);
	public static JRadioButton profButton = new JRadioButton();
	public static JLabel profLabel = new JLabel("Professor");
	public static JRadioButton taButton = new JRadioButton();
	public static JLabel taLabel = new JLabel("TA");
	public JLabel photoLabel = new JLabel("Photo");
	public static JTextField photoBox = new JTextField();
	public JButton browseButton = new JButton("Browse");
	public JButton cancelButton = new JButton("Cancel");
	public JButton saveButton1 = new JButton("Save and Close");
	public JButton saveButton2 = new JButton("Save and Create Another");
	public JButton advancedButton = new JButton("Advanced");

	// For advanced prof window
	public JFrame advancedFrame = new JFrame();
	public JPanel advancedPanel = new JPanel();
	public JLabel titleLabel = new JLabel("Title");
	public static JTextField titleBox = new JTextField();
	public JLabel descriptionLabel = new JLabel("Description");
	public static JTextArea descriptionBox = new JTextArea();
	public JScrollPane descriptionScrollPane = new JScrollPane(descriptionBox);
	public JLabel educationLabel = new JLabel("Education");
	public static JTextArea educationBox = new JTextArea();
	public JScrollPane educationScrollPane = new JScrollPane(educationBox);
	public JLabel researchLabel = new JLabel("Research Interest");
	public static JTextArea researchBox = new JTextArea();
	public JScrollPane researchScrollPane = new JScrollPane(researchBox);
	public JLabel courseLabel = new JLabel("Courses");
	public static JTextArea courseBox = new JTextArea();
	public JScrollPane courseScrollPane = new JScrollPane(courseBox);
	public JButton cancelButton2 = new JButton("Cancel");
	public JButton finishButton = new JButton("Finish");
}
