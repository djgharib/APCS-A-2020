package FinalProject;

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Neighborhood {

	int streetCount = 0;

	String thisLine = "";

	public static void main(String[] args) {

	}

	public Neighborhood() throws IOException {
		Scanner file = new Scanner(new File("C:\\Users\\Daniel\\Desktop\\Eclipse Workspace\\APCS-A-2020\\APCS-A-2020\\src\\FinalProject\\Neighborhood.dat"));

		while (file.hasNextLine()) {
			thisLine = file.nextLine();
			if (thisLine.equals("||")) {
				streetCount++;
			}
		}
		Street[] neighborhood = new Street[streetCount];
		for (int i = 0; i < streetCount; i++) {
			neighborhood[i] = new Street(i);
		}
		System.out.println(Arrays.toString(neighborhood));
	}

}
