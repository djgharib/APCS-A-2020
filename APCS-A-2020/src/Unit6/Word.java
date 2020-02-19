package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;



	public static void wordCheck(String s)
	{
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		for(int x = s.length()-1; x>-1; x--) {
			System.out.print(s.charAt(x));
		}
		System.out.println("\n" + s);
	}


}