package objects;

import java.util.ArrayList;

public class Course {
	/**
	 * Written by Nicole Beinstein
	 */

	public String name;
	public String num;
	public String dep;
	public String profname;
	public String taname;
	public String credits;
	public boolean enrolled = false;
	public String grade;
	boolean passed = false;
	boolean lecture;
	boolean conf;
	boolean lab;
	ArrayList<ArrayList<String>> lectdays;
	ArrayList<ArrayList<String>> confdays;
	ArrayList<ArrayList<String>> labdays;
	int year;
	ArrayList<String> term;
	String section;

	public Course(String Name, String Num, String Dep, String Profname, String Taname,
			String Credits) {
		name = Name;
		num = Num;
		dep = Dep;
		profname = Profname;
		taname = Taname;
		credits = Credits;
	}

	public void pass(String Grade) {
		grade = Grade;
		if (grade == "A" | grade == "B" | grade == "C")
			passed = true;
	}

	public void enroll(int Year, ArrayList<String> Term, String Section) {
		enrolled = true;
		year = Year;
		term = Term;
		section = Section;
	}

	public void schedSetup(ArrayList<ArrayList<String>> list,
			ArrayList<String> days, String startTime, String endTime) {
		int i = 0;
		while (i < days.size()) {
			ArrayList<String> New = new ArrayList<String>();
			New.add(days.get(i));
			New.add(startTime);
			New.add(endTime);
			list.add(New);
			i++;
		}
	}

	public void lectSetup(ArrayList<String> days, String startTime,
			String endTime) {
		schedSetup(lectdays, days, startTime, endTime);
	}

	public void confSetup(ArrayList<String> days, String startTime,
			String endTime) {
		schedSetup(confdays, days, startTime, endTime);
	}

	public void labSetup(ArrayList<String> days, String startTime,
			String endTime) {
		schedSetup(labdays, days, startTime, endTime);
	}

	public String toString(){
		
		return null;
	}
}
