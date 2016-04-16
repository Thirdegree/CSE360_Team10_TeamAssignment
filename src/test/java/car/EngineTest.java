package car;

import static org.junit.Assert.*;

import org.junit.Test;

public class EngineTest {
	
	@Test
	public void testEngine(){
		Engine engine = new Engine();
		assertNotNull(engine);
	}
	
	@Test
	public void testGetSpeedModifierWithNoUpgrades(){
		Engine engine = new Engine();
		double speedModifier = engine.getSpeedModifier();
		
		assertEquals(0, speedModifier, (1*10^(-15))); 
	}
	
	@Test
	public void testGetSpeedModifierWithUpgrades(){
		Engine engine = new Engine();
		
		engine.upgradeQuality();
		
		double speedModifier = engine.getSpeedModifier();
		
		assertEquals(0.2, speedModifier, (1*10^(-15))); 
	}
	
	@Test
	public void testGetSpeedModifierWithMaxUpgrades(){
		Engine engine = new Engine();
		
		engine.upgradeQuality();
		engine.upgradeQuality();
		engine.upgradeQuality();
		engine.upgradeQuality();
		
		double speedModifier = engine.getSpeedModifier();
		
		assertEquals(0.8, speedModifier, (1*10^(-15))); 
	}
}
