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
}
