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

	public ReadWrite() {
		
	}
	
	public static ArrayList<Person> personRead(File filepath) throws IOException {
		ArrayList<Person> Objects = new ArrayList<Person>();
		Scanner file = new Scanner(filepath);
		thisLine = file.nextLine();
		String name = "";
		String date = "";
		String job = "";
		int appearance = 0;
		int height = 0;
		int comma1 = 0;
		int comma2 = 0;
		int comma3 = 0;
		int comma4 = 0;
		int comma5 = 0;
		int comma6 = 0;
		int lineCount = 0;
		do {
			if(thisLine.charAt(0) == 'P') {
				for (int i = 1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma1 = i;
						System.out.println(comma1);
						break;
					}
				}
				for (int i = comma1+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma2 = i;
						System.out.println(comma2);
						name = thisLine.substring(comma1+1, comma2);
						break;
					}
				}
				for (int i = comma2+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma3 = i;
						System.out.println(comma3);
						date = thisLine.substring(comma2+1, comma3);
						break;
					}
				}
				for (int i = comma3+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma4 = i;
						System.out.println(comma4);
						appearance = Integer.parseInt(thisLine.substring(comma3+1, comma4));
						break;
					}
				}
				for (int i = comma4+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma5 = i;
						System.out.println(comma5);
						height = Integer.parseInt(thisLine.substring(comma4+1, comma5));
						break;
					}
				}
				for (int i = comma5+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ';') {
						comma6 = i;
						System.out.println(comma6);
						job = thisLine.substring(comma5+1, comma6);
						break;
					}
				}
				
			}
			else if(thisLine.charAt(0) == 'B') {
				
			}
			Objects.get(lineCount).setName(name);
			Objects.get(lineCount).setDate(date);
			Objects.get(lineCount).setAppearance(appearance);
			Objects.get(lineCount).setHeight(height);
			Objects.get(lineCount).setJob(job);
			
			System.out.println(Objects.get(lineCount));
			lineCount++;
			thisLine = file.nextLine();
		} while(file.hasNextLine());
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
