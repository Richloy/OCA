 
public class G200 extends Phone implements Communicatable, Streamable {
	
	// Constructor
	
	public G200(String name, int noOfDisplayPixels, float width,
		float height, float weight, boolean poweredOn, boolean recharging) {
		super(name, noOfDisplayPixels, width, height, weight, poweredOn, recharging);
	}

	// Method Implementation
	
	public void makeCall(String noToDial) {  
	   System.out.println("Dialling number " + noToDial + " on a G200 phone.");
	}
	
	public void receiveCall(String incomingPhoneNo) {
	  System.out.println("Incoming call from " + incomingPhoneNo + " on a G200 phone.");
	}// method
	
	public void sendText(String messageToSend, String phoneNo){
		System.out.println("Sending text: " + messageToSend + " to phone no: " + phoneNo + " on a G200 phone.");
	}// method
	
	public void receiveText(String message, String phoneNo){
		System.out.println("Incoming text: " + message + " received from phone no: " + phoneNo + " on a G200 phone.");
	}// method
	
	public void recharge(boolean status){
	  setRecharging(status);
	   if(status == true){
		  System.out.println("G200 is currently recharging...");
	   }	 
	}
	
	public void hangUp() {
	  System.out.println("Terminating a phone call on a G200 phone.");
	}// method	
	
	public String streamVideo() {
		return "Streaming live video on a G200 phone...";
	} // method
 
}// class
