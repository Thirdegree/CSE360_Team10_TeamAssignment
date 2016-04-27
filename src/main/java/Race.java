import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import car.Car;
import track.Track;

public class Race {
	
	private final int POSITION = 0; 
	private final int SKIP_STATUS= 0;
	
	private Die die1;
	private Die die2;
	private ArrayList<Player> players;
	private Map<String, int[]> playerRaceStatus;
	private Player activePlayer;
	private Track track; 
	private boolean raceStarted;
	private boolean raceWon;
	private int raceSlotsLeft;
	
	/**
	 * Race Initializer 
	 */
	public Race() {
		
		players = new ArrayList<Player>();
		playerRaceStatus = new HashMap<String, int[]>();
		raceStarted = false;
		raceWon = false;
		raceSlotsLeft = 12;
	}
	
	/**
	 * Creates the race. Each player in a race needs to call this.
	 * @param player The player joining the race
	 * @param track The track being played
	 */
	public void makeRace(Player player, Track track){
		joinRace(player); 
		this.track = track;
	}
	
	/**
	 * 
	 * @return The number of people that can still join the race.
	 */
	public int getRaceSlotsLeft(){
		return raceSlotsLeft;
	}
	
	/**
	 * 
	 * @param player The player joining the race
	 * @return True if the player joined the race. False otherwise
	 */
	public boolean joinRace(Player player){
		boolean joinSuccess = false;
		if (raceSlotsLeft > 0){
			addPlayerToRace(player); 
			
			joinSuccess = true; 
			--raceSlotsLeft;
		}
		return joinSuccess;
	}
	
	/**
	 * Adds a player to the race
	 * @param player The player being added to the race.
	 */
	private void addPlayerToRace(Player player){
		String userName = player.getName();
		int[] raceStatuses = setPlayerStatus(0,0);
		
		players.add(player);
		playerRaceStatus.put(userName, raceStatuses);
	}
	
	/**
	 * Sets position and if they player will be skipped for the next n rounds
	 * @param position The current position of the player
	 * @param skipStatus The number of rounds the player will be skipped
	 * @return [position, number of turns to be skipped]
	 */
	public int[] setPlayerStatus(int position, int skipStatus){
		int[] raceStatuses = new int[2];
		int racePosition = position;
		int turnsSkipped = skipStatus;
		
		raceStatuses[0] = racePosition;
		raceStatuses[1] = turnsSkipped; 
		
		return raceStatuses;
	}
	
	
	/**
	 * Starts the race
	 */
	public void startRace(){
		raceStarted =  true;
	}
	
	
	/**
	 * Moves the car
	 * @param player The player who's car is being moved
	 * @param dieTotal the number of places to move the car
	 */
	public void moveCar(Player player, int dieTotal){
		int usersNewPosition = determineUsersNewPositon(player, dieTotal);
		raceWon = (usersNewPosition > track.getDistance())?  true : false; 
		
		//track.checkForRoadObstruction(usersNewPosition); 
		//track.userNumberOfTurnsUserSkipped()
	}
	
	/**
	 * 
	 * @param player The player who's position is being changed
	 * @param dieTotal The result for the dice roll
	 * @return The position of the player after the dice roll
	 */
	private int determineUsersNewPositon(Player player, int dieTotal){
		int[] playerStatuses = playerRaceStatus.get(player.getName());
		Car playersCar = player.getCurrentCar();
		int speedModifier = (int) (dieTotal * playersCar.getSpeedModifier());
		int totalPositionGained = dieTotal + speedModifier;
		
		playerStatuses[POSITION] += totalPositionGained; 
		
		return playerStatuses[POSITION]; 
	}
	
}
