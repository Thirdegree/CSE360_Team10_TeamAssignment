package car;

public class Engine extends CarPart{
	
	/**
	 * Engine initializer.
	 */
	public Engine(){
		super();
	}

	/**
	 * Gets the Speed Modifier
	 * @return the speed modifier
	 */
	public double getSpeedModifier() {
		return quality * 0.20;
	}
}
