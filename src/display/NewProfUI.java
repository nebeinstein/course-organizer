package display;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import central.Creating;

public class NewProfUI extends NewProfUIHeader implements ActionListener {

	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = -883814311856863910L;

	public NewProfUI() {
		// Creating the window
		setSize(500, 553);
		setTitle("New Professor/TA");
		setResizable(false);
		setLocationRelativeTo(null);

		panel1.setSize(500, 553);
		panel1.setLayout(null);
		add(panel1, BorderLayout.CENTER);

		name1.setLocation(39, 39);
		name1.setSize(96, 25);
		name1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(name1);

		namebox1.setLocation(145, 39);
		namebox1.setSize(224, 25);
		panel1.add(namebox1);

		off1.setLocation(39, 79);
		off1.setSize(96, 25);
		off1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(off1);

		offbox1.setLocation(145, 79);
		offbox1.setSize(224, 25);
		panel1.add(offbox1);

		phone1.setLocation(39, 119);
		phone1.setSize(96, 25);
		phone1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(phone1);

		phonebox1.setLocation(145, 119);
		phonebox1.setSize(224, 25);
		panel1.add(phonebox1);

		fax1.setLocation(39, 159);
		fax1.setSize(96, 25);
		fax1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(fax1);

		faxbox1.setLocation(145, 159);
		faxbox1.setSize(224, 25);
		panel1.add(faxbox1);

		email1.setLocation(39, 199);
		email1.setSize(96, 25);
		email1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(email1);

		emailbox1.setLocation(145, 199);
		emailbox1.setSize(224, 25);
		panel1.add(emailbox1);

		dep1.setLocation(39, 239);
		dep1.setSize(96, 25);
		dep1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(dep1);

		depbox1.setLocation(145, 239);
		depbox1.setSize(224, 25);
		panel1.add(depbox1);

		probutt1.setLocation(100, 284);
		probutt1.setSize(15, 15);
		probutt1.addActionListener(this);
		panel1.add(probutt1);

		pro1.setLocation(109, 279);
		pro1.setSize(96, 25);
		pro1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(pro1);

		tabutt1.setLocation(215, 284);
		tabutt1.setSize(15, 15);
		tabutt1.addActionListener(this);
		panel1.add(tabutt1);

		Ta1.setLocation(209, 279);
		Ta1.setSize(96, 25);
		Ta1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(Ta1);

		photo1.setLocation(39, 319);
		photo1.setSize(96, 25);
		photo1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(photo1);

		photobox1.setLocation(145, 319);
		photobox1.setSize(224, 25);
		panel1.add(photobox1);

		browse1.setLocation(369, 319);
		browse1.setSize(96, 25);
		browse1.addActionListener(this);
		panel1.add(browse1);

		cancel1.setLocation(380, 490);
		cancel1.setSize(96, 25);
		cancel1.addActionListener(this);
		panel1.add(cancel1);

		create1.setLocation(264, 490);
		create1.setSize(96, 25);
		create1.addActionListener(this);
		panel1.add(create1);

		advance1.setLocation(148, 490);
		advance1.setSize(96, 25);
		advance1.addActionListener(this);
		panel1.add(advance1);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == probutt1)
			isProf(true);
		if (e.getSource() == tabutt1)
			isProf(false);
		if (e.getSource() == cancel1)
			this.dispose();
		if (e.getSource() == create1)
			Creating.createProf();
		if (e.getSource() == browse1)
			findPhoto(photobox1);
		if (e.getSource() == advance1)
			advanceProf();

		if (e.getSource() == cancel2)
			root2.dispose();
		if (e.getSource() == finish1)
			Creating.finishAdvance();
	}

	public void findPhoto(JTextField box) {
		String path = MainUI.browseComp("C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Photos");
		box.setText(path);
	}

	public void isProf(Boolean thing) {
		if (thing) {
			if (probutt1.isSelected())
				tabutt1.setSelected(false);
		} else {
			if (tabutt1.isSelected())
				probutt1.setSelected(false);
		}
	}

	public void advanceProf() {
		root2.setSize(680, 500);
		root2.setTitle("Professor Advanced");
		root2.setResizable(false);
		root2.setLocationRelativeTo(null);

		panel2.setSize(680, 500);
		panel2.setLayout(null);
		root2.add(panel2, BorderLayout.CENTER);

		title1.setLocation(79, 39);
		title1.setSize(96, 25);
		title1.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(title1);

		titlebox1.setLocation(185, 39);
		titlebox1.setSize(360, 25);
		panel2.add(titlebox1);

		desc1.setLocation(79, 79);
		desc1.setSize(96, 100);
		desc1.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(desc1);

		descbox1.setLocation(0, 0);
		descbox1.setSize(345, 100);

		descscrollpane.setLocation(185, 79);
		descscrollpane.setSize(360, 100);
		panel2.add(descscrollpane);

		edu1.setLocation(79, 194);
		edu1.setSize(96, 50);
		edu1.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(edu1);

		edubox1.setLocation(0, 0);
		edubox1.setSize(360, 50);

		eduscrollpane.setLocation(185, 194);
		eduscrollpane.setSize(360, 50);
		panel2.add(eduscrollpane);

		res1.setLocation(79, 259);
		res1.setSize(96, 50);
		res1.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(res1);

		resbox1.setLocation(0, 0);
		resbox1.setSize(360, 50);

		resscrollpane.setLocation(185, 259);
		resscrollpane.setSize(360, 50);
		panel2.add(resscrollpane);

		cours1.setLocation(79, 324);
		cours1.setSize(96, 75);
		cours1.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(cours1);

		coursbox1.setLocation(0, 0);
		coursbox1.setSize(345, 75);

		coursscrollpane.setLocation(185, 324);
		coursscrollpane.setSize(360, 75);
		panel2.add(coursscrollpane);

		cancel2.setLocation(558, 434);
		cancel2.setSize(96, 25);
		cancel2.addActionListener(this);
		panel2.add(cancel2);

		finish1.setLocation(442, 434);
		finish1.setSize(96, 25);
		finish1.addActionListener(this);
		panel2.add(finish1);

		root2.setVisible(true);
	}

}
