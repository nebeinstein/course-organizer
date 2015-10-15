package ui;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import objects.Course;
import objects.Require;

import central.Main;
import control.Controller;
import degreeThings.Degree;

public class MainUI extends MainUIHeader implements UI {
	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = 1L;

	static JFileChooser fc1 = new JFileChooser();

	public MainUI(Controller c) {
		addController(c);
		ctrl.addUI(this);
		setSize(800, 600);
		setTitle("My WPI Organizer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
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

		options.addActionListener(ctrl);
		exit.addActionListener(ctrl);
		require.addActionListener(ctrl);
		course.addActionListener(ctrl);
		prof.addActionListener(ctrl);
		deg.addActionListener(ctrl);
		myunder.addActionListener(ctrl);
		mygrad.addActionListener(ctrl);
		mycourses.addActionListener(ctrl);
		mysched.addActionListener(ctrl);
		myprofs.addActionListener(ctrl);
		mytas.addActionListener(ctrl);
		howto.addActionListener(ctrl);
		about.addActionListener(ctrl);

		panelmain.setSize(800, 600);
		panelmain.setLayout(null);
		add(panelmain);

		labelmain.setLocation(0, 0);
		labelmain.setSize(800, 25);
		labelmain.setHorizontalAlignment(JLabel.CENTER);
		panelmain.add(labelmain);

		setVisible(true);
	}

	public static String browseComp(String direct) {
		String output = "";
		// fc1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		// fc1.setCurrentDirectory(new File(direct));
		// int returnVal = fc1.showOpenDialog(MainUI.this);
		// if(returnVal == JFileChooser.APPROVE_OPTION){
		// File file = fc1.getSelectedFile();
		// output = file.getPath();
		// }
		return output;
	}

	public static void findCourses(JTextArea box) {
		System.out.println("Find courses!");
		// String path =
		// browseComp("C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Courses");
		// box.setText(box.getText() + path + "\n");
	}

	public void optWind() {
		System.out.println("Option Window");
	}

	public void viewProfs() {
		System.out.println("View Profs!!!");
		// Main.getProfs();
		// panelmain.removeAll();
		// labelmain.setText("MY PROFESSORS");
		// panelmain.add(labelmain);
		// String[] columnNames =
		// {"Name","Office","Phone","Fax","Email","Department"};
		// String[][] data = new String[Main.profs.length][];
		// int i = 0;
		// while (i<data.length){
		// data[i] = new String[] {Main.profs[i].name, Main.profs[i].office,
		// Main.profs[i].phone, Main.profs[i].fax, Main.profs[i].email,
		// Main.profs[i].dep};
		// i++;
		// }
		// JTable proftable = new JTable(data, columnNames){
		// private static final long serialVersionUID = -8052879652501507761L;
		// DefaultTableCellRenderer renderCenter=new DefaultTableCellRenderer();
		// {//initializer block
		// renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
		// }
		// public TableCellRenderer getCellRenderer(int arg0, int arg1) {
		// return renderCenter;
		// }
		// };
		// proftable.setRowHeight(25);
		//
		// proftable.getColumnModel().getColumn(1).setMaxWidth(75);
		// proftable.getColumnModel().getColumn(1).setPreferredWidth(75);
		// proftable.getColumnModel().getColumn(1).setResizable(false);
		//
		// proftable.getColumnModel().getColumn(2).setMaxWidth(90);
		// proftable.getColumnModel().getColumn(2).setPreferredWidth(90);
		// proftable.getColumnModel().getColumn(2).setResizable(false);
		//
		// proftable.getColumnModel().getColumn(3).setMaxWidth(90);
		// proftable.getColumnModel().getColumn(3).setPreferredWidth(90);
		// proftable.getColumnModel().getColumn(3).setResizable(false);
		//
		// proftable.getColumnModel().getColumn(5).setPreferredWidth(120);
		//
		// proftable.setSize(750, 500);
		// proftable.setLocation(0,0);
		//
		// JScrollPane profscroll = new JScrollPane(proftable);
		// profscroll.setSize(750,500);
		// profscroll.setLocation(20,25);
		// panelmain.add(profscroll);
	}

	public void viewTas() {
		System.out.println("View Tas!!!");
		// Main.getTas();
		// panelmain.removeAll();
		// labelmain.setText("MY TAS");
		// panelmain.add(labelmain);
		//
		// String[] columnNames =
		// {"Name","Office","Phone","Fax","Email","Department"};
		// String[][] data = new String[Main.tas.length][6];
		// int i = 0;
		// while (i<data.length){
		// data[i] = new String[] {Main.tas[i].name, Main.tas[i].office,
		// Main.tas[i].phone, Main.tas[i].fax, Main.tas[i].email,
		// Main.tas[i].dep};
		// i++;
		// }
		// JTable tatable = new JTable(data, columnNames){
		// private static final long serialVersionUID = -8052879652501507761L;
		// DefaultTableCellRenderer renderCenter=new DefaultTableCellRenderer();
		// {//initializer block
		// renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
		// }
		// public TableCellRenderer getCellRenderer(int arg0, int arg1) {
		// return renderCenter;
		// }
		// };
		// tatable.setRowHeight(25);
		//
		// tatable.getColumnModel().getColumn(1).setMaxWidth(75);
		// tatable.getColumnModel().getColumn(1).setPreferredWidth(75);
		// tatable.getColumnModel().getColumn(1).setResizable(false);
		//
		// tatable.getColumnModel().getColumn(2).setMaxWidth(90);
		// tatable.getColumnModel().getColumn(2).setPreferredWidth(90);
		// tatable.getColumnModel().getColumn(2).setResizable(false);
		//
		// tatable.getColumnModel().getColumn(3).setMaxWidth(90);
		// tatable.getColumnModel().getColumn(3).setPreferredWidth(90);
		// tatable.getColumnModel().getColumn(3).setResizable(false);
		//
		// tatable.getColumnModel().getColumn(5).setPreferredWidth(120);
		// tatable.setSize(750, 500);
		// tatable.setLocation(0,0);
		//
		// JScrollPane tascroll = new JScrollPane(tatable);
		// tascroll.setSize(750,500);
		// tascroll.setLocation(20,25);
		// panelmain.add(tascroll);
	}

	public void viewCourses() {
		// Main.getCourses();
		panelmain.removeAll();
		labelmain.setText("MY COURSES");
		panelmain.add(labelmain);

		String[] columnNames = { "Credits", "Name", "Dep", "Num", "Professor", "TA", "Enrolled", "Grade" };
		Object[][] data = new Object[Main.classes.length][8];

		String[] parts = {};

		int i = 0;
		while (i < data.length) {
//			parts = Main.classes[i].dep.split(" - ");

			if (Main.classes[i].enrolled) {
//				data[i] = new Object[] { Main.classes[i].credits, Main.classes[i].name, parts[0], Main.classes[i].num,
//						Main.classes[i].profname, Main.classes[i].taname, "Yes", Main.classes[i].grade };
			} else {
//				data[i] = new Object[] { Main.classes[i].credits, Main.classes[i].name, parts[0], Main.classes[i].num,
//						Main.classes[i].profname, Main.classes[i].taname, "No", Main.classes[i].grade };
			}
			i++;
		}

		JTable classtable = new JTable(data, columnNames) {
			private static final long serialVersionUID = -8052879652501507761L;
			DefaultTableCellRenderer renderCenter = new DefaultTableCellRenderer();

			{// initializer block
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
		classtable.setLocation(0, 0);

		JScrollPane classscroll = new JScrollPane(classtable);
		classscroll.setSize(750, 500);
		classscroll.setLocation(20, 25);
		panelmain.add(classscroll);
	}

	public void viewDegree(Degree deg, JPanel panel) {

		String[] columnNames = { "Credits", "Grade", "Year", "Sem", "Dept", "Num", "Class Name" };
		Object[][][] data = new Object[deg.requirements.size()][][];
		String[] parts = {};

		int i = 0;
		while (i < data.length) {
			Require currentreq = deg.requirements.get(i);
			data[i] = new Object[currentreq.courses.length][7];
			int f = 0;
			while (f < data[i].length) {
				Course current = currentreq.courses[f];
//				parts = current.dep.split(" - ");
//				data[i][f] = new Object[] { current.credits, current.grade, "---", "---", parts[0], current.num,
//						current.name };
				f++;
			}
			i++;
		}
		JLabel[] names = new JLabel[deg.requirements.size()];
		JLabel[] credits = new JLabel[deg.requirements.size()];
		JTable[] tables = new JTable[deg.requirements.size()];

		i = 0;
		while (i < names.length) {
			credits[i] = new JLabel(Double.toString(deg.requirements.get(i).creditsNeed));
			credits[i].setSize(100, 25);
			credits[i].setLocation(0, 0);
			credits[i].setHorizontalAlignment(JLabel.CENTER);
			panel.add(credits[i]);

			names[i] = new JLabel(deg.requirements.get(i).name);
			names[i].setSize(650, 25);
			names[i].setLocation(100, 0);
			names[i].setHorizontalAlignment(JLabel.CENTER);
			panel.add(names[i]);

			tables[i] = new JTable(data[i], columnNames) {
				private static final long serialVersionUID = -8052879652501507761L;
				DefaultTableCellRenderer renderCenter = new DefaultTableCellRenderer();

				{// initializer block
					renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
				}

				public TableCellRenderer getCellRenderer(int arg0, int arg1) {
					return renderCenter;
				}
			};
			tables[i].setRowHeight(25);
			tables[i].setSize(750, 25 + 25 * tables[i].getRowCount());
			tables[i].setLocation(0, 25);
			panel.add(tables[i]);
			i++;
		}
	}

	public void viewUndergrads() {
		System.out.println("View Undergrads!");
		// panelmain.removeAll();
		// labelmain.setText("MY UNDERGRADUATE DEGREES");
		// panelmain.add(labelmain);
		//
		// JTabbedPane tpane = new JTabbedPane();
		// tpane.setLocation(20,15);
		// tpane.setSize(750,515);
		//
		// JPanel[]tabs = new JPanel[Main.undergrads.length];
		//
		// for (int i = 0; i < tabs.length; i++) {
		// tabs[i] = new JPanel();
		// tabs[i].setSize(750,500);
		// tabs[i].setLayout(null);
		// if (Main.undergrads[i].kind.equals("WPI"))
		// tpane.addTab(Main.undergrads[i].kind, tabs[i]);
		// else if (i > 0 && Main.undergrads[i].kind.equals("Major") &&
		// Main.undergrads[i-1].kind.equals("Minor")){
		// tpane.remove(i-1);
		// tpane.addTab(Main.undergrads[i].name + " " + Main.undergrads[i].kind,
		// tabs[i]);
		// tpane.addTab(Main.undergrads[i-1].name + " " +
		// Main.undergrads[i-1].kind, tabs[i-1]);
		// }else tpane.addTab(Main.undergrads[i].name + " " +
		// Main.undergrads[i].kind, tabs[i]);
		// }
		//
		// if(tabs.length > 0) {
		// tpane.setMnemonicAt(0, KeyEvent.VK_1);
		// bigpanel1.setSize(750,490);
		// bigpanel1.setLocation(0,0);
		// bigpanel1.setLayout(null);
		// viewDegree(Main.undergrads[0], bigpanel1);
		// bigscroll1 = new JScrollPane(bigpanel1);
		// bigscroll1.setSize(750,490);
		// bigscroll1.setLocation(0,0);
		// tabs[0].add(bigscroll1);
		// }
		// if(tabs.length > 1) {
		// tpane.setMnemonicAt(1, KeyEvent.VK_2);
		// bigpanel2.setSize(750,490);
		// bigpanel2.setLocation(0,0);
		// bigpanel2.setLayout(null);
		// viewDegree(Main.undergrads[1], bigpanel2);
		// bigscroll2 = new JScrollPane(bigpanel2);
		// bigscroll2.setSize(750,490);
		// bigscroll2.setLocation(0,0);
		// tabs[1].add(bigscroll2);
		// }
		// if(tabs.length > 2) {
		// tpane.setMnemonicAt(2, KeyEvent.VK_3);
		// bigpanel3.setSize(750,490);
		// bigpanel3.setLocation(0,0);
		// bigpanel3.setLayout(null);
		// viewDegree(Main.undergrads[2], bigpanel3);
		// bigscroll3 = new JScrollPane(bigpanel3);
		// bigscroll3.setSize(750,490);
		// bigscroll3.setLocation(0,0);
		// tabs[2].add(bigscroll3);
		// }
		// if(tabs.length > 3) {
		// tpane.setMnemonicAt(3, KeyEvent.VK_4);
		// bigpanel4.setSize(750,490);
		// bigpanel4.setLocation(0,0);
		// bigpanel4.setLayout(null);
		// viewDegree(Main.undergrads[3], bigpanel4);
		// bigscroll4 = new JScrollPane(bigpanel4);
		// bigscroll4.setSize(750,490);
		// bigscroll4.setLocation(0,0);
		// tabs[3].add(bigscroll4);
		// }
		// if(tabs.length > 4) {
		// tpane.setMnemonicAt(4, KeyEvent.VK_5);
		// bigpanel5.setSize(750,490);
		// bigpanel5.setLocation(0,0);
		// viewDegree(Main.undergrads[4], bigpanel5);
		// bigscroll5 = new JScrollPane(bigpanel5);
		// bigscroll5.setSize(750,490);
		// bigscroll5.setLocation(0,0);
		// tabs[4].add(bigscroll5);
		// }
		//
		// panelmain.add(tpane);
		//
		// tpane.setSelectedIndex(0);
		// tpane.setVisible(true);
		//
		// panelmain.repaint();
		//
		/// *
		// for (int i = 0; i < underbutts.length; i++){
		// underbutts[i] = new JButton(Main.undergrads[i].name + " " +
		// Main.undergrads[i].kind);
		// underbutts[i].setSize(125,25);
		// underbutts[i].addActionListener(ctrl);
		// if (i == 0) underbutts[i].setLocation(20,25);
		// else if (Main.undergrads[i].kind.equals("Major") &&
		// Main.undergrads[i-1].kind.equals("Minor")){
		// underbutts[i-1].setLocation(180*i,25);
		// if (i==1) underbutts[i].setLocation(20,25);
		// else underbutts[i].setLocation(180*(i-1),25);
		// }else underbutts[i].setLocation(180*i,25);
		// panelmain.add(underbutts[i]);
		// }
		// */
		//
		/// *
		// String[][][] columnNames = new String[tabs.length][][];
		// int i = 0;
		// while(i<columnNames.length){
		// columnNames[i] = new
		// String[Main.undergrads[i].requirements.size()][7];
		// int f = 0;
		// while (f<columnNames[i].length){
		// columnNames[i][f] = new
		// String[]{"Credits","Grade","Year","Sem","Dept","Num","Class Name"};
		// f++;
		// }
		// i++;
		// }
		//
		// String[] parts = {};
		// Object[][][][] data = new Object[tabs.length][][][];
		// i = 0;
		// while (i<data.length){
		// columnNames[i] = new
		// String[Main.undergrads[i].requirements.size()][7];
		// data[i] = new Object[Main.undergrads[i].requirements.size()][][];
		// int g = 0;
		// while (g<data[i].length){
		// columnNames[i][g] = new
		// String[]{"Credits","Grade","Year","Sem","Dept","Num","Class Name"};
		// data[i][g] = new
		// Object[Main.undergrads[i].requirements.get(g).courses.length][];
		// int h = 0;
		// while(h<data[i][g].length){
		// Course current = Main.undergrads[i].requirements.get(g).courses[h];
		// parts = current.dep.split(" - ");
		// data[i][g][h] = new Object[]{current.credits, current.grade, "---",
		// "---", parts[0], current.num, current.name};
		// h++;
		// }
		// g++;
		// }
		// i++;
		// }
		// */
		//
		/// *
		// JScrollPane[] panes = new JScrollPane[tabs.length];
		// JPanel[] panels = new JPanel[tabs.length];
		// JLabel[][] names = new JLabel[tabs.length][];
		// JLabel[][] credits = new JLabel[tabs.length][];
		// JTable[][] tables = new JTable[tabs.length][];
		// i = 0;
		// while(i<names.length){
		// panels[i] = new JPanel();
		// panels[i].setSize(750,500);
		// panes[i] = new JScrollPane(panels[i]);
		// panes[i].setSize(750,500);
		// tabs[i].add(panes[i]);
		//
		// names[i] = new JLabel[Main.undergrads[i].requirements.size()];
		// credits[i] = new JLabel[Main.undergrads[i].requirements.size()];
		// tables[i] = new JTable[Main.undergrads[i].requirements.size()];
		// int k = 0;
		// while(k<names[i].length){
		// Require current = Main.undergrads[i].requirements.get(k);
		//
		// names[i][k] = new JLabel(current.name);
		// names[i][k].setSize(654,25);
		// names[i][k].setLocation(96,0);
		// names[i][k].setHorizontalAlignment(JLabel.CENTER);
		// panels[i].add(names[i][k]);
		//
		// credits[i][k] = new JLabel(String.valueOf(current.creditsNeed));
		// credits[i][k].setSize(96,25);
		// credits[i][k].setLocation(0,0);
		// credits[i][k].setHorizontalAlignment(JLabel.CENTER);
		// panels[i].add(credits[i][k]);
		//
		// tables[i][k] = new JTable(data[i][k], columnNames[i][k]){
		// private static final long serialVersionUID = -8052879652501507761L;
		// DefaultTableCellRenderer renderCenter=new DefaultTableCellRenderer();
		// {//initializer block
		// renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
		// }
		// public TableCellRenderer getCellRenderer(int arg0, int arg1) {
		// return renderCenter;
		// }
		// };
		// tables[i][k].setRowHeight(25);
		// tables[i][k].setSize(750,25+25*data[i][k].length);
		// tables[i][k].setLocation(0,25);
		// panels[i].add(tables[i][k]);
		// k++;
		// }
		// i++;
		// }
		// */
		//
		/// *
		// classtable.setRowHeight(25);
		// classtable.getColumnModel().getColumn(0).setMaxWidth(50);
		// classtable.getColumnModel().getColumn(2).setMaxWidth(40);
		// classtable.getColumnModel().getColumn(3).setMaxWidth(50);
		// classtable.getColumnModel().getColumn(6).setMaxWidth(60);
		// classtable.getColumnModel().getColumn(7).setMaxWidth(60);
		// classtable.setSize(750, 500);
		// classtable.setLocation(0,0);
		//
		// JScrollPane classscroll = new JScrollPane(classtable);
		// classscroll.setSize(750,500);
		// classscroll.setLocation(20,25);
		// panelmain.add(classscroll);
		// */
	}

	public void viewGrads() {
		System.out.println("View Graduate Degrees");
	}

	public void howToWind() {
		System.out.println("How to Window");
	}

	public void aboutWind() {
		System.out.println("About Window");
	}

	@Override
	public void addController(Controller c) {
		this.ctrl = c;

	}

	@Override
	public void buildUI() {
		// TODO Auto-generated method stub

	}

	@Override
	public JComponent getComponentByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}