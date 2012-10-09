package Vehicle;

import Algorithm.GoByFlyingAlgorithmFast;

/**
 * 
 * @author Anh
 *
 */
public class Jet extends Vehicle {

	public Jet() {
		setGoAlgorithm(new GoByFlyingAlgorithmFast());
	}
	
	public void go() {
		System.out.print("jet         : ");
		super.go();
	}
	
}
