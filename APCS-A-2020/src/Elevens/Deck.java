package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck{
	public static final int NUMCARDS = 52;
	public static String[] FACE = "ACE TWO THREE FOUR FIVE SIX SEVEN EIGHT NINE TEN JACK QUEEN KING".split(" ");
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	private List<Card> cards;
	private int top;
	private int size;

   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	public Deck() {
   		cards = new ArrayList<Card>();
   		for(int i = 1; i<=4; i++) {
   			for(int x = 1; i<=13; i++) {
   				
   				cards.add(new Card(SUITS[i], x));
   			}
   		}
   	}
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
}