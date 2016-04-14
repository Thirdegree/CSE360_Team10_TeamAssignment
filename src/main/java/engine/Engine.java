package engine;

public class Engine {
	private int quality;
	
	public Engine(){
		quality = 1;
	}
	
	public int getQuality() {
		return quality;
	}
	
	public void upgradeQuality() {
		quality += (quality < 5) ? 1 : 0;
	}
}
