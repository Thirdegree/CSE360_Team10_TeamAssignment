/** 
 * @author Joel Christiansen
 * 
 */
package track;

public class Track {
	
	private String startLocation;
	private String endLocation;
	private int distance;
	
	/**
	 * First initializer. 
	 */
	public Track(){
		startLocation = "Phoenix, AZ";
		endLocation = "Austin, TX";
		distance = 1006;
	} 
	
	/**
	 * Second initializer. 
	 */
	public Track(String startLocation, String endLocation, int distance) {
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.distance = distance;
	}
	
	/*
	 * Returns the start location
	 */
	public String getStartLocation() {
		return startLocation;
	}
	/*
	 * Returns the end location
	 */
	public String getEndLocation() {
		return endLocation;
	}
	/*
	 * Returns the distance.
	 */
	public int getDistance() {
		return distance;
	}
}
