
public class Violin extends Instrument {

	// Constructors:
	
	public Violin(String name, String sectionName, float weight) {
		super(name, sectionName, weight);
		// TODO Auto-generated constructor stub
	}
	
	public Violin() {
		this("Unknown Instrument Name","Unknown Section Name",0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String play(String piece) {
		return("Violin playing " + piece + ".");
	}// method

}// class
