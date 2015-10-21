package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import central.Creating;
import central.Main;
import degreeThings.Grad;
import degreeThings.UnderGrad;
import ui.NewRequirementUI;
import ui.UI;

public class NewRequirementUIController implements Controller {
	NewRequirementUI ui;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.degbutt3)
			isGradRequire(false);
		if (e.getSource() == ui.degbutt4)
			isGradRequire(true);
		if (e.getSource() == ui.browse2)
			;
		// MainUI.findCourses(ui.coursebox1);
		if (e.getSource() == ui.cancel6)
			ui.dispose();
		if (e.getSource() == ui.create4)
			Creating.createRequire();

	}

	public void isGradRequire(Boolean thing) {
		if (thing) {
			if (ui.degbutt4.isSelected()) {
				ui.degbutt3.setSelected(false);
				ui.degbox1.setEnabled(true);
				ui.degbox1.removeAllItems();
				for (Grad g : Main.DUMDUM.grads) {
					ui.degbox1.addItem(g.name);
				}
			} else {
				ui.degbox1.removeAllItems();
				ui.degbox1.setEnabled(false);
			}
		} else {
			if (ui.degbutt3.isSelected()) {
				ui.degbutt4.setSelected(false);
				ui.degbox1.setEnabled(true);
				ui.degbox1.removeAllItems();
				for (UnderGrad g : Main.DUMDUM.undergrads) {
					ui.degbox1.addItem(g.name);
				}
			} else {
				ui.degbox1.removeAllItems();
				ui.degbox1.setEnabled(false);
			}
		}
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
		ui = (NewRequirementUI) u;

	}

}
