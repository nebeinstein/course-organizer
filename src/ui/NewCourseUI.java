package ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;


import central.Creating;
import central.DummyClass;
import objects.Professor;

public class NewCourseUI extends NewCourseUIHeader implements ActionListener {

	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = 8374295929417692446L;

	public NewCourseUI() {
		// Main.getProfs();
		// Main.getTas();
		setSize(500, 553);
		setTitle("New Course");
		setResizable(false);
		setLocationRelativeTo(null);

		panel3.setSize(500, 553);
		panel3.setLayout(null);
		add(panel3, BorderLayout.CENTER);

		name2.setLocation(39, 39);
		name2.setSize(96, 25);
		name2.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(name2);

		namebox2.setLocation(145, 39);
		namebox2.setSize(224, 25);
		panel3.add(namebox2);

		dep2.setLocation(39, 79);
		dep2.setSize(96, 25);
		dep2.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(dep2);

		depbox2.setLocation(145, 79);
		depbox2.setSize(224, 25);
		panel3.add(depbox2);

		num1.setLocation(39, 119);
		num1.setSize(96, 25);
		num1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(num1);

		numbox1.setLocation(145, 119);
		numbox1.setSize(224, 25);
		panel3.add(numbox1);

		pro2.setLocation(39, 159);
		pro2.setSize(96, 25);
		pro2.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(pro2);

		probox2.setLocation(145, 159);
		probox2.setSize(224, 25);
		probox2.removeAllItems();
		probox2.addItem("--- Select One ---");
		for (Professor p : DummyClass.profs){
			probox2.addItem(p.name);
		}
		probox2.addItem("N/A");
		panel3.add(probox2);

		Ta2.setLocation(39, 199);
		Ta2.setSize(96, 25);
		Ta2.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(Ta2);

		tabox2.setLocation(145, 199);
		tabox2.setSize(224, 25);
		tabox2.removeAllItems();
		tabox2.addItem("--- Select One ---");
		for (Professor p : DummyClass.tas){
			tabox2.addItem(p.name);
		}
		tabox2.addItem("N/A");
		panel3.add(tabox2);

		credits1.setLocation(39, 239);
		credits1.setSize(96, 25);
		credits1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(credits1);

		creditsbox1.setLocation(145, 239);
		creditsbox1.setSize(224, 25);
		panel3.add(creditsbox1);

		enroll.setLocation(39, 279);
		enroll.setSize(96, 25);
		enroll.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(enroll);

		enbutt1.setLocation(145, 283);
		enbutt1.setSize(15, 15);
		enbutt1.addActionListener(this);
		panel3.add(enbutt1);

		yes1.setLocation(145, 279);
		yes1.setSize(96, 25);
		yes1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(yes1);

		enbutt2.setLocation(245, 283);
		enbutt2.setSize(15, 15);
		enbutt2.addActionListener(this);
		panel3.add(enbutt2);

		no1.setLocation(245, 279);
		no1.setSize(96, 25);
		no1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(no1);

		grade.setLocation(39, 319);
		grade.setSize(96, 25);
		grade.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(grade);

		abutt1.setLocation(145, 325);
		abutt1.setSize(15, 15);
		abutt1.addActionListener(this);
		panel3.add(abutt1);

		a1.setLocation(120, 319);
		a1.setSize(96, 25);
		a1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(a1);

		bbutt1.setLocation(200, 325);
		bbutt1.setSize(15, 15);
		bbutt1.addActionListener(this);
		panel3.add(bbutt1);

		b1.setLocation(175, 319);
		b1.setSize(96, 25);
		b1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(b1);

		cbutt1.setLocation(255, 325);
		cbutt1.setSize(15, 15);
		cbutt1.addActionListener(this);
		panel3.add(cbutt1);

		c1.setLocation(230, 319);
		c1.setSize(95, 25);
		c1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(c1);

		nrbutt1.setLocation(310, 325);
		nrbutt1.setSize(15, 15);
		nrbutt1.addActionListener(this);
		panel3.add(nrbutt1);

		nr1.setLocation(288, 319);
		nr1.setSize(96, 25);
		nr1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(nr1);

		lbutt1.setLocation(365, 325);
		lbutt1.setSize(15, 15);
		lbutt1.addActionListener(this);
		panel3.add(lbutt1);

		l1.setLocation(340, 319);
		l1.setSize(96, 25);
		l1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(l1);

		ibutt1.setLocation(145, 355);
		ibutt1.setSize(15, 15);
		ibutt1.addActionListener(this);
		panel3.add(ibutt1);

		i1.setLocation(120, 349);
		i1.setSize(96, 25);
		i1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(i1);

		nfbutt1.setLocation(200, 355);
		nfbutt1.setSize(15, 15);
		nfbutt1.addActionListener(this);
		panel3.add(nfbutt1);

		nf1.setLocation(203, 349);
		nf1.setSize(96, 25);
		nf1.setHorizontalAlignment(JLabel.CENTER);
		panel3.add(nf1);

		cancel3.setLocation(380, 490);
		cancel3.setSize(96, 25);
		cancel3.addActionListener(this);
		panel3.add(cancel3);

		create2.setLocation(266, 490);
		create2.setSize(96, 25);
		create2.addActionListener(this);
		panel3.add(create2);

		schedbutt.setLocation(150, 490);
		schedbutt.setSize(96, 25);
		schedbutt.addActionListener(this);
		panel3.add(schedbutt);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == enbutt1)
			isEnroll(true);
		if (e.getSource() == enbutt2)
			isEnroll(false);
		if (e.getSource() == abutt1)
			isGrade(a1.getText());
		if (e.getSource() == bbutt1)
			isGrade(b1.getText());
		if (e.getSource() == cbutt1)
			isGrade(c1.getText());
		if (e.getSource() == nrbutt1)
			isGrade(nr1.getText());
		if (e.getSource() == lbutt1)
			isGrade(l1.getText());
		if (e.getSource() == ibutt1)
			isGrade(i1.getText());
		if (e.getSource() == nfbutt1)
			isGrade(nf1.getText());
		if (e.getSource() == cancel3)
			this.dispose();
		if (e.getSource() == create2)
			Creating.createCourse();
		
