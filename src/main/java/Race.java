import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import track.Track;

public class Race {
	Die die1;
	Die die2;
	ArrayList<Player> players;
	Map<String, Integer> playerPositions;
	Player activePlayer;
	Track track; 
	boolean raceStarted;
	int raceSlotsLeft;
	
	public Race() {
		die1 = new Die();
		die2 = new Die();
		players = new ArrayList<Player>();
		playerPositions = new HashMap<String, Integer>();
		raceStarted = false; 
		raceSlotsLeft = 12;
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
		players.add(player);
		String userName = player.getName();
	
		playerPositions.put(userName, new Integer("0"));
	}
	
	public void startRace(){
		raceStarted =  true;
	}
	
}
