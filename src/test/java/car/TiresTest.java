package car;


import static org.junit.Assert.*;

import org.junit.Test;

public class TiresTest {
	
	@Test
	public void testTires(){
		Tires tires = new Tires();
		
		assertNotNull(tires);
	}
	
	@Test 
	public void testCustomConstructor(){
		Tires tires = new Tires(1,5);
		
		assertNotNull(tires);
	}
	
	
	@Test 
	public void testGetDurabilityWithDefaultCtor(){
		Tires tires = new Tires();
		
		assertEquals(3, tires.getDurability());
	}
	
	@Test 
	public void testGetDurabilityWithCustomCtor(){
		Tires tires = new Tires(1,5);
		
		assertEquals(1, tires.getDurability());
	}
	
	
	@Test 
	public void testGetSpeedWithDefaultCtor(){
		Tires tires = new Tires();
		
		assertEquals(3, tires.getSpeed());
	}
	
	@Test 
	public void testGetSpeedWithCustomCtor(){
		Tires tires = new Tires(1,5);
		
		assertEquals(5, tires.getSpeed());
	}
	

	@Test(expected=IllegalArgumentException.class)
	public void testSetDurabilityWithZero(){
		Tires tires = new Tires(); 
		
		tires.setDurability(0);
	}
	
	@Test
	public void testSetDurabilityWithValidValue(){
		Tires tires = new Tires(); 
		
		tires.setDurability(3);
		
		assertEquals(3, tires.getDurability());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetDurabilityWithValuePastMax(){
		Tires tires = new Tires(); 
		
		tires.setDurability(6);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetSpeedWithZero(){
		Tires tires = new Tires(); 
		
		tires.setSpeed(0);
	}
	
	@Test
	public void testSetSpeedWithValidValue(){
		Tires tires = new Tires(); 
		
		tires.setSpeed(3);
		
		assertEquals(3, tires.getSpeed());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetSpeedWithValuePastMax(){
		Tires tires = new Tires(); 
		
		tires.setSpeed(6);
	}
	
	
	@Test 
	public void testGetDurabilityModifierWithMinDurability(){
		Tires tires = new Tires();
		
		tires.setDurability(1);
		
		assertEquals(-0.8, tires.getDurabilityModifier(), (1 * 10^(-15)));
	}
	
	@Test 
	public void testGetDurabilityModifierWithMidDurability(){
		Tires tires = new Tires();
		
		tires.setDurability(3);
		
		assertEquals(0, tires.getDurabilityModifier(), (1 * 10^(-15)));
	}
	
	@Test 
	public void testGetDurabilityModifierWithMaxDurability(){
		Tires tires = new Tires();
		
		tires.setDurability(5);
		
		assertEquals(0.8, tires.getDurabilityModifier(), (1 * 10^(-15)));
	}
	
	
	@Test 
	public void testGetSpeedModifierWithMinSpeed(){
		Tires tires = new Tires();
		
		tires.setSpeed(1);
		
		assertEquals(-0.6, tires.getSpeedModifier(), (1 * 10^(-15)));
	}
	
	@Test 
	public void testGetSpeedModifierWithMidSpeed(){
		Tires tires = new Tires();
		
		tires.setSpeed(3);
		
		assertEquals(0, tires.getSpeedModifier(), (1 * 10^(-15)));
	}
	
	@Test 
	public void testGetSpeedModifierWithMaxSpeed(){
		Tires tires = new Tires();
		
		tires.setSpeed(5);
		
		assertEquals(0.6, tires.getSpeedModifier(), (1 * 10^(-15)));
	}
}
