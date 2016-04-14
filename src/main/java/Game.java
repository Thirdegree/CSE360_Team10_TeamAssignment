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
	
	public Game(int numOfPlayers, Track newTrack)
	{
		currentTrack =  newTrack;
		numPlayers = numOfPlayers;
		numVotes = 0;
	}
	
	int getNumVotes()
	{
		return numVotes;
	}
	
	Track getTrack()
	{
		return currentTrack;
	}
	
	void Vote()
	{
		numVotes++;
	}
	///Think about making Race static, so all players can interact and so each can use
	///race even if it is created by Game
	///player.game.race._______________
	void startRace()
	{
		Race newRace = new Race(currentTrack,numPlayers);
	}
}