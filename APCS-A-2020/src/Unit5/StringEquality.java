package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	public static String wordOne, wordTwo;

	public static boolean stringCheck(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
		if(wordOne.compareTo(wordTwo)==0) {
			System.out.println(wordOne + " has the same letters as " + wordTwo + ".");
			return true;
		}
		else {
			System.out.println(wordOne + " does not have the same letters as " + wordTwo + ".");
			return false;
		}
	}
}