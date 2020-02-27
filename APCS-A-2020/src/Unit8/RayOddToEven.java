package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddPos=0;
		int evenPos = 0;
		for(int i = 0; i<ray.length; i++) {
			if(findOdd(ray[i])==true) {
				oddPos = i;
				for(int x = i; x<ray.length; x++) {
					if(findOdd(ray[x])==false) {
						evenPos = x;
						return Math.abs(oddPos-evenPos);
					}
					if (findOdd(ray[x])==true && x==ray.length-1) {
						return -1;
					}
				}
			}
			if (findOdd(ray[i])==false && i==ray.length-1) {
				return -1;
			}
		}
		return -1;
	}
	
	public static boolean findOdd(int a) {
		if(a%2==0) {
			return false;
		}
		else {
			return true;
		}
	}
}