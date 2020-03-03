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
   		for(int i = 0; i<SUITS.length; i++) {
   			for(int x = 0; x<13; x++) {
   				cards.add(new Card(SUITS[i], FACE[x]));
   			}
   		}
   		size = cards.size();
   		top = size-1;
   	}
   //make a dealCard() method that returns the top card
   public Card dealCard() {
	   Card topCard = cards.get(top);
	   top--;
	   size--;
	   return topCard;
   }
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
   public List shuffle() {
	   size = cards.size();
	   top = size-1;
	   Collections.shuffle(cards);
	   return cards;
   }
   
   
   
   	public String toString(){
   		String temp = "";
   		for(int x = 0; x<cards.size(); x++) {
   			temp+="\n" + cards.get(x);
   		}
   		return temp;
   	}
}