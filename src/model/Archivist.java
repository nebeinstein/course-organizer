package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import objects.Course;
import objects.Prof;
import objects.Require;

public class Archivist {
	/**
	 * Interprets Jack's data to produce usable objects.
	 */
	ArrayList<String> lines;
	public ArrayList<Prof> professors;
	public ArrayList<Course> courses;
	public ArrayList<Require> require;
	int location;
	private boolean verboseOutputEnabled = true;

	/**
	 * Constructor for the archivist class.
	 */
	public Archivist() {
		this.lines = new ArrayList<String>();
		this.professors = new ArrayList<Prof>();
		this.location = 0;
		this.loadFile("data");
		this.interpret();
	}

	/**
	 * Interprets lines loaded from the file into usable data.
	 */
	public void interpret() {
		this.say("Interpreting...");
		while (location < lines.size()) {
			String s = lines.get(location);
			if (s.contains("professor")) {
				this.loadProfessor();
			}
		}
		this.say("Done.");
		this.say(this.professors.size() + " Professors Loaded...");
	}

	/**
	 * Loads all the lines in the datafile at the given filepath.
	 * 
	 * @param fp
	 */
	public void loadFile(String fp) {
		say("Loading File...");
		try {
			Scanner s = new Scanner(new File(fp));
			while (s.hasNext())
				lines.add(s.nextLine());
			say("File Loaded.");
			s.close();
			say("File Closed.");
		} catch (FileNotFoundException e) {
			say("File not found!");
			e.printStackTrace();
		}
	}

	/**
	 * Professor loader
	 */
	public void loadProfessor() {
		String s = this.lines.get(location);
		String[] professorData = new String[13];
		int depth = 0;
		while (!s.contains("}")) {
			s = this.lines.get(location);
			if (s.contains(";")) {
				String[] data = s.split(";");
				for (String point : data) {
					professorData[depth] = point;
					depth++;
				}
			}
			location++;
		}
		professors.add(new Prof(professorData));
		// say(professors.get(0).toString());
	}

	/**
	 * Saves the given object's toString() data in the datafile as the type
	 * specified by the given String in the file.
	 * 
	 * @param type
	 *            - The name of the type.
	 * @param payload
	 *            - The Object whose data you want to save
	 */
	public void savePayload(String type, Object payload) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("")));
			bw.write(type + "{");
			bw.newLine();
			bw.write(payload.toString());
			bw.newLine();
			bw.write("}");
			bw.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Archivist();
	}

	private void say(String s) {
		if (verboseOutputEnabled)
			System.out.println("Archivist: " + s);
	}
}