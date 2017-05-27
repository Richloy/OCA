public class Reindeer {

	// HAS-A behaviour
	private Halter halter = new Halter();
	
	public String halt(){
		// Use the Halter reference to halt the Reindeer.
		return "Reindeer: " + halter.halt();
	}
	
}// class
