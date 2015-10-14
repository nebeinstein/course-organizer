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

public class NewProfUIHeader extends JFrame {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -2077696753089985409L;
	// For prof window
	static JPanel panel1 = new JPanel();
	static JLabel name1 = new JLabel("Name");
	static JTextField namebox1 = new JTextField();
	static JLabel off1 = new JLabel("Office");
	static JTextField offbox1 = new JTextField();
	static JLabel phone1 = new JLabel("Phone");
	static JTextField phonebox1 = new JTextField();
	static JLabel fax1 = new JLabel("Fax");
	static JTextField faxbox1 = new JTextField();
	static JLabel email1 = new JLabel("Email");
	static JTextField emailbox1 = new JTextField();
	static JLabel dep1 = new JLabel("Department");
	static JComboBox<String> depbox1 = new JComboBox<String>(MainUIHeader.deps);
	static JRadioButton probutt1 = new JRadioButton();
	static JLabel pro1 = new JLabel("Professor");
	static JRadioButton tabutt1 = new JRadioButton();
	static JLabel Ta1 = new JLabel("TA");
	static JLabel photo1 = new JLabel("Photo");
	static JTextField photobox1 = new JTextField();
	JButton browse1 = new JButton("Browse");
	JButton cancel1 = new JButton("Cancel");
	JButton save1 = new JButton("Save and Close");
	JButton save2 = new JButton("Save and Create Another");
	JButton advance1 = new JButton("Advanced");

	// For advanced prof window
	static JFrame root2 = new JFrame();
	static JPanel panel2 = new JPanel();
	static JLabel title1 = new JLabel("Title");
	static JTextField titlebox1 = new JTextField();
	static JLabel desc1 = new JLabel("Description");
	static JTextArea descbox1 = new JTextArea();
	static JScrollPane descscrollpane = new JScrollPane(descbox1);
	static JLabel edu1 = new JLabel("Education");
	static JTextArea edubox1 = new JTextArea();
	static JScrollPane eduscrollpane = new JScrollPane(edubox1);
	static JLabel res1 = new JLabel("Research Interest");
	static JTextArea resbox1 = new JTextArea();
	static JScrollPane resscrollpane = new JScrollPane(resbox1);
	static JLabel cours1 = new JLabel("Courses");
	static JTextArea coursbox1 = new JTextArea();
	static JScrollPane coursscrollpane = new JScrollPane(coursbox1);
	JButton cancel2 = new JButton("Cancel");
	JButton finish1 = new JButton("Finish");
}
