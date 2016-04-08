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
	@Test
	public void testNonGenericDie(){
		Die die = new Die(16); 
		int numSides = die.getNumberOfSides(); 
		
		assertEquals(16, numSides);
	}
	
	

}
