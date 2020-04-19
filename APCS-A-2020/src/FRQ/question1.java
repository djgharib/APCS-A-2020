package FRQ;

public class question1 {

	/*public static int[] getCubeTosses(NumberCube cube, int numTosses) {
		int[] valueArray = new int[numTosses];
		for (int i = 0; i<10; i++) {
			valueArray[i] = cube.toss();
		}
		return valueArray;
	}*/
	
	public static int getLongestRun (int[] values) {
		int length = 1;
		for(int i = 1; i<values.length; i++) {
			if(values[i] == values[i-1]) {
				length++;
			}
			if(values[i] != values[i-1]) {
				length=1;
				
			}
		}
		return length;
	}
}
