package car;

import static org.junit.Assert.*;

import org.junit.Test;


public class CarPartTest {

	@Test
	public void testGetQuality() {
		CarPart carPart = new CarPart();
		int defaultQuality = carPart.getQuality();
		
		assertEquals(0, defaultQuality); 
	}
	
	@Test
	public void testUpgradeQuality(){
		CarPart carPart = new CarPart();
		boolean carPartUpgradeStatus; 
		
		carPartUpgradeStatus = carPart.upgradeQuality();
		carPartUpgradeStatus = carPart.upgradeQuality();
		carPartUpgradeStatus = carPart.upgradeQuality();
		
		int carPartQuality = carPart.getQuality();
		
		assertEquals(3, carPartQuality);
	}
	
	@Test
	public void testUpgradeQualityToMax(){
		CarPart carPart = new CarPart();
		boolean carPartUpgradeStatus; 
	
		carPartUpgradeStatus = carPart.upgradeQuality();
		carPartUpgradeStatus = carPart.upgradeQuality();
		carPartUpgradeStatus = carPart.upgradeQuality();
		carPartUpgradeStatus = carPart.upgradeQuality();
		
		int carPartQuality = carPart.getQuality();
		
		assertEquals(4, carPartQuality);
	}
	
	@Test
	public void testUpgradeQualityPastMax(){
		CarPart carPart = new CarPart();
		boolean carPartUpgradeStatus; 
		
		carPartUpgradeStatus = carPart.upgradeQuality();
		carPartUpgradeStatus = carPart.upgradeQuality();
		carPartUpgradeStatus = carPart.upgradeQuality();
		carPartUpgradeStatus = carPart.upgradeQuality();
		
		assertTrue(carPartUpgradeStatus); //should succeed setting quality to 5
		
		carPartUpgradeStatus = carPart.upgradeQuality();
		
		assertFalse(carPartUpgradeStatus); //should fail because quality is already 5
	}
}
