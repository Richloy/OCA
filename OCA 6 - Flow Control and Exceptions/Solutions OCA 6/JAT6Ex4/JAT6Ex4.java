public class JAT6Ex4{
  public static void main(String[] args){
    int noLoyaltyPointsEarned = 149;
	
	if (noLoyaltyPointsEarned > 350){
	    System.out.println("You have earned 75 Euro off your next shopping bill!");
	}else if(noLoyaltyPointsEarned > 250){
	    System.out.println("You have earned 50 Euro off your next shopping bill!");
	}else if(noLoyaltyPointsEarned > 150){
	    System.out.println("You have earned 35 Euro off your next shopping bill!");
	}else{
	    System.out.println("You do not qualify for any gifts.");
	}
	    
  }// main

}// class