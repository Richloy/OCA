
public interface Communicatable {

	public void makeCall(String noToDial); 
	public void receiveCall(String incomingPhoneNo); 
	public void sendText(String messageToSend, String phoneNo);
	public void receiveText(String message, String phoneNo); 
	public void recharge(boolean status); 
	public void hangUp();	
	
}// interface
