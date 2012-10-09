package Vehicle;

import Algorithm.GoAlgorithm;

/**
 * 
 * @author Anh
 *
 */
public abstract class Vehicle {
	
	private GoAlgorithm goAlgorithm;
	
	/**
	 * Constructor
	 */
	public Vehicle() {
		
	}
	
	/**
	 * 
	 */
	public void go() {
		this.goAlgorithm.go();
	}
	
	/**
	 * 
	 * @param goAlgorithm
	 */
	public void setGoAlgorithm(GoAlgorithm goAlgorithm) {
		this.goAlgorithm = goAlgorithm;
	}
	
	/**
	 * 
	 * @return
	 */
	public GoAlgorithm getGoAlgorithm() {
		return goAlgorithm;
	}
}
