import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import track.Track;

public class Race {
	Die die1;
	Die die2;
	ArrayList<Player> players;
	Map<String, int[]> playerRaceStatus;
	Player activePlayer;
	Track track; 
	boolean raceStarted;
	boolean raceWon;
	int raceSlotsLeft;
	
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
	
	public boolean joinRace(Player player){
		boolean joinSuccess = false;
		if (raceSlotsLeft > 0){
			addPlayerToRace(player); 
			
			joinSuccess = true; 
			--raceSlotsLeft;
		}
		return joinSuccess;
	}
	public void addPlayerToRace(Player player){
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
	
}
