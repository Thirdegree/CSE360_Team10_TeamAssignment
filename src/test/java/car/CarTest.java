package car;
import car.Car;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class CarTest {

	@Test
	public void testCar() {
		Car car = new Car();
		assertNotNull(car);
	}
	
	@Test
	public void testCustomCar() {
		Color color = new Color(0,0,0);
		Car car = new Car(color, "Chevrolet", "Corvette");
		assertNotNull(car);
	}

	@Test
	public void testChangeTiresToRacing() {
		Car car = new Car();
		car.changeTires(new Tires(1,5));
		
		assertEquals(-0.8,car.getDurabilityModifier(), (1 * 10^(-15)));
		assertEquals(0.6, car.getSpeedModifier(), (1 * 10^(-15))); 
	}
	
	@Test
	public void testChangeTiresToOffroading() {
		Car car = new Car();
		car.changeTires(new Tires(5,1));
		
		assertEquals(0.8,car.getDurabilityModifier(), (1 * 10^(-15)));
		assertEquals(-0.6, car.getSpeedModifier(), (1 * 10^(-15))); 
	}
	

	
	@Test
	public void testUpgradeEngine() {
		Car car = new Car();
		car.upgradeEngine();
		
		assertEquals(1, car.getEngineQuality());
	}
	
	@Test
	public void testUpgradeEngineToMax() {
		Car car = new Car();
		
		car.upgradeEngine();
		car.upgradeEngine();
		car.upgradeEngine();
		car.upgradeEngine();
		
		assertEquals(4, car.getEngineQuality());
	}
	
	@Test
	public void testUpgradeEnginePastMax() {
		Car car = new Car();
		
		car.upgradeEngine();
		car.upgradeEngine();
		car.upgradeEngine();
		car.upgradeEngine();
		
		assertFalse(car.upgradeEngine());
	}
	
	
	@Test
	public void testUpgradeExhaust() {
		Car car = new Car();
		car.upgradeExhaust();
		
		assertEquals(1, car.getExhaustQuality());
	}
	
	@Test
	public void testUpgradeExhaustToMax() {
		Car car = new Car();
		
		car.upgradeExhaust();
		car.upgradeExhaust();
		car.upgradeExhaust();
		car.upgradeExhaust();
		
		assertEquals(4, car.getExhaustQuality());
	}
	
	@Test
	public void testUpgradeExhaustPastMax() {
		Car car = new Car();
		
		car.upgradeExhaust();
		car.upgradeExhaust();
		car.upgradeExhaust();
		car.upgradeExhaust();
		
		assertFalse(car.upgradeExhaust());
	}

	
	@Test
	public void testUpgradeSuspension() {
		Car car = new Car();
		car.upgradeSuspension();
		
		assertEquals(1, car.getSuspensionQuality());
	}
	
	@Test
	public void testUpgradeSuspensionToMax() {
		Car car = new Car();
		
		car.upgradeSuspension();
		car.upgradeSuspension();
		car.upgradeSuspension();
		car.upgradeSuspension();
		
		assertEquals(4, car.getSuspensionQuality());
	}
	
	@Test
	public void testUpgradeSuspensionPastMax() {
		Car car = new Car();
		
		car.upgradeSuspension();
		car.upgradeSuspension();
		car.upgradeSuspension();
		car.upgradeSuspension();
		
		assertFalse(car.upgradeSuspension());
	}

	
	@Test
	public void testUpgradeTurbo() {
		Car car = new Car();
		car.upgradeTurbo();
		
		assertEquals(1, car.getTurboQuality());
	}
	
	@Test
	public void testUpgradeTurboToMax() {
		Car car = new Car();
		
		car.upgradeTurbo();
		car.upgradeTurbo();
		car.upgradeTurbo();
		car.upgradeTurbo();
		
		assertEquals(4, car.getTurboQuality());
	}
	
	@Test
	public void testUpgradeTurboPastMax() {
		Car car = new Car();
		
		car.upgradeTurbo();
		car.upgradeTurbo();
		car.upgradeTurbo();
		car.upgradeTurbo();
		
		assertFalse(car.upgradeTurbo());
	}

	

	@Test
	public void testGetTireDurablilty() {
		Car car = new Car();
		
		assertEquals(3, car.getTireDurability());
	}
	
	@Test
	public void testGetTireSpeed() {
		Car car = new Car();
		
		assertEquals(3, car.getTireSpeed());
	}
	
	
	@Test
	public void testGetEngine() {
		Car car = new Car();
		
		assertEquals(0, car.getEngineQuality());
	}
	
	@Test
	public void testGetExhaust() {
		Car car = new Car();
		
		assertEquals(0, car.getExhaustQuality());
	}
	
	@Test
	public void testGetSuspensionQuality() {
		Car car = new Car();
		
		assertEquals(0, car.getSuspensionQuality());
	}
	
	@Test
	public void testGetTurboQuality() {
		Car car = new Car();
		
		assertEquals(0, car.getTurboQuality());
	}

	
	@Test
	public void testGetDurabilityModifier() {
		Car car = new Car();
		
		car.changeTires(new Tires(1,5));
		
		assertEquals(-0.8, car.getDurabilityModifier(), 1*10^(-15));
	}
	
	
	@Test
	public void testGetRoadHandlingModifier(){
		Car car = new Car();
		
		assertEquals(0.6, car.getRoadHandlingModifier(), (1 * 10^(-15)));
	}

	@Test
	public void testGetSpeedModifierWithNoUpgrades() {
		Car car = new Car();
		
		assertEquals(0, car.getSpeedModifier(), 1*10^(-15));
	}
	
	@Test
	public void testGetSpeedModifierWithOnlyEngineUpgrades() {
		Car car = new Car();
		
		car.upgradeEngine();
		car.upgradeEngine();
		car.upgradeEngine();
		car.upgradeEngine();
		
		assertEquals(0.8, car.getSpeedModifier(), 1*10^(-15));
	}
	
	@Test
	public void testGetSpeedModifierWithOnlyExhaustUpgrades() {
		Car car = new Car();
		
		car.upgradeExhaust();
		car.upgradeExhaust();
		car.upgradeExhaust();
		car.upgradeExhaust();
		
		assertEquals(0.6, car.getSpeedModifier(), 1*10^(-15));
	}
	
	@Test
	public void testGetSpeedModifierWithRacingTires() {
		Car car = new Car();
		
		car.changeTires(new Tires(2,5));

		assertEquals(0.6, car.getSpeedModifier(), 1*10^(-15));
	}
	
	@Test
	public void testGetSpeedModifierWithOffroadingTires() {
		Car car = new Car();
		
		car.changeTires(new Tires(5,1));

		assertEquals(-0.6, car.getSpeedModifier(), 1*10^(-15));
	}
	
	@Test
	public void testGetSpeedModifierWithEngineExhaustUpAndOffroadingTires() {
		Car car = new Car();
		
		car.upgradeEngine();
		car.upgradeExhaust();
		car.changeTires(new Tires(5,1));

		assertEquals(-0.25, car.getSpeedModifier(), 1*10^(-15));
	}
	
	@Test
	public void testGetSpeedModifierWithEngineExhaustUpAndRacingTires() {
		Car car = new Car();
		
		car.upgradeEngine();
		car.upgradeExhaust();
		car.changeTires(new Tires(1,5));

		assertEquals(0.95, car.getSpeedModifier(), 1*10^(-15));
	}
	
	
	@Test
	public void testGetColor() {
		Car car = new Car();
		
		assertEquals(Color.white, car.getColor());
	}

	@Test
	public void testGetMake() {
		Car car = new Car();
		
		assertEquals("MINI", car.getMake());
	}

	@Test
	public void testGetModel() {
		Car car = new Car();
		
		assertEquals("PACEMAN", car.getModel());
	}

	
	@Test
	public void testSetColor() {
		Car car = new Car();
		Color color = new Color(0, 0, 0);
		
		car.setColor(color);
		
		assertEquals(Color.black, car.getColor());
	}

	@Test
	public void testSetMake() {
		Car car = new Car();
		car.setMake("Chevrolet");
		
		assertEquals("Chevrolet", car.getMake());
	}

	@Test
	public void testSetModel() {
		Car car = new Car();
		car.setModel("Corvette");
		
		assertEquals("Corvette", car.getModel());
	}

}
