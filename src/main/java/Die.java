import java.util.Random;

/**
 * 
 */

/**
 * @author jcrupp
 *
 */
public class Die {

	
	private int numberOfSides; 
	
	
	/**
	 * Sets up a normal every day die with 6 sides.
	 */
	public Die() {
		numberOfSides = 6;
	}
	/**
	 * sets up a customized die with a specific number of sides.
	 * @param numSides is the number of die sides.
	 */
	public Die(int numSides) {
		numberOfSides = numSides;
	}

	/**
	 * Gets the die's number of sides
	 */
	public int getNumberOfSides() {
		return numberOfSides;
	}
	public int roll() {
		Random rand = new Random(); 
		
		return rand.nextInt(numberOfSides) + 1;
	}


}
