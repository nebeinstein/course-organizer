package objects;

import java.util.ArrayList;

import central.Main;

public class Require {
	/**
	 * Written by Nicole Beinstein
	 */

	public String name;
	public double creditsNeed;
	double creditsHave = 0.000;
	String[] reqcourses;
	String[] courseFiles;
	public ArrayList<String> courseNames;
	public Course[] courses = {};
	double GPA;
	boolean met = false;

	public Require(String Name, double Credits, String[] Reqcourses, String[] CourseFiles) {
		name = Name;
		creditsNeed = Credits;
		reqcourses = Reqcourses;
		courseFiles = CourseFiles;
	}

	public Course findCourse(String Name){
		Course thatOne = null;
		int i = 0;
		while(i<Main.classes.length){
			if(Main.classes[i].name.equals(Name)) thatOne = Main.classes[i];
			i++;
		}
		return thatOne;
	}
	
	public void addCourses() {
		courses = new Course[courseFiles.length];
		int i = 0;
		while(i<courseFiles.length){
			courses[i] = findCourse(courseNames.get(i));
			i++;
		}
	}

	public void calc() {
		int i = 0;
		double big = 0.000;
		while (i < courses.length) {
			if (courses[i].enrolled && courses[i].passed) {
				double add = 0;
				creditsHave = creditsHave + Double.parseDouble(courses[i].credits);
				if (courses[i].grade == "A")
					add = 4.000;
				if (courses[i].grade == "B")
					add = 3.000;
				if (courses[i].grade == "C")
					add = 2.000;
				big = big + add;
			}
			i++;
		}
		GPA = big / courses.length;
	}

	public void checkMet() {
		if (creditsNeed == creditsHave) {
			met = true;
		}
	}
}
