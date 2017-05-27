public class Main {

	public static void main(String[] args){		
		// Create a Child Object
		Child c = new Child();
		
		// Call the Child object's blowWhistle() method.
		System.out.println(c.blowWhistle());
		
		System.out.println("");
		
        // Create a Referee object.
		Referee referee = new Referee();
		
		// Call the Referee object's blowWhistle method.
		System.out.println(referee.blowWhistle());

	}// main
	
}// class
