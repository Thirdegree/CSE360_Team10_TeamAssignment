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