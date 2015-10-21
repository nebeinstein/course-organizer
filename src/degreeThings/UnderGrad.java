package degreeThings;

import objects.Requirement;

public class UnderGrad extends Degree {
	/**
	 * Written by Nicole Beinstein
	 */

	String type;
	public String kind;

	public UnderGrad(String Name, String Kind) {
		level = "Undergraduate";
		// typeOptions.add("BS");
		// typeOptions.add("BA");
		name = Name;
		kind = Kind;
	}

	public UnderGrad(String Name, String Kind, Requirement[] reqs) {
		level = "Undergradate";
		name = Name;
		kind = Kind;
		for (Requirement r : reqs) {
			addRequirement(r);
		}
	}
}
