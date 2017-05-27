import java.text.DecimalFormat;

public class JAT1Ex13{
   public static void main(String[] args){
      // Create objects
	  CurrentAccount sa1 = new CurrentAccount("Billy","Bonds","3434S");
	  sa1.makeLodgement(40);
	  CurrentAccount sa2 = new CurrentAccount("Clare","Taylor","5441S");
	  sa2.makeLodgement(100);
	  CurrentAccount sa3 = new CurrentAccount("Anna","Long","6431S");
	  sa3.makeLodgement(135);
	  
	  System.out.println(sa1);
	  System.out.println("Withdrawal Request: 50 ");
	  sa1.makeWithdrawal(50);  // Withdrawal
	  System.out.println("Balance: " + sa1.getBalance());
	  System.out.println("\n");
	  
	  System.out.println(sa2);
	  System.out.println("Withdrawal Request: 600 ");
	  sa2.makeWithdrawal(600);  // Withdrawal
	  System.out.println("Balance: " + sa2.getBalance());
	  System.out.println("\n");
	  
	  System.out.println(sa3);
	  System.out.println("Withdrawal Request: 60 ");
	  sa3.makeWithdrawal(60);  // Withdrawal
	  System.out.println("Balance: " + sa3.getBalance());
	  System.out.println("\n");	
	  
	  // Create a DecimalFormat object
      DecimalFormat df = new DecimalFormat(".00");
	  
	  // Access the static variables
	  System.out.println("No. of current accounts: " + CurrentAccount.noOfSavingsAccounts);
	  System.out.println("Sum of balances held : " + df.format(CurrentAccount.totalAmountSaved));
	  System.out.println("Average balance held per customer: " + df.format(CurrentAccount.getAverageSavingsAmount()));	   
   }

}