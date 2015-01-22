package central;
import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
//import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import objects.Course;
import objects.Require;

import central.Creating;
import degreeThings.Degree;

public class Display extends JFrame implements ActionListener {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = 1L;
	
	//Lists
	static String[] deps = {"--- Select one ---", "BB - Biology and Biotechnology", "BME - Biomedical Engineering","CS - Computer Science", "ECE - Electrical and Computer Engineering","ES - Engineering Science", "HU - Humanities & Arts", "MA - Mathematic Sciences", "MU - Music", "PE - Physical Education", "PH - Physics", "RBE - Robotics Engineering"};
	static String[] years = {"--- Select one ---", "2012-2013", "2013-2014", "2014-2015", "2015-2016"};
	static String[] times = {"1:00","2:00","3:00","4:00","5:00","6:00","7:00","8:00","9:00","10:00","11:00","12:00"};
	static String[] ampm = {"AM", "PM"};
	static String[] undegtypes = {"--- Select one ---","WPI", "Major", "Minor"};
	
	// Menu things
	JMenuBar bar = new JMenuBar();
	
	// File menu
	JMenu file = new JMenu("File");
	JMenuItem options = new JMenuItem("Options");
	JMenuItem exit = new JMenuItem("Exit");
	// New menu in file menu
	JMenu New = new JMenu("New");
	JMenuItem deg = new JMenuItem("Degree");
	JMenuItem require = new JMenuItem("Requirement");
	JMenuItem course = new JMenuItem("Course");
	JMenuItem prof = new JMenuItem("Professor/TA");

	// View Menu
	JMenu view = new JMenu("View");
	JMenuItem mycourses = new JMenuItem("My Courses");
	JMenuItem myprofs = new JMenuItem("My Professors");
	JMenuItem mytas = new JMenuItem("My TAs");
	JMenuItem mysched = new JMenuItem("My Schedule");
	JMenu mydeg = new JMenu("My Degrees");
	//Deg Menu in View Menu
	JMenuItem myunder = new JMenuItem("Undergraduate");
	JMenuItem mygrad = new JMenuItem("Graduate");
	
	// Help menu
	JMenu help = new JMenu("Help");
	JMenuItem about = new JMenuItem("About");
	JMenuItem howto = new JMenuItem("How to Use");
	
	//For main window
	JPanel panelmain = new JPanel();
	JLabel labelmain = new JLabel();
	
	//For prof window
	static JFrame root1 = new JFrame();
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
	static JComboBox<String> depbox1 = new JComboBox<String>(deps);
	static JRadioButton probutt1 = new JRadioButton();
	static JLabel pro1 = new JLabel("Professor");
	static JRadioButton tabutt1 = new JRadioButton();
	static JLabel Ta1 = new JLabel("TA");
	static JLabel photo1 = new JLabel("Photo");
	static JTextField photobox1 = new JTextField();
	JButton browse1 = new JButton("Browse");
	JButton cancel1 = new JButton("Cancel");
	JButton create1 = new JButton("Create");
	JButton advance1 = new JButton("Advanced");
	
	JFileChooser fc1 = new JFileChooser();
	
	//For advanced prof window
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
	
	//For course window
	static JFrame root3 = new JFrame();
	static JPanel panel3 = new JPanel();
	static JLabel name2 = new JLabel("Name");
	static JTextField namebox2 = new JTextField();
	static JLabel dep2 = new JLabel("Department");
	static JComboBox<String> depbox2 = new JComboBox<String>(deps);
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
	
	//For scheduling Window
	static JFrame root4 = new JFrame();
	static JPanel panel4 = new JPanel();
	static JLabel year1 = new JLabel("Year");
	static JComboBox<String> yearbox1 = new JComboBox<String>(years);
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
	
	//For Degree Window
	static JFrame root5 = new JFrame();
	static JPanel panel5 = new JPanel();
	static JLabel name3 = new JLabel("Name");
	static JTextField namebox3 = new JTextField();
	static JRadioButton degbutt1 = new JRadioButton();
	static JLabel deglabe1 = new JLabel("Undergraduate");
	static JRadioButton degbutt2 = new JRadioButton();
	static JLabel deglabe2 = new JLabel("Graduate");
	static JLabel type1 = new JLabel("Type");
	static JComboBox<String> typebox1 = new JComboBox<String>(undegtypes);
	JButton cancel5 = new JButton("Cancel");
	JButton create3 = new JButton("Create");
	
	//For Requirement Window
	static JFrame root6 = new JFrame();
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
	
	static JButton[] underbutts = new JButton[Main.undergrads.length];
	static JButton[] gradbutts = new JButton[Main.grads.length];
	
	//For viewing degrees
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
	
	public Display() {
		setSize(800, 600);
		setTitle("My WPI Organizer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		bar.add(file);
		bar.add(view);
		bar.add(help);
		file.add(New);
		file.add(options);
		file.add(new JSeparator());
		file.add(exit);
		New.add(prof);
		New.add(course);
		New.add(deg);
		New.add(require);
		view.add(mydeg);
		view.add(mycourses);
		view.add(mysched);
		view.add(myprofs);
		view.add(mytas);
		mydeg.add(myunder);
		mydeg.add(mygrad);
		help.add(howto);
		help.add(about);
		add(bar, BorderLayout.NORTH);

		options.addActionListener(this);
		exit.addActionListener(this);
		require.addActionListener(this);
		course.addActionListener(this);
		prof.addActionListener(this);
		deg.addActionListener(this);
		myunder.addActionListener(this);
		mygrad.addActionListener(this);
		mycourses.addActionListener(this);
		mysched.addActionListener(this);
		myprofs.addActionListener(this);
		mytas.addActionListener(this);
		howto.addActionListener(this);
		about.addActionListener(this);
		
		panelmain.setSize(800,600);
		panelmain.setLayout(null);
		add(panelmain);
		
		labelmain.setLocation(0,0);
		labelmain.setSize(800,25);
		labelmain.setHorizontalAlignment(JLabel.CENTER);
		panelmain.add(labelmain);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exit) System.exit(0);
		if (e.getSource() == course) newCourse();
		if (e.getSource() == prof) newProf();
		if (e.getSource() == deg) newDegree();
		if (e.getSource() == require) newRequire();
		if (e.getSource() == options) optWind();
		
		if (e.getSource() == myprofs) viewProfs();
		if (e.getSource() == mytas) viewTas();
		if (e.getSource() == mycourses) viewCourses();
		if (e.getSource() == myunder) viewUndergrads();
		if (e.getSource() == mygrad) viewGrads();
		
		if (e.getSource() == howto) howToWind();
		if (e.getSource() == about) aboutWind();
		
		if (e.getSource() == probutt1) isProf(true);
		if (e.getSource() == tabutt1) isProf(false);
		if (e.getSource() == cancel1) root1.dispose();
		if (e.getSource() == create1) Creating.createProf();
		if (e.getSource() == browse1) findPhoto(photobox1);
		if (e.getSource() == advance1) advanceProf();
		
		if (e.getSource() == cancel2) root2.dispose();
		if (e.getSource() == finish1) Creating.finishAdvance();
		
		if (e.getSource() == enbutt1) isEnroll(true);
		if (e.getSource() == enbutt2) isEnroll(false);
		if (e.getSource() == abutt1) isGrade(a1.getText());
		if (e.getSource() == bbutt1) isGrade(b1.getText());
		if (e.getSource() == cbutt1) isGrade(c1.getText());
		if (e.getSource() == nrbutt1) isGrade(nr1.getText());
		if (e.getSource() == lbutt1) isGrade(l1.getText());
		if (e.getSource() == ibutt1) isGrade(i1.getText());
		if (e.getSource() == nfbutt1) isGrade(nf1.getText());
		if (e.getSource() == cancel3) root3.dispose();
		if (e.getSource() == create2) Creating.createCourse();
		if (e.getSource() == schedbutt) schedWind();
		
		if (e.getSource() == fallbutt1) isFall(true);
		if (e.getSource() == springbutt1) isFall(false);
		if (e.getSource() == nonebutt1) noLect();
		if (e.getSource() == nonebutt2) noConf();
		if (e.getSource() == nonebutt3) noLab();
		if (e.getSource() == cancel4) root4.dispose();
		if (e.getSource() == finish2) Creating.finishSched();
		
		if (e.getSource() == degbutt1) isGrad(false);
		if (e.getSource() == degbutt2) isGrad(true);
		if (e.getSource() == cancel5) root5.dispose();
		if (e.getSource() == create3) Creating.createDegree();
		
		if (e.getSource() == degbutt3) isGradRequire(false);
		if (e.getSource() == degbutt4) isGradRequire(true);
		if (e.getSource() == browse2) findCourses(coursebox1);
		if (e.getSource() == cancel6) root6.dispose();
		if (e.getSource() == create4) Creating.createRequire();

		/*
		if (Arrays.asList(underbutts).contains(e.getSource())) viewDegree(underbutts, Arrays.asList(underbutts).indexOf(e.getSource()), true);
		if (Arrays.asList(gradbutts).contains(e.getSource())) viewDegree(gradbutts, Arrays.asList(gradbutts).indexOf(e.getSource()), false);
		*/
	}
	
