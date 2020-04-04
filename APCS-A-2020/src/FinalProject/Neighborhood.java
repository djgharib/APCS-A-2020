package FinalProject;

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Neighborhood {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("C:\\Users\\Daniel\\Desktop\\Eclipse Workspace\\APCS-A-2020\\APCS-A-2020\\src\\FinalProject\\Neighborhood.dat"));
		int streetCount = 0;
		String thisLine = "";
		while(file.hasNextLine()) {
			thisLine = file.nextLine();
			if(thisLine.equals("||")) {
				streetCount++;
			}
		}
		
	}
}
