package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import central.Creating;
import control.Controller;

public class NewDegreeUI extends NewDegreeUIHeader implements UI {

	/**
	 * Written by Nicole Beinstein
	 */
	private static final long serialVersionUID = 2568085091000360273L;

	public NewDegreeUI(Controller ctrl) {
		addController(ctrl);
		ctrl.addUI(this);
		setSize(400, 270);
		setTitle("New Degree");
		setResizable(false);
		setLocationRelativeTo(null);

		panel5.setSize(400, 270);
		panel5.setLayout(null);
		add(panel5);

		name3.setLocation(14, 39);
		name3.setSize(96, 25);
		name3.setHorizontalAlignment(JLabel.CENTER);
		panel5.add(name3);

		namebox3.setLocation(125, 39);
		namebox3.setSize(194, 25);
		panel5.add(namebox3);

		degbutt1.setLocation(70, 85);
		degbutt1.setSize(15, 15);
		degbutt1.addActionListener(ctrl);
		panel5.add(degbutt1);

		deglabe1.setLocation(90, 79);
		deglabe1.setSize(96, 25);
		deglabe1.setHorizontalAlignment(JLabel.LEFT);
		panel5.add(deglabe1);

		degbutt2.setLocation(210, 85);
		degbutt2.setSize(15, 15);
		degbutt2.addActionListener(ctrl);
		panel5.add(degbutt2);

		deglabe2.setLocation(230, 79);
		deglabe2.setSize(96, 25);
		deglabe2.setHorizontalAlignment(JLabel.LEFT);
		panel5.add(deglabe2);

		type1.setLocation(14, 119);
		type1.setSize(96, 25);
		type1.setHorizontalAlignment(JLabel.CENTER);
		panel5.add(type1);

		typebox1.setLocation(125, 119);
		typebox1.setSize(194, 25);
		panel5.add(typebox1);

		cancel5.setLocation(280, 207);
		cancel5.setSize(96, 25);
		cancel5.addActionListener(ctrl);
		panel5.add(cancel5);

		create3.setLocation(166, 207);
		create3.setSize(96, 25);
		create3.addActionListener(ctrl);
		panel5.add(create3);

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
