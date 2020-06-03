package FinalProject2;

public class Person implements Object {
	private String name;
	private String date;
	private int appearance;
	private int height;
	private String job;
	
	
	public Person() {
		
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
	
	public String getDate() {
		return date;
	}
	
	public int getAppearance() {
		return appearance;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String getJob() {
		return job;
	}
}
