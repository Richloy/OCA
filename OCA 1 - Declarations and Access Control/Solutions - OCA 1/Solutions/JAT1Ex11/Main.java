import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		// Create a LandLine2000 phone
		LandLine2000 ll2 = new LandLine2000("LandLine 2000", 400, 5.6f, 8.5f, 80.5f, true, false);
				
		// Create a G200 phone
		G200 g200 = new G200("G200", 510, 4.5f, 8.6f, 80.5f, true, false);
		
		System.out.println("**********Test Phone Functionality**********");
		
		// Create an ArrayList 
	    ArrayList<Communicatable> phones = new ArrayList<Communicatable>();
		
		// Add object references to ArrayList
		phones.add(ll2);
		phones.add(g200);
		
		// Iterate through the collection calling behaviours
		for(Communicatable c: phones){
			System.out.println(c.toString());
			c.makeCall("0874646372"); 
			c.receiveCall("0864546342");
			c.hangUp();
			c.sendText("Hi,very warm!","0874546432");
			c.receiveText("Lucky you!","0864545454");
			c.recharge(true);
			
			if(c instanceof G200){
              G200 objG200 = (G200) c;				
			  System.out.println(objG200.streamVideo());
			}
			
			System.out.println("");
		}// enhanced for loop
		
	} // main	
	
}// class
