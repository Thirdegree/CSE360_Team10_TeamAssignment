/** 
 * @author Joel Christiansen
 * 
 */
package track;

public class Track {
	private double disasters = 0.05;
	private double blessings = 0.05;
	private String startLocation;
	private String endLocation;
	private int length;
	
	public double getDisasters() {
		return disasters;
	}
	public double getBlessings() {
		return blessings;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public int getLength() {
		return length;
	}
}
