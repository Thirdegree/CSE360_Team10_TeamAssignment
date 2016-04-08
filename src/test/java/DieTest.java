import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test Generic Die creation
	 */
	@Test
	public void testDie() {
		Die die = new Die(); 
		int numSides = die.getNumberOfSides();
		
		assertEquals(6, numSides); 
	}
	
	
	
	/**
	 * Tests the creation of a Die using a constructor that allows for the number of sides to be set.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testNonGenericDieInvalidNumberOfSides(){
		Die die = new Die(2); 
	}
	
	/**
	 * Tests the creation of a Die with a specific number of sides.
	 */
	@Test
	public void testNonGenericDieBoundaryNumberOfSides(){
		Die die = new Die(3); 
		int numSides = die.getNumberOfSides(); 
		
		assertEquals(3, numSides);
	}
	
	/**
	 * Tests the creation of a Die with a specific number of sides.
	 */
	@Test
	public void testNonGenericDieValidNumberOfSides(){
		Die die = new Die(4); 
		int numSides = die.getNumberOfSides(); 
		
		assertEquals(4, numSides);
	}
	
	
	@Test
	public void testRollWithDefaultDie(){
		Die die = new Die(); 
		int rollValue = die.roll();
		
		assertTrue((1 <= rollValue) && (rollValue <= 6));
	}
	
	@Test
	public void testRollWithNonGenericDie(){
		int numSides = 16;
		Die die = new Die(numSides); 
		int rollValue = die.roll();
		
		assertTrue((1 <= rollValue) && (rollValue <= numSides));
	}
	

}
