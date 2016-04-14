package car;

public class CarPart {

	protected int quality;
	
	public CarPart(){
		quality = 0;
	}
	
	public int getQuality() {
		return quality;
	}
	
	public boolean upgradeQuality() {
		boolean upgradeSuccess = false;
		
		if (quality < 4){
			++quality;
			upgradeSuccess = true;
		}
		
		return upgradeSuccess;
	}

}
