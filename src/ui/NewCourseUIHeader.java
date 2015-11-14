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

	// String arrays
	static String[] times = { "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00",
			"12:00" };
	static String[] ampm = { "AM", "PM" };

	// For course window
	JPanel coursePanel = new JPanel();
	JLabel nameLabel = new JLabel("Name");
	public static JTextField nameBox = new JTextField();
	JLabel departmentLabel = new JLabel("Department");
	public static JComboBox<String> departmentBox = new JComboBox<String>(MainUIHeader.deps);
	JLabel numberLabel = new JLabel("Number");
	public static JTextField numberBox = new JTextField();
	JLabel profLabel = new JLabel("Professor");
	public static JComboBox<String> profBox = new JComboBox<String>();
	JLabel taLabel = new JLabel("TA");
	public static JComboBox<String> taBox = new JComboBox<String>();
	JLabel creditsLabel = new JLabel("Credits");
	public static JTextField creditsbox = new JTextField();
	JLabel enrollLabel = new JLabel("Enrolled");
	public static JRadioButton yesButton = new JRadioButton();
	JLabel yesLabel = new JLabel("Yes");
	public static JRadioButton noButton = new JRadioButton();
	JLabel noLabel = new JLabel("No");
	public JLabel grade = new JLabel("Grade");
	public static JRadioButton aButton = new JRadioButton();
	public JLabel aLabel = new JLabel("A");
	public static JRadioButton bButton = new JRadioButton();
	public JLabel bLabel = new JLabel("B");
	public static JRadioButton cButton = new JRadioButton();
	public JLabel cLabel = new JLabel("C");
	public JRadioButton nrButton = new JRadioButton();
	public JLabel nrLabel = new JLabel("NR");
	public JRadioButton lButton = new JRadioButton();
	public JLabel lLabel = new JLabel("L");
	public JRadioButton iButton = new JRadioButton();
	public JLabel iLabel = new JLabel("I");
	public JRadioButton nfButton = new JRadioButton();
	public JLabel nfLabel = new JLabel("In Progess");
	public JButton cancelButton = new JButton("Cancel");
	public JButton createButton = new JButton("Create");
	public JButton scheduleButton = new JButton("Schedule");

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
