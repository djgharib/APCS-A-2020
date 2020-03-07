package Unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies {
	private Dog[] pups;

	public Doggies(int size) {
		// point pups at a new array of Dog
		pups = new Dog[size];
	}

	public void set(int spot, int age, String name) {
		pups[spot] = new Dog(age, name);
		// put a new Dog in the array at spot
		// make sure spot is in bounds
	}

	public String getNameOfOldest() {
		int oldest = 0;
		for(int i = 0; i<pups.length; i++) {
			if(pups[oldest].getAge()<pups[i].getAge()) {
				oldest = i;
			}
		}
		return pups[oldest].getName();
	}

	public String getNameOfYoungest() {
		int youngest = 0;
		for(int i = 0; i<pups.length; i++) {
			if(pups[youngest].getAge()>pups[i].getAge()) {
				youngest = i;
			}
		}
		return pups[youngest].getName();
	}

	public String toString() {
		return "" + Arrays.toString(pups);
	}
}