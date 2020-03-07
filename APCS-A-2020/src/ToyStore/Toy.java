package ToyStore;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		count = 1;
		name = " ";
	}

	public Toy(String nm)
	{
		count = 1;
		name = nm;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return name + " " + count;
	}
}