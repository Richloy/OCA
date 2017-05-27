import java.util.Scanner;
import java.util.InputMismatchException;

public class JAT6Ex23{
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		String tryAgain = "";
		int noEntered = 0;
		
		do{		
		  try{
			tryAgain = "No"; 
		    System.out.print("Please enter a number: ");
		    noEntered = scanner.nextInt();
		    System.out.println("The number that you have entered is: " + noEntered);
		  }catch(InputMismatchException e){	
		   scanner.nextLine(); // push the scanner forward.
		   System.out.print("Invalid Entry - Numbers Only - Enter Yes to continue | No to exit. ");
		   tryAgain = scanner.nextLine();
		  }
		}while(tryAgain.equalsIgnoreCase("Yes"));
		
	}// main

}// class

/*
An InputMismatchException is an unchecked exception. The compiler does not force you to 'handle or declare' this
type of exception.
*/


