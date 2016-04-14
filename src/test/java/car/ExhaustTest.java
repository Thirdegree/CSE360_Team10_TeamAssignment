package car;
import static org.junit.Assert.*;

import org.junit.Test;

import car.Exhaust;

public class ExhaustTest {
	
	@Test
	public void testGetSpeedModifierWithNoUpgrades(){
		Exhaust exhaust = new Exhaust();
		double speedModifier = exhaust.getSpeedModifier();
		
		assertEquals(0, speedModifier, (1*10^(-15))); 
	}
	
	@Test
	public void testGetSpeedModifierWithUpgrades(){
		Exhaust exhaust = new Exhaust();
		
		exhaust.upgradeQuality();
		
		double speedModifier = exhaust.getSpeedModifier();
		
		assertEquals(0.15, speedModifier, (1*10^(-15))); 
	}
	
	@Test
	public void testGetSpeedModifierWithMaxUpgrades(){
		Exhaust exhaust = new Exhaust();
		
		exhaust.upgradeQuality();
		exhaust.upgradeQuality();
		exhaust.upgradeQuality();
		exhaust.upgradeQuality();
		
		double speedModifier = exhaust.getSpeedModifier();
		
		assertEquals(0.6, speedModifier, (1*10^(-15))); 
	}
}