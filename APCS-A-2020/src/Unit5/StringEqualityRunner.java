package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality.stringCheck("hello", "goodbye");
		StringEquality.stringCheck("one", "two");
		StringEquality.stringCheck("three", "four");
		StringEquality.stringCheck("TCEA", "UIL");
		StringEquality.stringCheck("State", "Champions");
		StringEquality.stringCheck("ABC", "ABC");
		StringEquality.stringCheck("ABC", "CBA");
		StringEquality.stringCheck("Same", "Same");
		
	}
}