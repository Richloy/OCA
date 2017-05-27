
public abstract class Instrument implements Playable {

	// If this class implements Playable, all classes that 
	// extend this class would implicitly implement Playable too.
	
	// Instance Variables
	
	private String name;
	private String sectionName;
	private float weight;
	
	// Constructors
	
	public Instrument(String name, String sectionName, float weight) {
		this.name = name;
		this.sectionName = sectionName;
	
		// Validate the weight
		if(weight < 0){
		  this.weight = 0;
	    }else{
	      this.weight=weight;
	    }
		
	}// method
	
	public Instrument(){
	   this("No Instrument Name","No Section Name", 0);
	}	
	
	// Setters and Getters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		// Validate the weight
		if(weight < 0){
		   this.weight = 0;
	    }else{
		   this.weight=weight;
	    }	
	}
	
}// class
