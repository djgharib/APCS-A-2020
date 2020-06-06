package FinalProject2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import Starfighter.Alien;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;  

public class ReadWrite {
	static String thisLine = "";
	private static int comma1;
	private static int comma2;

	public ReadWrite() {
		
	}
	
	public static ArrayList<Person> personRead(File filepath) throws IOException {
		ArrayList<Person> Objects = new ArrayList<Person>();
		Scanner file = new Scanner(filepath);
		String name = "";
		String date = "";
		int appearance = 0;
		int height = 0;
		String job = "";
		while (file.hasNextLine()) {
			if(thisLine.charAt(0) == 'P') {
				
			}
			else if(thisLine.charAt(0) == 'B') {
				
			}
		}
		file.close();
		return Objects;
	}
	
	/*public static ArrayList<Building> buildingRead(File filepath) throws IOException {
		ArrayList<Building> Objects = new ArrayList<Building>();
		Scanner file = new Scanner(filepath);
		while (file.hasNextLine()) {
			thisLine = file.nextLine();
			if(thisLine.charAt(0) == 'B') {
				
				Objects.add(new Building(thisLine.substring(comma1, comma2),thisLine.substring(comma2, comma3),Integer.parseInt(thisLine.substring(comma3, comma4)),Integer.parseInt(thisLine.substring(comma4, comma5)),thisLine.substring(comma5, end)));
			}
			else if(thisLine.charAt(0) == 'P') {
				
			}
		}
		file.close();
		return Objects;
	}*/
	
	public static void personWrite(ArrayList<Person> personList) throws IOException {
		PrintWriter printWriter = new PrintWriter("C:\\Users\\Daniel\\Desktop\\Eclipse Workspace\\APCS-A-2020\\APCS-A-2020\\src\\FinalProject2\\Info.dat");
	    for(int i = 0; i<personList.size();i++) {
	    	printWriter.println(personList.get(i).toString());
	    }
	    printWriter.close();
	}
	
	public static void buildingWrite(ArrayList<Building> buildingList) throws IOException {
		PrintWriter printWriter = new PrintWriter("C:\\Users\\Daniel\\Desktop\\Eclipse Workspace\\APCS-A-2020\\APCS-A-2020\\src\\FinalProject2\\Info.dat");
	    for(int i = 0; i<buildingList.size();i++) {
	    	printWriter.println(buildingList.get(i).toString());
	    }
	    printWriter.close();
	}
}
