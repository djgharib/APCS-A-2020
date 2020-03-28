package Unit13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.sql.Array;

import static java.lang.System.*;

public class NumberShifter {
	public static int[] makeLucky7Array(int size) {
		int[] luckyArray = new int[size];
		for(int x = 0; x<luckyArray.length; x++) {
			luckyArray[x] = (int)(Math.random() * ((10 - 1) + 1)) + 1;
		}
		return luckyArray;
	}

	public static int[] shiftEm(int[] array) {
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		for (int x = 0; x<array.length; x++) {
			if (array[x] == 7) {
				array2.add(array[x]);
				array[x] = 50;
			}
		}
		for (int y = 0; y<array.length; y++) {
			if (array[y] != 50) {
				array2.add(array[y]);
			}
		}
		for (int z = 0; z<array2.size(); z++) {
			array[z] = array2.get(z);
		}
		return array;
	}
	public String toString() {
		return "";
	}
}