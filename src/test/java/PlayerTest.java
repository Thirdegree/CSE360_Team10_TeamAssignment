import static org.junit.Assert.*;

import org.junit.*;

import car.Car;

//import java.awt.Color;

public class PlayerTest {

	@Test
	public void testPlayer() {
		Player myPlayer = new Player("player1");
		assertNotNull(myPlayer);
	}
	
	@Test
	public void testGetCurrentCar() {
		Player myPlayer = new Player("player1");
		assertNotNull(myPlayer.getCurrentCar());
	}
	
	@Test
	public void testGetName() {
		Player myPlayer = new Player("player1");
		assertEquals(myPlayer.getName(), "player1");
	}
	
	@Test
	public void testGetTotalMoney() {
		Player myPlayer = new Player("player1");
		assertEquals((int)myPlayer.getTotalMoney(), 0);
	}
	
	@Test
	public void testGetTotalScore() {
		Player myPlayer = new Player("player1");
		assertEquals(myPlayer.getTotalScore(), 0);
	}
	
	@Test
	public void testUpdateCar() {
		Player myPlayer = new Player("player1");
		Car fastCar = new Car(); 
		
		myPlayer.updateCar(fastCar);
		assertNotNull(myPlayer.getCurrentCar());
	}
	
	@Test
	public void testUpdateMoney() {
		Player myPlayer = new Player("player1");
		myPlayer.updateMoney(59.0);
		assertEquals((int)myPlayer.getTotalMoney(), 59);
	}
	
	@Test
	public void testUpdateScore() {
		Player myPlayer = new Player("player1");
		myPlayer.updateScore(100);
		assertEquals(myPlayer.getTotalScore(), 100);
	}
	
	@Test
	public void testVote() {
		Player myPlayer = new Player("player1");
		assertEquals(myPlayer.vote(), 1);
	}
	
	@Test
	public void testUpdateProfile() {
		Player myPlayer = new Player("player1");
		myPlayer.updateProfile();
		// Change user name to Jesus
		assertEquals(myPlayer.getName(), "Jesus");
		// Change car make to Plymouth
		assertEquals(myPlayer.getCurrentCar().getMake(), "Plymouth");
		// Change car model to Valiant
		assertEquals(myPlayer.getCurrentCar().getModel(), "Valiant");
	}

}
