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
	
	public Race() {
		die1 = new Die();
		die2 = new Die();
		players = new ArrayList<Player>();
		playerRaceStatus = new HashMap<String, int[]>();
		raceStarted = false;
		raceWon = false;
		raceSlotsLeft = 12;
	}
	
	public void startRace(Player player, Track track){
		joinRace(player); 
		this.track = track;
	}
	public int getRaceSlotsLeft(){
		return raceSlotsLeft;
	}
	public boolean joinRace(Player player){
		boolean joinSuccess = false;
		if (raceSlotsLeft > 0){
			addPlayerToRace(player); 
			
			joinSuccess = true; 
			--raceSlotsLeft;
		}
		return joinSuccess;
	}
	
	private void addPlayerToRace(Player player){
		String userName = player.getName();
		int[] raceStatuses = setPlayerStatus(0,0);
		
		players.add(player);
		playerRaceStatus.put(userName, raceStatuses);
	}
	
	public int[] setPlayerStatus(int position, int skipStatus){
		int[] raceStatuses = new int[2];
		int racePosition = position;
		int turnsSkipped = skipStatus;
		
		raceStatuses[0] = racePosition;
		raceStatuses[1] = turnsSkipped; 
		
		return raceStatuses;
	}
	
	
	public void startRace(){
		raceStarted =  true;
		
		while (!raceWon){
			
		}
	}
	
	
	public void moveCar(Player player, int dieTotal){
		int usersNewPosition = determineUsersNewPositon(player, dieTotal);
		
		//track.checkForRoadObstruction(usersNewPosition); 
		//track.userNumberOfTurnsUserSkipped()
	}
	private int determineUsersNewPositon(Player player, int dieTotal){
		int[] playerStatuses = playerRaceStatus.get(player.getName());
		Car playersCar = player.getCurrentCar();
		int speedModifier = (int) (dieTotal * playersCar.getSpeedModifier());
		int totalPositionGained = dieTotal + speedModifier;
		
		playerStatuses[POSITION] += totalPositionGained; 
		
		return playerStatuses[POSITION]; 
	}
	
}
