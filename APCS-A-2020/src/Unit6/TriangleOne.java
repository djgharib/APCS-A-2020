package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	public static void construct(String s)
	{
		for (int x=s.length(); x>0; x--) {
			System.out.println(s.substring(0, x));
		}
	}
}