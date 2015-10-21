package ui;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import central.Main;
import control.Controller;
import control.MainUIController;
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
		buildUI();
		setVisible(true);
	}

	@Override
	public void addController(Controller c) {
		this.ctrl = (MainUIController) c;

	}

	@Override
	public void buildUI() {
		// Creating the window
		setSize(800, 600);
		setTitle("My WPI Organizer");
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

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

		panelmain.setSize(this.getWidth(), this.getHeight());
		panelmain.setLayout(null);
		add(panelmain);

		labelmain.setLocation(0, 0);
		labelmain.setSize(this.getWidth(), 25);
		labelmain.setHorizontalAlignment(JLabel.CENTER);
		panelmain.add(labelmain);
	}

	public JTable makeTable(String[][] data, String[] columnNames) {
		JTable table = new JTable(data, columnNames) {
			private static final long serialVersionUID = -8052879652501507761L;
			DefaultTableCellRenderer renderCenter = new DefaultTableCellRenderer();

			{// initializer block
				renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
			}

			public TableCellRenderer getCellRenderer(int arg0, int arg1) {
				return renderCenter;
			}
		};
		return table;
	}

	public void viewProfData(String labelText, String[][] data) {
		panelmain.removeAll();
		labelmain.setText(labelText);
		panelmain.add(labelmain);

		String[] columnNames = { "Name", "Email", "Office", "Phone", "Fax" };

		JTable proftable = makeTable(data, columnNames);

		proftable.setRowHeight(25);
		proftable.setSize(this.getWidth() - 50, this.getHeight() - 100);
		proftable.setLocation(0, 0);

		JScrollPane profscroll = new JScrollPane(proftable);
		profscroll.setSize(proftable.getWidth(), proftable.getHeight());
		profscroll.setLocation(20, 25);
		panelmain.add(profscroll);
	}

	public void viewProfs() {
		String[][] data = ctrl.getProfs();
		viewProfData("MY PROFESSORS", data);
	}

	public void viewTas() {
		String[][] data = ctrl.getTas();
		viewProfData("MY TAS", data);
	}

	public void viewCourses() {
		String[][] data = ctrl.getCourseData(Main.DUMDUM.courses);
		panelmain.removeAll();
		labelmain.setText("MY COURSES");
		panelmain.add(labelmain);

		String[] columnNames = { "Credits", "Name", "Dep", "Num", "Professor",
				"TA", "Enrolled", "Grade" };

		JTable classtable = makeTable(data, columnNames);

		classtable.setRowHeight(25);
		classtable.getColumnModel().getColumn(0).setMaxWidth(50);
		classtable.getColumnModel().getColumn(2).setMaxWidth(40);
		classtable.getColumnModel().getColumn(3).setMaxWidth(50);
		classtable.getColumnModel().getColumn(6).setMaxWidth(60);
		classtable.getColumnModel().getColumn(7).setMaxWidth(75);
		classtable.setSize(this.getWidth() - 50, this.getHeight() - 100);
		classtable.setLocation(0, 0);

		JScrollPane classscroll = new JScrollPane(classtable);
		classscroll.setSize(classtable.getWidth(), classtable.getHeight());
		classscroll.setLocation(20, 25);
		panelmain.add(classscroll);
	}

	public void viewDegree(Degree deg, JPanel panel) {
		System.out.println("View Degree!");
		String[] columnNames = { "Credits", "Grade", "Year", "Sem", "Dept",
				"Num", "Class Name" };
		String[][][] data = ctrl.getDegreeData(deg);

		JLabel[] names = new JLabel[deg.requirements.size()];
		JLabel[] credits = new JLabel[deg.requirements.size()];
		JTable[] tables = new JTable[deg.requirements.size()];

		int i = 0;
		while (i < names.length) {
			tables[i] = makeTable(data[i], columnNames);
			tables[i].setRowHeight(25);
			tables[i].setSize(750, 25 + 25 * tables[i].getRowCount());
			tables[i].setLocation(0, 25 + ((tables[i].getHeight() + 25) * i));
			panel.add(tables[i]);

			credits[i] = new JLabel(
					Double.toString(deg.requirements.get(i).creditsNeed));
			credits[i].setSize(100, 25);
			credits[i].setLocation(0, (tables[i].getHeight() + 25) * i);
			credits[i].setHorizontalAlignment(JLabel.CENTER);
			panel.add(credits[i]);

			names[i] = new JLabel(deg.requirements.get(i).name);
			names[i].setSize(650, 25);
			names[i].setLocation(100, (tables[i].getHeight() + 25) * i);
			names[i].setHorizontalAlignment(JLabel.CENTER);
			panel.add(names[i]);

			i++;
		}
	}

	public void viewDegrees(String labeltext, Degree[] degrees) {
		panelmain.removeAll();
		labelmain.setText(labeltext);
		panelmain.add(labelmain);

		JTabbedPane tpane = new JTabbedPane();
		tpane.setLocation(20, 15);
		tpane.setSize(750, 515);

		JPanel[] tabs = new JPanel[degrees.length];

		int i = 0;
		while (i < degrees.length) {
			tabs[i] = new JPanel();
			tabs[i].setSize(750, 500);
			tabs[i].setLayout(null);
			tpane.addTab(degrees[i].name, tabs[i]);

			bigpanels[i] = new JPanel();
			bigpanels[i].setSize(750, 490);
			bigpanels[i].setLocation(0, 0);
			bigpanels[i].setLayout(null);
			viewDegree(degrees[i], bigpanels[i]);

			bigscrolls[i] = new JScrollPane(bigpanels[i]);
			bigscrolls[i].setSize(750, 490);
			bigscrolls[i].setLocation(0, 0);
			tabs[i].add(bigscrolls[i]);

			i++;
		}

		panelmain.add(tpane);
		tpane.setSelectedIndex(0);
		tpane.setVisible(true);

		panelmain.repaint();
	}

	public void viewUndergrads() {
		viewDegrees("MY UNDERGRADUATE DEGREES", Main.DUMDUM.undergrads);
		System.out.println("View Undergrads!");
	}

	public void viewGrads() {
		viewDegrees("MY GRADUATE DEGREES", Main.DUMDUM.grads);
		System.out.println("View Graduate Degrees");
	}

	public void howToWind() {
		javax.swing.JOptionPane
				.showMessageDialog(
						this,
						"Click buttons and shit happens. Figure it out. It's not that hard.",
						"How to Use", -1);
	}

	public void aboutWind() {
		javax.swing.JOptionPane
				.showMessageDialog(
						this,
						"This application was written by Nicole Beinstein and Jack Rivadeneira.",
						"About", -1);
	}

	@Override
	public JComponent getComponentByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}