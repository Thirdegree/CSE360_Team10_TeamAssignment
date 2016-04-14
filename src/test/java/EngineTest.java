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
		
		engine.upgradeQuality();
		
		int engineQuality = engine.getQuality();
		
		assertEquals(2, engineQuality);
	}
	

}
