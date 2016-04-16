package car;

public class CarPart {

	protected int quality;
	protected int maxQuality;
	
	/**
	 * CarPart initializer. 
	 */
	public CarPart(){
		quality = 0;
		maxQuality = 4;
	}
	
	/**
	 * Gets the part quality
	 * @return quality
	 */
	public int getQuality() {
		return quality;
	}

	/**
	 * Checks if the part can be upgraded.
	 * @return True if the part can be upgraded, false otherwise.
	 */
	public boolean canUpgrade(){
		return (quality < maxQuality)? true : false;
	}
	
	/**
	 * Increments quality if possible.
	 * @returns True if the upgrade was successful, false otherwise.
	 */
	public boolean upgradeQuality() {
		boolean upgradeSuccess = false;
		
		if (quality < maxQuality){
			++quality;
			upgradeSuccess = true;
		}
	
		return upgradeSuccess;
	}	
}
