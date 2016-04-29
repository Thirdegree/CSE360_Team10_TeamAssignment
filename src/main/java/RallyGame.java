import java.awt.Color;
import java.util.Scanner;

import menus.*;
import track.Track;
import player.Player;


/**
 * 
 * @author JulianC-M
 * My idea is to create two game with different tracks, and we vote specificly on
 * the game rather than just on a single track. propbably make it easier
 * have each player with a vote command, with RallyGame as param, and each player with
 * an instance of game can count as one vote towards the game
 */
public class RallyGame{
	
	Track currentTrack;
	int numPlayers;
	int numVotes;
	
	
	public static void main (String[] args){
		GameWindow gw = new GameWindow();
		try (Scanner userInput = new Scanner(System.in)) {
			boolean done = false;
			while (!done) {
				System.out.println("===============================================");
				System.out.println("\t\tShow Menus");
				System.out.println("===============================================");
				System.out.println("1. Login Form");
				System.out.println("2. Main Menu ");
				System.out.println("3. Create New Profile Menu");
				System.out.println("4. Update Profile Menu");
				System.out.println("5. Update Car Menu");
				System.out.println("0. Exit");
				
				System.out.print("\nPlease enter a menu option: ");
				String menuItem = userInput.next();
				
				Player testPlayer = new Player("test");
				switch(menuItem) {
				case "1" :
					Login loginForm = new Login();
					gw.updateWindowContent(loginForm.getFormPanel());
		            break;
		        case "2" :
		        	MainMenu mainMenu = new MainMenu();
		        	gw.updateWindowContent(mainMenu.getFormPanel());
		            break;
		        case "3" :
		        	Profile profileMenu = new Profile();
		        	gw.updateWindowContent(profileMenu.getFormPanel());
		            break;
		        case "4" :
		        	Profile updateProfileMenu = new Profile(testPlayer);
		        	gw.updateWindowContent(updateProfileMenu.getFormPanel());
		            break;
		        case "5" :
		        	UpgradeCar upgradeCarMenu = new UpgradeCar(testPlayer);
		        	gw.updateWindowContent(upgradeCarMenu.getFormPanel());
		            break;
		        case "0" :
		            System.out.println("Exiting.\n");
		            done = true;
		            break;
		        default :
		            System.out.println("Please try again with a valid number.");
		            break;
				}
			}
		}
		
	}
	
	
	/*public static void main(String[] args){
		Die die1 = new Die();
		Die die2 = new Die();
		
		Race race = new Race();
		Player player = new Player("Player");
		Track track = new Track();
		
		race.makeRace(player, track);
		
		
		
	}*/
	
	
	/** The initializer for the RallyGame class.
	 * 
	 * @param numOfPlayers The number of players in the race.
	 * @param newTrack The track being played
	 */
	public RallyGame(int numOfPlayers, Track newTrack){
		currentTrack =  newTrack;
		numPlayers = numOfPlayers;
		numVotes = 0;
	}
	
	/** Getter for numVotes
	 * 
	 * @return the value of numVotes
	 */
	int getNumVotes(){
		return numVotes;
	}
	
	/**
	 * Getter for track
	 * @return the current track
	 */
	Track getTrack(){
		return currentTrack;
	}
	
	/**
	 *  Increments numVotes by one.
	 */
	void Vote(){
		numVotes++;
	}

	///Think about making Race static, so all players can interact and so each can use
	///race even if it is created by RallyGame
	///player.game.race._______________
	/**
	 * Begins the race.
	 */
	void startRace(){
		Race newRace = new Race();
	}
}