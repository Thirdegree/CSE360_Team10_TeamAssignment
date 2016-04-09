package Car;
/**
 * 
 * @author Joel Christiansen
 *
 */
public class Car {
	private Tire tire;
	private Turbo turbo;
	private Suspension sus;
	private Engine engine;
	private Exaust exaust;
	

	public Car() { 
		tire = new AllPurposeTire();
		turbo = new BaseTurbo();
		sus = new BaseSuspension();
		engine = new BaseEngine();
		exaust = new BaseExaust();
		
	}
	public void upgradeTire(Tire newTire) {
		tire = newTire;
		
	}
	public void upgradeTurbo(Turbo newTurbo) {
		turbo = newTurbo;
	}
	public void upgradeSuspension(Suspension newSus) {
		sus = newSus;
	}
	public void upgradeEngine(Engine newEngine) {
		engine = newEngine;
	}
	public void upgradeExaust(Exaust newExaust) {
		exaust = newExaust;
	}
}
