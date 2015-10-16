package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import central.Creating;
import ui.NewProfUI;
import ui.UI;

public class NewProfUIController implements Controller {
	NewProfUI ui;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.probutt1)
			isProf(true);
		if (e.getSource() == ui.tabutt1)
			isProf(false);
		if (e.getSource() == ui.cancel1)
			ui.dispose();
		if (e.getSource() == ui.save1) {
			Creating.createProf();
			// this.dispose();
		}
		if (e.getSource() == ui.save2) {
			Creating.createProf();
			// this.dispose();
			// new NewProfUI();
		}
		if (e.getSource() == ui.browse1)
			;
		// findPhoto(ui.photobox1);
		if (e.getSource() == ui.advance1)
			ui.advanceProf();
		if (e.getSource() == ui.cancel2)
			ui.root2.dispose();
		if (e.getSource() == ui.finish1) {
			Creating.finishAdvance();
			ui.root2.dispose();
		}
	}

	public void isProf(Boolean thing) {
		if (thing) {
			if (ui.probutt1.isSelected())
				ui.tabutt1.setSelected(false);
		} else {
			if (ui.tabutt1.isSelected())
				ui.probutt1.setSelected(false);
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
		ui = (NewProfUI) u;

	}

}
