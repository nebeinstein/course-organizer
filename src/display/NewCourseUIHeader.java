package display;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class NewCourseUIHeader extends JFrame {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = 4328260817709448975L;
	static String[] times = { "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00",
			"12:00" };
	static String[] ampm = { "AM", "PM" };
	// For course window
	static JPanel panel3 = new JPanel();
	static JLabel name2 = new JLabel("Name");
	static JTextField namebox2 = new JTextField();
	static JLabel dep2 = new JLabel("Department");
	static JComboBox<String> depbox2 = new JComboBox<String>(MainUIHeader.deps);
	static JLabel num1 = new JLabel("Number");
	static JTextField numbox1 = new JTextField();
	static JLabel pro2 = new JLabel("Professor");
	static JComboBox<String> probox2 = new JComboBox<String>();
	static JLabel Ta2 = new JLabel("TA");
	static JComboBox<String> tabox2 = new JComboBox<String>();
	static JLabel credits1 = new JLabel("Credits");
	static JTextField creditsbox1 = new JTextField();
	static JLabel enroll = new JLabel("Enrolled");
	static JRadioButton enbutt1 = new JRadioButton();
	static JLabel yes1 = new JLabel("Yes");
	static JRadioButton enbutt2 = new JRadioButton();
	static JLabel no1 = new JLabel("No");
	static JLabel grade = new JLabel("Grade");
	static JRadioButton abutt1 = new JRadioButton();
	static JLabel a1 = new JLabel("A");
	static JRadioButton bbutt1 = new JRadioButton();
	static JLabel b1 = new JLabel("B");
	static JRadioButton cbutt1 = new JRadioButton();
	static JLabel c1 = new JLabel("C");
	static JRadioButton nrbutt1 = new JRadioButton();
	static JLabel nr1 = new JLabel("NR");
	static JRadioButton lbutt1 = new JRadioButton();
	static JLabel l1 = new JLabel("L");
	static JRadioButton ibutt1 = new JRadioButton();
	static JLabel i1 = new JLabel("I");
	static JRadioButton nfbutt1 = new JRadioButton();
	static JLabel nf1 = new JLabel("In Progess");
	JButton cancel3 = new JButton("Cancel");
	JButton create2 = new JButton("Create");
	JButton schedbutt = new JButton("Schedule");

	// For scheduling Window
	static JFrame root4 = new JFrame();
	static JPanel panel4 = new JPanel();
	static JLabel year1 = new JLabel("Year");
	static JComboBox<String> yearbox1 = new JComboBox<String>(MainUIHeader.years);
	static JLabel termsem1 = new JLabel("Term/Semester");
	static JRadioButton abutt2 = new JRadioButton();
	static JLabel a2 = new JLabel("A Term");
	static JRadioButton bbutt2 = new JRadioButton();
	static JLabel b2 = new JLabel("B Term");
	static JRadioButton cbutt2 = new JRadioButton();
	static JLabel c2 = new JLabel("C Term");
	static JRadioButton dbutt2 = new JRadioButton();
	static JLabel d2 = new JLabel("D Term");
	static JRadioButton fallbutt1 = new JRadioButton();
	static JLabel fall1 = new JLabel("Fall");
	static JRadioButton springbutt1 = new JRadioButton();
	static JLabel spring1 = new JLabel("Spring");

	static JTabbedPane tabbedPane1 = new JTabbedPane();

	static JPanel lectpanel1 = new JPanel();
	static JRadioButton nonebutt1 = new JRadioButton();
	static JLabel none1 = new JLabel("No Lecture");
	static JRadioButton monbutt1 = new JRadioButton();
	static JLabel mon1 = new JLabel("Monday");
	static JRadioButton tuesbutt1 = new JRadioButton();
	static JLabel tues1 = new JLabel("Tuesday");
	static JRadioButton wedbutt1 = new JRadioButton();
	static JLabel wed1 = new JLabel("Wednesday");
	static JRadioButton thursbutt1 = new JRadioButton();
	static JLabel thurs1 = new JLabel("Thursday");
	static JRadioButton fributt1 = new JRadioButton();
	static JLabel fri1 = new JLabel("Friday");
	static JLabel start1 = new JLabel("Start");
	static JComboBox<String> starttime1 = new JComboBox<String>(times);
	static JComboBox<String> startam1 = new JComboBox<String>(ampm);
	static JLabel end1 = new JLabel("End");
	static JComboBox<String> endtime1 = new JComboBox<String>(times);
	static JComboBox<String> endam1 = new JComboBox<String>(ampm);

	static JPanel confpanel1 = new JPanel();
	static JRadioButton nonebutt2 = new JRadioButton();
	static JLabel none2 = new JLabel("No Conference");
	static JRadioButton monbutt2 = new JRadioButton();
	static JLabel mon2 = new JLabel("Monday");
	static JRadioButton tuesbutt2 = new JRadioButton();
	static JLabel tues2 = new JLabel("Tuesday");
	static JRadioButton wedbutt2 = new JRadioButton();
	static JLabel wed2 = new JLabel("Wednesday");
	static JRadioButton thursbutt2 = new JRadioButton();
	static JLabel thurs2 = new JLabel("Thursday");
	static JRadioButton fributt2 = new JRadioButton();
	static JLabel fri2 = new JLabel("Friday");
	static JLabel start2 = new JLabel("Start");
	static JComboBox<String> starttime2 = new JComboBox<String>(times);
	static JComboBox<String> startam2 = new JComboBox<String>(ampm);
	static JLabel end2 = new JLabel("End");
	static JComboBox<String> endtime2 = new JComboBox<String>(times);
	static JComboBox<String> endam2 = new JComboBox<String>(ampm);

	static JPanel labpanel1 = new JPanel();
	static JRadioButton nonebutt3 = new JRadioButton();
	static JLabel none3 = new JLabel("No Lab");
	static JRadioButton monbutt3 = new JRadioButton();
	static JLabel mon3 = new JLabel("Monday");
	static JRadioButton tuesbutt3 = new JRadioButton();
	static JLabel tues3 = new JLabel("Tuesday");
	static JRadioButton wedbutt3 = new JRadioButton();
	static JLabel wed3 = new JLabel("Wednesday");
	static JRadioButton thursbutt3 = new JRadioButton();
	static JLabel thurs3 = new JLabel("Thursday");
	static JRadioButton fributt3 = new JRadioButton();
	static JLabel fri3 = new JLabel("Friday");
	static JLabel start3 = new JLabel("Start");
	static JComboBox<String> starttime3 = new JComboBox<String>(times);
	static JComboBox<String> startam3 = new JComboBox<String>(ampm);
	static JLabel end3 = new JLabel("End");
	static JComboBox<String> endtime3 = new JComboBox<String>(times);
	static JComboBox<String> endam3 = new JComboBox<String>(ampm);

	JButton cancel4 = new JButton("Cancel");
	JButton finish2 = new JButton("Finish");
}
