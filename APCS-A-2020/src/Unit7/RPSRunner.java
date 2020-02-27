package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		boolean keepPlaying = true;
		
		//add in a do while loop after you get the basics up and running
		
		
			out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
			String playerChoice = keyboard.next();
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(playerChoice);
			System.out.println(game.toString(game.determineWinner()));
			System.out.println();
			
			while(keepPlaying = true) {
				out.print("Do you want to play again? [Y/N] :: ");
				String continueType = keyboard.next();
				if(continueType.equals("Y") || continueType.equals("y")) {
					out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
					playerChoice = keyboard.next();
					game.setPlayers(playerChoice);
					System.out.println(game.toString(game.determineWinner()));
					System.out.println();
				}
				else if (continueType.equals("N") || continueType.equals("n")){
					System.out.println("Thank you for playing!");
					return;
				}
			}
	}
}



