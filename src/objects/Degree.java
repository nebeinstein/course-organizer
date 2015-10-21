package objects;

import java.util.ArrayList;

public class Degree {
	/**
	 * Written by Nicole Beinstein
	 */

	public String name;
	public ArrayList<Requirement> requirements = new ArrayList<Requirement>();
	String level;
	String type;
	ArrayList<String> typeOptions;

	public Degree(){
		typeOptions = new ArrayList<String>();
	}
	
	public void addRequirement(Requirement newReq) {
		requirements.add(newReq);
	}
}
