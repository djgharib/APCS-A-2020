package ToyStore;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy giJoe = new Toy("gi joe");
        Toy sorry = new Toy("sorry");
        out.println(giJoe.toString());
        out.println(sorry.toString());
	}
}