package FinalProject2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import Starfighter.Alien;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;  

public class ReadWrite {
	static String thisLine = "";

	public ReadWrite() {
		
	}
	
	public static ArrayList<Object> read(File filepath) throws IOException {
		ArrayList<Object> Objects = new ArrayList<Object>();
		Scanner file = new Scanner(filepath);
		while (file.hasNextLine()) {
			thisLine = file.nextLine();
			if(thisLine.charAt(0) == 'B') {
				System.out.println(thisLine.substring(1,3));
			}
			else if(thisLine.charAt(0) == 'P') {
				System.out.println(thisLine.substring(1,3));
			}
		}
		
		return Objects;
	}
	
	public void write(ArrayList<Object> objectList) throws FileNotFoundException {
		try (PrintWriter out = new PrintWriter("Info.dat")) {
		    out.println();
		}
	}
}