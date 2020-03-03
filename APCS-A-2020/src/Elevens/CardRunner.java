package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.awt.Color;

public class CardRunner
{
	public static void main( String args[] )
	{
		Card one = new Card("SPADES", "NINE");
		out.println(one.getSuit());
		out.println(one.getFace());

		Card two = new Card("DIAMONDS", "ONE");
		out.println(two);
		two.setFace("THREE");
		out.println(two);

		Card three = new Card("CLUBS", "FOUR");
		out.println(three);

		Card four = new Card("SPADES", "QUEEN");
		out.println(four);

		Card five = new Card("HEARTS", "QUEEN");
		out.println(five);
	}
}