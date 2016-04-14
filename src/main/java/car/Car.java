package car;

import java.awt.Color;

/**
 * 
 * @author Joel Christiansen
 *
 */
public class Car {
	//have an impact on gameplay
	private Tires tires;
	private Turbo turbo;
	private Suspension suspension;
	private Engine engine;
	private Exhaust exhaust;
	// cosmetics? or flavor at least.
	private Color color;
	private String make;
	private String model;
	

	public Car() { 
		tires = new Tires();
		turbo = new Turbo();
		suspension = new Suspension();
		engine = new Engine();
		exhaust = new Exhaust();
		
	}
	
	public void changeTires(Tires newTire) {
		tires = newTire;
	}
	
	public void upgradeTurbo() {
		turbo.upgradeQuality();
	}
	
	public void upgradeSuspension() {
		suspension.upgradeQuality();
	}
	
	public void upgradeEngine() {
		engine.upgradeQuality();
	}
	
	public void upgradeExaust() {
		exhaust.upgradeQuality();
	}

	
	public Tires getTires() {
		return tires;
	}
	
	public Turbo getTurbo() {
		return turbo;
	}
	
	public Suspension getSuspension() {
		return suspension;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public Exhaust getExaust() {
		return exhaust;
	}
	
	
	public int getSpeedModifier() {
		
		//TODO: FIGURE OUT HOW WE WANT TO DO THIS
		return 1;
	}
	
	public int getDurabilityModifier() {
		//TODO: FIGURE OUT HOW WE WANT TO DO THIS
		return 1;
	}

	
	public Color getColor() {
		return color;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
}
