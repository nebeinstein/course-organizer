package objects;


public class Grad extends Degree {
	/**
	 * Written by Nicole Beinstein
	 */

	public Grad(String Name) {
		super();
		typeOptions.add("MS");
		typeOptions.add("MA");
		level = "Graduate";
		name = Name;
	}
}
