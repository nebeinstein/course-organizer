package central;

import java.io.File;
import java.util.ArrayList;

import degreeThings.Grad;
import degreeThings.UnderGrad;
import objects.Course;
import objects.Professor;
import objects.Requirement;

public class DummyClass {
	public static File f;
	public static ArrayList<Object> l;
	public Professor[] profs = { new Professor("L.K. Ram-Mohan", "OH 204",
			"555-5555", "555-5555", "mohan@wpi.edu", "PH") };
	public Professor[] tas = { new Professor("L.K. Ram-Mohan", "OH 204",
			"555-5555", "555-5555", "mohan@wpi.edu", "PH") };
	public Course[] courses = {
			new Course("PH-511-Classical Mechanics", "L.R. Ram-Mohan", "N/A",
					"3.000"),
			new Course("PH-2301-Electromagnetic Fields", "P.K. Aravind", "N/A",
					"3.000") };
	public static Requirement[] requirements = {
			new Requirement("Math Classes", 18.000),
			new Requirement("Music Classes", 15.000) };
	public UnderGrad[] undergrads = {
			new UnderGrad("Physics", "Major", requirements),
			new UnderGrad("Music", "Minor", requirements) };
	public Grad[] grads = { new Grad("Physics") };

}
