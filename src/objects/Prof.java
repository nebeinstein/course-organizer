package objects;

public class Prof {
	/**
	 * Written by Nicole Beinstein
	 */

	public String name;
	public String office;
	public String phone;
	public String fax;
	public String email;
	public String dep;
	public String type;
	public String photo;
	public String title;
	public String describe;
	public String edu;
	public String research;
	public String courses;
	
	public Prof(String[] professorData){
		int i = 0;
		name = professorData[i++];
		office = professorData[i++];
		phone = professorData[i++];
		fax = professorData[i++];
		email = professorData[i++];
		dep = professorData[i++];
		type = professorData[i++];
		photo = professorData[i++];
		title = professorData[i++];
		describe = professorData[i++];
		edu = professorData[i++];
		research = professorData[i++];
		courses = professorData[i++];
	}

	public Prof(String Name, String Office, String Phone, String Fax,
			String Email, String Dep) {
		name = Name;
		office = Office;
		phone = Phone;
		fax = Fax;
		email = Email;
		dep = Dep;
	}

	public void detail(String Title, String Edu, String Research,
			String Courses) {
		title = Title;
		edu = Edu;
		research = Research;
		courses = Courses;
	}

	public void description(String Describe) {
		describe = Describe;
	}

	public void picture(String Photo) {
		photo = Photo;
	}
	
	public String toString(){
		String s = name;
		s += " " + office;
		s += " " + phone;
		s += " " + fax;
		s += " " + email;
		s += " " + dep;
		s += " " + type;
		s += " " + photo;
		s += " " + title;
		s += " " + describe;
		s += " " + edu;
		s += " " + research;
		s += " " + courses;
		return s;
	}
}
