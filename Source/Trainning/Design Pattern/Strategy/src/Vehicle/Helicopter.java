package Vehicle;

import Algorithm.GoByFlyingAlgorithm;

/**
 * 
 * @author Anh
 *
 */
public class Helicopter extends Vehicle {
	
	public Helicopter() {
		setGoAlgorithm(new GoByFlyingAlgorithm());
	}
	
	public void go() {
		System.out.print("helicopter  : ");
		super.go();
	}

}