		if (e.getSource() == schedbutt)
			schedWind();
		if (e.getSource() == fallbutt1)
			isFall(true);
		if (e.getSource() == springbutt1)
			isFall(false);
		if (e.getSource() == nonebutt1)
			noLect();
		if (e.getSource() == nonebutt2)
			noConf();
		if (e.getSource() == nonebutt3)
			noLab();
		if (e.getSource() == cancel4)
			root4.dispose();
		if (e.getSource() == finish2)
			Creating.finishSched();
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
		fallbutt1.addActionListener(this);
		panel4.add(fallbutt1);

		fall1.setLocation(190, 109);
		fall1.setSize(96, 25);
		fall1.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(fall1);

		springbutt1.setLocation(300, 115);
		springbutt1.setSize(15, 15);
		springbutt1.addActionListener(this);
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
		nonebutt1.addActionListener(this);
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
		nonebutt2.addActionListener(this);
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
		nonebutt3.addActionListener(this);
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
		cancel4.addActionListener(this);
		panel4.add(cancel4);

		finish2.setLocation(442, 434);
		finish2.setSize(96, 25);
		finish2.addActionListener(this);
		panel4.add(finish2);

		root4.setVisible(true);
	}

	public void noLab() {
		if (nonebutt3.isSelected()) {
			monbutt3.setEnabled(false);
			mon3.setEnabled(false);
			tuesbutt3.setEnabled(false);
			tues3.setEnabled(false);
			wedbutt3.setEnabled(false);
			wed3.setEnabled(false);
			thursbutt3.setEnabled(false);
			thurs3.setEnabled(false);
			fributt3.setEnabled(false);
			fri3.setEnabled(false);
			start3.setEnabled(false);
			starttime3.setEnabled(false);
			startam3.setEnabled(false);
			end3.setEnabled(false);
			endtime3.setEnabled(false);
			endam3.setEnabled(false);
		} else {
			monbutt3.setEnabled(true);
			mon3.setEnabled(true);
			tuesbutt3.setEnabled(true);
			tues3.setEnabled(true);
			wedbutt3.setEnabled(true);
			wed3.setEnabled(true);
			thursbutt3.setEnabled(true);
			thurs3.setEnabled(true);
			fributt3.setEnabled(true);
			fri3.setEnabled(true);
			start3.setEnabled(true);
			starttime3.setEnabled(true);
			startam3.setEnabled(true);
			end3.setEnabled(true);
			endtime3.setEnabled(true);
			endam3.setEnabled(true);
		}
	}

	public void isEnroll(Boolean thing) {
		if (thing) {
			if (enbutt1.isSelected()) {
				enbutt2.setSelected(false);
				grade.setEnabled(true);
				abutt1.setEnabled(true);
				a1.setEnabled(true);
				bbutt1.setEnabled(true);
				b1.setEnabled(true);
				cbutt1.setEnabled(true);
				c1.setEnabled(true);
				nrbutt1.setEnabled(true);
				nr1.setEnabled(true);
				lbutt1.setEnabled(true);
				l1.setEnabled(true);
				ibutt1.setEnabled(true);
				i1.setEnabled(true);
				nfbutt1.setEnabled(true);
				nf1.setEnabled(true);
			}
		} else {
			if (enbutt2.isSelected()) {
				enbutt1.setSelected(false);
				grade.setEnabled(false);
				abutt1.setEnabled(false);
				a1.setEnabled(false);
				bbutt1.setEnabled(false);
				b1.setEnabled(false);
				cbutt1.setEnabled(false);
				c1.setEnabled(false);
				nrbutt1.setEnabled(false);
				nr1.setEnabled(false);
				lbutt1.setEnabled(false);
				l1.setEnabled(false);
				ibutt1.setEnabled(false);
				i1.setEnabled(false);
				nfbutt1.setEnabled(false);
				nf1.setEnabled(false);
			}
		}
	}

	public void isGrade(String grade) {
		if (grade == a1.getText()) {
			if (abutt1.isSelected()) {
				bbutt1.setSelected(false);
				cbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				lbutt1.setSelected(false);
				ibutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == b1.getText()) {
			if (bbutt1.isSelected()) {
				abutt1.setSelected(false);
				cbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				lbutt1.setSelected(false);
				ibutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == c1.getText()) {
			if (cbutt1.isSelected()) {
				abutt1.setSelected(false);
				bbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				lbutt1.setSelected(false);
				ibutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == nr1.getText()) {
			if (nrbutt1.isSelected()) {
				abutt1.setSelected(false);
				bbutt1.setSelected(false);
				cbutt1.setSelected(false);
				lbutt1.setSelected(false);
				ibutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == l1.getText()) {
			if (lbutt1.isSelected()) {
				abutt1.setSelected(false);
				bbutt1.setSelected(false);
				cbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				ibutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == i1.getText()) {
			if (ibutt1.isSelected()) {
				abutt1.setSelected(false);
				bbutt1.setSelected(false);
				cbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				lbutt1.setSelected(false);
				nfbutt1.setSelected(false);
			}
		}
		if (grade == nf1.getText()) {
			if (nfbutt1.isSelected()) {
				abutt1.setSelected(false);
				bbutt1.setSelected(false);
				cbutt1.setSelected(false);
				nrbutt1.setSelected(false);
				lbutt1.setSelected(false);
				ibutt1.setSelected(false);
			}
		}
	}

	public void isFall(Boolean thing) {
		if (thing) {
			if (fallbutt1.isSelected()) {
				abutt2.setSelected(true);
				bbutt2.setSelected(true);
				cbutt2.setSelected(false);
				dbutt2.setSelected(false);
				springbutt1.setSelected(false);
			} else {
				abutt2.setSelected(false);
				bbutt2.setSelected(false);
			}
		} else {
			if (springbutt1.isSelected()) {
				abutt2.setSelected(false);
				bbutt2.setSelected(false);
				cbutt2.setSelected(true);
				dbutt2.setSelected(true);
				fallbutt1.setSelected(false);
			} else {
				cbutt2.setSelected(false);
				dbutt2.setSelected(false);
			}
		}
	}

	public void noLect() {
		if (nonebutt1.isSelected()) {
			monbutt1.setEnabled(false);
			mon1.setEnabled(false);
			tuesbutt1.setEnabled(false);
			tues1.setEnabled(false);
			wedbutt1.setEnabled(false);
			wed1.setEnabled(false);
			thursbutt1.setEnabled(false);
			thurs1.setEnabled(false);
			fributt1.setEnabled(false);
			fri1.setEnabled(false);
			start1.setEnabled(false);
			starttime1.setEnabled(false);
			startam1.setEnabled(false);
			end1.setEnabled(false);
			endtime1.setEnabled(false);
			endam1.setEnabled(false);
		} else {
			monbutt1.setEnabled(true);
			mon1.setEnabled(true);
			tuesbutt1.setEnabled(true);
			tues1.setEnabled(true);
			wedbutt1.setEnabled(true);
			wed1.setEnabled(true);
			thursbutt1.setEnabled(true);
			thurs1.setEnabled(true);
			fributt1.setEnabled(true);
			fri1.setEnabled(true);
			start1.setEnabled(true);
			starttime1.setEnabled(true);
			startam1.setEnabled(true);
			end1.setEnabled(true);
			endtime1.setEnabled(true);
			endam1.setEnabled(true);
		}
	}

	public void noConf() {
		if (nonebutt2.isSelected()) {
			monbutt2.setEnabled(false);
			mon2.setEnabled(false);
			tuesbutt2.setEnabled(false);
			tues2.setEnabled(false);
			wedbutt2.setEnabled(false);
			wed2.setEnabled(false);
			thursbutt2.setEnabled(false);
			thurs2.setEnabled(false);
			fributt2.setEnabled(false);
			fri2.setEnabled(false);
			start2.setEnabled(false);
			starttime2.setEnabled(false);
			startam2.setEnabled(false);
			end2.setEnabled(false);
			endtime2.setEnabled(false);
			endam2.setEnabled(false);
		} else {
			monbutt2.setEnabled(true);
			mon2.setEnabled(true);
			tuesbutt2.setEnabled(true);
			tues2.setEnabled(true);
			wedbutt2.setEnabled(true);
			wed2.setEnabled(true);
			thursbutt2.setEnabled(true);
			thurs2.setEnabled(true);
			fributt2.setEnabled(true);
			fri2.setEnabled(true);
			start2.setEnabled(true);
			starttime2.setEnabled(true);
			startam2.setEnabled(true);
			end2.setEnabled(true);
			endtime2.setEnabled(true);
			endam2.setEnabled(true);
		}
	}
}
