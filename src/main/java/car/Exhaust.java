package car;

public class Exhaust extends CarPart{
	
	/**
	 * Exhaust initializer 
	 */
	Exhaust(){
		super();
	}
	
	/**
	 * Gets the speed modifier
	 * @return the speed modifier
	 */
	public double getSpeedModifier() {
		return quality * 0.15;
	}
}
