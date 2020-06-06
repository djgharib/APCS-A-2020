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
		int appearance = 0;
		int height = 0;
		String job = "";
		int comma1 = 0;
		int comma2 = 0;
		int comma3 = 0;
		int comma4 = 0;
		int comma5 = 0;
		int comma6 = 0;
		do {
			if(thisLine.charAt(0) == 'P') {
				for (int i = 1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma1 = i;
						break;
					}
				}
				for (int i = comma1+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma2 = i;
						name = thisLine.substring(comma1+1, comma2);
						break;
					}
				}
				for (int i = comma2+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma3 = i;
						date = thisLine.substring(comma2+1, comma3);
						break;
					}
				}
				for (int i = comma3+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma4 = i;
						appearance = Integer.parseInt(thisLine.substring(comma3+1, comma4));
						break;
					}
				}
				for (int i = comma4+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma5 = i;
						height = Integer.parseInt(thisLine.substring(comma4+1, comma5));
						break;
					}
				}
				for (int i = comma5+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ';') {
						comma6 = i;
						job = thisLine.substring(comma5+1, comma6);
						break;
					}
				}
				Objects.add(new Person(name,date,appearance,height,job));
			}
			else if(thisLine.charAt(0) == 'B') {
				
			}
			thisLine = file.nextLine();
		} while(file.hasNextLine());
		file.close();
		System.out.println(Objects);
		return Objects;
	}
	
	public static ArrayList<Building> buildingRead(File filepath) throws IOException {
		ArrayList<Building> Objects = new ArrayList<Building>();
		Scanner file = new Scanner(filepath);
		thisLine = file.nextLine();
		String name = "";
		String date = "";
		int appearance = 0;
		int size = 0;
		String owner = "";
		int comma1 = 0;
		int comma2 = 0;
		int comma3 = 0;
		int comma4 = 0;
		int comma5 = 0;
		int comma6 = 0;
		do {
			if(thisLine.charAt(0) == 'P') {
				for (int i = 1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma1 = i;
						break;
					}
				}
				for (int i = comma1+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma2 = i;
						name = thisLine.substring(comma1+1, comma2);
						break;
					}
				}
				for (int i = comma2+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma3 = i;
						date = thisLine.substring(comma2+1, comma3);
						break;
					}
				}
				for (int i = comma3+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma4 = i;
						appearance = Integer.parseInt(thisLine.substring(comma3+1, comma4));
						break;
					}
				}
				for (int i = comma4+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ',') {
						comma5 = i;
						size = Integer.parseInt(thisLine.substring(comma4+1, comma5));
						break;
					}
				}
				for (int i = comma5+1; i < thisLine.length(); i++) {
					if (thisLine.charAt(i) == ';') {
						comma6 = i;
						owner = thisLine.substring(comma5+1, comma6);
						break;
					}
				}
				
			}
			else if(thisLine.charAt(0) == 'B') {
				
			}
			Objects.add(new Building(name,date,appearance,size,owner));
			thisLine = file.nextLine();
		} while(file.hasNextLine());
		file.close();
		return Objects;
	}
	
	public static void write(ArrayList<Person> personList, ArrayList<Building> buildingList) throws IOException {
		PrintWriter printWriter = new PrintWriter("C:\\Users\\Daniel\\Desktop\\Eclipse Workspace\\APCS-A-2020\\APCS-A-2020\\src\\FinalProject2\\Info.dat");
	    for(int i = 0; i<personList.size();i++) {
	    	
	    		printWriter.println(personList.get(i).toString());
	    }
	    for(int i = 0; i<buildingList.size();i++) {
	    	
    		printWriter.println(buildingList.get(i).toString());
    }
	    printWriter.close();
	}
}
