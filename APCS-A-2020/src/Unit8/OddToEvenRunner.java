package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		int[] array = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		System.out.println(RayOddToEven.go(array));
		
		int[] array2 = {11,9,8,7,6,5,4,3,2,1,-99,7};
		System.out.println(RayOddToEven.go(array2));
		
		int[] array3 = {9,11,11,11,7,1000,3};
		System.out.println(RayOddToEven.go(array3));
		
		int[] array4 = {2,4,6,8,8};
		System.out.println(RayOddToEven.go(array4));
		
		
	}
}