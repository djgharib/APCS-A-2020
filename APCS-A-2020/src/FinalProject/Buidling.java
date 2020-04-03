package FinalProject;

public class Buidling{
	private String buildingType;
	private int buildingSize;
	private int buildingCost;

	public void Building() {
		setType("");
		setSize(0);
		setCost(0);
	}

	public void Building(String type, int size) {
		setType(type);
		setSize(size);
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
}
