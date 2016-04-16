/** 
 * @author Joel Christiansen
 * 
 */
package track;

public class Track {
	
	private String startLocation;
	private String endLocation;
	private int distance;
	
	public Track(){
		startLocation = "Phoenix, AZ";
		endLocation = "Austin, TX";
		distance = 1006;
	} 
	
	public String getStartLocation() {
		return startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public int getDistance() {
		return distance;
	}
}
