package Elevens;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Card {
	public static final String FACES[] = { "ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE", "TEN", "JACK", "QUEEN", "KING" };

	// instance variables
	private String suit;
	private String face;
	private int ptValue;

	// constructors

	public Card(String cardSuit, String cardFace) {
		suit = cardSuit;
		face = cardFace;
	}

	/*public Card(String cardSuit, String cardFace, int cardPtValue) {
		suit = cardSuit;
		face = cardFace;
		ptValue = cardPtValue;
	}*/

	public String getSuit() {
		return suit;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String newFace) {
		face = newFace;
	}

	// modifiers
	// set methods

	// accessors
	// get methods

	// toString
	public String toString() {

		return face + " of " + suit;
	}
}