	public String browseComp(String direct){
		String output = "";
		fc1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fc1.setCurrentDirectory(new File(direct));
		int returnVal = fc1.showOpenDialog(Display.this);
		if(returnVal == JFileChooser.APPROVE_OPTION){
			File file = fc1.getSelectedFile();
			output = file.getPath();
		}
		return output;
	}

	public void newProf() {
		//Creating the window
		root1.setSize(500,553);
		root1.setTitle("New Professor/TA");
		root1.setResizable(false);
		root1.setLocationRelativeTo(null);
		
		panel1.setSize(500,553);
		panel1.setLayout(null);
		root1.add(panel1, BorderLayout.CENTER);
		
		name1.setLocation(39,39);
		name1.setSize(96,25);
		name1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(name1);
		
		namebox1.setLocation(145,39);
		namebox1.setSize(224,25);
		panel1.add(namebox1);
		
		off1.setLocation(39,79);
		off1.setSize(96,25);
		off1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(off1);
		
		offbox1.setLocation(145,79);
		offbox1.setSize(224,25);
		panel1.add(offbox1);
		
		phone1.setLocation(39,119);
		phone1.setSize(96,25);
		phone1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(phone1);
		
		phonebox1.setLocation(145,119);
		phonebox1.setSize(224,25);
		panel1.add(phonebox1);
		
		fax1.setLocation(39,159);
		fax1.setSize(96,25);
		fax1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(fax1);

		faxbox1.setLocation(145,159);
		faxbox1.setSize(224,25);
		panel1.add(faxbox1);
		
		email1.setLocation(39,199);
		email1.setSize(96,25);
		email1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(email1);
		
		emailbox1.setLocation(145,199);
		emailbox1.setSize(224,25);
		panel1.add(emailbox1);
		
		dep1.setLocation(39,239);
		dep1.setSize(96,25);
		dep1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(dep1);

		depbox1.setLocation(145,239);
		depbox1.setSize(224,25);
		panel1.add(depbox1);
		
		probutt1.setLocation(100,284);
		probutt1.setSize(15,15);
		probutt1.addActionListener(this);
		panel1.add(probutt1);
		
		pro1.setLocation(109,279);
		pro1.setSize(96,25);
		pro1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(pro1);
		
		tabutt1.setLocation(215,284);
		tabutt1.setSize(15,15);
		tabutt1.addActionListener(this);
		panel1.add(tabutt1);
		
		Ta1.setLocation(209,279);
		Ta1.setSize(96,25);
		Ta1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(Ta1);
		
		photo1.setLocation(39,319);
		photo1.setSize(96,25);
		photo1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(photo1);
		
		photobox1.setLocation(145,319);
		photobox1.setSize(224,25);
		panel1.add(photobox1);
		
		browse1.setLocation(369,319);
		browse1.setSize(96,25);
		browse1.addActionListener(this);
		panel1.add(browse1);
		
		cancel1.setLocation(380,490);
		cancel1.setSize(96,25);
		cancel1.addActionListener(this);
		panel1.add(cancel1);
		
		create1.setLocation(264,490);
		create1.setSize(96,25);
		create1.addActionListener(this);
		panel1.add(create1);
		
		advance1.setLocation(148,490);
		advance1.setSize(96,25);
		advance1.addActionListener(this);
		panel1.add(advance1);
		
		root1.setVisible(true);
	}
	
	public void findPhoto(JTextField box){
		String path = browseComp("C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Photos");
		box.setText(path);
	}
	
	public void isProf(Boolean thing){
		if (thing){
			if (probutt1.isSelected()) tabutt1.setSelected(false);
		}else{
			if(tabutt1.isSelected()) probutt1.setSelected(false);
		}
	}

	public void advanceProf(){		
		root2.setSize(680,500);
		root2.setTitle("Professor Advanced");
		root2.setResizable(false);
		root2.setLocationRelativeTo(null);
		
		panel2.setSize(680,500);
		panel2.setLayout(null);
		root2.add(panel2, BorderLayout.CENTER);
		
		title1.setLocation(79,39);
		title1.setSize(96,25);
		title1.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(title1);
		
		titlebox1.setLocation(185,39);
		titlebox1.setSize(360,25);
		panel2.add(titlebox1);
		
		desc1.setLocation(79,79);
		desc1.setSize(96,100);
		desc1.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(desc1);
		
		descbox1.setLocation(0,0);
		descbox1.setSize(345,100);
		
		descscrollpane.setLocation(185,79);
		descscrollpane.setSize(360,100);
		panel2.add(descscrollpane);
		
		edu1.setLocation(79, 194);
		edu1.setSize(96,50);
		edu1.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(edu1);
		
		edubox1.setLocation(0,0);
		edubox1.setSize(360,50);
		
		eduscrollpane.setLocation(185,194);
		eduscrollpane.setSize(360,50);
		panel2.add(eduscrollpane);
		
		res1.setLocation(79, 259);
		res1.setSize(96,50);
		res1.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(res1);
		
		resbox1.setLocation(0,0);
		resbox1.setSize(360,50);
		
		resscrollpane.setLocation(185,259);
		resscrollpane.setSize(360,50);
		panel2.add(resscrollpane);
		
		cours1.setLocation(79,324);
		cours1.setSize(96,75);
		cours1.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(cours1);
		
		coursbox1.setLocation(0,0);
		coursbox1.setSize(345,75);
		
		coursscrollpane.setLocation(185,324);
		coursscrollpane.setSize(360,75);
		panel2.add(coursscrollpane);
		
		cancel2.setLocation(558,434);
		cancel2.setSize(96,25);
		cancel2.addActionListener(this);
		panel2.add(cancel2);
		
		finish1.setLocation(442,434);
		finish1.setSize(96,25);
		finish1.addActionListener(this);
		panel2.add(finish1);
		
		root2.setVisible(true);
	}
	
