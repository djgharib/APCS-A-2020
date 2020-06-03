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
	
	public String getDate() {
		return date;
	}
	
	public int getAppearance() {
		return appearance;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getOwner() {
		return owner;
	}
}
