package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int length = 0;
		int x = 1;
		boolean lessThan = false;
		while (lessThan == false) {
			if(number / x == 0) {
				lessThan = true;
			}
			else{
				x = 10*x;
				length++;
			}
		}
		return length;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int y = 0;
		while (number > 0) {
		    sorted[y] = number % 10;
		    number = number / 10;
		    y++;
		}
		Arrays.sort(sorted);
		return sorted;
	}
}