	public void newCourse() {
//		Main.getProfs();
//		Main.getTas();
		root3.setSize(500,553);
		root3.setTitle("New Course");
		root3.setResizable(false);
		root3.setLocationRelativeTo(null);

		panel3.setSize(500,553);
		panel3.setLayout(null);
		root3.add(panel3, BorderLayout.CENTER);
		
		name2.setLocation(39,39);
		name2.setSize(96,25);
		name2.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(name2);
		
		namebox2.setLocation(145,39);
		namebox2.setSize(224,25);
		panel3.add(namebox2);	
		
		dep2.setLocation(39,79);
		dep2.setSize(96,25);
		dep2.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(dep2);

		depbox2.setLocation(145,79);
		depbox2.setSize(224,25);
		panel3.add(depbox2);
		
		num1.setLocation(39,119);
		num1.setSize(96,25);
		num1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(num1);
		
		numbox1.setLocation(145,119);
		numbox1.setSize(224,25);
		panel3.add(numbox1);
		
		pro2.setLocation(39,159);
		pro2.setSize(96,25);
		pro2.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(pro2);

		probox2.setLocation(145,159);
		probox2.setSize(224,25);
		probox2.removeAllItems();
		probox2.addItem("--- Select One ---");
		int i = 0;
		while(i<Main.profs.length){
			probox2.addItem(Main.profs[i].name);
			i++;
		}
		probox2.addItem("N/A");
		panel3.add(probox2);
		
		Ta2.setLocation(39,199);
		Ta2.setSize(96,25);
		Ta2.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(Ta2);

		tabox2.setLocation(145,199);
		tabox2.setSize(224,25);
		tabox2.removeAllItems();
		tabox2.addItem("--- Select One ---");
		i = 0;
		while(i<Main.tas.length){
			tabox2.addItem(Main.tas[i].name);
			i++;
		}
		tabox2.addItem("N/A");
		panel3.add(tabox2);
		
		credits1.setLocation(39,239);
		credits1.setSize(96,25);
		credits1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(credits1);
		
		creditsbox1.setLocation(145,239);
		creditsbox1.setSize(224,25);
		panel3.add(creditsbox1);
		
		enroll.setLocation(39,279);
		enroll.setSize(96,25);
		enroll.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(enroll);
		
		enbutt1.setLocation(145,283);
		enbutt1.setSize(15,15);
		enbutt1.addActionListener(this);
		panel3.add(enbutt1);
		
		yes1.setLocation(145,279);
		yes1.setSize(96,25);
		yes1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(yes1);
		
		enbutt2.setLocation(245,283);
		enbutt2.setSize(15,15);
		enbutt2.addActionListener(this);
		panel3.add(enbutt2);
		
		no1.setLocation(245,279);
		no1.setSize(96,25);
		no1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(no1);
		
		grade.setLocation(39,319);
		grade.setSize(96,25);
		grade.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(grade);
		
		abutt1.setLocation(145,325);
		abutt1.setSize(15,15);
		abutt1.addActionListener(this);
		panel3.add(abutt1);
		
		a1.setLocation(120, 319);
		a1.setSize(96,25);
		a1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(a1);
		
		bbutt1.setLocation(200,325);
		bbutt1.setSize(15,15);
		bbutt1.addActionListener(this);
		panel3.add(bbutt1);
		
		b1.setLocation(175, 319);
		b1.setSize(96,25);
		b1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(b1);
		
		cbutt1.setLocation(255,325);
		cbutt1.setSize(15,15);
		cbutt1.addActionListener(this);
		panel3.add(cbutt1);
		
		c1.setLocation(230,319);
		c1.setSize(95,25);
		c1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(c1);
		
		nrbutt1.setLocation(310,325);
		nrbutt1.setSize(15,15);
		nrbutt1.addActionListener(this);
		panel3.add(nrbutt1);
		
		nr1.setLocation(288,319);
		nr1.setSize(96,25);
		nr1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(nr1);
		
		lbutt1.setLocation(365,325);
		lbutt1.setSize(15,15);
		lbutt1.addActionListener(this);
		panel3.add(lbutt1);
		
		l1.setLocation(340,319);
		l1.setSize(96,25);
		l1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(l1);
		
		ibutt1.setLocation(145,355);
		ibutt1.setSize(15,15);
		ibutt1.addActionListener(this);
		panel3.add(ibutt1);
		
		i1.setLocation(120,349);
		i1.setSize(96,25);
		i1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(i1);
		
		nfbutt1.setLocation(200,355);
		nfbutt1.setSize(15,15);
		nfbutt1.addActionListener(this);
		panel3.add(nfbutt1);
		
		nf1.setLocation(203,349);
		nf1.setSize(96,25);
		nf1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(nf1);
		
		cancel3.setLocation(380,490);
		cancel3.setSize(96,25);
		cancel3.addActionListener(this);
		panel3.add(cancel3);
		
		create2.setLocation(266,490);
		create2.setSize(96,25);
		create2.addActionListener(this);
		panel3.add(create2);
		
		schedbutt.setLocation(150,490);
		schedbutt.setSize(96,25);
		schedbutt.addActionListener(this);
		panel3.add(schedbutt);
		
		root3.setVisible(true);
	}
	
	public void isEnroll(Boolean thing){
		if (thing){
			if (enbutt1.isSelected()) {
				enbutt2.setSelected(false);
				grade.setEnabled(true);
				abutt1.setEnabled(true);
				a1.setEnabled(true);
				bbutt1.setEnabled(true);
				b1.setEnabled(true);
				cbutt1.setEnabled(true);
				c1.setEnabled(true);
				nrbutt1.setEnabled(true);
				nr1.setEnabled(true);
				lbutt1.setEnabled(true);
				l1.setEnabled(true);
				ibutt1.setEnabled(true);
				i1.setEnabled(true);
				nfbutt1.setEnabled(true);
				nf1.setEnabled(true);
			}
		}else{
			if (enbutt2.isSelected()) {
				enbutt1.setSelected(false);
				grade.setEnabled(false);
				abutt1.setEnabled(false);
				a1.setEnabled(false);
				bbutt1.setEnabled(false);
				b1.setEnabled(false);
				cbutt1.setEnabled(false);
				c1.setEnabled(false);
				nrbutt1.setEnabled(false);
				nr1.setEnabled(false);
				lbutt1.setEnabled(false);
				l1.setEnabled(false);
				ibutt1.setEnabled(false);
				i1.setEnabled(false);
				nfbutt1.setEnabled(false);
				nf1.setEnabled(false);
			}
		}
	}

