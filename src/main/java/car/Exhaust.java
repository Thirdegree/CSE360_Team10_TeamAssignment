package car;

public class Exhaust extends CarPart{
	
	Exhaust(){
		super();
	}
	
	public double getSpeedModifier() {
		return quality * 0.1;
	}

}
