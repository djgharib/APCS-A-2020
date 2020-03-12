package CelebrityLab;

/**
 * Celebrity base class for the Celebrity game.
 * 
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity {
	String cClue;

	String cAnswer;

	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * 
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue) {
		cClue = clue;
		cAnswer = answer;
	}

	/**
	 * Supplies the clue for the celebrity
	 * 
	 * @return
	 */
	public String getClue() {
		return cClue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * 
	 * @return
	 */
	public String getAnswer() {
		return cAnswer;
	}

	/**
	 * Updates the clue to the provided String.
	 * 
	 * @param clue The new clue.
	 */
	public void setClue(String clue) {
		cClue = clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * 
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer) {
		cAnswer = answer;
	}

	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString() {
		return cAnswer;
	}

}