	public void isGrade(String grade){
		if (grade == a1.getText()){
			if (abutt1.isSelected()){
				bbutt1.setSelected(false);
				cbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				lbutt1.setSelected(false);
				ibutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == b1.getText()){
			if (bbutt1.isSelected()){
				abutt1.setSelected(false);
				cbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				lbutt1.setSelected(false);
				ibutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == c1.getText()){
			if (cbutt1.isSelected()){
				abutt1.setSelected(false);
				bbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				lbutt1.setSelected(false);
				ibutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == nr1.getText()){
			if (nrbutt1.isSelected()){
				abutt1.setSelected(false);
				bbutt1.setSelected(false);
				cbutt1.setSelected(false);
				lbutt1.setSelected(false);
				ibutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == l1.getText()){
			if (lbutt1.isSelected()){
				abutt1.setSelected(false);
				bbutt1.setSelected(false);
				cbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				ibutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == i1.getText()){
			if (ibutt1.isSelected()){
				abutt1.setSelected(false);
				bbutt1.setSelected(false);
				cbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				lbutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == nf1.getText()){
			if (nfbutt1.isSelected()){
				abutt1.setSelected(false);
				bbutt1.setSelected(false);
				cbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				lbutt1.setSelected(false);
				ibutt1.setSelected(false);
			}
		}
	}

	public void schedWind(){
		root4.setSize(680,500);
		root4.setTitle("Scheduling");
		root4.setResizable(false);
		root4.setLocationRelativeTo(null);
		
		panel4.setSize(680,500);
		panel4.setLayout(null);
		root4.add(panel4);
		
		year1.setLocation(79,39);
		year1.setSize(96,25);
		year1.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(year1);
		
		yearbox1.setLocation(185,39);
		yearbox1.setSize(360,25);
		panel4.add(yearbox1);
		
		termsem1.setLocation(79,79);
		termsem1.setSize(96,25);
		termsem1.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(termsem1);
		
		abutt2.setLocation(185,85);
		abutt2.setSize(15,15);
		panel4.add(abutt2);
		
		a2.setLocation(190, 79);
		a2.setSize(96,25);
		a2.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(a2);
		
		bbutt2.setLocation(300,85);
		bbutt2.setSize(15,15);
		panel4.add(bbutt2);
		
		b2.setLocation(305, 79);
		b2.setSize(96,25);
		b2.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(b2);
		
		cbutt2.setLocation(415,85);
		cbutt2.setSize(15,15);
		panel4.add(cbutt2);
		
		c2.setLocation(420,79);
		c2.setSize(95,25);
		c2.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(c2);
		
		dbutt2.setLocation(530,85);
		dbutt2.setSize(15,15);
		panel4.add(dbutt2);
		
		d2.setLocation(535,79);
		d2.setSize(96,25);
		d2.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(d2);
		
		fallbutt1.setLocation(185,115);
		fallbutt1.setSize(15,15);
		fallbutt1.addActionListener(this);
		panel4.add(fallbutt1);
		
		fall1.setLocation(190,109);
		fall1.setSize(96,25);
		fall1.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(fall1);
		
		springbutt1.setLocation(300,115);
		springbutt1.setSize(15,15);
		springbutt1.addActionListener(this);
		panel4.add(springbutt1);
		
		spring1.setLocation(305,109);
		spring1.setSize(96,25);
		spring1.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(spring1);
		
		tabbedPane1.setLocation(79,150);
		tabbedPane1.setSize(522,250);
		
		lectpanel1.setSize(522,250);
		lectpanel1.setLayout(null);
		tabbedPane1.addTab("Lecture",lectpanel1);
		tabbedPane1.setMnemonicAt(0, KeyEvent.VK_1);
		
		confpanel1.setSize(522,250);
		confpanel1.setLayout(null);
		tabbedPane1.addTab("Conference", confpanel1);
		tabbedPane1.setMnemonicAt(1, KeyEvent.VK_2);
		
		labpanel1.setSize(522,250);
		labpanel1.setLayout(null);
		tabbedPane1.addTab("Lab", labpanel1);
		tabbedPane1.setMnemonicAt(2, KeyEvent.VK_3);
		
		panel4.add(tabbedPane1);
		
		//Lecture Tab
		nonebutt1.setLocation(19,15);
		nonebutt1.setSize(15,15);
		nonebutt1.addActionListener(this);
		lectpanel1.add(nonebutt1);
		
		none1.setLocation(36, 9);
		none1.setSize(96,25);
		none1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(none1);
		
		monbutt1.setLocation(34,75);
		monbutt1.setSize(15,15);
		lectpanel1.add(monbutt1);
		
		mon1.setLocation(52,69);
		mon1.setSize(96,25);
		mon1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(mon1);
		
		tuesbutt1.setLocation(128, 75);
		tuesbutt1.setSize(15,15);
		lectpanel1.add(tuesbutt1);
		
		tues1.setLocation(146,69);
		tues1.setSize(96,25);
		tues1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(tues1);
		
		wedbutt1.setLocation(222,75);
		wedbutt1.setSize(15,15);
		lectpanel1.add(wedbutt1);
		
		wed1.setLocation(240,69);
		wed1.setSize(96,25);
		wed1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(wed1);
		
		thursbutt1.setLocation(316,75);
		thursbutt1.setSize(15,15);
		lectpanel1.add(thursbutt1);
		
		thurs1.setLocation(334,69);
		thurs1.setSize(96,25);
		thurs1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(thurs1);
		
		fributt1.setLocation(410,75);
		fributt1.setSize(15,15);
		lectpanel1.add(fributt1);
		
		fri1.setLocation(428,69);
		fri1.setSize(96,25);
		fri1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(fri1);
		
		start1.setLocation(39, 115);
		start1.setSize(96,25);
		start1.setHorizontalAlignment(JLabel.CENTER);
		lectpanel1.add(start1);
		
		starttime1.setLocation(115, 115);
		starttime1.setSize(64,25);
		starttime1.setEditable(true);
		lectpanel1.add(starttime1);
		
		startam1.setLocation(190, 115);
		startam1.setSize(48,25);
		lectpanel1.add(startam1);
		
		end1.setLocation(239, 115);
		end1.setSize(96,25);
		end1.setHorizontalAlignment(JLabel.CENTER);
		lectpanel1.add(end1);
		
		endtime1.setLocation(315, 115);
		endtime1.setSize(64,25);
		endtime1.setEditable(true);
		lectpanel1.add(endtime1);
		
		endam1.setLocation(390, 115);
		endam1.setSize(48,25);
		lectpanel1.add(endam1);
		
		//Conference Tab
		nonebutt2.setLocation(19,15);
		nonebutt2.setSize(15,15);
		nonebutt2.addActionListener(this);
		confpanel1.add(nonebutt2);
		
		none2.setLocation(36,9);
		none2.setSize(96,25);
		none2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(none2);
		
		monbutt2.setLocation(34,75);
		monbutt2.setSize(15,15);
		confpanel1.add(monbutt2);
		
		mon2.setLocation(52,69);
		mon2.setSize(96,25);
		mon2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(mon2);
		
		tuesbutt2.setLocation(128, 75);
		tuesbutt2.setSize(15,15);
		confpanel1.add(tuesbutt2);
		
		tues2.setLocation(146,69);
		tues2.setSize(96,25);
		tues2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(tues2);
		
		wedbutt2.setLocation(222,75);
		wedbutt2.setSize(15,15);
		confpanel1.add(wedbutt2);
		
		wed2.setLocation(240,69);
		wed2.setSize(96,25);
		wed2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(wed2);
		
		thursbutt2.setLocation(316,75);
		thursbutt2.setSize(15,15);
		confpanel1.add(thursbutt2);
		
		thurs2.setLocation(334,69);
		thurs2.setSize(96,25);
		thurs2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(thurs2);
		
		fributt2.setLocation(410,75);
		fributt2.setSize(15,15);
		confpanel1.add(fributt2);
		
		fri2.setLocation(428,69);
		fri2.setSize(96,25);
		fri2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(fri2);
		
		start2.setLocation(39, 115);
		start2.setSize(96,25);
		start2.setHorizontalAlignment(JLabel.CENTER);
		confpanel1.add(start2);
		
		starttime2.setLocation(115, 115);
		starttime2.setSize(64,25);
		starttime2.setEditable(true);
		confpanel1.add(starttime2);
		
		startam2.setLocation(190, 115);
		startam2.setSize(48,25);
		confpanel1.add(startam2);
		
		end2.setLocation(239, 115);
		end2.setSize(96,25);
		end2.setHorizontalAlignment(JLabel.CENTER);
		confpanel1.add(end2);
		
		endtime2.setLocation(315, 115);
		endtime2.setSize(64,25);
		endtime2.setEditable(true);
		confpanel1.add(endtime2);
		
		endam2.setLocation(390, 115);
		endam2.setSize(48,25);
		confpanel1.add(endam2);
		
		//Lab Tab
		nonebutt3.setLocation(19,15);
		nonebutt3.setSize(15,15);
		nonebutt3.addActionListener(this);
		labpanel1.add(nonebutt3);
		
		none3.setLocation(36,9);
		none3.setSize(96,25);
		none3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(none3);
	
		monbutt3.setLocation(34,75);
		monbutt3.setSize(15,15);
		labpanel1.add(monbutt3);
		
		mon3.setLocation(52,69);
		mon3.setSize(96,25);
		mon3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(mon3);
		
		tuesbutt3.setLocation(128, 75);
		tuesbutt3.setSize(15,15);
		labpanel1.add(tuesbutt3);
		
		tues3.setLocation(146,69);
		tues3.setSize(96,25);
		tues3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(tues3);
		
		wedbutt3.setLocation(222,75);
		wedbutt3.setSize(15,15);
		labpanel1.add(wedbutt3);
		
		wed3.setLocation(240,69);
		wed3.setSize(96,25);
		wed3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(wed3);
		
		thursbutt3.setLocation(316,75);
		thursbutt3.setSize(15,15);
		labpanel1.add(thursbutt3);
		
		thurs3.setLocation(334,69);
		thurs3.setSize(96,25);
		thurs3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(thurs3);
		
		fributt3.setLocation(410,75);
		fributt3.setSize(15,15);
		labpanel1.add(fributt3);
		
		fri3.setLocation(428,69);
		fri3.setSize(96,25);
		fri3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(fri3);
		
		start3.setLocation(39, 115);
		start3.setSize(96,25);
		start3.setHorizontalAlignment(JLabel.CENTER);
		labpanel1.add(start3);
		
		starttime3.setLocation(115, 115);
		starttime3.setSize(64,25);
		starttime3.setEditable(true);
		labpanel1.add(starttime3);
		
		startam3.setLocation(190, 115);
		startam3.setSize(48,25);
		labpanel1.add(startam3);
		
		end3.setLocation(239, 115);
		end3.setSize(96,25);
		end3.setHorizontalAlignment(JLabel.CENTER);
		labpanel1.add(end3);
		
		endtime3.setLocation(315, 115);
		endtime3.setSize(64,25);
		endtime3.setEditable(true);
		labpanel1.add(endtime3);
		
		endam3.setLocation(390, 115);
		endam3.setSize(48,25);
		labpanel1.add(endam3);
		
		//Buttons at bottom of Window
		cancel4.setLocation(558,434);
		cancel4.setSize(96,25);
		cancel4.addActionListener(this);
		panel4.add(cancel4);
		
		finish2.setLocation(442,434);
		finish2.setSize(96,25);
		finish2.addActionListener(this);
		panel4.add(finish2);
		
		root4.setVisible(true);
	}
	
	public void isFall(Boolean thing){
		if (thing){
			if(fallbutt1.isSelected()){
				abutt2.setSelected(true);
				bbutt2.setSelected(true);
				cbutt2.setSelected(false);
				dbutt2.setSelected(false);
				springbutt1.setSelected(false);
			}else{
				abutt2.setSelected(false);
				bbutt2.setSelected(false);
			}
		}else{
			if(springbutt1.isSelected()){
				abutt2.setSelected(false);
				bbutt2.setSelected(false);
				cbutt2.setSelected(true);
				dbutt2.setSelected(true);
				fallbutt1.setSelected(false);
			}else{
				cbutt2.setSelected(false);
				dbutt2.setSelected(false);
			}
		}
	}

	public void noLect(){
		if (nonebutt1.isSelected()){
			monbutt1.setEnabled(false);
			mon1.setEnabled(false);
			tuesbutt1.setEnabled(false);
			tues1.setEnabled(false);
			wedbutt1.setEnabled(false);
			wed1.setEnabled(false);
			thursbutt1.setEnabled(false);
			thurs1.setEnabled(false);
			fributt1.setEnabled(false);
			fri1.setEnabled(false);
			start1.setEnabled(false);
			starttime1.setEnabled(false);
			startam1.setEnabled(false);
			end1.setEnabled(false);
			endtime1.setEnabled(false);
			endam1.setEnabled(false);
		}else{
			monbutt1.setEnabled(true);
			mon1.setEnabled(true);
			tuesbutt1.setEnabled(true);
			tues1.setEnabled(true);
			wedbutt1.setEnabled(true);
			wed1.setEnabled(true);
			thursbutt1.setEnabled(true);
			thurs1.setEnabled(true);
			fributt1.setEnabled(true);
			fri1.setEnabled(true);
			start1.setEnabled(true);
			starttime1.setEnabled(true);
			startam1.setEnabled(true);
			end1.setEnabled(true);
			endtime1.setEnabled(true);
			endam1.setEnabled(true);
		}
	}
	
	public void noConf(){
		if (nonebutt2.isSelected()){
			monbutt2.setEnabled(false);
			mon2.setEnabled(false);
			tuesbutt2.setEnabled(false);
			tues2.setEnabled(false);
			wedbutt2.setEnabled(false);
			wed2.setEnabled(false);
			thursbutt2.setEnabled(false);
			thurs2.setEnabled(false);
			fributt2.setEnabled(false);
			fri2.setEnabled(false);
			start2.setEnabled(false);
			starttime2.setEnabled(false);
			startam2.setEnabled(false);
			end2.setEnabled(false);
			endtime2.setEnabled(false);
			endam2.setEnabled(false);
		}else{
			monbutt2.setEnabled(true);
			mon2.setEnabled(true);
			tuesbutt2.setEnabled(true);
			tues2.setEnabled(true);
			wedbutt2.setEnabled(true);
			wed2.setEnabled(true);
			thursbutt2.setEnabled(true);
			thurs2.setEnabled(true);
			fributt2.setEnabled(true);
			fri2.setEnabled(true);
			start2.setEnabled(true);
			starttime2.setEnabled(true);
			startam2.setEnabled(true);
			end2.setEnabled(true);
			endtime2.setEnabled(true);
			endam2.setEnabled(true);
		}
	}
	
	public void noLab(){
		if (nonebutt3.isSelected()){
			monbutt3.setEnabled(false);
			mon3.setEnabled(false);
			tuesbutt3.setEnabled(false);
			tues3.setEnabled(false);
			wedbutt3.setEnabled(false);
			wed3.setEnabled(false);
			thursbutt3.setEnabled(false);
			thurs3.setEnabled(false);
			fributt3.setEnabled(false);
			fri3.setEnabled(false);
			start3.setEnabled(false);
			starttime3.setEnabled(false);
			startam3.setEnabled(false);
			end3.setEnabled(false);
			endtime3.setEnabled(false);
			endam3.setEnabled(false);
		}else{
			monbutt3.setEnabled(true);
			mon3.setEnabled(true);
			tuesbutt3.setEnabled(true);
			tues3.setEnabled(true);
			wedbutt3.setEnabled(true);
			wed3.setEnabled(true);
			thursbutt3.setEnabled(true);
			thurs3.setEnabled(true);
			fributt3.setEnabled(true);
			fri3.setEnabled(true);
			start3.setEnabled(true);
			starttime3.setEnabled(true);
			startam3.setEnabled(true);
			end3.setEnabled(true);
			endtime3.setEnabled(true);
			endam3.setEnabled(true);
		}
	}

	public void newDegree() {
		root5.setSize(400,270);
		root5.setTitle("New Degree");
		root5.setResizable(false);
		root5.setLocationRelativeTo(null);
		
		panel5.setSize(400,270);
		panel5.setLayout(null);
		root5.add(panel5);
		
		name3.setLocation(14,39);
		name3.setSize(96,25);
		name3.setHorizontalAlignment(JLabel.CENTER);
		panel5.add(name3);
		
		namebox3.setLocation(125,39);
		namebox3.setSize(194,25);
		panel5.add(namebox3);
		
		degbutt1.setLocation(70,85);
		degbutt1.setSize(15,15);
		degbutt1.addActionListener(this);
		panel5.add(degbutt1);
		
		deglabe1.setLocation(90,79);
		deglabe1.setSize(96,25);
		deglabe1.setHorizontalAlignment(JLabel.LEFT);
		panel5.add(deglabe1);
		
		degbutt2.setLocation(210,85);
		degbutt2.setSize(15,15);
		degbutt2.addActionListener(this);
		panel5.add(degbutt2);
		
		deglabe2.setLocation(230,79);
		deglabe2.setSize(96,25);
		deglabe2.setHorizontalAlignment(JLabel.LEFT);
		panel5.add(deglabe2);
		
		type1.setLocation(14,119);
		type1.setSize(96,25);
		type1.setHorizontalAlignment(JLabel.CENTER);
		panel5.add(type1);
		
		typebox1.setLocation(125,119);
		typebox1.setSize(194,25);
		panel5.add(typebox1);
		
		cancel5.setLocation(280,207);
		cancel5.setSize(96,25);
		cancel5.addActionListener(this);
		panel5.add(cancel5);
		
		create3.setLocation(166,207);
		create3.setSize(96,25);
		create3.addActionListener(this);
		panel5.add(create3);
		
		root5.setVisible(true);
		
	}

	public void isGrad(Boolean thing){
		if(thing){
			if (degbutt2.isSelected()){
				degbutt1.setSelected(false);
				type1.setEnabled(false);
				typebox1.setEnabled(false);
			}
		}else{
			if (degbutt1.isSelected()){
				degbutt2.setSelected(false);
				type1.setEnabled(true);
				typebox1.setEnabled(true);
			}
		}
	}
	
	public void newRequire() {
//		Main.getGrads();
//		Main.getUndergrads();
//		Main.getCourses();
		
		root6.setSize(500,553);
		root6.setTitle("New Requirement");
		root6.setResizable(false);
		root6.setLocationRelativeTo(null);
		
		panel6.setSize(500,553);
		panel6.setLayout(null);
		root6.add(panel6);
		
		name4.setLocation(39,39);
		name4.setSize(96,25);
		name4.setHorizontalAlignment(JLabel.CENTER);
		panel6.add(name4);
		
		namebox4.setLocation(145,39);
		namebox4.setSize(224,25);
		panel6.add(namebox4);
		
		deg1.setLocation(39,79);
		deg1.setSize(96,25);
		deg1.setHorizontalAlignment(JLabel.CENTER);
		panel6.add(deg1);
		
		degbutt3.setLocation(145,85);
		degbutt3.setSize(15,15);
		degbutt3.addActionListener(this);
		panel6.add(degbutt3);
		
		deglabe3.setLocation(165,79);
		deglabe3.setSize(96,25);
		deglabe3.setHorizontalAlignment(JLabel.LEFT);
		panel6.add(deglabe3);
		
		degbutt4.setLocation(260,85);
		degbutt4.setSize(15,15);
		degbutt4.addActionListener(this);
		panel6.add(degbutt4);
		
		deglabe4.setLocation(280,79);
		deglabe4.setSize(96,25);
		deglabe4.setHorizontalAlignment(JLabel.LEFT);
		panel6.add(deglabe4);
		
		degbox1.setLocation(145,104);
		degbox1.setSize(224,25);
		degbox1.setEnabled(false);
		panel6.add(degbox1);
		
		credits2.setLocation(39,144);
		credits2.setSize(96,25);
		credits2.setHorizontalAlignment(JLabel.CENTER);
		panel6.add(credits2);
		
		creditsbox2.setLocation(145,144);
		creditsbox2.setSize(224,25);
		panel6.add(creditsbox2);
		
		reqcourses.setLocation(39,184);
		reqcourses.setSize(96,50);
		reqcourses.setHorizontalAlignment(JLabel.CENTER);
		panel6.add(reqcourses);
		
		reqbox.setLocation(0,0);
		reqbox.setSize(224, 75);
		
		reqscrollpane.setLocation(145,184);
		reqscrollpane.setSize(224,75);
		panel6.add(reqscrollpane);
		
		courses1.setLocation(39,274);
		courses1.setSize(96,25);
		courses1.setHorizontalAlignment(JLabel.CENTER);
		panel6.add(courses1);
		
		coursebox1.setLocation(0,0);
		coursebox1.setSize(224,100);
		
		coursescrollpane.setLocation(145,274);
		coursescrollpane.setSize(224,100);
		panel6.add(coursescrollpane);
		
		browse2.setLocation(374,274);
		browse2.setSize(96,25);
		browse2.addActionListener(this);
		panel6.add(browse2);
		
		cancel6.setLocation(380,490);
		cancel6.setSize(96,25);
		cancel6.addActionListener(this);
		panel6.add(cancel6);
		
		create4.setLocation(266,490);
		create4.setSize(96,25);
		create4.addActionListener(this);
		panel6.add(create4);
		
		root6.setVisible(true);
	}

	public void isGradRequire(Boolean thing){
		if (thing){
			if(degbutt4.isSelected()){
				degbutt3.setSelected(false);
				degbox1.setEnabled(true);
				degbox1.removeAllItems();
				int i = 0;
				while(i<Main.grads.length){
					degbox1.addItem(Main.grads[i].name);
					i++;
				}
			}else{
				degbox1.removeAllItems();
				degbox1.setEnabled(false);
			}
		}else{
			if(degbutt3.isSelected()){
				degbutt4.setSelected(false);
				degbox1.setEnabled(true);
				degbox1.removeAllItems();
				int i = 0;
				while(i<Main.undergrads.length){
					degbox1.addItem(Main.undergrads[i].name);
					i++;
				}
			}else{
				degbox1.removeAllItems();
				degbox1.setEnabled(false);
			}
		}
	}

	public void findCourses(JTextArea box){
		String path = browseComp("C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Courses");
		box.setText(box.getText() + path + "\n");
	}
	
	public void optWind() {
		System.out.println("Option Window");
	}
	
	public void viewProfs(){
//		Main.getProfs();
		panelmain.removeAll();
		labelmain.setText("MY PROFESSORS");
		panelmain.add(labelmain);
		String[] columnNames = {"Name","Office","Phone","Fax","Email","Department"};
		String[][] data = new String[Main.profs.length][];
		int i = 0;
		while (i<data.length){
			data[i] = new String[] {Main.profs[i].name, Main.profs[i].office, Main.profs[i].phone, Main.profs[i].fax, Main.profs[i].email, Main.profs[i].dep};
			i++;
		}
		JTable proftable = new JTable(data, columnNames){ 
			private static final long serialVersionUID = -8052879652501507761L;
			DefaultTableCellRenderer renderCenter=new DefaultTableCellRenderer();
	          {//initializer block
	              renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
	          }
	        public TableCellRenderer getCellRenderer(int arg0, int arg1) {
	               return renderCenter;
	        }
	    };
		proftable.setRowHeight(25);
		
		proftable.getColumnModel().getColumn(1).setMaxWidth(75);
		proftable.getColumnModel().getColumn(1).setPreferredWidth(75);
		proftable.getColumnModel().getColumn(1).setResizable(false);
		
		proftable.getColumnModel().getColumn(2).setMaxWidth(90);
		proftable.getColumnModel().getColumn(2).setPreferredWidth(90);
		proftable.getColumnModel().getColumn(2).setResizable(false);
		
		proftable.getColumnModel().getColumn(3).setMaxWidth(90);
		proftable.getColumnModel().getColumn(3).setPreferredWidth(90);
		proftable.getColumnModel().getColumn(3).setResizable(false);
		
		proftable.getColumnModel().getColumn(5).setPreferredWidth(120);
		
		proftable.setSize(750, 500);
		proftable.setLocation(0,0);
		
		JScrollPane profscroll = new JScrollPane(proftable);
		profscroll.setSize(750,500);
		profscroll.setLocation(20,25);
		panelmain.add(profscroll);
	}

	public void viewTas(){
//		Main.getTas();
		panelmain.removeAll();
		labelmain.setText("MY TAS");
		panelmain.add(labelmain);
		
		String[] columnNames = {"Name","Office","Phone","Fax","Email","Department"};
		String[][] data = new String[Main.tas.length][6];
		int i = 0;
		while (i<data.length){
			data[i] = new String[] {Main.tas[i].name, Main.tas[i].office, Main.tas[i].phone, Main.tas[i].fax, Main.tas[i].email, Main.tas[i].dep};
			i++;
		}
		JTable tatable = new JTable(data, columnNames){ 
			private static final long serialVersionUID = -8052879652501507761L;
			DefaultTableCellRenderer renderCenter=new DefaultTableCellRenderer();
	          {//initializer block
	              renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
	          }
	        public TableCellRenderer getCellRenderer(int arg0, int arg1) {
	               return renderCenter;
	        }
	    };
	    tatable.setRowHeight(25);
		
		tatable.getColumnModel().getColumn(1).setMaxWidth(75);
		tatable.getColumnModel().getColumn(1).setPreferredWidth(75);
		tatable.getColumnModel().getColumn(1).setResizable(false);
		
		tatable.getColumnModel().getColumn(2).setMaxWidth(90);
		tatable.getColumnModel().getColumn(2).setPreferredWidth(90);
		tatable.getColumnModel().getColumn(2).setResizable(false);
			
		tatable.getColumnModel().getColumn(3).setMaxWidth(90);
		tatable.getColumnModel().getColumn(3).setPreferredWidth(90);
		tatable.getColumnModel().getColumn(3).setResizable(false);
			
		tatable.getColumnModel().getColumn(5).setPreferredWidth(120);
		tatable.setSize(750, 500);
		tatable.setLocation(0,0);
		
		JScrollPane tascroll = new JScrollPane(tatable);
		tascroll.setSize(750,500);
		tascroll.setLocation(20,25);
		panelmain.add(tascroll);
	}
	
	public void viewCourses(){
//		Main.getCourses();
		panelmain.removeAll();
		labelmain.setText("MY COURSES");
		panelmain.add(labelmain);
		
		String[] columnNames = {"Credits","Name","Dep","Num","Professor","TA","Enrolled","Grade"};
		Object[][] data = new Object[Main.classes.length][8];
		
		String[] parts = {};
		
		int i = 0;
		while (i<data.length){
			parts = Main.classes[i].dep.split(" - ");
			
			if (Main.classes[i].enrolled){
				data[i] = new Object[] {Main.classes[i].credits, Main.classes[i].name, parts[0], Main.classes[i].num, Main.classes[i].profname, Main.classes[i].taname, "Yes", Main.classes[i].grade};
			}else{
				data[i] = new Object[] {Main.classes[i].credits, Main.classes[i].name, parts[0], Main.classes[i].num, Main.classes[i].profname, Main.classes[i].taname, "No", Main.classes[i].grade};
			}
			i++;
		}
		
		JTable classtable = new JTable(data, columnNames){ 
			private static final long serialVersionUID = -8052879652501507761L;
			DefaultTableCellRenderer renderCenter=new DefaultTableCellRenderer();
	          {//initializer block
	              renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
	          }
	        public TableCellRenderer getCellRenderer(int arg0, int arg1) {
	               return renderCenter;
	        }
	    };
		classtable.setRowHeight(25);
		classtable.getColumnModel().getColumn(0).setMaxWidth(50);
		classtable.getColumnModel().getColumn(2).setMaxWidth(40);
		classtable.getColumnModel().getColumn(3).setMaxWidth(50);
		classtable.getColumnModel().getColumn(6).setMaxWidth(60);
		classtable.getColumnModel().getColumn(7).setMaxWidth(60);
		classtable.setSize(750, 500);
		classtable.setLocation(0,0);
		
		JScrollPane classscroll = new JScrollPane(classtable);
		classscroll.setSize(750,500);
		classscroll.setLocation(20,25);
		panelmain.add(classscroll);
	}
	
	public void viewDegree(Degree deg, JPanel panel){
		
		String[] columnNames = {"Credits","Grade","Year","Sem","Dept","Num","Class Name"};
		Object[][][] data = new Object[deg.requirements.size()][][];
		String[] parts = {};
		
		int i = 0;
		while (i<data.length){
			Require currentreq = deg.requirements.get(i);
			data[i] = new Object[currentreq.courses.length][7];
			int f = 0;
			while (f<data[i].length){
				Course current = currentreq.courses[f];
				parts = current.dep.split(" - ");
				data[i][f] = new Object[]{current.credits, current.grade, "---", "---", parts[0], current.num, current.name};
				f++;
			}
			i++;
		}
		JLabel[] names = new JLabel[deg.requirements.size()];
		JLabel[] credits = new JLabel[deg.requirements.size()];
		JTable[] tables = new JTable[deg.requirements.size()];
		
		i = 0;
		while (i<names.length){
			credits[i] = new JLabel(Double.toString(deg.requirements.get(i).creditsNeed));
			credits[i].setSize(100,25);
			credits[i].setLocation(0,0);
			credits[i].setHorizontalAlignment(JLabel.CENTER);
			panel.add(credits[i]);
			
			names[i] = new JLabel(deg.requirements.get(i).name);
			names[i].setSize(650,25);
			names[i].setLocation(100,0);
			names[i].setHorizontalAlignment(JLabel.CENTER);
			panel.add(names[i]);
			
			tables[i] = new JTable(data[i], columnNames){ 
				private static final long serialVersionUID = -8052879652501507761L;
				DefaultTableCellRenderer renderCenter=new DefaultTableCellRenderer();
		          {//initializer block
		              renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
		          }
		        public TableCellRenderer getCellRenderer(int arg0, int arg1) {
		               return renderCenter;
		        }
		    };
		    tables[i].setRowHeight(25);
		    tables[i].setSize(750, 25+25*tables[i].getRowCount());
		    tables[i].setLocation(0,25);
		    panel.add(tables[i]);
			i++;
		}
	}
	
	public void viewUndergrads(){			
		panelmain.removeAll();
		labelmain.setText("MY UNDERGRADUATE DEGREES");
		panelmain.add(labelmain);
		
		JTabbedPane tpane = new JTabbedPane();
		tpane.setLocation(20,15);
		tpane.setSize(750,515);
		
		JPanel[]tabs = new JPanel[Main.undergrads.length];
		
		for (int i = 0; i < tabs.length; i++) {
		    tabs[i] = new JPanel();
		    tabs[i].setSize(750,500);
		    tabs[i].setLayout(null);
		    if (Main.undergrads[i].kind.equals("WPI")) tpane.addTab(Main.undergrads[i].kind, tabs[i]);
		    else if (i > 0 && Main.undergrads[i].kind.equals("Major") && Main.undergrads[i-1].kind.equals("Minor")){
		    	tpane.remove(i-1);
		    	tpane.addTab(Main.undergrads[i].name + " " + Main.undergrads[i].kind, tabs[i]);
		    	tpane.addTab(Main.undergrads[i-1].name + " " + Main.undergrads[i-1].kind, tabs[i-1]);
		    }else tpane.addTab(Main.undergrads[i].name + " " + Main.undergrads[i].kind, tabs[i]); 
		}
		
		if(tabs.length > 0) {
			tpane.setMnemonicAt(0, KeyEvent.VK_1);
			bigpanel1.setSize(750,490);
			bigpanel1.setLocation(0,0);
			bigpanel1.setLayout(null);
			viewDegree(Main.undergrads[0], bigpanel1);
			bigscroll1 = new JScrollPane(bigpanel1);
			bigscroll1.setSize(750,490);
			bigscroll1.setLocation(0,0);
			tabs[0].add(bigscroll1);
		}
		if(tabs.length > 1)	{
			tpane.setMnemonicAt(1, KeyEvent.VK_2);
			bigpanel2.setSize(750,490);
			bigpanel2.setLocation(0,0);
			bigpanel2.setLayout(null);
			viewDegree(Main.undergrads[1], bigpanel2);
			bigscroll2 = new JScrollPane(bigpanel2);
			bigscroll2.setSize(750,490);
			bigscroll2.setLocation(0,0);
			tabs[1].add(bigscroll2);
		}
		if(tabs.length > 2) {
			tpane.setMnemonicAt(2, KeyEvent.VK_3);
			bigpanel3.setSize(750,490);
			bigpanel3.setLocation(0,0);
			bigpanel3.setLayout(null);
			viewDegree(Main.undergrads[2], bigpanel3);
			bigscroll3 = new JScrollPane(bigpanel3);
			bigscroll3.setSize(750,490);
			bigscroll3.setLocation(0,0);
			tabs[2].add(bigscroll3);
		}
		if(tabs.length > 3) {
			tpane.setMnemonicAt(3, KeyEvent.VK_4);
			bigpanel4.setSize(750,490);
			bigpanel4.setLocation(0,0);
			bigpanel4.setLayout(null);
			viewDegree(Main.undergrads[3], bigpanel4);
			bigscroll4 = new JScrollPane(bigpanel4);
			bigscroll4.setSize(750,490);
			bigscroll4.setLocation(0,0);
			tabs[3].add(bigscroll4);
		}
		if(tabs.length > 4) {
			tpane.setMnemonicAt(4, KeyEvent.VK_5);
			bigpanel5.setSize(750,490);
			bigpanel5.setLocation(0,0);
			viewDegree(Main.undergrads[4], bigpanel5);
			bigscroll5 = new JScrollPane(bigpanel5);
			bigscroll5.setSize(750,490);
			bigscroll5.setLocation(0,0);
			tabs[4].add(bigscroll5);
		}
		
		panelmain.add(tpane);
		
		tpane.setSelectedIndex(0);
		tpane.setVisible(true);
		
		panelmain.repaint();
		
/*		
		for (int i = 0; i < underbutts.length; i++){
			underbutts[i] = new JButton(Main.undergrads[i].name + " " + Main.undergrads[i].kind);
			underbutts[i].setSize(125,25);
			underbutts[i].addActionListener(this);
			if (i == 0) underbutts[i].setLocation(20,25);
			else if (Main.undergrads[i].kind.equals("Major") && Main.undergrads[i-1].kind.equals("Minor")){
				underbutts[i-1].setLocation(180*i,25);
				if (i==1) underbutts[i].setLocation(20,25);
				else underbutts[i].setLocation(180*(i-1),25);
			}else underbutts[i].setLocation(180*i,25);
			panelmain.add(underbutts[i]);
		}
*/
		
/*		
		String[][][] columnNames = new String[tabs.length][][];
		int i = 0;
		while(i<columnNames.length){
			columnNames[i] = new String[Main.undergrads[i].requirements.size()][7];
			int f = 0;
			while (f<columnNames[i].length){
				columnNames[i][f] = new String[]{"Credits","Grade","Year","Sem","Dept","Num","Class Name"};
				f++;
			}
			i++;
		}

		String[] parts = {};
		Object[][][][] data = new Object[tabs.length][][][];
		i = 0;
		while (i<data.length){
			columnNames[i] = new String[Main.undergrads[i].requirements.size()][7];
			data[i] = new Object[Main.undergrads[i].requirements.size()][][];
			int g = 0;
			while (g<data[i].length){
				columnNames[i][g] = new String[]{"Credits","Grade","Year","Sem","Dept","Num","Class Name"};
				data[i][g] = new Object[Main.undergrads[i].requirements.get(g).courses.length][];
				int h = 0;
				while(h<data[i][g].length){
					Course current = Main.undergrads[i].requirements.get(g).courses[h];
					parts = current.dep.split(" - ");
					data[i][g][h] = new Object[]{current.credits, current.grade, "---", "---", parts[0], current.num, current.name};
					h++;
				}
				g++;
			}
			i++;
		}
*/
		
/*
		JScrollPane[] panes = new JScrollPane[tabs.length];
		JPanel[] panels = new JPanel[tabs.length];
		JLabel[][] names = new JLabel[tabs.length][];
		JLabel[][] credits = new JLabel[tabs.length][];
		JTable[][] tables = new JTable[tabs.length][];
		i = 0;
		while(i<names.length){
			panels[i] = new JPanel();
			panels[i].setSize(750,500);
			panes[i] = new JScrollPane(panels[i]);
			panes[i].setSize(750,500);
			tabs[i].add(panes[i]);
			
			names[i] = new JLabel[Main.undergrads[i].requirements.size()];
			credits[i] = new JLabel[Main.undergrads[i].requirements.size()];
			tables[i] = new JTable[Main.undergrads[i].requirements.size()];
			int k = 0;
			while(k<names[i].length){
				Require current = Main.undergrads[i].requirements.get(k);
				
				names[i][k] = new JLabel(current.name);
				names[i][k].setSize(654,25);
 				names[i][k].setLocation(96,0);
				names[i][k].setHorizontalAlignment(JLabel.CENTER);
				panels[i].add(names[i][k]);
				
				credits[i][k] = new JLabel(String.valueOf(current.creditsNeed));
				credits[i][k].setSize(96,25);
				credits[i][k].setLocation(0,0);
				credits[i][k].setHorizontalAlignment(JLabel.CENTER);
				panels[i].add(credits[i][k]);
				
				tables[i][k] = new JTable(data[i][k], columnNames[i][k]){ 
					private static final long serialVersionUID = -8052879652501507761L;
					DefaultTableCellRenderer renderCenter=new DefaultTableCellRenderer();
			          {//initializer block
			              renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
			          }
			        public TableCellRenderer getCellRenderer(int arg0, int arg1) {
			               return renderCenter;
			        }
			    };
			    tables[i][k].setRowHeight(25);
			    tables[i][k].setSize(750,25+25*data[i][k].length);
			    tables[i][k].setLocation(0,25);
			    panels[i].add(tables[i][k]);
				k++;
			}
			i++;
		}
*/
		
/*
		classtable.setRowHeight(25);
		classtable.getColumnModel().getColumn(0).setMaxWidth(50);
		classtable.getColumnModel().getColumn(2).setMaxWidth(40);
		classtable.getColumnModel().getColumn(3).setMaxWidth(50);
		classtable.getColumnModel().getColumn(6).setMaxWidth(60);
		classtable.getColumnModel().getColumn(7).setMaxWidth(60);
		classtable.setSize(750, 500);
		classtable.setLocation(0,0);
		
		JScrollPane classscroll = new JScrollPane(classtable);
		classscroll.setSize(750,500);
		classscroll.setLocation(20,25);
		panelmain.add(classscroll);
*/
	}
	
	public void viewGrads(){
		System.out.println("View Graduate Degrees");
	}
	
	public void howToWind(){
		System.out.println("How to Window");
	}
	
	public void aboutWind(){
		System.out.println("About Window");
	}
	
}