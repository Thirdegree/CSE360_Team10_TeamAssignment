import java.awt.Color;
import java.util.Scanner;

import track.Track;


/**
 * 
 * @author JulianC-M
 * My idea is to create two game with different tracks, and we vote specificly on
 * the game rather than just on a single track. propbably make it easier
 * have each player with a vote command, with Game as param, and each player with
 * an instance of game can count as one vote towards the game
 */
public class Game{
	
	Track currentTrack;
	int numPlayers;
	int numVotes;
	
	
	public static void main(String[] args){
		Die die1 = new Die();
		Die die2 = new Die();
		
		Race race = new Race();
		Player player = new Player("Player");
		Track track = new Track();
		
		race.makeRace(player, track);
		boolean done = false;
		try (Scanner userInput = new Scanner(System.in)) {
			
			while (!done) {
				System.out.println("===============================================");
				System.out.println("\t\tGAME MENU");
				System.out.println("===============================================");
				System.out.println("1. MAKE RACE");
				System.out.println("2. START RACE");
				System.out.println("3. UPDATE PROFILE");
				System.out.println("4. MOVE CAR");
				System.out.println("0. Exit");
				
				System.out.print("\nPlease enter a menu option: ");
				String menuItem = userInput.next();
				
				switch(menuItem) {
				case "1" :
					race.makeRace(player, track);
					System.out.print("\nRacing from " + track.getStartLocation() + " to " + track.getEndLocation() + "\n\n1");
		            break;
		        case "2" :
		        	race.startRace();
		        	System.out.print("Race started.\n\n");
		            break;
		        case "3" :
		        	player.updateProfile();
		            break;
		        case "4" :
		        	int dieTotal = die1.roll() + die2.roll();
		        	race.moveCar(player, dieTotal);
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
	
	
	/** The initializer for the Game class.
	 * 
	 * @param numOfPlayers The number of players in the race.
	 * @param newTrack The track being played
	 */
	public Game(int numOfPlayers, Track newTrack){
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
	///race even if it is created by Game
	///player.game.race._______________
	/**
	 * Begins the race.
	 */
	void startRace(){
		Race newRace = new Race();
	}
}