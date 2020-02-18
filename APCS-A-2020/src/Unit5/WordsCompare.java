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
	private static String wordOne, wordTwo;

	public static void compareCheck(String one, String two)
	{
		for(int a = 0; a<one.length() || a<two.length(); a++) {
			wordOne = one;
			wordTwo = two;
			if (wordOne.charAt(a)>wordTwo.charAt(a)){
				System.out.println(wordTwo+" should be placed before "+wordOne);
			}
			else if (wordTwo.charAt(a)>wordOne.charAt(a)) {
				System.out.println(wordTwo+" should be placed after "+wordOne);
			}
			else {
				a++;
			}
		}
	}
}