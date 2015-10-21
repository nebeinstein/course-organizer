package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import central.Main;
import objects.Course;
import objects.Degree;
import objects.Professor;
import objects.Requirement;
import ui.MainUI;
import ui.NewCourseUI;
import ui.NewDegreeUI;
import ui.NewProfUI;
import ui.NewRequirementUI;
import ui.OptionUI;
import ui.UI;

public class MainUIController implements Controller {
	MainUI ui;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.exit)
			System.exit(0);
		if (e.getSource() == ui.course)
			new NewCourseUI(new NewCourseUIController());
		if (e.getSource() == ui.prof)
			new NewProfUI(new NewProfUIController());
		if (e.getSource() == ui.deg)
			new NewDegreeUI(new NewDegreeUIController());
		if (e.getSource() == ui.require)
			new NewRequirementUI(new NewRequirementUIController());
		if (e.getSource() == ui.options)
			new OptionUI(new OptionUIController());

		if (e.getSource() == ui.myprofs)
			ui.viewProfs();
		if (e.getSource() == ui.mytas)
			ui.viewTas();
		if (e.getSource() == ui.mycourses)
			ui.viewCourses();
		if (e.getSource() == ui.myunder)
			ui.viewUndergrads();
		if (e.getSource() == ui.mygrad)
			ui.viewGrads();

		if (e.getSource() == ui.howto)
			ui.howToWind();
		if (e.getSource() == ui.about)
			ui.aboutWind();
	}

	public String[][] getProfessorData(Professor[] start) {
		String[][] data = new String[start.length][5];
		int i = 0;
		while (i < data.length) {
			Professor p = start[i];
			data[i] = new String[] { p.name, p.email, p.office, p.phone, p.fax };
			i++;
		}
		return data;
	}

	public String[][] getProfs() {
		return getProfessorData(Main.DUMDUM.profs);
	}

	public String[][] getTas() {
		return getProfessorData(Main.DUMDUM.tas);
	}

	public String[][] getCourseData(Course[] start) {
		String[][] data = new String[start.length][8];
		int i = 0;
		while (i < data.length) {
			Course c = start[i];
			String enrolled = "No";
			if (c.enrolled)
				enrolled = "Yes";
			data[i] = new String[] { c.credits, c.getCourseName(),
					c.getDepartment(), c.getCourseNumber(), c.profname,
					c.taname, enrolled, "N/A" };
			i++;
		}
		return data;
	}

	public String[][][] getDegreeData(Degree deg) {
		String[][][] data = new String[deg.requirements.size()][][];
		int i = 0;
		while (i < data.length) {
			Requirement currentreq = deg.requirements.get(i);
			data[i] = getCourseData(currentreq.courses);
			i++;
		}
		return data;
	}

	public String[][] getDegrees(Degree[] start) {
		String[][] data = new String[start.length][1];
		int i = 0;
		while (i < data.length) {
			Degree d = start[i];
			data[i] = new String[] { d.name };
			i++;
		}
		return data;
	}

	public String[][] getGrads() {
		return getDegrees(Main.DUMDUM.grads);
	}

	public String[][] getUndergrads() {
		return getDegrees(Main.DUMDUM.undergrads);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUI(UI u) {
		ui = (MainUI) u;
	}

}
