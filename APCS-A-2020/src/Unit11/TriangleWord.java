package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String tempWord = "";
		for(int i = 0; i<=word.length(); i++) {
			for(int x = 0; x<i; x++) {
				System.out.print(word.substring(0,i));
			}
			System.out.println();
		}
	}
}