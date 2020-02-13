package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		//add in input
		out.print("Enter a number :: ");
		int n = keyboard.nextInt();
		System.out.println(n+" is odd :: " + NumberVerify.isOdd(n));
		System.out.println(n+" is even :: " + NumberVerify.isEven(n));
		
		//add in more test cases
	}
}