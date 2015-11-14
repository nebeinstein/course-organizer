package model;

import objects.Professor;
import ui.NewProfUI;

public class Creator {
	/**
	 * Written by Nicole Beinstein
	 */

	private static boolean verboseOutputEnabled = true;
	static boolean advancedProfessor = true;

	public Creator() {

	}

	public static void createProfessor(String type) {
		// Getting information from the window
		say("Getting information...");
		int n = 8;
		if (advancedProfessor)
			n = 13;
		String[] professorData = new String[n];
		professorData[0] = NewProfUI.nameBox.getText();
		professorData[1] = NewProfUI.officeBox.getText();
		professorData[2] = NewProfUI.phoneBox.getText();
		professorData[3] = NewProfUI.faxBox.getText();
		professorData[4] = NewProfUI.emailBox.getText();
		professorData[5] = (String) NewProfUI.departmentBox.getSelectedItem();
		professorData[6] = type;
		professorData[7] = NewProfUI.photoBox.getText();

		if (n > 8) {
			professorData[8] = NewProfUI.titleBox.getText();
			professorData[9] = NewProfUI.descriptionBox.getText();
			professorData[10] = NewProfUI.educationBox.getText();
			professorData[11] = NewProfUI.researchBox.getText();
			professorData[12] = NewProfUI.courseBox.getText();
			say("Advanced things happened.");
		}
		say("Done.");

		// Creating the professor object
		say("Creating professor...");
		Professor newMan = new Professor(professorData);
		say("Done.");

		// Sending to archivist
		say("Sending to archivist...");
		Archivist.savePayload("Professor", newMan);
		say("Sent.");

	}

	public static void finishAdvancedProf() {
		say("Advanced professor data!!!");

	}

	public static void createCourse(String grade) {
		say("Getting course information...");

		say("Done");

		say("Creating course...");

		say("Done.");

		say("Sending to archivist...");

		say("Sent.");
	}

	public void finishSched() {
		say("Finish Schedule");
	}

	public void createDegree() {
		say("Create degree!!!");
	}

	public void createRequire() {
		say("Create Requirement");
	}

	private static void say(String s) {
		if (verboseOutputEnabled)
			System.out.println("Creator: " + s);
	}

}
