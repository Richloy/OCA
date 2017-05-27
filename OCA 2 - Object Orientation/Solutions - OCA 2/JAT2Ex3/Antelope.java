public class Antelope extends Animal{
  @Override
  public String move(){
     return "Antelope moving..";
   }
   
  public void joinHerd(){
	   System.out.println("Joining other Antelopes....");
   }
   
   public void sleep(int noOfHours, int noOfMinutes){
	   System.out.println("Antelope sleeping for " + noOfHours + " hours and " + noOfMinutes + " minutes." );	   
   } 
   
}