package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import objects.Course;
import objects.Professor;
import objects.Requirement;

public class Archivist {
	/**
	 * Interprets Jack's data to produce usable objects.
	 */
	ArrayList<String> lines;
	public static ArrayList<Professor> professors;
	public static ArrayList<Course> courses;
	public static ArrayList<Requirement> require;
	int location;
	private boolean verboseOutputEnabled = true;
	private final String datafile = "data";

	/**
	 * Constructor for the archivist class.
	 */
	public Archivist() {
		this.lines = new ArrayList<String>();
		this.professors = new ArrayList<Professor>();
		this.location = 0;
		this.loadFile(datafile);
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
			location++;
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
		String[] professorData = new String[14];
		int depth = 0;
		while (depth<13) {
			s = this.lines.get(location);
			if (s.contains(";")) {
				if(s.contains("{"))
					s = s.substring(s.indexOf("{") + 1);
				String[] data = s.split(";");
				for (String point : data) {
					professorData[depth] = point;
					depth++;
				}
			}
			location++;
		}
		professors.add(new Professor(professorData));
		say(professors.get(professors.size()-1).toString());
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
		say("Saving...");
		try {
			say("Opening file...");
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					datafile),true));
			say("Writing header...");
			bw.newLine();
			bw.write(type + "{");
			say("Done.");
			bw.newLine();
			say("Writing data...");
			bw.write(payload.toString());
			say("Done.");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			say("Closing file...");
			bw.close();
			say("File closed.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		say("Save complete.");
		if(type.equals("professor")){
			professors.add((Professor)payload);
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