package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private static String wordOne, wordTwo, x;

	public static void compareCheck(String one, String two)
	{
			if(one.compareTo(two)>0) {
				System.out.println(one+" should be placed before "+two);
			}
			else if (one.compareTo(two)<0) {
				System.out.println(one+" should be placed after "+two);
			}
}
}