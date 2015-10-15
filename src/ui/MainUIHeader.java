package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import control.MainUIController;

public class MainUIHeader extends JFrame {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = 6719521816566213537L;
	// Controller
	MainUIController ctrl;
	
	// Lists
	static String[] deps = { "--- Select one ---", " - Accounting", "AE - Aerospace Engineering", " - Air Science",
			" - Arabic", " - Art", " - Bioinformatics & Computnl Biol", "BB - Biology and Biotechnology",
			"BME - Biomedical Engineering", " - Business", "CHE - Chemical Engineering", "CH - Chemistry", " - Chinese",
			" - Civil Engineering", "CS - Computer Science", " - Data Science", " - Economics",
			"ECE - Electrical and Computer Engineering", "ES - Engineering Science", " - English",
			" - Entrepreneurship", "ENV - Environmental Studies", " - Finance", "FPE - FIre Protection", " - German",
			"GOV - Government, Politcl Sci, & Law", "HI - History", "HU - Humanities & Arts",
			"MA - Mathematic Sciences", "MU - Music", "PE - Physical Education", "PH - Physics",
			"RBE - Robotics Engineering" };
	static String[] years = { "--- Select one ---", "2012-2013", "2013-2014", "2014-2015", "2015-2016" };

	// Menu things
	 JMenuBar bar = new JMenuBar();

	// File menu
	 JMenu file = new JMenu("File");
	public  JMenuItem options = new JMenuItem("Options");
	public  JMenuItem exit = new JMenuItem("Exit");
	// New menu in file menu
	 JMenu New = new JMenu("New");
	public  JMenuItem deg = new JMenuItem("Degree");
	public  JMenuItem require = new JMenuItem("Requirement");
	public  JMenuItem course = new JMenuItem("Course");
	public  JMenuItem prof = new JMenuItem("Professor/TA");

	// View Menu
	 JMenu view = new JMenu("View");
	public  JMenuItem mycourses = new JMenuItem("My Courses");
	public  JMenuItem myprofs = new JMenuItem("My Professors");
	public  JMenuItem mytas = new JMenuItem("My TAs");
	public  JMenuItem mysched = new JMenuItem("My Schedule");
	 JMenu mydeg = new JMenu("My Degrees");
	// Deg Menu in View Menu
	public  JMenuItem myunder = new JMenuItem("Undergraduate");
	public  JMenuItem mygrad = new JMenuItem("Graduate");

	// Help menu
	 JMenu help = new JMenu("Help");
	public  JMenuItem about = new JMenuItem("About");
	public  JMenuItem howto = new JMenuItem("How to Use");

	// For main window
	 JPanel panelmain = new JPanel();
	 JLabel labelmain = new JLabel();

	// For viewing degrees
	 JPanel bigpanel1 = new JPanel();
	 JPanel bigpanel2 = new JPanel();
	 JPanel bigpanel3 = new JPanel();
	 JPanel bigpanel4 = new JPanel();
	 JPanel bigpanel5 = new JPanel();

	 JScrollPane bigscroll1;
	 JScrollPane bigscroll2;
	 JScrollPane bigscroll3;
	 JScrollPane bigscroll4;
	 JScrollPane bigscroll5;
}
