import java.awt.Color;
import car.Car;
import java.util.Scanner;

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
	
	public void setUserName(String newName) {
		this.userName = newName;
	}
	
	/**
	 * Updates the player's total score.
	 * 
	 * @param score
	 */
	public void updateScore(int score) {
		this.totalScore += score;
	}
	
	/**
	 * Updates the amount of money in the player's account.
	 * 
	 * @param money
	 */
	public void updateMoney(double money) {
		this.totalMoney += money;
	}
	
	/**
	 * Updates the player's race car with a new one.
	 * 
	 * @param newCar
	 */
	public void updateCar(Car newCar) {
		this.currentCar = newCar;
	}
	
	/**
	 * Allows a player to change username along with make, model and color of their car.
	 * Prints out a menu giving the player different options.
	 */
	public void updateProfile() {
		boolean done = false;
		String menuItem;
		String newName;
		String carMake;
		String carModel;
		String carColor;
		Color newColor;
		
		try (Scanner userInput = new Scanner(System.in)) {
			
			while (!done) {
				System.out.println("===============================================");
				System.out.println("\t\tUPDATE PROFILE MENU");
				System.out.println("===============================================");
				System.out.println("1. Change Username");
				System.out.println("2. Change Car Make");
				System.out.println("3. Change Car Model");
				System.out.println("4. Change Car Color");
				System.out.println("0. Exit");
				
				System.out.print("\nPlease enter a menu option: ");
				menuItem = userInput.next();
				
				switch(menuItem) {
				case "1" :
					System.out.println("Type in your new username: ");
		            newName = userInput.next();
		            this.setUserName(newName);
		            break;
		        case "2" :
		            System.out.print("\nWhat is the make of your car: ");
		            carMake = userInput.next();
		            this.currentCar.setMake(carMake);
		            break;
		        case "3" :
		            System.out.print("\nWhat is the model of your car: ");
		            carModel = userInput.next();
		            this.currentCar.setModel(carModel);
		            break;
		        case "4" :
		            System.out.print("\nWhat is the color of your car: ");
		            carColor = userInput.next();
		            
		            try {
		                newColor = (Color) Color.class.getField(carColor.toLowerCase()).get(null);
		            } catch (Exception exception) {
		            	newColor = null; // Not defined
		            	System.out.println("We're sorry, " + carColor + " is not a valid color.");
		            }
		            this.currentCar.setColor(newColor);
		            break;
		        case "0" :
		            System.out.println("Exiting profile update.\n");
		            done = true;
		            break;
		        default :
		            System.out.println("Please try again with a valid number.");
		            break;
				}
			}
		}
	}
}
