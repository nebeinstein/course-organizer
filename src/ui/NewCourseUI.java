package ui;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;
import javax.swing.JLabel;

import central.Main;
import control.Controller;
import objects.Professor;

public class NewCourseUI extends NewCourseUIHeader implements UI {

	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = 8374295929417692446L;

	public NewCourseUI(Controller c) {
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
		setTitle("New Course");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		coursePanel.setSize(500, 553);
		coursePanel.setLayout(null);
		add(coursePanel, BorderLayout.CENTER);

		nameLabel.setLocation(39, 39);
		nameLabel.setSize(96, 25);
		nameLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(nameLabel);

		nameBox.setLocation(145, 39);
		nameBox.setSize(224, 25);
		coursePanel.add(nameBox);

		departmentLabel.setLocation(39, 79);
		departmentLabel.setSize(96, 25);
		departmentLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(departmentLabel);

		departmentBox.setLocation(145, 79);
		departmentBox.setSize(224, 25);
		coursePanel.add(departmentBox);

		numberLabel.setLocation(39, 119);
		numberLabel.setSize(96, 25);
		numberLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(numberLabel);

		numberBox.setLocation(145, 119);
		numberBox.setSize(224, 25);
		coursePanel.add(numberBox);

		profLabel.setLocation(39, 159);
		profLabel.setSize(96, 25);
		profLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(profLabel);

		profBox.setLocation(145, 159);
		profBox.setSize(224, 25);
		profBox.removeAllItems();
		profBox.addItem("--- Select One ---");
		for (Professor p : Main.DUMDUM.profs) {
			profBox.addItem(p.name);
		}
		profBox.addItem("N/A");
		coursePanel.add(profBox);

		taLabel.setLocation(39, 199);
		taLabel.setSize(96, 25);
		taLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(taLabel);

		taBox.setLocation(145, 199);
		taBox.setSize(224, 25);
		taBox.removeAllItems();
		taBox.addItem("--- Select One ---");
		for (Professor p : Main.DUMDUM.tas) {
			taBox.addItem(p.name);
		}
		taBox.addItem("N/A");
		coursePanel.add(taBox);

		creditsLabel.setLocation(39, 239);
		creditsLabel.setSize(96, 25);
		creditsLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(creditsLabel);

		creditsbox.setLocation(145, 239);
		creditsbox.setSize(224, 25);
		coursePanel.add(creditsbox);

		enrollLabel.setLocation(39, 279);
		enrollLabel.setSize(96, 25);
		enrollLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(enrollLabel);

		yesButton.setLocation(145, 283);
		yesButton.setSize(15, 15);
		yesButton.addActionListener(ctrl);
		coursePanel.add(yesButton);

		yesLabel.setLocation(145, 279);
		yesLabel.setSize(96, 25);
		yesLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(yesLabel);

		noButton.setLocation(245, 283);
		noButton.setSize(15, 15);
		noButton.addActionListener(ctrl);
		coursePanel.add(noButton);

		noLabel.setLocation(245, 279);
		noLabel.setSize(96, 25);
		noLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(noLabel);

		grade.setLocation(39, 319);
		grade.setSize(96, 25);
		grade.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(grade);

		aButton.setLocation(145, 325);
		aButton.setSize(15, 15);
		aButton.addActionListener(ctrl);
		coursePanel.add(aButton);

		aLabel.setLocation(120, 319);
		aLabel.setSize(96, 25);
		aLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(aLabel);

		bButton.setLocation(200, 325);
		bButton.setSize(15, 15);
		bButton.addActionListener(ctrl);
		coursePanel.add(bButton);

		bLabel.setLocation(175, 319);
		bLabel.setSize(96, 25);
		bLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(bLabel);

		cButton.setLocation(255, 325);
		cButton.setSize(15, 15);
		cButton.addActionListener(ctrl);
		coursePanel.add(cButton);

		cLabel.setLocation(230, 319);
		cLabel.setSize(95, 25);
		cLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(cLabel);

		nrButton.setLocation(310, 325);
		nrButton.setSize(15, 15);
		nrButton.addActionListener(ctrl);
		coursePanel.add(nrButton);

		nrLabel.setLocation(288, 319);
		nrLabel.setSize(96, 25);
		nrLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(nrLabel);

		lButton.setLocation(365, 325);
		lButton.setSize(15, 15);
		lButton.addActionListener(ctrl);
		coursePanel.add(lButton);

		lLabel.setLocation(340, 319);
		lLabel.setSize(96, 25);
		lLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(lLabel);

		iButton.setLocation(145, 355);
		iButton.setSize(15, 15);
		iButton.addActionListener(ctrl);
		coursePanel.add(iButton);

		iLabel.setLocation(120, 349);
		iLabel.setSize(96, 25);
		iLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(iLabel);

		nfButton.setLocation(200, 355);
		nfButton.setSize(15, 15);
		nfButton.addActionListener(ctrl);
		coursePanel.add(nfButton);

		nfLabel.setLocation(203, 349);
		nfLabel.setSize(96, 25);
		nfLabel.setHorizontalAlignment(JLabel.CENTER);
		coursePanel.add(nfLabel);

		cancelButton.setLocation(380, 490);
		cancelButton.setSize(96, 25);
		cancelButton.addActionListener(ctrl);
		coursePanel.add(cancelButton);

		createButton.setLocation(266, 490);
		createButton.setSize(96, 25);
		createButton.addActionListener(ctrl);
		coursePanel.add(createButton);

		scheduleButton.setLocation(150, 490);
		scheduleButton.setSize(96, 25);
		scheduleButton.addActionListener(ctrl);
		coursePanel.add(scheduleButton);
	}

