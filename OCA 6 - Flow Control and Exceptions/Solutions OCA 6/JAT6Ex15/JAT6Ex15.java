import java.util.ArrayList;

public class JAT6Ex15{

  public static void main(String[] args){
   ArrayList<String> campingTripBookings = new ArrayList<String>(); 
   campingTripBookings.add("Fred Smith");
   campingTripBookings.add("Helena Davis");
   campingTripBookings.add("Brian Burrows");
   campingTripBookings.add("Jane Beagles");
   
   System.out.println("The follow people have booked their place on the trip: ");
   
   for(String s:campingTripBookings){
    System.out.println(s);
   }// enhanced for
   
  }// main

}// class