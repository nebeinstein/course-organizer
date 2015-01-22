package degreeThings;

public class Grad extends Degree {
	/**
	 * Written by Nicole Beinstein
	 */

	public Grad(String Name) {
		level = "Graduate";
		typeOptions.add("MS");
		typeOptions.add("MA");
		name = Name;
	}
}
