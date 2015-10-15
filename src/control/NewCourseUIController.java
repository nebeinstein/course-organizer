package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import central.Creating;
import ui.NewCourseUI;
import ui.UI;

public class NewCourseUIController implements Controller{
	NewCourseUI ui;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.enbutt1)
			isEnroll(true);
		if (e.getSource() == ui.enbutt2)
			isEnroll(false);
		if (e.getSource() == ui.abutt1)
			isGrade(ui.a1.getText());
		if (e.getSource() == ui.bbutt1)
			isGrade(ui.b1.getText());
		if (e.getSource() == ui.cbutt1)
			isGrade(ui.c1.getText());
		if (e.getSource() == ui.nrbutt1)
			isGrade(ui.nr1.getText());
		if (e.getSource() == ui.lbutt1)
			isGrade(ui.l1.getText());
		if (e.getSource() == ui.ibutt1)
			isGrade(ui.i1.getText());
		if (e.getSource() == ui.nfbutt1)
			isGrade(ui.nf1.getText());
		if (e.getSource() == ui.cancel3)
			ui.dispose();
		if (e.getSource() == ui.create2)
			Creating.createCourse();
		
		if (e.getSource() == ui.schedbutt)
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
		if (e.getSource() == ui.finish2)
			Creating.finishSched();
	}
	public void isEnroll(Boolean thing) {
		if (thing) {
			if (ui.enbutt1.isSelected()) {
				ui.enbutt2.setSelected(false);
				ui.grade.setEnabled(true);
				ui.abutt1.setEnabled(true);
				ui.a1.setEnabled(true);
				ui.bbutt1.setEnabled(true);
				ui.b1.setEnabled(true);
				ui.cbutt1.setEnabled(true);
				ui.c1.setEnabled(true);
				ui.nrbutt1.setEnabled(true);
				ui.nr1.setEnabled(true);
				ui.lbutt1.setEnabled(true);
				ui.l1.setEnabled(true);
				ui.ibutt1.setEnabled(true);
				ui.i1.setEnabled(true);
				ui.nfbutt1.setEnabled(true);
				ui.nf1.setEnabled(true);
			}
		} else {
			if (ui.enbutt2.isSelected()) {
				ui.enbutt1.setSelected(false);
				ui.grade.setEnabled(false);
				ui.abutt1.setEnabled(false);
				ui.a1.setEnabled(false);
				ui.bbutt1.setEnabled(false);
				ui.b1.setEnabled(false);
				ui.cbutt1.setEnabled(false);
				ui.c1.setEnabled(false);
				ui.nrbutt1.setEnabled(false);
				ui.nr1.setEnabled(false);
				ui.lbutt1.setEnabled(false);
				ui.l1.setEnabled(false);
				ui.ibutt1.setEnabled(false);
				ui.i1.setEnabled(false);
				ui.nfbutt1.setEnabled(false);
				ui.nf1.setEnabled(false);
			}
		}
	}
	public void isGrade(String grade) {
		if (grade == ui.a1.getText()) {
			if (ui.abutt1.isSelected()) {
				ui.bbutt1.setSelected(false);
				ui.cbutt1.setSelected(false);
				ui.nrbutt1.setSelected(false);
				ui.lbutt1.setSelected(false);
				ui.ibutt1.setSelected(false);
				ui.nfbutt1.setSelected(false);
			}
		}
		if (grade == ui.b1.getText()) {
			if (ui.bbutt1.isSelected()) {
				ui.abutt1.setSelected(false);
				ui.cbutt1.setSelected(false);
				ui.nrbutt1.setSelected(false);
				ui.lbutt1.setSelected(false);
				ui.ibutt1.setSelected(false);
				ui.nfbutt1.setSelected(false);
			}
		}
		if (grade == ui.c1.getText()) {
			if (ui.cbutt1.isSelected()) {
				ui.abutt1.setSelected(false);
				ui.bbutt1.setSelected(false);
				ui.nrbutt1.setSelected(false);
				ui.lbutt1.setSelected(false);
				ui.ibutt1.setSelected(false);
				ui.nfbutt1.setSelected(false);
			}
		}
		if (grade == ui.nr1.getText()) {
			if (ui.nrbutt1.isSelected()) {
				ui.abutt1.setSelected(false);
				ui.bbutt1.setSelected(false);
				ui.cbutt1.setSelected(false);
				ui.lbutt1.setSelected(false);
				ui.ibutt1.setSelected(false);
				ui.nfbutt1.setSelected(false);
			}
		}
		if (grade == ui.l1.getText()) {
			if (ui.lbutt1.isSelected()) {
				ui.abutt1.setSelected(false);
				ui.bbutt1.setSelected(false);
				ui.cbutt1.setSelected(false);
				ui.nrbutt1.setSelected(false);
				ui.ibutt1.setSelected(false);
				ui.nfbutt1.setSelected(false);
			}
		}
		if (grade == ui.i1.getText()) {
			if (ui.ibutt1.isSelected()) {
				ui.abutt1.setSelected(false);
				ui.bbutt1.setSelected(false);
				ui.cbutt1.setSelected(false);
				ui.nrbutt1.setSelected(false);
				ui.lbutt1.setSelected(false);
				ui.nfbutt1.setSelected(false);
			}
		}
		if (grade == ui.nf1.getText()) {
			if (ui.nfbutt1.isSelected()) {
				ui.abutt1.setSelected(false);
				ui.bbutt1.setSelected(false);
				ui.cbutt1.setSelected(false);
				ui.nrbutt1.setSelected(false);
				ui.lbutt1.setSelected(false);
				ui.ibutt1.setSelected(false);
			}
		}
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
		ui = (NewCourseUI)u;
		
	}

}
