package Vehicle;

/**
 * 
 * @author Anh
 *
 */
public class StartTheRace {
	
	public static void main(String args[]) {
		
		// Define vehicle
		StreetRacer streetRacer = new StreetRacer();
		Helicopter  helicopter  = new Helicopter();
		Jet         jet         = new Jet();
		
		// Run it
		streetRacer.go();
		helicopter.go();
		jet.go();
		
		// Speed up for helicopter
		helicopter.setGoAlgorithm(jet.getGoAlgorithm());
		helicopter.go();
		
	}
	
}
