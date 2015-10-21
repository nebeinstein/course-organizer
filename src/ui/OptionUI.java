package ui;

import javax.swing.JComponent;

import control.Controller;

public class OptionUI extends OptionUIHeader implements UI {

	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -8045596633602117283L;

	public OptionUI(Controller c) {
		addController(c);
		ctrl.addUI(this);
		buildUI();
		setVisible(true);
	}

	@Override
	public void addController(Controller c) {
		this.ctrl = c;

	}
	
	@Override
	public void buildUI() {
		// Creating the window
		setSize(500, 553);
		setTitle("Options");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	@Override
	public JComponent getComponentByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
