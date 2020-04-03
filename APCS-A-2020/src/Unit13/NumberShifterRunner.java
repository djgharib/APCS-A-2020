package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] stuff = new int[] {3, 61, 15, 11, 7, 9, 2};
		for(int i=1; i<5; ++i) {
			int val = stuff[i];
			int j=i;
			while(j>0&&val<stuff[j-1]) {
				stuff[j]=stuff[j-1];
				j--;
			}
			stuff[j]=val;
		}
		System.out.println(Arrays.toString(stuff));
		System.out.println(Arrays.toString(NumberShifter.shiftEm(NumberShifter.makeLucky7Array(20))));
		System.out.println(Arrays.toString(NumberShifter.shiftEm(NumberShifter.makeLucky7Array(20))));
		System.out.println();
		System.out.println(Arrays.toString(NumberShifter.shiftEm(NumberShifter.makeLucky7Array(20))));
		System.out.println(Arrays.toString(NumberShifter.shiftEm(NumberShifter.makeLucky7Array(20))));
		System.out.println();
		System.out.println(Arrays.toString(NumberShifter.shiftEm(NumberShifter.makeLucky7Array(20))));
		System.out.println(Arrays.toString(NumberShifter.shiftEm(NumberShifter.makeLucky7Array(20))));
		
	}
}



