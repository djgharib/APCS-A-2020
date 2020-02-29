package Unit9;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
		System.out.println(ListOddToEven.go(arrayList));
		
		ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
		System.out.println(ListOddToEven.go(arrayList2));
		
		ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(10,20,30,40,5,41,31,20,11,7));
		System.out.println(ListOddToEven.go(arrayList3));
		
		ArrayList<Integer> arrayList4 = new ArrayList<>(Arrays.asList(32767,70,4,5,6,7));
		System.out.println(ListOddToEven.go(arrayList4));
		
		ArrayList<Integer> arrayList5 = new ArrayList<>(Arrays.asList(2,7,11,21,5,7));
		System.out.println(ListOddToEven.go(arrayList5));
	}
}