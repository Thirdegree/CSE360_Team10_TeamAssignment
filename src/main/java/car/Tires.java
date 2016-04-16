package car;

public class Tires {
	protected int durability;
	protected int speed;
	
	/**
	 * Tires default initializer
	 */
	public Tires(){
		durability = 3;
		speed = 3; 		
	}
	/**
	 * Tires initializer
	 * @param durability tire durability
	 * @param speed tire speed
	 */
	public Tires(int durability, int speed){
		setDurability(durability);
		setSpeed(speed); 
	}
	
	/**
	 * Gets the tire's durability.
	 * @return the tire's durability.
	 */
	public int getDurability() {
		return durability;
	}
	
	/**
	 * Gets the tire's speed.
	 * @return the tire's speed.
	 */
	public int getSpeed() {
		return speed;
	}
	
	
	/**
	 * Sets the tire's durability modifier
	 * @param durability the durability
	 * @throws IllegalArgumentException 
	 */
	public void setDurability(int durability) throws IllegalArgumentException{
		if ((durability < 1 ) || (durability > 5)){
			throw new IllegalArgumentException();
		} 
		
		this.durability = durability;
	}
	
	/**
	 * Set's the tire's speed
	 * @param speed the speed
	 * @throws IllegalArgumentException
	 */
	public void setSpeed(int speed) throws IllegalArgumentException{
		if ((speed < 1) || (speed > 5)){
			throw new IllegalArgumentException();
		} 
		
		this.speed = speed;
	}
	
	
	/**
	 * Gets the tire's speed modifier.
	 * @return the tire's speed modifier.
	 */
	public double getSpeedModifier(){
		return (speed - 3)  * 0.3;
	}
	
	/**
	 * Gets the tire's durability modifier.
	 * @return the tire's durability modifier.
	 */
	public double getDurabilityModifier(){
		return (durability - 3)  * 0.4;
	}
}
