package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private static int number, num1;

	//add constructors

	//add a set method

	public static boolean isPerfect(int num)
	{
		number = 0;
		num1 = num;
		for (int i = 1; i<num; i++) {
			if(num%i ==0) {
				number+=i;
			}
		}
		if (number == num) {
			return true;
		}
		else {
			return false;
		}
	}

	public static String toString(boolean perfection) {
		if (perfection == true) {
			return num1 + " is perfect.";
		}
		else {
			return num1 + " is not perfect.";
		}
	}
	
}