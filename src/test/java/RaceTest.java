import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RaceTest {
	
	@Test
	public void testRace() {
		Race race = new Race();
		assertNotNull(race);
	}
	
	@Test
    public void testGetPlayerPositionAfterS(){
		Race race = new Race();
	}
    
	@Test
	public void testGetRaceSlotsLeftWithEmptyPlayerList(){
		Race race = new Race();
		Player player = new Player("Player");
		
		race.joinRace(player);
		
		assertEquals(11, race.getRaceSlotsLeft());
	}
	
	@Test
	public void testJoinRaceWithEmptyPlayerList(){
		Race race = new Race();
		Player player = new Player("Player");
	
		assertTrue(race.joinRace(player));
	}
	
	@Test
	public void testJoinRaceWithFullPlayerList(){
		Race race = new Race();
		
		//Batch create players to make test simpler
		for (int i = 0; i < 12; ++i){
			Player player = new Player("Player" + i);
			race.joinRace(player);
		}
		
		Player player = new Player("Failed Player");
	
		assertFalse(race.joinRace(player));
	}

}
