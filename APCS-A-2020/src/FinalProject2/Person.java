package FinalProject2;

public class Person implements Object {
	private String name;
	private String date;
	private int appearance;
	private int height;
	private String job;
	
	
	public Person() {
		this("","",0,0,"");
	}
	
	public Person( String nm, String dt, int app, int hei, String jb) {
		name = nm;
		date = dt;
		appearance = app;
		height = hei;
		job = jb;
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
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int hei) {
		height = hei;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String jb) {
		job = jb;
	}
	
	public String toString() {
		return "P," + name + ","+date+","+appearance+","+height+","+job+";";
	}
}
