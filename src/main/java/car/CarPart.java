package car;

public class CarPart {

	protected int quality;
	protected int maxQuality;
	
	public CarPart(){
		quality = 0;
		maxQuality = 4;
	}
	
	public int getQuality() {
		return quality;
	}

	public boolean canUpgrade(){
		return (quality < maxQuality)? true : false;
	}
	
	public boolean upgradeQuality() {
		boolean upgradeSuccess = false;
		
		if (quality < maxQuality){
			++quality;
			upgradeSuccess = true;
		}
	
		return upgradeSuccess;
	}	
}
