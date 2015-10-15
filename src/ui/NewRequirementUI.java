package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import central.Creating;

public class NewRequirementUI extends NewRequirementUIHeader implements ActionListener {

	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -3829339437239505334L;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == degbutt3)
			isGradRequire(false);
		if (e.getSource() == degbutt4)
			isGradRequire(true);
		if (e.getSource() == browse2)
			MainUI.findCourses(coursebox1);
		if (e.getSource() == cancel6)
			this.dispose();
		if (e.getSource() == create4)
			Creating.createRequire();

	}

	public NewRequirementUI() {
		// Main.getGrads();
		// Main.getUndergrads();
		// Main.getCourses();

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
		degbutt3.addActionListener(this);
		panel6.add(degbutt3);

		deglabe3.setLocation(165, 79);
		deglabe3.setSize(96, 25);
		deglabe3.setHorizontalAlignment(JLabel.LEFT);
		panel6.add(deglabe3);

		degbutt4.setLocation(260, 85);
		degbutt4.setSize(15, 15);
		degbutt4.addActionListener(this);
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
		browse2.addActionListener(this);
		panel6.add(browse2);

		cancel6.setLocation(380, 490);
		cancel6.setSize(96, 25);
		cancel6.addActionListener(this);
		panel6.add(cancel6);

		create4.setLocation(266, 490);
		create4.setSize(96, 25);
		create4.addActionListener(this);
		panel6.add(create4);

		setVisible(true);
	}

	public void isGradRequire(Boolean thing) {
		if (thing) {
			if (degbutt4.isSelected()) {
				degbutt3.setSelected(false);
				degbox1.setEnabled(true);
				degbox1.removeAllItems();
				// int i = 0;
				// while(i<Main.grads.length){
				// degbox1.addItem(Main.grads[i].name);
				// i++;
				// }
			} else {
				degbox1.removeAllItems();
				degbox1.setEnabled(false);
			}
		} else {
			if (degbutt3.isSelected()) {
				degbutt4.setSelected(false);
				degbox1.setEnabled(true);
				degbox1.removeAllItems();
				// int i = 0;
				// while(i<Main.undergrads.length){
				// degbox1.addItem(Main.undergrads[i].name);
				// i++;
				// }
			} else {
				degbox1.removeAllItems();
				degbox1.setEnabled(false);
			}
		}
	}

}
