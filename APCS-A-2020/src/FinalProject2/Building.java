package FinalProject2;

public class Building implements Object {
	private String name;
	private String date;
	private int appearance;
	private int size;
	private String owner;
	
	
	public Building() {
		
	}
	
	public Building( String nm, String dt, int app, int sz, String own) {
		name = nm;
		date = dt;
		appearance = app;
		size = sz;
		owner = own;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String dt) {
		date = dt;
	}
	
	public int getAppearance() {
		return appearance;
	}
	
	public void setAppearance(int app) {
		appearance = app;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int sz) {
		size = sz;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String own) {
		owner = own;
	}
	
	public String toString() {
		return "B," + name + ","+date+","+appearance+","+size+","+owner+",";
	}
}
