package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.Arrays;

public class SumFirstRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
		System.out.println(ListSumFirst.go(arrayList));
		
		ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(ListSumFirst.go(arrayList2));
		
		ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(ListSumFirst.go(arrayList3));
		
		ArrayList<Integer> arrayList4 = new ArrayList<>(Arrays.asList(32767));
		System.out.println(ListSumFirst.go(arrayList4));
		
		

	}
}