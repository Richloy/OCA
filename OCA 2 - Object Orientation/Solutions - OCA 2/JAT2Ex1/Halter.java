// Halter-related behaviour

public class Halter {
	
	// Instance Variable
	private String colour;
	
	// Constructors
	public Halter(){
		this("brown");
	}
	
	public Halter(String colour){
		this.colour=colour;
	}	

	public String halt(){		
		return "Halted...";
	}// method
	
}// class


