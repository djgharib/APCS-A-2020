package FRQ;

import java.util.*;

public class test {
	public static void main(String[] args) {
		//int[] data = { 1, 2, 3, 4, 4, 4, 1, 1, 2, 3, 4, 8, 8, 8, 8, 8 };
		//question1.getLongestRun(data);
		//question2.getChargeStartTime(30);
		
		int length = 0;
		int value = 0;
		int value1 = 0;
		int value2 = 0;
		int maxlength = 0;
		int highestI = 0;
		for(int i = 1; i<1000; i++) {
			length = 2;
			value2 = 1000;
			value1 = i;
			value = 0;
			while(value>=0) {
				value = value2-value1;
				length++;
				value2 = value1;
				value1 = value;
				if(length>maxlength) {
					maxlength = length;
					highestI = i;
				}
			}
		}
		System.out.println(maxlength);
		System.out.println(highestI);
	}
	public void newValues (int value, int value2) {
		
	}
}
