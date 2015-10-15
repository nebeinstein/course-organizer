package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainUIHeader extends JFrame {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = 6719521816566213537L;
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
	static JMenuBar bar = new JMenuBar();

	// File menu
	static JMenu file = new JMenu("File");
	static JMenuItem options = new JMenuItem("Options");
	static JMenuItem exit = new JMenuItem("Exit");
	// New menu in file menu
	static JMenu New = new JMenu("New");
	static JMenuItem deg = new JMenuItem("Degree");
	static JMenuItem require = new JMenuItem("Requirement");
	static JMenuItem course = new JMenuItem("Course");
	static JMenuItem prof = new JMenuItem("Professor/TA");

	// View Menu
	static JMenu view = new JMenu("View");
	static JMenuItem mycourses = new JMenuItem("My Courses");
	static JMenuItem myprofs = new JMenuItem("My Professors");
	static JMenuItem mytas = new JMenuItem("My TAs");
	static JMenuItem mysched = new JMenuItem("My Schedule");
	static JMenu mydeg = new JMenu("My Degrees");
	// Deg Menu in View Menu
	static JMenuItem myunder = new JMenuItem("Undergraduate");
	static JMenuItem mygrad = new JMenuItem("Graduate");

	// Help menu
	static JMenu help = new JMenu("Help");
	static JMenuItem about = new JMenuItem("About");
	static JMenuItem howto = new JMenuItem("How to Use");

	// For main window
	static JPanel panelmain = new JPanel();
	static JLabel labelmain = new JLabel();

	// For viewing degrees
	static JPanel bigpanel1 = new JPanel();
	static JPanel bigpanel2 = new JPanel();
	static JPanel bigpanel3 = new JPanel();
	static JPanel bigpanel4 = new JPanel();
	static JPanel bigpanel5 = new JPanel();

	static JScrollPane bigscroll1;
	static JScrollPane bigscroll2;
	static JScrollPane bigscroll3;
	static JScrollPane bigscroll4;
	static JScrollPane bigscroll5;
}
