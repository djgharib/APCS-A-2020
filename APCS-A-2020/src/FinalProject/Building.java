package FinalProject;

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Comparable;

public class Building {
	private String buildingType;
	private int buildingSize;
	private int buildingCost;

	public Building() {
		setType("");
		setSize(1);
		setCost(1);
	}

	public Building(String type, int size, int cost) {
		setType(type);
		setSize(size);
		setCost(cost);
	}

	public void setType(String type) {
		buildingType = type;
	}

	public void setSize(int size) {
		buildingSize = size;
	}

	public void setCost(int cost) {
		buildingCost = cost;
	}

	public int getCost() {
		return buildingCost;
	}

	public int getSize() {
		return buildingSize;
	}

	public String getType() {
		return buildingType;
	}

	public String toString() {
		return buildingType + " " + buildingCost + " " + buildingSize;
	}
}
