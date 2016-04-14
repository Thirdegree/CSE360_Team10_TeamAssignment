package car;

public class Tires {
	protected int durability;
	protected int speed;
	
	public Tires(){
		speed = 3; 
		durability = 3;
	}
	
	public int getDurability() {
		return durability;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public double speedModifier(){
		return (speed - 3)  * .3;
	}
}
