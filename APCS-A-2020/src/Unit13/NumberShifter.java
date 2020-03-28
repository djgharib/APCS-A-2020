package Unit13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import ToyStore.Toy;

import java.io.File;
import java.io.IOException;
import java.sql.Array;

import static java.lang.System.*;

public class NumberShifter {
	public static int[] makeLucky7Array(int size) {
		int[] luckyArray = new int[size];
		for(int x:luckyArray) {
			luckyArray[x] = (int) (Math.random() * 10 + 1);
		}
		return luckyArray;
	}

	public static void shiftEm(int[] array) {
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		for (int x : array) {
			if (array[x] == 7) {
				array[x] = 50;
				array2.add(x);
			}
		}
		for (int x : array) {
			if (array[x] != 50) {
				array2.add(x);
			}
		}
		for (int x : array2) {
			array[x] = array2.get(x);
		}
		return array;
	}
}