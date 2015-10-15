package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import ui.MainUI;
import ui.NewCourseUI;
import ui.NewDegreeUI;
import ui.NewProfUI;
import ui.NewRequirementUI;
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
			ui.optWind();

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

		/*
		 * if (Arrays.asList(underbutts).contains(e.getSource()))
		 * viewDegree(underbutts,
		 * Arrays.asList(underbutts).indexOf(e.getSource()), true); if
		 * (Arrays.asList(gradbutts).contains(e.getSource()))
		 * viewDegree(gradbutts,
		 * Arrays.asList(gradbutts).indexOf(e.getSource()), false);
		 */
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
