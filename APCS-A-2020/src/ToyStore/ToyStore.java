package ToyStore;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	public String[] toyArray;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		int wordCount = 1;
		for (int i = 0; i<toys.length(); i++) {
			if(toys.charAt(i) == ' ') {
				wordCount++;
			}
		}
		String[] toyArray = new String[wordCount];
		int lastSpace = 0;
		wordCount = 0;
		for (int i = 0; i<toys.length(); i++) {
			if(toys.charAt(i) == ' ') {
				toyArray[wordCount] = (toys.substring(lastSpace, i));
				wordCount++;
				lastSpace = i+1;
			}
			if(i == toys.length()-1) {
				toyArray[wordCount] = (toys.substring(lastSpace, i+1));
			}
		}
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		ArrayList<String> arrayCheck = new ArrayList<String>();
  		ArrayList<Integer> numCheckArray = new ArrayList<Integer>();
  		for (int x = 0; x<toyArray.length; x++) {
  			arrayCheck.add(toyArray[x]);
  		}
  		for(int x = 0; x<arrayCheck.size(); x++) {
  			for(int y = 1; y<=arrayCheck.size(); y++) {
  				if(arrayCheck.get(y)==arrayCheck.get(x)) {
  					
  				}
  			}
  		}
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}