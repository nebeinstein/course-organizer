package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import model.Creator;
import ui.NewCourseUI;
import ui.UI;

public class NewCourseUIController implements Controller {
	NewCourseUI ui;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.yesButton)
			isEnroll(true);
		if (e.getSource() == ui.noButton)
			isEnroll(false);
		if (e.getSource() == ui.aButton)
			isGrade(ui.aLabel.getText());
		if (e.getSource() == ui.bButton)
			isGrade(ui.bLabel.getText());
		if (e.getSource() == ui.cButton)
			isGrade(ui.cLabel.getText());
		if (e.getSource() == ui.nrButton)
			isGrade(ui.nrLabel.getText());
		if (e.getSource() == ui.lButton)
			isGrade(ui.lLabel.getText());
		if (e.getSource() == ui.iButton)
			isGrade(ui.iLabel.getText());
		if (e.getSource() == ui.nfButton)
			isGrade(ui.nfLabel.getText());
		if (e.getSource() == ui.cancelButton)
			ui.dispose();
		if (e.getSource() == ui.createButton)
			saveCourse();

		if (e.getSource() == ui.scheduleButton)
			ui.schedWind();
		if (e.getSource() == ui.fallbutt1)
			isFall(true);
		if (e.getSource() == ui.springbutt1)
			isFall(false);
		if (e.getSource() == ui.nonebutt1)
			noLect();
		if (e.getSource() == ui.nonebutt2)
			noConf();
		if (e.getSource() == ui.nonebutt3)
			noLab();
		if (e.getSource() == ui.cancel4)
			ui.root4.dispose();
		// if (e.getSource() == ui.finish2)
		// Creator.finishSched();
	}

	public void isEnroll(Boolean thing) {
		if (thing) {
			if (ui.yesButton.isSelected()) {
				ui.noButton.setSelected(false);
				ui.grade.setEnabled(true);
				ui.aButton.setEnabled(true);
				ui.aLabel.setEnabled(true);
				ui.bButton.setEnabled(true);
				ui.bLabel.setEnabled(true);
				ui.cButton.setEnabled(true);
				ui.cLabel.setEnabled(true);
				ui.nrButton.setEnabled(true);
				ui.nrLabel.setEnabled(true);
				ui.lButton.setEnabled(true);
				ui.lLabel.setEnabled(true);
				ui.iButton.setEnabled(true);
				ui.iLabel.setEnabled(true);
				ui.nfButton.setEnabled(true);
				ui.nfLabel.setEnabled(true);
			}
		} else {
			if (ui.noButton.isSelected()) {
				ui.yesButton.setSelected(false);
				ui.grade.setEnabled(false);
				ui.aButton.setEnabled(false);
				ui.aLabel.setEnabled(false);
				ui.bButton.setEnabled(false);
				ui.bLabel.setEnabled(false);
				ui.cButton.setEnabled(false);
				ui.cLabel.setEnabled(false);
				ui.nrButton.setEnabled(false);
				ui.nrLabel.setEnabled(false);
				ui.lButton.setEnabled(false);
				ui.lLabel.setEnabled(false);
				ui.iButton.setEnabled(false);
				ui.iLabel.setEnabled(false);
				ui.nfButton.setEnabled(false);
				ui.nfLabel.setEnabled(false);
			}
		}
	}

	public void isGrade(String grade) {
		if (grade == ui.aLabel.getText()) {
			if (ui.aButton.isSelected()) {
				ui.bButton.setSelected(false);
				ui.cButton.setSelected(false);
				ui.nrButton.setSelected(false);
				ui.lButton.setSelected(false);
				ui.iButton.setSelected(false);
				ui.nfButton.setSelected(false);
			}
		}
		if (grade == ui.bLabel.getText()) {
			if (ui.bButton.isSelected()) {
				ui.aButton.setSelected(false);
				ui.cButton.setSelected(false);
				ui.nrButton.setSelected(false);
				ui.lButton.setSelected(false);
				ui.iButton.setSelected(false);
				ui.nfButton.setSelected(false);
			}
		}
		if (grade == ui.cLabel.getText()) {
			if (ui.cButton.isSelected()) {
				ui.aButton.setSelected(false);
				ui.bButton.setSelected(false);
				ui.nrButton.setSelected(false);
				ui.lButton.setSelected(false);
				ui.iButton.setSelected(false);
				ui.nfButton.setSelected(false);
			}
		}
		if (grade == ui.nrLabel.getText()) {
			if (ui.nrButton.isSelected()) {
				ui.aButton.setSelected(false);
				ui.bButton.setSelected(false);
				ui.cButton.setSelected(false);
				ui.lButton.setSelected(false);
				ui.iButton.setSelected(false);
				ui.nfButton.setSelected(false);
			}
		}
		if (grade == ui.lLabel.getText()) {
			if (ui.lButton.isSelected()) {
				ui.aButton.setSelected(false);
				ui.bButton.setSelected(false);
				ui.cButton.setSelected(false);
				ui.nrButton.setSelected(false);
				ui.iButton.setSelected(false);
				ui.nfButton.setSelected(false);
			}
		}
		if (grade == ui.iLabel.getText()) {
			if (ui.iButton.isSelected()) {
				ui.aButton.setSelected(false);
				ui.bButton.setSelected(false);
				ui.cButton.setSelected(false);
				ui.nrButton.setSelected(false);
				ui.lButton.setSelected(false);
				ui.nfButton.setSelected(false);
			}
		}
		if (grade == ui.nfLabel.getText()) {
			if (ui.nfButton.isSelected()) {
				ui.aButton.setSelected(false);
				ui.bButton.setSelected(false);
				ui.cButton.setSelected(false);
				ui.nrButton.setSelected(false);
				ui.lButton.setSelected(false);
				ui.iButton.setSelected(false);
			}
		}
	}

	public void saveCourse() {
		String grade = "N/A";
		if (ui.aButton.isSelected())
			grade = "A";
		else if (ui.bButton.isSelected())
			grade = "B";
		else if (ui.cButton.isSelected())
			grade = "C";
		else if (ui.lButton.isSelected())
			grade = "L";
		else if (ui.iButton.isSelected())
			grade = "I";
		else if (ui.nrButton.isSelected())
			grade = "NR";
		Creator.createCourse(grade);
		ui.dispose();
	}

	public void isFall(Boolean thing) {
		if (thing) {
			if (ui.fallbutt1.isSelected()) {
				ui.abutt2.setSelected(true);
				ui.bbutt2.setSelected(true);
				ui.cbutt2.setSelected(false);
				ui.dbutt2.setSelected(false);
				ui.springbutt1.setSelected(false);
			} else {
				ui.abutt2.setSelected(false);
				ui.bbutt2.setSelected(false);
			}
		} else {
			if (ui.springbutt1.isSelected()) {
				ui.abutt2.setSelected(false);
				ui.bbutt2.setSelected(false);
				ui.cbutt2.setSelected(true);
				ui.dbutt2.setSelected(true);
				ui.fallbutt1.setSelected(false);
			} else {
				ui.cbutt2.setSelected(false);
				ui.dbutt2.setSelected(false);
			}
		}
	}

	public void noLect() {
		if (ui.nonebutt1.isSelected()) {
			ui.monbutt1.setEnabled(false);
			ui.mon1.setEnabled(false);
			ui.tuesbutt1.setEnabled(false);
			ui.tues1.setEnabled(false);
			ui.wedbutt1.setEnabled(false);
			ui.wed1.setEnabled(false);
			ui.thursbutt1.setEnabled(false);
			ui.thurs1.setEnabled(false);
			ui.fributt1.setEnabled(false);
			ui.fri1.setEnabled(false);
			ui.start1.setEnabled(false);
			ui.starttime1.setEnabled(false);
			ui.startam1.setEnabled(false);
			ui.end1.setEnabled(false);
			ui.endtime1.setEnabled(false);
			ui.endam1.setEnabled(false);
		} else {
			ui.monbutt1.setEnabled(true);
			ui.mon1.setEnabled(true);
			ui.tuesbutt1.setEnabled(true);
			ui.tues1.setEnabled(true);
			ui.wedbutt1.setEnabled(true);
			ui.wed1.setEnabled(true);
			ui.thursbutt1.setEnabled(true);
			ui.thurs1.setEnabled(true);
			ui.fributt1.setEnabled(true);
			ui.fri1.setEnabled(true);
			ui.start1.setEnabled(true);
			ui.starttime1.setEnabled(true);
			ui.startam1.setEnabled(true);
			ui.end1.setEnabled(true);
			ui.endtime1.setEnabled(true);
			ui.endam1.setEnabled(true);
		}
	}

	public void noConf() {
		if (ui.nonebutt2.isSelected()) {
			ui.monbutt2.setEnabled(false);
			ui.mon2.setEnabled(false);
			ui.tuesbutt2.setEnabled(false);
			ui.tues2.setEnabled(false);
			ui.wedbutt2.setEnabled(false);
			ui.wed2.setEnabled(false);
			ui.thursbutt2.setEnabled(false);
			ui.thurs2.setEnabled(false);
			ui.fributt2.setEnabled(false);
			ui.fri2.setEnabled(false);
			ui.start2.setEnabled(false);
			ui.starttime2.setEnabled(false);
			ui.startam2.setEnabled(false);
			ui.end2.setEnabled(false);
			ui.endtime2.setEnabled(false);
			ui.endam2.setEnabled(false);
		} else {
			ui.monbutt2.setEnabled(true);
			ui.mon2.setEnabled(true);
			ui.tuesbutt2.setEnabled(true);
			ui.tues2.setEnabled(true);
			ui.wedbutt2.setEnabled(true);
			ui.wed2.setEnabled(true);
			ui.thursbutt2.setEnabled(true);
			ui.thurs2.setEnabled(true);
			ui.fributt2.setEnabled(true);
			ui.fri2.setEnabled(true);
			ui.start2.setEnabled(true);
			ui.starttime2.setEnabled(true);
			ui.startam2.setEnabled(true);
			ui.end2.setEnabled(true);
			ui.endtime2.setEnabled(true);
			ui.endam2.setEnabled(true);
		}
	}

	public void noLab() {
		if (ui.nonebutt3.isSelected()) {
			ui.monbutt3.setEnabled(false);
			ui.mon3.setEnabled(false);
			ui.tuesbutt3.setEnabled(false);
			ui.tues3.setEnabled(false);
			ui.wedbutt3.setEnabled(false);
			ui.wed3.setEnabled(false);
			ui.thursbutt3.setEnabled(false);
			ui.thurs3.setEnabled(false);
			ui.fributt3.setEnabled(false);
			ui.fri3.setEnabled(false);
			ui.start3.setEnabled(false);
			ui.starttime3.setEnabled(false);
			ui.startam3.setEnabled(false);
			ui.end3.setEnabled(false);
			ui.endtime3.setEnabled(false);
			ui.endam3.setEnabled(false);
		} else {
			ui.monbutt3.setEnabled(true);
			ui.mon3.setEnabled(true);
			ui.tuesbutt3.setEnabled(true);
			ui.tues3.setEnabled(true);
			ui.wedbutt3.setEnabled(true);
			ui.wed3.setEnabled(true);
			ui.thursbutt3.setEnabled(true);
			ui.thurs3.setEnabled(true);
			ui.fributt3.setEnabled(true);
			ui.fri3.setEnabled(true);
			ui.start3.setEnabled(true);
			ui.starttime3.setEnabled(true);
			ui.startam3.setEnabled(true);
			ui.end3.setEnabled(true);
			ui.endtime3.setEnabled(true);
			ui.endam3.setEnabled(true);
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
		ui = (NewCourseUI) u;

	}

}
