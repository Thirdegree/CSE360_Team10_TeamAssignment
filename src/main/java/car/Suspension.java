package car;

public class Suspension extends CarPart{
	
	Suspension(){
		super();
	}
	
	public double getRoadHandlingModifier(){
		return 0.6 + (quality * 0.1);
	}
}
