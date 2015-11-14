package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import model.Creator;
import ui.NewProfUI;
import ui.UI;

public class NewProfUIController implements Controller {
	NewProfUI ui;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.profButton)
			isProf(true);
		if (e.getSource() == ui.taButton)
			isProf(false);
		if (e.getSource() == ui.cancelButton)
			ui.dispose();
		if (e.getSource() == ui.saveButton1)
			saveProf(0);
		if (e.getSource() == ui.saveButton2)
			saveProf(1);
		if (e.getSource() == ui.browseButton)
			;
		// findPhoto(ui.photobox1);
		if (e.getSource() == ui.advancedButton)
			ui.advanceProf();
		if (e.getSource() == ui.cancelButton2)
			ui.advancedFrame.dispose();
		if (e.getSource() == ui.finishButton) {
			Creator.finishAdvancedProf();
			ui.advancedFrame.dispose();
		}
	}

	public void isProf(Boolean thing) {
		if (thing) {
			if (ui.profButton.isSelected())
				ui.taButton.setSelected(false);
		} else {
			if (ui.taButton.isSelected())
				ui.profButton.setSelected(false);
		}
	}

	void saveProf(int button) {
		String type = "N/A";
		if (NewProfUI.profButton.isSelected())
			type = NewProfUI.profLabel.getText();
		else if (NewProfUI.taButton.isSelected())
			type = NewProfUI.taLabel.getText();
		Creator.createProfessor(type);
		ui.dispose();
		if (button > 0)
			new NewProfUI(new NewProfUIController());
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
