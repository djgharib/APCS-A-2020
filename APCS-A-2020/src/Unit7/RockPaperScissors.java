package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private String winner;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		double tempVal = Math.random();
		if(tempVal>0.67) {
			compChoice = "R";
		}
		else if (tempVal<=0.33) {
			compChoice = "S";
		}
		else {
			compChoice = "P";
		}
	}

	public String determineWinner()
	{
		if(playChoice.equals("R") && compChoice.equals("P")) {
			winner = "!Computer wins <<Paper Covers Rock>>!";
		}
		else if (playChoice.equals("S") && compChoice.equals("R")) {
			winner = "!Computer wins <<Rock Breaks Scissors>>!";
		}
		else if (playChoice.equals("P") && compChoice.equals("S")) {
			winner = "!Computer wins <<Scissors Cuts Paper>>!";
		}
		else if (playChoice.equals("S") && compChoice.equals("P")) {
			winner = "!Player wins <<Scissors Cuts Paper>>!";
		}
		else if (playChoice.equals("R") && compChoice.equals("S")) {
			winner = "!Player wins <<Rock Breaks Scissors>>!";
		}
		else if (playChoice.equals("P") && compChoice.equals("R")) {
			winner = "!Player wins <<Paper Covers Rock>>!";
		}
		else {
			winner = "!Draw Game!";
		}
		return winner;
	}

	public String toString(String victor)
	{
		String output = victor;
		return output;
	}
}