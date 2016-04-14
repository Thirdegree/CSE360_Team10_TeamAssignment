package car;

import java.awt.Color;

/**
 * 
 * @author Joel Christiansen
 * @author John Rupp
 *
 */
public class Car {
	// Cosmetic/Flavor Attributes
	private Color color;
	private String make;
	private String model;
		
	//Gameplay Modifier Attributes
	private Tires tires;
	private Turbo turbo;
	private Suspension suspension;
	private Engine engine;
	private Exhaust exhaust;
	

	public Car() { 
		color = new Color(255,255,255);
		make = "MINI";
		model = "PACEMAN";
		
		engine = new Engine();
		exhaust = new Exhaust();
		suspension = new Suspension();
		tires = new Tires();
		turbo = new Turbo();
	}
	
	public Car(Color color, String make, String model) { 
		this.color = color;
		this.make = make;
		this.model = model;
		
		engine = new Engine();
		exhaust = new Exhaust();
		suspension = new Suspension();
		tires = new Tires();
		turbo = new Turbo();
	}
	
	
	public boolean canUpgradeEngine(){
		return engine.canUpgrade();
	}
	
	public boolean canUpgradeExhaust(){
		return exhaust.canUpgrade();
	}
	
	public boolean canUpgradeSuspension(){
		return suspension.canUpgrade();
	}
	
	public boolean canUpgradeTurbo(){
		return turbo.canUpgrade();
	}

	
	public boolean upgradeEngine() {
		return engine.upgradeQuality();
	}
	
	public boolean upgradeExhaust() {
		return exhaust.upgradeQuality();
	}
	
	public boolean upgradeSuspension() {
		return suspension.upgradeQuality();
	}
	
	public void changeTires(Tires newTires) {
		tires = newTires;
	}
	
	public boolean upgradeTurbo() {
		return turbo.upgradeQuality();
	}
	
	
	public int getEngineQuality() {
		return engine.getQuality();
	}
	
	public int getExhaustQuality() {
		return exhaust.getQuality();
	}
	
	public int getSuspensionQuality() {
		return suspension.getQuality();
	}
	
	public int getTireSpeed() {
		return tires.getSpeed();
	}
	
	public int getTireDurability() {
		return tires.getDurability();
	}
	
	public int getTurboQuality() {
		return turbo.getQuality();
	}
	
	
	public int getDurabilityModifier() {
		return tires.getDurability();
	}
	
	public int getGetAwayModifier() {
		return turbo.getQuality();
	}
	
	public double getRoadHandlingModifier(){
		return (1 - (suspension.getQuality() * 0.1));
	}
	
	public double getSpeedModifier() {
		double engineSpdMod = engine.getSpeedModifier();
		double exhaustSpdMod = exhaust.getSpeedModifier();
		double tiresSpdMod = tires.getSpeedModifier();
		
		return engineSpdMod + exhaustSpdMod + tiresSpdMod;
	}
	

	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
}
