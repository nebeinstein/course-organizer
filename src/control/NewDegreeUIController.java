package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import model.Creator;
import ui.NewDegreeUI;
import ui.UI;

public class NewDegreeUIController implements Controller{
	NewDegreeUI ui;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.degbutt1)
			isGrad(false);
		if (e.getSource() == ui.degbutt2)
			isGrad(true);
		if (e.getSource() == ui.cancel5)
			ui.dispose();
		if (e.getSource() == ui.create3)
			Creator.createDegree();
	}

	public void isGrad(Boolean thing) {
		if (thing) {
			if (ui.degbutt2.isSelected()) {
				ui.degbutt1.setSelected(false);
				ui.type1.setEnabled(false);
				ui.typebox1.setEnabled(false);
			}
		} else {
			if (ui.degbutt1.isSelected()) {
				ui.degbutt2.setSelected(false);
				ui.type1.setEnabled(true);
				ui.typebox1.setEnabled(true);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUI(UI u) {
		ui = (NewDegreeUI)u;
		
	}

}
