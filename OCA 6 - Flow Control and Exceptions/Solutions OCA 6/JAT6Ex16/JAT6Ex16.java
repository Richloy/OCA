
public class JAT6Ex16{

  enum TicketType {SINGLE,RETURN,MONTHLY,ANNUAL}

  public static void main(String[] args){
   
   for(TicketType ticket:TicketType.values()){
     System.out.println(ticket);
   }// loop
  
  }// main

}// class