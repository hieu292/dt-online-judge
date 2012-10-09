package Vehicle;

import Algorithm.GoByDrivingAlgorithm;

/**
 * 
 * @author Anh
 *
 */
public class StreetRacer extends Vehicle {
	
	public StreetRacer() {
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}
	
	public void go() {
		System.out.print("streetRacer : ");
		super.go();
	}
}
