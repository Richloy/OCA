public class JAT6Ex5{
  public static void main(String[] args){
    byte positionInQueue = 3;
	String ticketNo = "12345Z";
	
	switch(positionInQueue){
	  case 1:
	  case 2:
	  case 3:
	   System.out.println("Ticket No: " + ticketNo + "\nNo. in Queue: " + positionInQueue + " - please approach the front desk.");
	   break;
	  default: 
	   System.out.println("Ticket No: " + ticketNo + "\nNo. in Queue: " + positionInQueue + " - please remain seated.");
	  
	}// switch
	    
  }// main

}// class