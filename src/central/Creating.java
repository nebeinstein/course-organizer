package central;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;

public class Creating {
	/**
	 * Written by Nicole Beinstein
	 */
	public static void createFile(String name, String path, String ext, ArrayList<String> info) {
		Formatter x;
		String attach = "\\\\";
		try {
			x = new Formatter(path + name + ext);
			int i = 0;
			while (i < info.size()) {
				x.format(info.get(i) + attach);
				i++;
			}
			x.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void createProf() {
		System.out.println("Create Prof!!!!");
		// String path = "";
		// String which = "";
		// String ext = "";
		// ArrayList<String> info = new ArrayList<String>();
		//
		// String name = null;
		// String[] nameparts = MainUI.namebox1.getText().split(" ");
		// if (nameparts.length == 2) name = nameparts[1] + ", " + nameparts[0];
		// if (nameparts.length == 3) name = nameparts[2] + ", " + nameparts[0]
		// + " " + nameparts[1];
		//
		// if (MainUI.probutt1.isSelected()) {
		// path =
		// "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Professors\\";
		// which = "Professor";
		// ext = ".prof";
		// }
		// if (MainUI.tabutt1.isSelected()) {
		// path =
		// "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Tas\\";
		// which = "TA";
		// ext = ".ta";
		// }
		//
		// info.add(MainUI.namebox1.getText());
		// info.add(MainUI.offbox1.getText());
		// info.add(MainUI.phonebox1.getText());
		// info.add(MainUI.faxbox1.getText());
		// info.add(MainUI.emailbox1.getText());
		// info.add((String)MainUI.depbox1.getSelectedItem());
		// info.add(which);
		// info.add(MainUI.photobox1.getText());
		//
		// createFile(name, path, ext, info);
		//
		// MainUI.root1.dispose();
	}

	public static void finishAdvance() {
		System.out.println("Finish advanced prof!!!");
		// String path = "";
		// String which = "";
		// String ext = "";
		// ArrayList<String> info = new ArrayList<String>();
		//
		// if (MainUI.probutt1.isSelected()) {
		// path =
		// "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Professors\\";
		// which = "Professor";
		// ext = ".prof";
		// }
		// if (MainUI.tabutt1.isSelected()) {
		// path =
		// "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Tas\\";
		// which = "TA";
		// ext = ".ta";
		// }
		//
		// info.add(MainUI.offbox1.getText());
		// info.add(MainUI.phonebox1.getText());
		// info.add(MainUI.faxbox1.getText());
		// info.add(MainUI.emailbox1.getText());
		// info.add((String)MainUI.depbox1.getSelectedItem());
		// info.add(which);
		// info.add(MainUI.photobox1.getText());
		//// info.add(titlebox1.getText());
		//// info.add(descbox1.getText());
		//// info.add(edubox1.getText());
		//// info.add(resbox1.getText());
		//// info.add(coursbox1.getText());
		//
		// createFile(MainUI.namebox1.getText(), path, ext, info);
		//
		// MainUI.root2.dispose();
		// MainUI.root1.dispose();
	}

	public static void createCourse() {
		System.out.println("Create course!!!");
		// String path =
		// "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Courses\\";
		// String ext = ".course";
		// String which = "";
		// String grade = "";
		// ArrayList<String> info = new ArrayList<String>();
		//
		// if (MainUI.enbutt1.isSelected()) {
		// which = "true";
		// if (MainUI.abutt1.isSelected()) grade = "A";
		// if (MainUI.bbutt1.isSelected()) grade = "B";
		// if (MainUI.cbutt1.isSelected()) grade = "C";
		// if (MainUI.nrbutt1.isSelected()) grade = "NR";
		// if (MainUI.lbutt1.isSelected()) grade = "L";
		// if (MainUI.ibutt1.isSelected()) grade = "I";
		// if (MainUI.nfbutt1.isSelected()) grade = "**";
		// }
		// if (MainUI.enbutt2.isSelected()) {
		// which = "false";
		// grade = "N/A";
		// }
		//
		// info.add(MainUI.namebox2.getText());
		// info.add((String)MainUI.depbox2.getSelectedItem());
		// info.add(MainUI.numbox1.getText());
		// info.add((String)MainUI.probox2.getSelectedItem());
		// info.add((String)MainUI.tabox2.getSelectedItem());
		// info.add(MainUI.creditsbox1.getText());
		// info.add(which);
		// info.add(grade);
		//
		// createFile(MainUI.namebox2.getText(), path, ext, info);
		//
		// MainUI.root3.dispose();
	}

	public static void finishSched() {
		System.out.println("Finish Schedule");
	}

	public static void createDegree() {
		System.out.println("Create degree!!!");
		// String path = "";
		// String ext = "";
		// ArrayList<String> info = new ArrayList<String>();
		//
		// if (MainUI.degbutt1.isSelected()){
		// path =
		// "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Undergrad
		// Degrees\\";
		// info.add(MainUI.namebox3.getText());
		// info.add((String)MainUI.typebox1.getSelectedItem());
		// if ((String)MainUI.typebox1.getSelectedItem() == "Major") ext =
		// ".major";
		// if ((String)MainUI.typebox1.getSelectedItem() == "Minor") ext =
		// ".minor";
		// if ((String)MainUI.typebox1.getSelectedItem() == "WPI") ext =
		// ".under";
		// }
		// if (MainUI.degbutt2.isSelected()){
		// path =
		// "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Grad
		// Degrees";
		// ext = ".grad";
		// info.add(MainUI.namebox3.getText());
		// }
		//
		// createFile(MainUI.namebox3.getText(), path, ext, info);
		//
		// MainUI.root5.dispose();
	}

	public static void createRequire() {
		System.out.println("Create Requirement");
		// String path =
		// "C:\\Users\\Nicole\\Desktop\\Coding\\Java\\Organizer\\Data\\Requirements\\";
		// String ext = ".require";
		// String which = "";
		// String[] req = {};
		// String reqs = "";
		// String[] course = {};
		// String courses = "";
		// ArrayList<String> info = new ArrayList<String>();
		//
		// if(MainUI.degbutt3.isSelected()) which = "true";
		// if(MainUI.degbutt4.isSelected()) which = "false";
		//
		// req = MainUI.reqbox.getText().split("\n");
		// int i = 0;
		// while(i<req.length){
		// if (i == req.length-1) reqs = reqs + req[i];
		// else reqs = reqs + req[i] + ",";
		// i++;
		// }
		//
		// course = MainUI.coursebox1.getText().split("\n");
		// i = 0;
		// while(i<course.length){
		// courses = courses + course[i] + ",";
		// i++;
		// }
		//
		// info.add(MainUI.namebox4.getText());
		// info.add(which);
		// info.add((String)MainUI.degbox1.getSelectedItem());
		// info.add(MainUI.creditsbox2.getText());
		// info.add(reqs);
		// info.add(courses);
		//
		// createFile(MainUI.namebox4.getText(), path, ext, info);
		//
		// MainUI.root6.dispose();
	}

}
