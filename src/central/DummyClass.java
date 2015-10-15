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
	public static Professor[] profs = {};
	public static Professor[] tas = {};
	public static Course[] classes = {};
	public static Require[] requires = {};
	public static UnderGrad[] undergrads = {};
	public static Grad[] grads = {};
	public static Require[] reqs = {};
	
	public Course fake = new Course(null, null, null, null, null, null);
}
