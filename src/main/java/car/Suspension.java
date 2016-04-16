package car;

public class Suspension extends CarPart{
	
	/**
	 * Suspension initializer 
	 */
	Suspension(){
		super();
	}
	
	/**
	 * Gets RoadHandling Modifier
	 * @return roadhandling modifier
	 */
	public double getRoadHandlingModifier(){
		return 0.6 + (quality * 0.1);
	}
}
