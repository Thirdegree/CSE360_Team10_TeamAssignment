package car;

public class Tires {
	protected int durability;
	protected int speed;
	
	public Tires(){
		durability = 3;
		speed = 3; 		
	}
	public Tires(int durability, int speed){
		this.durability = durability;
		this.speed = speed; 
	}
	
	public int getDurability() {
		return durability;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	
	public double getSpeedModifier(){
		return (speed - 3)  * 0.3;
	}
	
	public double getDurabilityModifier(){
		return (durability - 3)  * 0.4;
	}
}
