package central;

import java.io.File;
import java.util.ArrayList;

import degreeThings.Grad;
import degreeThings.UnderGrad;
import objects.Course;
import objects.Professor;
import objects.Require;

public class DummyClass {
	public static File f;
	public static ArrayList<Object> l;
	public static Professor[] profs = { new Professor("L.K. Ram-Mohan",
			"OH 204", "555-5555", "555-5555", "mohan@wpi.edu", "PH") };
	public static Professor[] tas = { new Professor("L.K. Ram-Mohan", "OH 204",
			"555-5555", "555-5555", "mohan@wpi.edu", "PH") };
	public static Course[] courses = {
			new Course("PH-511-Classical Mechanics", "L.R. Ram-Mohan", "N/A",
					"3.000"),
			new Course("PH-2301-Electromagnetic Fields", "P.K. Aravind", "N/A",
					"3.000") };
	public static Require[] requires = {};
	public static UnderGrad[] undergrads = {};
	public static Grad[] grads = {};
	public static Require[] reqs = {};

}
