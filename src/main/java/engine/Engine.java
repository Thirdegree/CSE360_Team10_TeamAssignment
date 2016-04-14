package engine;

public class Engine {
	private int quality;
	
	public Engine(){
		quality = 1;
	}
	
	public int getQuality() {
		return quality;
	}
	
	public boolean upgradeQuality() {
		boolean upgradeSuccess = false; 
		if (quality < 5){
			++quality;
			upgradeSuccess = true;
		}
		return upgradeSuccess;
	}
}
