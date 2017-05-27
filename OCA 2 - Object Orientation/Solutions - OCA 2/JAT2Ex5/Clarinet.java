
public class Clarinet extends Instrument {

	// Constructors:
	
	public Clarinet(String name, String sectionName, float weight) {
		super(name, sectionName, weight);
	}
	
	public Clarinet() {
		this("Unknown Instrument Name","Unknown Section Name",0);
	}
	
	@Override
	public String play(String piece) {
		return ("Clarinet playing " + piece + ".");
	}// method

}// class
