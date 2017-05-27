
public class LandLine2000 extends Phone implements Communicatable {
	
	// Constructor
	
	public LandLine2000(String name, int noOfDisplayPixels, float width,
		float height, float weight, boolean poweredOn, boolean recharging) {
		super(name, noOfDisplayPixels, width, height, weight, poweredOn, recharging);
	}

	// Method Implementation
	
	public void makeCall(String noToDial) {  
	   System.out.println("Dialling number " + noToDial + " on a LandLine2000 phone.");
	}
	
	public void receiveCall(String incomingPhoneNo) {
	  System.out.println("Incoming call from " + incomingPhoneNo + " on a LandLine2000 phone.");
	}// method
	
	public void sendText(String messageToSend, String phoneNo){
		System.out.println("Sending text: " + messageToSend + " to phone no: " + phoneNo + " on a LandLine2000 phone.");
	}// method
	
	public void receiveText(String message, String phoneNo){
		System.out.println("Incoming text: " + message + " received from phone no: " + phoneNo + " on a LandLine2000 phone.");
	}// method
	
	public void recharge(boolean status){
	  setRecharging(status);
	   if(status == true){
		  System.out.println("Landline 2000 is currently recharging...");
	   }	 
	}
	
	public void hangUp() {
	  System.out.println("Terminating a phone call on a LandLine2000 phone.");
	}// method	
 
}// class
