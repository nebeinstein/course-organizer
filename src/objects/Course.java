package objects;

public class Course {
	/**
	 * Written by Nicole Beinstein
	 */

	public String name; // PH-511-Classical Mechanics
	public String profname;
	public String taname;
	public String credits;
	public String grade;
	public boolean enrolled = false;

	int year;
	boolean lecture;
	boolean conf;
	boolean lab;

	String lectdays;
	String confdays;
	String labdays;
	String term;

	public Course(String[] courseData, boolean Enrolled) {
		int i = 0;
		name = courseData[i++];
		profname = courseData[i++];
		taname = courseData[i++];
		credits = courseData[i++];
		grade = courseData[i++];
		enrolled = Enrolled;
	}

	public Course(String Name, String Profname, String Taname, String Credits) {
		name = Name;
		profname = Profname;
		taname = Taname;
		credits = Credits;
	}

	public boolean passed() {
		return "ABCL".contains(grade);
	}

	public void enroll(int Year, String Term, String Section) {
		enrolled = true;
		year = Year;
		term = Term;
	}

	public void finish(String Grade) {
		grade = Grade;
	}

	/**
	 * Gets the department name for this course
	 * 
	 * @returns The department(s) the course falls under as a string.
	 */
	public String getDepartment() {
		return name.split("-")[0];
	}

	/**
	 * Gets the number for this course
	 * 
	 * @returns The course number as a string.
	 */
	public String getCourseNumber() {
		return name.split("-")[1];
	}

	/**
	 * Gets the course name for this course.
	 * 
	 * @returns The course name as a string.
	 */
	public String getCourseName() {
		return name.split("-")[2];
	}

	public void schedSetup(String list, String days, String startTime, String endTime) {

	}

	public void lectSetup(String days, String startTime, String endTime) {
		schedSetup(lectdays, days, startTime, endTime);
	}

	public void confSetup(String days, String startTime, String endTime) {
		schedSetup(confdays, days, startTime, endTime);
	}

	public void labSetup(String days, String startTime, String endTime) {
		schedSetup(labdays, days, startTime, endTime);
	}

	public String toString() {
		String s = name;
		s += ";" + profname;
		s += ";" + taname;
		s += ";" + credits;
		s += ";" + enrolled;
		s += ";" + grade;
		s += ";" + year;
		s += ";" + lecture;
		s += ";" + conf;
		s += ";" + lab;
		s += ";" + lectdays;
		s += ";" + confdays;
		s += ";" + labdays;
		s += ";" + term + ";";
		return s;
	}
}