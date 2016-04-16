package car;
import static org.junit.Assert.*;

import org.junit.Test;


public class SuspensionTest {
	
	@Test
	public void testSuspension(){
		Suspension suspension = new Suspension();
		assertNotNull(suspension);
	}
	
	@Test
	public void testGetRoadHandlingModifierWithNoUpgrades(){
		Suspension suspension = new Suspension();
		double roadHandlingModifier = suspension.getRoadHandlingModifier();
		
		assertEquals(0.6, roadHandlingModifier, (1*10^(-15))); 
	}
	
	@Test
	public void testGetRoadHandlingModifierWithUpgrades(){
		Suspension suspension = new Suspension();
		
		suspension.upgradeQuality();
		
		double roadHandlingModifier = suspension.getRoadHandlingModifier();
		
		assertEquals(0.7, roadHandlingModifier, (1*10^(-15))); 
	}
	
	@Test
	public void testGetRoadHandlingModifierWithMaxUpgrades(){
		Suspension suspension = new Suspension();
		
		suspension.upgradeQuality();
		suspension.upgradeQuality();
		suspension.upgradeQuality();
		suspension.upgradeQuality();
		
		double roadHandlingModifier = suspension.getRoadHandlingModifier();
		
		assertEquals(1.0, roadHandlingModifier, (1*10^(-15))); 
	}
}