public class LandLine2000 extends Phone implements Communicatable {

    public LandLine2000(String n, int no, float w, float h, float we, boolean isp, boolean isc) {
        super(n, no, w, h, we, isp, isc);
    }

    @Override
    public void makeCall(String noToDial) {
        System.out.println("Dialling Number " + noToDial + " on a " + getName());
    }

    @Override
    public void receiveCall(String incomingPhoneNo) {
        System.out.println("Incoming call from " + incomingPhoneNo + " on a " + getName());
    }

    @Override
    public void sendText(String messageToSend, String noToText) {
        System.out.println("Sending Text: " + messageToSend + " to number " + noToText + " on a " + getName());
    }

    @Override
    public void receiveText(String message, String incomingPhoneNo) {
        System.out.println("Receiving Text: " + message + " from number " + incomingPhoneNo + " on a " + getName());    
    }

    @Override
    public void recharge(boolean status) {
        setIsRecharging(status);
        if(status) {
            System.out.println(getName() + " is Recharging...");
        } else {
            System.out.println(getName() + " is not charging.");
        }
    }

    @Override
    public void hangUp() {
        System.out.println("Terminating a call on a " + getName());
    }
    
}
