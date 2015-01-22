package degreeThings;

public class UnderGrad extends Degree {
	/**
	 * Written by Nicole Beinstein
	 */

	String type;
	public String kind;

	public UnderGrad(String Name, String Kind) {
		level = "Undergraduate";
//		typeOptions.add("BS");
//		typeOptions.add("BA");
		name = Name;
		kind = Kind;
	}
}
