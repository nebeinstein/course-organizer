package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import objects.Course;
import objects.Prof;
import objects.Require;

public class Archivist {
	/**
	 * Constructor for the Archivist class.
	 */
	ArrayList<String> lines;
	ArrayList<Prof> professors;
	ArrayList<Course> courses;
	ArrayList<Require> require;
	int location;
	private boolean verboseOutputEnabled = true;

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
	}

	public static void main(String[] args) {
		new Archivist();
	}

	public void say(String s) {
		if (verboseOutputEnabled)
			System.out.println("Archivist: " + s);
	}
}