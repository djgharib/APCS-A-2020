package ToyStore;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner {
	public static void main(String args[]) {
		ToyStore39 sto = new ToyStore39();
		System.out.println(sto);
		sto.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(sto);
		System.out.println("max == " + sto.getMostFrequentToy());
	}
}