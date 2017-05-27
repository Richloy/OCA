import java.util.Scanner;

public class JAT6Ex21{
	
	public static void main(String[] args){
		
		// Create a Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Create and populate the array
		String[][] passwords = new String[2][3]; 
		passwords[0][0] = "JavaDuke";
		passwords[0][1] = "JavaBean";
		passwords[0][2] = "TheNullPointer";
		passwords[1][0] = "StackOverflow";
		passwords[1][1] = "VirtualMachine";
		passwords[1][2] = "LossyPrecision";
		
		// Prompt the user for their password. 		
		
		// The user is given three attempts to enter the correct password.
		int attemptsAllowed = 3;
		int noOfAttemptsMade = 0;
		boolean passwordFound = false;
		
		breakLabel: do{
			System.out.print("Enter your password: ");
		    String passwordEntered = scanner.nextLine();
			
		  	for(int i=0; i<passwords.length; i++){
				for(int j=0; j<passwords[i].length; j++){
					if(passwords[i][j].equals(passwordEntered)){
						passwordFound = true;
						break breakLabel;
					}// if statement
				}// inner loop
			}// outer loop
			
		  noOfAttemptsMade++;
          System.out.println("Invalid log-in. " + (attemptsAllowed - noOfAttemptsMade) + " attempt(s) remaining.");		  
		}while(noOfAttemptsMade < attemptsAllowed);
		
		// Display a message to the user.
		if(passwordFound){
		  System.out.println("Log-In Successful.");	
		}else{
		  System.out.println("Log-In Failed");	
		}
	}// main
}// class
