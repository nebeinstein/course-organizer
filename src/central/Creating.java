package central;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;

import central.Display;
//import objects.*;
//import degreeThings.*;

public class Creating {
	/**
	 * Written by Nicole Beinstein
	 */
	
	
	public static void createFile(String name, String path, String ext, ArrayList<String> info){
		Formatter x;
		String attach = "\\\\";
		try {
			x = new Formatter(path + name + ext);
			int i = 0;
			while (i<info.size()){
				x.format(info.get(i)+ attach);
				i++;
			}			
			x.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void createProf(){
		String path = "";
		String which = "";
		String ext = "";
		ArrayList<String> info = new ArrayList<String>();
		
		String name = null;
		String[] nameparts = Display.namebox1.getText().split(" ");
		if (nameparts.length == 2) name = nameparts[1] + ", " + nameparts[0];
		if (nameparts.length == 3) name = nameparts[2] + ", " + nameparts[0] + " " + nameparts[1];
		
		if (Display.probutt1.isSelected()) {
			path = "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Professors\\";
			which = "Professor";
			ext = ".prof";
		}
		if (Display.tabutt1.isSelected()) {
			path = "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Tas\\";
			which = "TA";
			ext = ".ta";
		}
		
		info.add(Display.namebox1.getText());
		info.add(Display.offbox1.getText());
		info.add(Display.phonebox1.getText());
		info.add(Display.faxbox1.getText());
		info.add(Display.emailbox1.getText());
		info.add((String)Display.depbox1.getSelectedItem());
		info.add(which);
		info.add(Display.photobox1.getText());
		
		createFile(name, path, ext, info);

		Display.root1.dispose();
	}
	
	public static void finishAdvance(){
		String path = "";
		String which = "";
		String ext = "";
		ArrayList<String> info = new ArrayList<String>();
		
		if (Display.probutt1.isSelected()) {
			path = "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Professors\\";
			which = "Professor";
			ext = ".prof";
		}
		if (Display.tabutt1.isSelected()) {
			path = "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Tas\\";
			which = "TA";
			ext = ".ta";
		}
		
		info.add(Display.offbox1.getText());
		info.add(Display.phonebox1.getText());
		info.add(Display.faxbox1.getText());
		info.add(Display.emailbox1.getText());
		info.add((String)Display.depbox1.getSelectedItem());
		info.add(which);
		info.add(Display.photobox1.getText());
//		info.add(titlebox1.getText());
//		info.add(descbox1.getText());
//		info.add(edubox1.getText());
//		info.add(resbox1.getText());
//		info.add(coursbox1.getText());
		
		createFile(Display.namebox1.getText(), path, ext, info);

		Display.root2.dispose();
		Display.root1.dispose();
	}
	
	public static void createCourse(){
		String path = "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Courses\\";
		String ext = ".course";
		String which = "";
		String grade = "";
		ArrayList<String> info = new ArrayList<String>();
		
		if (Display.enbutt1.isSelected()) {
			which = "true";
			if (Display.abutt1.isSelected()) grade = "A";
			if (Display.bbutt1.isSelected()) grade = "B";
			if (Display.cbutt1.isSelected()) grade = "C";
			if (Display.nrbutt1.isSelected()) grade = "NR";
			if (Display.lbutt1.isSelected()) grade = "L";
			if (Display.ibutt1.isSelected()) grade = "I";
			if (Display.nfbutt1.isSelected()) grade = "**";
		}
		if (Display.enbutt2.isSelected()) {
			which = "false";
			grade = "N/A";
		}
		
		info.add(Display.namebox2.getText());
		info.add((String)Display.depbox2.getSelectedItem());
		info.add(Display.numbox1.getText());
		info.add((String)Display.probox2.getSelectedItem());
		info.add((String)Display.tabox2.getSelectedItem());
		info.add(Display.creditsbox1.getText());
		info.add(which);
		info.add(grade);
		
		createFile(Display.namebox2.getText(), path, ext, info);

		Display.root3.dispose();
	}
	
	public static void finishSched(){
		System.out.println("Finish Schedule");
	}
	
	public static void createDegree(){
		String path = "";
		String ext = "";
		ArrayList<String> info = new ArrayList<String>();
		
		if (Display.degbutt1.isSelected()){
			path = "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Undergrad Degrees\\";
			info.add(Display.namebox3.getText());
			info.add((String)Display.typebox1.getSelectedItem());
			if ((String)Display.typebox1.getSelectedItem() == "Major") ext = ".major";
			if ((String)Display.typebox1.getSelectedItem() == "Minor") ext = ".minor";
			if ((String)Display.typebox1.getSelectedItem() == "WPI") ext = ".under";
		}
		if (Display.degbutt2.isSelected()){
			path = "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Grad Degrees";
			ext = ".grad";
			info.add(Display.namebox3.getText());
		}
		
		createFile(Display.namebox3.getText(), path, ext, info);

		Display.root5.dispose();
	}
	
	public static void createRequire(){
//		System.out.println("Create Requirement");
		String path = "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Requirements\\";
		String ext = ".require";
		String which = "";
		String[] req = {};
		String reqs = "";
		String[] course = {};
		String courses = "";
		ArrayList<String> info = new ArrayList<String>();
		
		if(Display.degbutt3.isSelected()) which = "true";
		if(Display.degbutt4.isSelected()) which = "false";
		
		req = Display.reqbox.getText().split("\n");
		int i = 0;
		while(i<req.length){
			if (i == req.length-1) reqs = reqs + req[i];
			else reqs = reqs + req[i] + ",";
			i++;
		}
		
		course = Display.coursebox1.getText().split("\n");
		i = 0;
		while(i<course.length){
			courses = courses + course[i] + ",";
			i++;
		}
		
		info.add(Display.namebox4.getText());
		info.add(which);
		info.add((String)Display.degbox1.getSelectedItem());
		info.add(Display.creditsbox2.getText());
		info.add(reqs);
		info.add(courses);
		
		createFile(Display.namebox4.getText(), path, ext, info);

		Display.root6.dispose();
	}
	
}
