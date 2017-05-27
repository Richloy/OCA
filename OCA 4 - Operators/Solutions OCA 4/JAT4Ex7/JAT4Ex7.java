public class JAT4Ex7{
   public static void main(String args[]){
      // Ticket Sales
	  int age = 12;
      double ticketPrice = (age<12) ? 4.50 :  12.50;
      System.out.println(ticketPrice);
	  
	  // Gold Coins
	  boolean isCaptain = true;
      int goldCoins = (isCaptain == true) ? 10 : 5;
      System.out.println(isCaptain);
	  
	  // Employee Salary
	  double mySalary = 26000;
      double taxDue = (mySalary >= 20000) ? (mySalary*0.35) : (mySalary*0.15);
      System.out.println(taxDue);
	  
	  // Student Travel Allowance
	  boolean isStudent = true;
      double distanceThreshold = 10.00; // miles
      double distanceToTravel = 2.03;   // miles
      double travelAllowance = (isStudent == true)? (distanceToTravel>distanceThreshold)? 20 : 10 : 0;
      System.out.println(travelAllowance);

	  // At the pub
	  boolean isSober = true;
	  age = 18;
	  String admittance = (age >= 18) ? (isSober == true) ? "Enter" : "No Admittance - not sober" : "No Admittance - not overage";
      System.out.println(admittance);
	  
	  // At the ATM
	  float customerBalance = 300.45f;
	  float withdrawalRequest = 200.00f;
	  float maxCashWithdrawal = 200.00f;
	  String messageExcessCashRequest = "Sorry, the maximum cash withdrawal request is for 200 Euro.";
	  String messageInsufficientFunds = "Sorry, you do not have sufficient funds for this transaction.";
	  String messageSuffientFunds = "Withdrawl processed - please remove notes from dispenser."; 
      
	  String withdrawalOutcome = (withdrawalRequest > maxCashWithdrawal) ? messageExcessCashRequest : 
	  (withdrawalRequest > customerBalance) ? messageInsufficientFunds : messageSuffientFunds;
	  
	  System.out.println(withdrawalOutcome); 
   }	
}