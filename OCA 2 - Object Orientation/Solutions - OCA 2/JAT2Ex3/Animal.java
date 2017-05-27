public class Animal implements Moveable{
   public String move(){
     return "Animal moving..";
   }

   public void sleep(int noOfHours){
	   System.out.println("Animal sleeping for " + noOfHours + " hours.");	   
   }   
}