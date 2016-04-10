import Car.Car;

/**
 * 
 * @author Jesus Ramirez
 *
 */

public class Player {
	private String userName;
	private int totalScore;
	private double totalMoney;
	private Car currentCar;
	
	/**
	 * Constructor - sets the userName to the name given by the user
	 * and initializes totalScore and totalMoney to zero. It gives the 
	 * user a generic car for the race. 
	 * 
	 * @param name
	 */
	public Player(String name) {
		userName = name;
		totalScore = 0;
		totalMoney = 0;
		currentCar = new Car();
	}
	
	/**
	 * Allows the user to vote for a particular race stage/leg.
	 * 
	 * @return vote
	 */
	public int vote() {
		// Need to determine how the voting will be implemented.
		int vote = 1; 
		
		return vote;		
	}
	
	/**
	 * Returns the player's userName.
	 * 
	 * @return userName
	 */
	public String getName() {
		return this.userName;
	}

	/**
	 * Returns the player's total score.
	 * 
	 * @return totalScore
	 */
	public int getTotalScore() {
		return this.totalScore;
	}
	
	/**
	 * Returns the amount of money the player has in his account.
	 * 
	 * @return totalMoney
	 */
	public double getTotalMoney() {
		return this.totalMoney;
	}
	
	/**
	 * Returns the car the player is racing with.
	 * 
	 * @return currentCar
	 */
	public Car getCurrentCar() {
		return this.currentCar;
	}
	
	/**
	 * Updates the player's total score.
	 * 
	 * @param score
	 */
	public void updateScore(int score) {
		totalScore += score;
	}
	
	/**
	 * Updates the amount of money in the player's account.
	 * 
	 * @param money
	 */
	public void updateMoney(double money) {
		totalMoney += money;
	}
	
	/**
	 * Updates the player's race car with a new one.
	 * 
	 * @param newCar
	 */
	public void updateCar(Car newCar) {
		currentCar = newCar;
	}
}