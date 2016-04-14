package car;

public class Engine extends CarPart{
	
	public Engine(){
		super();
	}

	public double getSpeedModifier() {
		return quality * 0.20;
	}
}
