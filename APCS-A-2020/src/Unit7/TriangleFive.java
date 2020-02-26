package Unit7;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive {
	private static char letter;
	private static int amount;
	private static char letterOverride;

	public TriangleFive() {
	}

	public TriangleFive(char c, int amt) {
		letter = c;
		amount = amt;
	}

	public static void setLetter(char c) {
		letter = c;
		letterOverride = c;
	}

	public static void setAmount(int amt) {
		amount = amt;
		int length = amt;
		int rowControl = amt;
		for(int rowPrint = 1; rowPrint<=amt; rowPrint++) {
			letter = letterOverride;
			for(int row = 1; row<=rowControl; row++) {
				for(int tempLength = 1; tempLength<=length; tempLength++) {
					System.out.print(letter);
				}
				System.out.print(" ");
				letter++;
				length--;
				if(letter>90) {
					letter=65;
				}
				
			}
			length = amt;
			rowControl--;
			System.out.println();
		}
		System.out.println();
	}

	public String toString() {

		String output = "";
		return output;
	}
}