	public void schedWind() {
		root4.setSize(680, 500);
		root4.setTitle("Scheduling");
		root4.setResizable(false);
		root4.setLocationRelativeTo(null);

		panel4.setSize(680, 500);
		panel4.setLayout(null);
		root4.add(panel4);

		year1.setLocation(79, 39);
		year1.setSize(96, 25);
		year1.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(year1);

		yearbox1.setLocation(185, 39);
		yearbox1.setSize(360, 25);
		panel4.add(yearbox1);

		termsem1.setLocation(79, 79);
		termsem1.setSize(96, 25);
		termsem1.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(termsem1);

		abutt2.setLocation(185, 85);
		abutt2.setSize(15, 15);
		panel4.add(abutt2);

		a2.setLocation(190, 79);
		a2.setSize(96, 25);
		a2.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(a2);

		bbutt2.setLocation(300, 85);
		bbutt2.setSize(15, 15);
		panel4.add(bbutt2);

		b2.setLocation(305, 79);
		b2.setSize(96, 25);
		b2.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(b2);

		cbutt2.setLocation(415, 85);
		cbutt2.setSize(15, 15);
		panel4.add(cbutt2);

		c2.setLocation(420, 79);
		c2.setSize(95, 25);
		c2.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(c2);

		dbutt2.setLocation(530, 85);
		dbutt2.setSize(15, 15);
		panel4.add(dbutt2);

		d2.setLocation(535, 79);
		d2.setSize(96, 25);
		d2.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(d2);

		fallbutt1.setLocation(185, 115);
		fallbutt1.setSize(15, 15);
		fallbutt1.addActionListener(ctrl);
		panel4.add(fallbutt1);

		fall1.setLocation(190, 109);
		fall1.setSize(96, 25);
		fall1.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(fall1);

		springbutt1.setLocation(300, 115);
		springbutt1.setSize(15, 15);
		springbutt1.addActionListener(ctrl);
		panel4.add(springbutt1);

		spring1.setLocation(305, 109);
		spring1.setSize(96, 25);
		spring1.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(spring1);

		tabbedPane1.setLocation(79, 150);
		tabbedPane1.setSize(522, 250);

		lectpanel1.setSize(522, 250);
		lectpanel1.setLayout(null);
		tabbedPane1.addTab("Lecture", lectpanel1);
		tabbedPane1.setMnemonicAt(0, KeyEvent.VK_1);

		confpanel1.setSize(522, 250);
		confpanel1.setLayout(null);
		tabbedPane1.addTab("Conference", confpanel1);
		tabbedPane1.setMnemonicAt(1, KeyEvent.VK_2);

		labpanel1.setSize(522, 250);
		labpanel1.setLayout(null);
		tabbedPane1.addTab("Lab", labpanel1);
		tabbedPane1.setMnemonicAt(2, KeyEvent.VK_3);

		panel4.add(tabbedPane1);

		// Lecture Tab
		nonebutt1.setLocation(19, 15);
		nonebutt1.setSize(15, 15);
		nonebutt1.addActionListener(ctrl);
		lectpanel1.add(nonebutt1);

		none1.setLocation(36, 9);
		none1.setSize(96, 25);
		none1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(none1);

		monbutt1.setLocation(34, 75);
		monbutt1.setSize(15, 15);
		lectpanel1.add(monbutt1);

		mon1.setLocation(52, 69);
		mon1.setSize(96, 25);
		mon1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(mon1);

		tuesbutt1.setLocation(128, 75);
		tuesbutt1.setSize(15, 15);
		lectpanel1.add(tuesbutt1);

		tues1.setLocation(146, 69);
		tues1.setSize(96, 25);
		tues1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(tues1);

		wedbutt1.setLocation(222, 75);
		wedbutt1.setSize(15, 15);
		lectpanel1.add(wedbutt1);

		wed1.setLocation(240, 69);
		wed1.setSize(96, 25);
		wed1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(wed1);

		thursbutt1.setLocation(316, 75);
		thursbutt1.setSize(15, 15);
		lectpanel1.add(thursbutt1);

		thurs1.setLocation(334, 69);
		thurs1.setSize(96, 25);
		thurs1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(thurs1);

		fributt1.setLocation(410, 75);
		fributt1.setSize(15, 15);
		lectpanel1.add(fributt1);

		fri1.setLocation(428, 69);
		fri1.setSize(96, 25);
		fri1.setHorizontalAlignment(JLabel.LEFT);
		lectpanel1.add(fri1);

		start1.setLocation(39, 115);
		start1.setSize(96, 25);
		start1.setHorizontalAlignment(JLabel.CENTER);
		lectpanel1.add(start1);

		starttime1.setLocation(115, 115);
		starttime1.setSize(64, 25);
		starttime1.setEditable(true);
		lectpanel1.add(starttime1);

		startam1.setLocation(190, 115);
		startam1.setSize(48, 25);
		lectpanel1.add(startam1);

		end1.setLocation(239, 115);
		end1.setSize(96, 25);
		end1.setHorizontalAlignment(JLabel.CENTER);
		lectpanel1.add(end1);

		endtime1.setLocation(315, 115);
		endtime1.setSize(64, 25);
		endtime1.setEditable(true);
		lectpanel1.add(endtime1);

		endam1.setLocation(390, 115);
		endam1.setSize(48, 25);
		lectpanel1.add(endam1);

		// Conference Tab
		nonebutt2.setLocation(19, 15);
		nonebutt2.setSize(15, 15);
		nonebutt2.addActionListener(ctrl);
		confpanel1.add(nonebutt2);

		none2.setLocation(36, 9);
		none2.setSize(96, 25);
		none2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(none2);

		monbutt2.setLocation(34, 75);
		monbutt2.setSize(15, 15);
		confpanel1.add(monbutt2);

		mon2.setLocation(52, 69);
		mon2.setSize(96, 25);
		mon2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(mon2);

		tuesbutt2.setLocation(128, 75);
		tuesbutt2.setSize(15, 15);
		confpanel1.add(tuesbutt2);

		tues2.setLocation(146, 69);
		tues2.setSize(96, 25);
		tues2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(tues2);

		wedbutt2.setLocation(222, 75);
		wedbutt2.setSize(15, 15);
		confpanel1.add(wedbutt2);

		wed2.setLocation(240, 69);
		wed2.setSize(96, 25);
		wed2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(wed2);

		thursbutt2.setLocation(316, 75);
		thursbutt2.setSize(15, 15);
		confpanel1.add(thursbutt2);

		thurs2.setLocation(334, 69);
		thurs2.setSize(96, 25);
		thurs2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(thurs2);

		fributt2.setLocation(410, 75);
		fributt2.setSize(15, 15);
		confpanel1.add(fributt2);

		fri2.setLocation(428, 69);
		fri2.setSize(96, 25);
		fri2.setHorizontalAlignment(JLabel.LEFT);
		confpanel1.add(fri2);

		start2.setLocation(39, 115);
		start2.setSize(96, 25);
		start2.setHorizontalAlignment(JLabel.CENTER);
		confpanel1.add(start2);

		starttime2.setLocation(115, 115);
		starttime2.setSize(64, 25);
		starttime2.setEditable(true);
		confpanel1.add(starttime2);

		startam2.setLocation(190, 115);
		startam2.setSize(48, 25);
		confpanel1.add(startam2);

		end2.setLocation(239, 115);
		end2.setSize(96, 25);
		end2.setHorizontalAlignment(JLabel.CENTER);
		confpanel1.add(end2);

		endtime2.setLocation(315, 115);
		endtime2.setSize(64, 25);
		endtime2.setEditable(true);
		confpanel1.add(endtime2);

		endam2.setLocation(390, 115);
		endam2.setSize(48, 25);
		confpanel1.add(endam2);

		// Lab Tab
		nonebutt3.setLocation(19, 15);
		nonebutt3.setSize(15, 15);
		nonebutt3.addActionListener(ctrl);
		labpanel1.add(nonebutt3);

		none3.setLocation(36, 9);
		none3.setSize(96, 25);
		none3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(none3);

		monbutt3.setLocation(34, 75);
		monbutt3.setSize(15, 15);
		labpanel1.add(monbutt3);

		mon3.setLocation(52, 69);
		mon3.setSize(96, 25);
		mon3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(mon3);

		tuesbutt3.setLocation(128, 75);
		tuesbutt3.setSize(15, 15);
		labpanel1.add(tuesbutt3);

		tues3.setLocation(146, 69);
		tues3.setSize(96, 25);
		tues3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(tues3);

		wedbutt3.setLocation(222, 75);
		wedbutt3.setSize(15, 15);
		labpanel1.add(wedbutt3);

		wed3.setLocation(240, 69);
		wed3.setSize(96, 25);
		wed3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(wed3);

		thursbutt3.setLocation(316, 75);
		thursbutt3.setSize(15, 15);
		labpanel1.add(thursbutt3);

		thurs3.setLocation(334, 69);
		thurs3.setSize(96, 25);
		thurs3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(thurs3);

		fributt3.setLocation(410, 75);
		fributt3.setSize(15, 15);
		labpanel1.add(fributt3);

		fri3.setLocation(428, 69);
		fri3.setSize(96, 25);
		fri3.setHorizontalAlignment(JLabel.LEFT);
		labpanel1.add(fri3);

		start3.setLocation(39, 115);
		start3.setSize(96, 25);
		start3.setHorizontalAlignment(JLabel.CENTER);
		labpanel1.add(start3);

		starttime3.setLocation(115, 115);
		starttime3.setSize(64, 25);
		starttime3.setEditable(true);
		labpanel1.add(starttime3);

		startam3.setLocation(190, 115);
		startam3.setSize(48, 25);
		labpanel1.add(startam3);

		end3.setLocation(239, 115);
		end3.setSize(96, 25);
		end3.setHorizontalAlignment(JLabel.CENTER);
		labpanel1.add(end3);

		endtime3.setLocation(315, 115);
		endtime3.setSize(64, 25);
		endtime3.setEditable(true);
		labpanel1.add(endtime3);

		endam3.setLocation(390, 115);
		endam3.setSize(48, 25);
		labpanel1.add(endam3);

		// Buttons at bottom of Window
		cancel4.setLocation(558, 434);
		cancel4.setSize(96, 25);
		cancel4.addActionListener(ctrl);
		panel4.add(cancel4);

		finish2.setLocation(442, 434);
		finish2.setSize(96, 25);
		finish2.addActionListener(ctrl);
		panel4.add(finish2);

		root4.setVisible(true);
	}

	@Override
	public JComponent getComponentByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}
