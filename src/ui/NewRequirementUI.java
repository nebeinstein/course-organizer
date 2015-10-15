package ui;

import javax.swing.JComponent;
import javax.swing.JLabel;

import control.Controller;

public class NewRequirementUI extends NewRequirementUIHeader implements UI {

	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -3829339437239505334L;

	public NewRequirementUI(Controller c) {
		// Main.getGrads();
		// Main.getUndergrads();
		// Main.getCourses();
		addController(c);
		ctrl.addUI(this);

		setSize(500, 553);
		setTitle("New Requirement");
		setResizable(false);
		setLocationRelativeTo(null);

		panel6.setSize(500, 553);
		panel6.setLayout(null);
		add(panel6);

		name4.setLocation(39, 39);
		name4.setSize(96, 25);
		name4.setHorizontalAlignment(JLabel.CENTER);
		panel6.add(name4);

		namebox4.setLocation(145, 39);
		namebox4.setSize(224, 25);
		panel6.add(namebox4);

		deg1.setLocation(39, 79);
		deg1.setSize(96, 25);
		deg1.setHorizontalAlignment(JLabel.CENTER);
		panel6.add(deg1);

		degbutt3.setLocation(145, 85);
		degbutt3.setSize(15, 15);
		degbutt3.addActionListener(ctrl);
		panel6.add(degbutt3);

		deglabe3.setLocation(165, 79);
		deglabe3.setSize(96, 25);
		deglabe3.setHorizontalAlignment(JLabel.LEFT);
		panel6.add(deglabe3);

		degbutt4.setLocation(260, 85);
		degbutt4.setSize(15, 15);
		degbutt4.addActionListener(ctrl);
		panel6.add(degbutt4);

		deglabe4.setLocation(280, 79);
		deglabe4.setSize(96, 25);
		deglabe4.setHorizontalAlignment(JLabel.LEFT);
		panel6.add(deglabe4);

		degbox1.setLocation(145, 104);
		degbox1.setSize(224, 25);
		degbox1.setEnabled(false);
		panel6.add(degbox1);

		credits2.setLocation(39, 144);
		credits2.setSize(96, 25);
		credits2.setHorizontalAlignment(JLabel.CENTER);
		panel6.add(credits2);

		creditsbox2.setLocation(145, 144);
		creditsbox2.setSize(224, 25);
		panel6.add(creditsbox2);

		reqcourses.setLocation(39, 184);
		reqcourses.setSize(96, 50);
		reqcourses.setHorizontalAlignment(JLabel.CENTER);
		panel6.add(reqcourses);

		reqbox.setLocation(0, 0);
		reqbox.setSize(224, 75);

		reqscrollpane.setLocation(145, 184);
		reqscrollpane.setSize(224, 75);
		panel6.add(reqscrollpane);

		courses1.setLocation(39, 274);
		courses1.setSize(96, 25);
		courses1.setHorizontalAlignment(JLabel.CENTER);
		panel6.add(courses1);

		coursebox1.setLocation(0, 0);
		coursebox1.setSize(224, 100);

		coursescrollpane.setLocation(145, 274);
		coursescrollpane.setSize(224, 100);
		panel6.add(coursescrollpane);

		browse2.setLocation(374, 274);
		browse2.setSize(96, 25);
		browse2.addActionListener(ctrl);
		panel6.add(browse2);

		cancel6.setLocation(380, 490);
		cancel6.setSize(96, 25);
		cancel6.addActionListener(ctrl);
		panel6.add(cancel6);

		create4.setLocation(266, 490);
		create4.setSize(96, 25);
		create4.addActionListener(ctrl);
		panel6.add(create4);

		setVisible(true);
	}

	@Override
	public void addController(Controller c) {
		this.ctrl = c;

	}

	@Override
	public void buildUI() {
		// TODO Auto-generated method stub

	}

	@Override
	public JComponent getComponentByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
