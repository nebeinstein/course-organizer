package objects;


public class UnderGrad extends Degree {
	/**
	 * Written by Nicole Beinstein
	 */

	public String kind;

	public UnderGrad(String Name, String Kind) {
		super();
		typeOptions.add("BS");
		typeOptions.add("BA");
		level = "Undergraduate";
		name = Name;
		kind = Kind;
	}

	public UnderGrad(String Name, String Kind, Requirement[] reqs) {
		super();
		typeOptions.add("BS");
		typeOptions.add("BA");
		level = "Undergradate";
		name = Name;
		kind = Kind;
		for (Requirement r : reqs) {
			addRequirement(r);
		}
	}
}
