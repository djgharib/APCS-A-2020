package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	private static double x, y;
	public static double check(double a, double b )
	{
		x = a;
		y = b;
		if (x>y) {
			return (x-y);
		}
		else if(x<y) {
			return (y-x);
		}
		else {
			return (x*y);
		}
	}
}