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
		for (int z = amount; z > 0; z--) {
			for (int n = amount; n > 0; n--) {
				for (int i = amount; i > 0; i--) {
					System.out.print(letter);
				}
				System.out.print(" ");
				letter--;
				amount--;
			}
			amount = amt;
			letter = letterOverride;
			System.out.println();
		}
	}

	public String toString() {

		String output = "";
		return output;
	}
}