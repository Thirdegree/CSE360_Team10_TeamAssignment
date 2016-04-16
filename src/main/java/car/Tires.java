package car;

public class Tires {
	protected int durability;
	protected int speed;
	
	public Tires(){
		durability = 3;
		speed = 3; 		
	}
	public Tires(int durability, int speed){
		setDurability(durability);
		setSpeed(speed); 
	}
	
	
	public int getDurability() {
		return durability;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	
	public void setDurability(int durability) throws IllegalArgumentException{
		if ((durability < 1 ) || (durability > 5)){
			throw new IllegalArgumentException();
		} 
		
		this.durability = durability;
	}
	
	public void setSpeed(int speed) throws IllegalArgumentException{
		if ((speed < 1) || (speed > 5)){
			throw new IllegalArgumentException();
		} 
		
		this.speed = speed;
	}
	
	
	public double getSpeedModifier(){
		return (speed - 3)  * 0.3;
	}
	
	public double getDurabilityModifier(){
		return (durability - 3)  * 0.4;
	}
}
