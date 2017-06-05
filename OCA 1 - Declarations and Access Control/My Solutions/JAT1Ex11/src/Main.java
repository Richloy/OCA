
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        G200 g200 = new G200("G200", 510, 4.5f, 8.6f, 80.5f, true, false);
        LandLine2000 ll2000 = new LandLine2000("LandLine 2000", 400, 5.6f, 8.5f, 80.5f, true, false);
        
        ArrayList<Communicatable> phoneList = new ArrayList<Communicatable>();
        phoneList.add(ll2000);
        phoneList.add(g200);
        
        for(Communicatable c: phoneList){
            System.out.println(c.toString());
            c.makeCall("0874646372"); 
            c.receiveCall("0864546342");
            c.hangUp();
            c.sendText("Hi,very warm!","0874546432");
            c.receiveText("Lucky you!","0864545454");
            c.recharge(true);
            if(c instanceof G200){
                G200 g2 = (G200)c;
                g2.streamVideo(); 
            }
            System.out.println();
        }
    }
    
}
