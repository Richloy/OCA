
public class FrenchHorn extends Instrument {

	// Constructors:
	
	public FrenchHorn(String name, String sectionName, float weight) {
		super(name, sectionName, weight);
	}
	
	public FrenchHorn() {
		this("Unknown Instrument Name","Unknown Section Name",0);
	}
	
	@Override
	public String play(String piece) {
		return("French Horn playing " + piece + ".");
	}// method

}// class
