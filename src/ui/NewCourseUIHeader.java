package ui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import control.Controller;

public class NewCourseUIHeader extends JFrame {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = 4328260817709448975L;
	// Controller
	Controller ctrl;
	
	static String[] times = { "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00",
			"12:00" };
	static String[] ampm = { "AM", "PM" };
	// For course window
	JPanel panel3 = new JPanel();
	JLabel name2 = new JLabel("Name");
	public JTextField namebox2 = new JTextField();
	JLabel dep2 = new JLabel("Department");
	public JComboBox<String> depbox2 = new JComboBox<String>(MainUIHeader.deps);
	JLabel num1 = new JLabel("Number");
	public JTextField numbox1 = new JTextField();
	JLabel pro2 = new JLabel("Professor");
	public JComboBox<String> probox2 = new JComboBox<String>();
	JLabel Ta2 = new JLabel("TA");
	public JComboBox<String> tabox2 = new JComboBox<String>();
	JLabel credits1 = new JLabel("Credits");
	public JTextField creditsbox1 = new JTextField();
	JLabel enroll = new JLabel("Enrolled");
	public JRadioButton enbutt1 = new JRadioButton();
	JLabel yes1 = new JLabel("Yes");
	public JRadioButton enbutt2 = new JRadioButton();
	JLabel no1 = new JLabel("No");
	public JLabel grade = new JLabel("Grade");
	public JRadioButton abutt1 = new JRadioButton();
	public JLabel a1 = new JLabel("A");
	public JRadioButton bbutt1 = new JRadioButton();
	public JLabel b1 = new JLabel("B");
	public JRadioButton cbutt1 = new JRadioButton();
	public JLabel c1 = new JLabel("C");
	public JRadioButton nrbutt1 = new JRadioButton();
	public JLabel nr1 = new JLabel("NR");
	public JRadioButton lbutt1 = new JRadioButton();
	public JLabel l1 = new JLabel("L");
	public JRadioButton ibutt1 = new JRadioButton();
	public JLabel i1 = new JLabel("I");
	public JRadioButton nfbutt1 = new JRadioButton();
	public JLabel nf1 = new JLabel("In Progess");
	public JButton cancel3 = new JButton("Cancel");
	public JButton create2 = new JButton("Create");
	public JButton schedbutt = new JButton("Schedule");

	// For scheduling Window
	public JFrame root4 = new JFrame();
	JPanel panel4 = new JPanel();
	JLabel year1 = new JLabel("Year");
	public JComboBox<String> yearbox1 = new JComboBox<String>(MainUIHeader.years);
	JLabel termsem1 = new JLabel("Term/Semester");
	public JRadioButton abutt2 = new JRadioButton();
	JLabel a2 = new JLabel("A Term");
	public JRadioButton bbutt2 = new JRadioButton();
	JLabel b2 = new JLabel("B Term");
	public JRadioButton cbutt2 = new JRadioButton();
	JLabel c2 = new JLabel("C Term");
	public JRadioButton dbutt2 = new JRadioButton();
	JLabel d2 = new JLabel("D Term");
	public JRadioButton fallbutt1 = new JRadioButton();
	JLabel fall1 = new JLabel("Fall");
	public JRadioButton springbutt1 = new JRadioButton();
	JLabel spring1 = new JLabel("Spring");

	JTabbedPane tabbedPane1 = new JTabbedPane();

	JPanel lectpanel1 = new JPanel();
	public JRadioButton nonebutt1 = new JRadioButton();
	public JLabel none1 = new JLabel("No Lecture");
	public JRadioButton monbutt1 = new JRadioButton();
	public JLabel mon1 = new JLabel("Monday");
	public JRadioButton tuesbutt1 = new JRadioButton();
	public JLabel tues1 = new JLabel("Tuesday");
	public JRadioButton wedbutt1 = new JRadioButton();
	public JLabel wed1 = new JLabel("Wednesday");
	public JRadioButton thursbutt1 = new JRadioButton();
	public JLabel thurs1 = new JLabel("Thursday");
	public JRadioButton fributt1 = new JRadioButton();
	public JLabel fri1 = new JLabel("Friday");
	public JLabel start1 = new JLabel("Start");
	public JComboBox<String> starttime1 = new JComboBox<String>(times);
	public JComboBox<String> startam1 = new JComboBox<String>(ampm);
	public JLabel end1 = new JLabel("End");
	public JComboBox<String> endtime1 = new JComboBox<String>(times);
	public JComboBox<String> endam1 = new JComboBox<String>(ampm);

	JPanel confpanel1 = new JPanel();
	public JRadioButton nonebutt2 = new JRadioButton();
	public JLabel none2 = new JLabel("No Conference");
	public JRadioButton monbutt2 = new JRadioButton();
	public JLabel mon2 = new JLabel("Monday");
	public JRadioButton tuesbutt2 = new JRadioButton();
	public JLabel tues2 = new JLabel("Tuesday");
	public JRadioButton wedbutt2 = new JRadioButton();
	public JLabel wed2 = new JLabel("Wednesday");
	public JRadioButton thursbutt2 = new JRadioButton();
	public JLabel thurs2 = new JLabel("Thursday");
	public JRadioButton fributt2 = new JRadioButton();
	public JLabel fri2 = new JLabel("Friday");
	public JLabel start2 = new JLabel("Start");
	public JComboBox<String> starttime2 = new JComboBox<String>(times);
	public JComboBox<String> startam2 = new JComboBox<String>(ampm);
	public JLabel end2 = new JLabel("End");
	public JComboBox<String> endtime2 = new JComboBox<String>(times);
	public JComboBox<String> endam2 = new JComboBox<String>(ampm);

	JPanel labpanel1 = new JPanel();
	public JRadioButton nonebutt3 = new JRadioButton();
	public JLabel none3 = new JLabel("No Lab");
	public JRadioButton monbutt3 = new JRadioButton();
	public JLabel mon3 = new JLabel("Monday");
	public JRadioButton tuesbutt3 = new JRadioButton();
	public JLabel tues3 = new JLabel("Tuesday");
	public JRadioButton wedbutt3 = new JRadioButton();
	public JLabel wed3 = new JLabel("Wednesday");
	public JRadioButton thursbutt3 = new JRadioButton();
	public JLabel thurs3 = new JLabel("Thursday");
	public JRadioButton fributt3 = new JRadioButton();
	public JLabel fri3 = new JLabel("Friday");
	public JLabel start3 = new JLabel("Start");
	public JComboBox<String> starttime3 = new JComboBox<String>(times);
	public JComboBox<String> startam3 = new JComboBox<String>(ampm);
	public JLabel end3 = new JLabel("End");
	public JComboBox<String> endtime3 = new JComboBox<String>(times);
	public JComboBox<String> endam3 = new JComboBox<String>(ampm);

	public JButton cancel4 = new JButton("Cancel");
	public JButton finish2 = new JButton("Finish");
}
