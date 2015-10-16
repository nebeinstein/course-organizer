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
	//Controller
	Controller ctrl;
	
	// For prof window
	JPanel panel1 = new JPanel();
	public JLabel name1 = new JLabel("Name");
	public JTextField namebox1 = new JTextField();
	public JLabel off1 = new JLabel("Office");
	public JTextField offbox1 = new JTextField();
	public JLabel phone1 = new JLabel("Phone");
	public JTextField phonebox1 = new JTextField();
	public JLabel fax1 = new JLabel("Fax");
	public JTextField faxbox1 = new JTextField();
	public JLabel email1 = new JLabel("Email");
	public JTextField emailbox1 = new JTextField();
	public JLabel dep1 = new JLabel("Department");
	public JComboBox<String> depbox1 = new JComboBox<String>(MainUIHeader.deps);
	public JRadioButton probutt1 = new JRadioButton();
	public JLabel pro1 = new JLabel("Professor");
	public JRadioButton tabutt1 = new JRadioButton();
	public JLabel Ta1 = new JLabel("TA");
	public JLabel photo1 = new JLabel("Photo");
	public JTextField photobox1 = new JTextField();
	public JButton browse1 = new JButton("Browse");
	public JButton cancel1 = new JButton("Cancel");
	public JButton save1 = new JButton("Save and Close");
	public JButton save2 = new JButton("Save and Create Another");
	public JButton advance1 = new JButton("Advanced");

	// For advanced prof window
	public JFrame root2 = new JFrame();
	public JPanel panel2 = new JPanel();
	public JLabel title1 = new JLabel("Title");
	public JTextField titlebox1 = new JTextField();
	public JLabel desc1 = new JLabel("Description");
	public JTextArea descbox1 = new JTextArea();
	public JScrollPane descscrollpane = new JScrollPane(descbox1);
	public JLabel edu1 = new JLabel("Education");
	public JTextArea edubox1 = new JTextArea();
	public JScrollPane eduscrollpane = new JScrollPane(edubox1);
	public JLabel res1 = new JLabel("Research Interest");
	public JTextArea resbox1 = new JTextArea();
	public JScrollPane resscrollpane = new JScrollPane(resbox1);
	public JLabel cours1 = new JLabel("Courses");
	public JTextArea coursbox1 = new JTextArea();
	public JScrollPane coursscrollpane = new JScrollPane(coursbox1);
	public JButton cancel2 = new JButton("Cancel");
	public JButton finish1 = new JButton("Finish");
}
