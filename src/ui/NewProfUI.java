package ui;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;

import control.Controller;

public class NewProfUI extends NewProfUIHeader implements UI {

	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -883814311856863910L;

	public NewProfUI(Controller c) {
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
		setTitle("New Professor/TA");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		profPanel.setSize(500, 553);
		profPanel.setLayout(null);
		add(profPanel, BorderLayout.CENTER);

		nameLabel.setLocation(39, 39);
		nameLabel.setSize(96, 25);
		nameLabel.setHorizontalAlignment(JLabel.CENTER);
		profPanel.add(nameLabel);

		nameBox.setLocation(145, 39);
		nameBox.setSize(224, 25);
		profPanel.add(nameBox);

		officeLabel.setLocation(39, 79);
		officeLabel.setSize(96, 25);
		officeLabel.setHorizontalAlignment(JLabel.CENTER);
		profPanel.add(officeLabel);

		officeBox.setLocation(145, 79);
		officeBox.setSize(224, 25);
		profPanel.add(officeBox);

		phoneLabel.setLocation(39, 119);
		phoneLabel.setSize(96, 25);
		phoneLabel.setHorizontalAlignment(JLabel.CENTER);
		profPanel.add(phoneLabel);

		phoneBox.setLocation(145, 119);
		phoneBox.setSize(224, 25);
		profPanel.add(phoneBox);

		faxLabel.setLocation(39, 159);
		faxLabel.setSize(96, 25);
		faxLabel.setHorizontalAlignment(JLabel.CENTER);
		profPanel.add(faxLabel);

		faxBox.setLocation(145, 159);
		faxBox.setSize(224, 25);
		profPanel.add(faxBox);

		emailLabel.setLocation(39, 199);
		emailLabel.setSize(96, 25);
		emailLabel.setHorizontalAlignment(JLabel.CENTER);
		profPanel.add(emailLabel);

		emailBox.setLocation(145, 199);
		emailBox.setSize(224, 25);
		profPanel.add(emailBox);

		departmentLabel.setLocation(39, 239);
		departmentLabel.setSize(96, 25);
		departmentLabel.setHorizontalAlignment(JLabel.CENTER);
		profPanel.add(departmentLabel);

		departmentBox.setLocation(145, 239);
		departmentBox.setSize(224, 25);
		profPanel.add(departmentBox);

		profButton.setLocation(100, 284);
		profButton.setSize(15, 15);
		profButton.addActionListener(ctrl);
		profPanel.add(profButton);

		profLabel.setLocation(109, 279);
		profLabel.setSize(96, 25);
		profLabel.setHorizontalAlignment(JLabel.CENTER);
		profPanel.add(profLabel);

		taButton.setLocation(215, 284);
		taButton.setSize(15, 15);
		taButton.addActionListener(ctrl);
		profPanel.add(taButton);

		taLabel.setLocation(209, 279);
		taLabel.setSize(96, 25);
		taLabel.setHorizontalAlignment(JLabel.CENTER);
		profPanel.add(taLabel);

		photoLabel.setLocation(39, 319);
		photoLabel.setSize(96, 25);
		photoLabel.setHorizontalAlignment(JLabel.CENTER);
		profPanel.add(photoLabel);

		photoBox.setLocation(145, 319);
		photoBox.setSize(224, 25);
		profPanel.add(photoBox);

		browseButton.setLocation(369, 319);
		browseButton.setSize(96, 25);
		browseButton.addActionListener(ctrl);
		profPanel.add(browseButton);

		cancelButton.setLocation(380, 490);
		cancelButton.setSize(96, 25);
		cancelButton.addActionListener(ctrl);
		profPanel.add(cancelButton);

		saveButton2.setLocation(264, 490);
		saveButton2.setSize(96, 25);
		saveButton2.addActionListener(ctrl);
		profPanel.add(saveButton2);

		saveButton1.setLocation(148, 490);
		saveButton1.setSize(96, 25);
		saveButton1.addActionListener(ctrl);
		profPanel.add(saveButton1);

		advancedButton.setLocation(26, 490);
		advancedButton.setSize(96, 25);
		advancedButton.addActionListener(ctrl);
		profPanel.add(advancedButton);
	}

	public void advanceProf() {
		advancedFrame.setSize(680, 500);
		advancedFrame.setTitle("Professor Advanced");
		advancedFrame.setResizable(false);
		advancedFrame.setLocationRelativeTo(null);

		advancedPanel.setSize(680, 500);
		advancedPanel.setLayout(null);
		advancedFrame.add(advancedPanel, BorderLayout.CENTER);

		titleLabel.setLocation(79, 39);
		titleLabel.setSize(96, 25);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		advancedPanel.add(titleLabel);

		titleBox.setLocation(185, 39);
		titleBox.setSize(360, 25);
		advancedPanel.add(titleBox);

		descriptionLabel.setLocation(79, 79);
		descriptionLabel.setSize(96, 100);
		descriptionLabel.setHorizontalAlignment(JLabel.CENTER);
		advancedPanel.add(descriptionLabel);

		descriptionBox.setLocation(0, 0);
		descriptionBox.setSize(345, 100);

		descriptionScrollPane.setLocation(185, 79);
		descriptionScrollPane.setSize(360, 100);
		advancedPanel.add(descriptionScrollPane);

		educationLabel.setLocation(79, 194);
		educationLabel.setSize(96, 50);
		educationLabel.setHorizontalAlignment(JLabel.CENTER);
		advancedPanel.add(educationLabel);

		educationBox.setLocation(0, 0);
		educationBox.setSize(360, 50);

		educationScrollPane.setLocation(185, 194);
		educationScrollPane.setSize(360, 50);
		advancedPanel.add(educationScrollPane);

		researchLabel.setLocation(79, 259);
		researchLabel.setSize(96, 50);
		researchLabel.setHorizontalAlignment(JLabel.CENTER);
		advancedPanel.add(researchLabel);

		researchBox.setLocation(0, 0);
		researchBox.setSize(360, 50);

		researchScrollPane.setLocation(185, 259);
		researchScrollPane.setSize(360, 50);
		advancedPanel.add(researchScrollPane);

		courseLabel.setLocation(79, 324);
		courseLabel.setSize(96, 75);
		courseLabel.setHorizontalAlignment(JLabel.CENTER);
		advancedPanel.add(courseLabel);

		courseBox.setLocation(0, 0);
		courseBox.setSize(345, 75);

		courseScrollPane.setLocation(185, 324);
		courseScrollPane.setSize(360, 75);
		advancedPanel.add(courseScrollPane);

		cancelButton2.setLocation(558, 434);
		cancelButton2.setSize(96, 25);
		cancelButton2.addActionListener(ctrl);
		advancedPanel.add(cancelButton2);

		finishButton.setLocation(442, 434);
		finishButton.setSize(96, 25);
		finishButton.addActionListener(ctrl);
		advancedPanel.add(finishButton);

		advancedFrame.setVisible(true);
	}

	@Override
	public JComponent getComponentByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
