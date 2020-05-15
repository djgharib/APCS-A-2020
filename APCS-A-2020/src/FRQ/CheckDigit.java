package FRQ;

public class CheckDigit {
	// WRITING this method is
	// NOT part of the sample question
	// needed in order to type up and
	// test student code
	// Returns the check digit for num
	// Pre: The number of digits in num is >=1 and <=6 and num >= 0
	public static int getCheck(int num) {
		// made up a check algorithm
		// just for fun

		// sum all odd digits
		// multiply sum by 3
		// mod sum by 10

		int sum = 0;
		while (num > 0) {
			int dig = num % 10;
			if (dig % 2 != 0)
				sum += dig;
			num /= 10;
		}
		sum *= 3;
		return sum % 10;
	}
	
	public static boolean isValid(int num) {
		String number = Integer.toString(num);
		int checkNum = Character.getNumericValue(number.charAt(number.length()-1));
		if(getCheck(Integer.parseInt(number.substring(0, number.length()-1))) != checkNum) {
			return false;
		}
		return true;
	}
}