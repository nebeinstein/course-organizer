package central;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import control.MainUIController;
import objects.Course;
import objects.Professor;
import objects.Require;
import ui.MainUI;
import degreeThings.*;

public class Main {
	/**
	 * Written by Nicole Beinstein and Jack Rivadeneira
	 */

	static ArrayList<File> profFiles = new ArrayList<File>();
	static Professor[] profs = {};
	
	static ArrayList<File> taFiles = new ArrayList<File>();
	static Professor[] tas = {};
	
	static ArrayList<File> classFiles = new ArrayList<File>();
	public static Course[] classes = {};
	
	static ArrayList<File> requireFiles = new ArrayList<File>();
	static Require[] requires = {};
	
	static ArrayList<File> undergradFiles = new ArrayList<File>();
	static UnderGrad[] undergrads = {};
	
	static ArrayList<File> gradFiles = new ArrayList<File>();
	static Grad[] grads = {};
	
	static ArrayList<File> reqFiles = new ArrayList<File>();
	static Require[] reqs = {};
	
	public static void main(String[] args) {
		getProfs();
		getTas();
		getCourses();
		getGrads();
		getUndergrads();
		getRequires();
		new MainUI(new MainUIController());
	}
	
	static void addTree(File file, ArrayList<File> all){
		File[] children = file.listFiles();
		if (children != null){
			for (File child:children){
				all.add(child);
				addTree(child,all);
			}
		}
	}
	
	public static String[][] getInfo(ArrayList<File> Files, String Split){
		String[][] info = new String[Files.size()][];
		int i = 0;
		while (i<Files.size()){
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(Files.get(i)));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			String line = null;
			try {
				line = reader.readLine();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			info[i] = line.split(Split);

			int c = 0;
			while(c<info[i].length){
				if (info[i][c].startsWith("\\")){
					String[] parts = info[i][c].split("\\\\", 2);
					info[i][c] = parts[parts.length - 1];
				}
//				System.out.println(info[i][c]);
				c++;
			}
			i++;
		}
		return info;
	}
	
	public static void getProfs(){
		addTree(new File("C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Professors"), profFiles);
		
		profs = new Professor[profFiles.size()];
		
		String[][] info = getInfo(profFiles, "\\\\\\\\");
		
		int i = 0;
		while (i<profFiles.size()){
			profs[i] = new Professor(info[i][0], info[i][1], info[i][2], info[i][3], info[i][4], info[i][5]);
			profs[i].type = "Professor";
			profs[i].picture(info[i][6]);
			if (info[i].length == 12) {
				profs[i].detail(info[i][7], info[i][9], info[i][10], info[i][11]);
				profs[i].description(info[i][8]);
			}
			i++;
		}
	}
	
	public static void getTas(){
		addTree(new File("C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\TAs"), taFiles);
		
		tas = new Professor[taFiles.size()];
		
		String[][] info = getInfo(taFiles, "\\\\\\\\");
		
		int i = 0;
		while (i<taFiles.size()){
			tas[i] = new Professor(info[i][0], info[i][1], info[i][2], info[i][3], info[i][4], info[i][5]);
			tas[i].type = "TA";
			tas[i].picture(info[i][6]);
			if (info[i].length == 12) {
				tas[i].detail(info[i][7], info[i][9], info[i][10], info[i][11]);
				tas[i].description(info[i][8]);
			}
			i++;
		}
	}
	
	public static void getCourses(){
		addTree(new File("C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Courses"), classFiles);
		
		classes = new Course[classFiles.size()];
		
		String[][] info = getInfo(classFiles, "\\\\\\\\");
		
		int i = 0;
		while (i<classFiles.size()){
			classes[i] = new Course(info[i][0], info[i][2], info[i][1], info[i][3], info[i][4], info[i][5]);
			if (Boolean.valueOf(info[i][6])) classes[i].enrolled = true;
//			classes[i].pass(info[i][7]);
			i++;
		}
	}
	
	public static void getUndergrads(){
		addTree(new File("C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Undergrad Degrees"), undergradFiles);

		undergrads = new UnderGrad[undergradFiles.size()];
		
		String[][] info = getInfo(undergradFiles, "\\\\\\\\");
		
		int i = 0;
		while (i<undergradFiles.size()){
			undergrads[i] = new UnderGrad(info[i][0], info[i][1]);
			i++;
		}
	}
	
	public static void getGrads(){
		addTree(new File("C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Grad Degrees"), gradFiles);

		grads = new Grad[gradFiles.size()];
		
		String[][] info = getInfo(gradFiles, "\\\\\\\\");
		
		int i = 0;
		while (i<gradFiles.size()){
			grads[i] = new Grad(info[i][0]);
			i++;
		}
	}
	
	public static void getRequires(){
		addTree(new File("C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Requirements"), reqFiles);

		reqs = new Require[reqFiles.size()];
		
		String[][] info = getInfo(reqFiles, "\\\\\\\\");
		
		int i = 0;
		while (i<reqFiles.size()){
			String[] reqNames = info[i][4].split(",");
			String[] paths = info[i][5].split(",");
			
			String[] parts = {};
			String[] extRem = {};
			ArrayList<String> names = new ArrayList<String>();
			int b = 0;
			while(b<paths.length){
				parts = paths[b].split("\\\\");
				extRem = parts[parts.length-1].split(".course");
				names.add(extRem[0]);
				b++;
			}
			reqs[i] = new Require(info[i][0], Double.parseDouble(info[i][3]), reqNames, paths);
			reqs[i].courseNames = names;
			reqs[i].addCourses();
			reqs[i].checkMet();
			
			if(Boolean.valueOf(info[i][1])){
				int c = 0;
				while (c<undergrads.length){
					if(undergrads[c].name.equals(info[i][2])) undergrads[c].requirements.add(reqs[i]);
					c++;
				}
			}else {
				int d = 0;
				while(d<grads.length){
					if(grads[d].name.equals(info[i][2])) grads[d].requirements.add(reqs[i]);
					d++;
				}
			}
			
			i++;
		}
	}
}
