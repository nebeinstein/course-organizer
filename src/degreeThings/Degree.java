package degreeThings;

import java.util.ArrayList;
import objects.Requirement;

public class Degree {
	/**
	 * Written by Nicole Beinstein
	 */

	public String name;
	public ArrayList<Requirement> requirements = new ArrayList<Requirement>();
	String level;
	String type;
	ArrayList<String> typeOptions;

	public void addRequirement(Requirement newReq) {
		requirements.add(newReq);
	}
}
