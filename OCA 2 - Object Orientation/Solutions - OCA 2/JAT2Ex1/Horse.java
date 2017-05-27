public class Horse {

	// Horse HAS-A Halter
	private Halter halter = new Halter(); 
	
	public String halt(){
	 // Use the Halter reference to halt the horse.
	 return "Horse: " + halter.halt();
	}// method
	
}// class
