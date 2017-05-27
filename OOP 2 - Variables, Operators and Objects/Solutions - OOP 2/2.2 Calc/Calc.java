// Assignment 2.2 Calc

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter 2 values to be added together.");
		
		int num1 = 0;
		int num2 = 0;
		int total = 0;
		
		System.out.print("Please enter value one: " );
		num1 = userInput.nextInt();
		
		System.out.print("Please enter value two: " );
		num2 = userInput.nextInt();
		
        total = (num1 + num2);		
		
		System.out.println("Total: " + total);
		
		userInput.close();	
	}
}