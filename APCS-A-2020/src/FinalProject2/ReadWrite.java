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
	
	public static ArrayList<Person> read(File filepath) throws IOException {
		ArrayList<Person> Objects = new ArrayList<Person>();
		Scanner file = new Scanner(filepath);
		while (file.hasNextLine()) {
			thisLine = file.nextLine();
			if(thisLine.charAt(0) == 'B') {
				
				Objects.add(new Person("","",1,1,""));
			}
			else if(thisLine.charAt(0) == 'P') {
				System.out.println(thisLine.substring(2,7));
			}
		}
		file.close();
		return Objects;
	}
	
	public static void write(ArrayList<Person> objectList) throws IOException {
		PrintWriter printWriter = new PrintWriter("Info.dat");
	    for(int i = 0; i<objectList.size();i++) {
	    	printWriter.println(objectList.get(i).toString());
	    }
	    printWriter.close();
	}
}
