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
	

	/**
	 * Default Car initializer 
	 */
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
	
	/**
	 * Car initializer
	 * 
	 * @param color The color of the car.
	 * @param make The make of the car.
	 * @param model The model of the car.
	 */
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
	
	public Car(Car car){
		this.color = car.getColor();
		this.make = car.getMake();
		this.model = car.getModel();
		
		engine = car.engine;
		exhaust = car.exhaust;
		suspension = car.suspension;
		tires = car.tires;
		turbo = car.turbo;
	}
	
	
	/** Checks if the engine can be upgraded
	 * 
	 * @return True if the engine can be upgraded, false otherwise.
	 */
	public boolean canUpgradeEngine(){
		return engine.canUpgrade();
	}
	
	/** Checks if the exhaust can be upgraded
	 * 
	 * @return True if the exhaust can be upgraded, false otherwise.
	 */
	public boolean canUpgradeExhaust(){
		return exhaust.canUpgrade();
	}
	
	/** Checks if the suspension can be upgraded
	 * 
	 * @return True if the suspension can be upgraded, false otherwise.
	 */
	public boolean canUpgradeSuspension(){
		return suspension.canUpgrade();
	}
	
	/** Checks if the turbo can be upgraded
	 * 
	 * @return True if the turbo can be upgraded, false otherwise.
	 */
	public boolean canUpgradeTurbo(){
		return turbo.canUpgrade();
	}

	/**
	 * Upgrades the engine.
	 * @return True if the engine was successfully upgraded, false otherwise.
	 */
	public boolean upgradeEngine() {
		return engine.upgradeQuality();
	}
	
	/**
	 * Upgrades the exhaust.
	 * @return True if the exhaust was successfully upgraded, false otherwise.
	 */
	public boolean upgradeExhaust() {
		return exhaust.upgradeQuality();
	}
	
	/**
	 * Upgrades the suspension.
	 * @return True if the suspension was successfully upgraded, false otherwise.
	 */
	public boolean upgradeSuspension() {
		return suspension.upgradeQuality();
	}
	
	/**
	 * Changes the tires
	 */
	public void changeTires(Tires newTires) {
		tires = newTires;
	}
	
	/**
	 * Upgrades the Turbo.
	 * @return True if the Turbo was successfully upgraded, false otherwise.
	 */
	public boolean upgradeTurbo() {
		return turbo.upgradeQuality();
	}
	
	/**
	 * Gets the engine quality.
	 * @return The engine quality.
	 */
	public int getEngineQuality() {
		return engine.getQuality();
	}
	
	/**
	 * Gets the exhaust quality.
	 * @return The exhaust quality.
	 */
	public int getExhaustQuality() {
		return exhaust.getQuality();
	}
	
	/**
	 * Gets the suspension quality.
	 * @return The suspension quality.
	 */
	public int getSuspensionQuality() {
		return suspension.getQuality();
	}
	
	/**
	 * Gets the tire speed.
	 * @return The tire speed.
	 */
	public int getTireSpeed() {
		return tires.getSpeed();
	}
	
	/**
	 * Gets the tire durability.
	 * @return The tire durability.
	 */
	public int getTireDurability() {
		return tires.getDurability();
	}
	
	/**
	 * Gets the turbo quality.
	 * @return The turbo quality.
	 */
	public int getTurboQuality() {
		return turbo.getQuality();
	}
	
	
	/**
	 * Gets the durability modifier.
	 * @return The durability modifier.
	 */
	public double getDurabilityModifier() {
		return tires.getDurabilityModifier();
	}
	
	/**
	 * Gets the getaway modifier.
	 * @return The getaway modifier.
	 */
	public int getGetAwayModifier() {
		return turbo.getQuality();
	}
	
	/**
	 * Gets the roadhandling modifier.
	 * @return The roadhandling modifier.
	 */
	public double getRoadHandlingModifier(){
		return suspension.getRoadHandlingModifier();
	}
	
	/**
	 * Gets the speed modifier.
	 * @return The speed modifier.
	 */
	public double getSpeedModifier() {
		double engineSpdMod = engine.getSpeedModifier();
		double exhaustSpdMod = exhaust.getSpeedModifier();
		double tiresSpdMod = tires.getSpeedModifier();
		
		return engineSpdMod + exhaustSpdMod + tiresSpdMod;
	}
	

	/**
	 * Gets the color
	 * @return The color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Sets the color
	 * @param color The color
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	/**
	 * Gets the make.
	 * @return The make
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * Sets the make
	 * @param color make
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	
	/**
	 * Gets the model
	 * @return The model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Sets the model 
	 * @param color model
	 */
	public void setModel(String model) {
		this.model = model;
	}
}
