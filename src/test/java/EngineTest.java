import engine.Engine;

import static org.junit.Assert.*;

import org.junit.Test;

public class EngineTest {

	@Test
	public void testGetQuality() {
		Engine engine = new Engine();
		int defaultQuality = engine.getQuality();
		
		assertEquals(1, defaultQuality); 
	}
	
	@Test
	public void testUpgradeQuality(){
		Engine engine = new Engine();
		boolean engineUpgradeStatus; 
		
		engineUpgradeStatus = engine.upgradeQuality();
		engineUpgradeStatus = engine.upgradeQuality();
		engineUpgradeStatus = engine.upgradeQuality();
		
		int engineQuality = engine.getQuality();
		
		assertEquals(4, engineQuality);
	}
	
	@Test
	public void testUpgradeQualityToMax(){
		Engine engine = new Engine();
		boolean engineUpgradeStatus; 
	
		engineUpgradeStatus = engine.upgradeQuality();
		engineUpgradeStatus = engine.upgradeQuality();
		engineUpgradeStatus = engine.upgradeQuality();
		engineUpgradeStatus = engine.upgradeQuality();
		
		int engineQuality = engine.getQuality();
		
		assertEquals(5, engineQuality);
	}
	
	@Test
	public void testUpgradeQualityPastMax(){
		Engine engine = new Engine();
		boolean engineUpgradeStatus; 
		
		engineUpgradeStatus = engine.upgradeQuality();
		engineUpgradeStatus = engine.upgradeQuality();
		engineUpgradeStatus = engine.upgradeQuality();
		engineUpgradeStatus = engine.upgradeQuality();
		
		assertTrue(engineUpgradeStatus); //should succeed setting quality to 5
		
		engineUpgradeStatus = engine.upgradeQuality();
		
		assertFalse(engineUpgradeStatus); //should fail because quality is already 5
	}
	

}
