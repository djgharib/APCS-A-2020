package FinalProject2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import Starfighter.Alien;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;  

public class ReadWrite {
	String thisLine = "";

	public ReadWrite() {
		
	}
	
	public ArrayList<Object> read(String filepath) throws IOException {
		ArrayList<Object> Objects = new ArrayList<Object>();
		Scanner file = new Scanner(new File(filepath));
		while (file.hasNextLine()) {
			thisLine = file.nextLine();
			if(thisLine.charAt(0) == 'B') {
				thisLine.substring(1,3);
			}
			else if(thisLine.charAt(0) == 'P') {
				
			}
		}
		
		return Objects;
	}
}
