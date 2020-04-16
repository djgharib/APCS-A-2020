package FinalProject;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.lang.Comparable;

public class Street {
	static private String streetName;
	static private int cheapestBuilding;
	static private int mostExpensiveBuilding;
	ArrayList<Building> streetContents = new ArrayList<Building>();
	public static void main(String[] args) {

	}

	public Street(int number) throws IOException {
		streetContents.clear();
		Scanner file = new Scanner(new File("C:\\Users\\Daniel\\Desktop\\Eclipse Workspace\\APCS-A-2020\\APCS-A-2020\\src\\FinalProject\\Neighborhood.dat"));
		streetName = file.nextLine();
		String buildingInfo = "";
		String buildingType = "";
		String buildingSize = "";
		String buildingCost = "";
		int typeEnd = 0;
		int sizeEnd = 0;
		int costEnd = 0;
		int x = 0;
		buildingInfo = file.nextLine();
		String test = "";
		while (x<number) {
			test = file.nextLine();
			if(test.equals("||")) {
				x++;
			}
		}
		while (!buildingInfo.equals("||")) {
			for (int i = 0; i < buildingInfo.length(); i++) {
				if (buildingInfo.charAt(i) == ';') {
					buildingType = buildingInfo.substring(0, i);
					typeEnd = i;
					break;
				}
			}
			for (int i = typeEnd; i < buildingInfo.length(); i++) {
				if (buildingInfo.charAt(i) == ',') {
					sizeEnd = i;
					buildingSize = buildingInfo.substring(typeEnd + 2, sizeEnd);
					break;
				}
			}
			for (int i = sizeEnd; i < buildingInfo.length(); i++) {
				if (buildingInfo.charAt(i) == ';') {
					costEnd = i;
					buildingCost = buildingInfo.substring(sizeEnd + 2, costEnd);
					break;
				}
			}
			int intCost = Integer.parseInt(buildingCost);
			int intSize = Integer.parseInt(buildingSize);
			
			streetContents.add(new Building(buildingType, intSize, intCost));
			buildingInfo = file.nextLine();
		}
		System.out.println(streetName + streetContents);
	}

	public String getName() {
		return streetName;
	}

	/*public int getCheap() {
		cheapestBuilding = streetContents.get(0).getCost();
		for (int i = 1; i < streetContents.size(); i++) {
			if (streetContents.get(i).getCost() < cheapestBuilding) {
				cheapestBuilding = streetContents.get(i).getCost();
			}
		}
		System.out.println(cheapestBuilding);
		return cheapestBuilding;
	}

	public int getExpensive() {
		mostExpensiveBuilding = streetContents.get(0).getCost();
		for (int i = 1; i < streetContents.size(); i++) {
			if (streetContents.get(i).getCost() > mostExpensiveBuilding) {
				mostExpensiveBuilding = streetContents.get(i).getCost();
			}
		}
		System.out.println(mostExpensiveBuilding);
		return mostExpensiveBuilding;
	}*/
	
	//public String toString() {
		//return Arrays.toString;
	//}
}
