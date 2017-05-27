/*	Q2 – JAT1Ex2
	Write a Java program, which determines the largest number entered by a user at the command
	prompt. Investigate the methods of the Integer class when writing your solution.
	Make use of the static imports feature when displaying the largest number in the console.
	Save your class as JAT1Ex2.java
*/

public class JAT1Ex2{
	
	public static void main(String[] args){
		int[] nums = new int[args.length];
		int large;
		int biggest = 0;
		for(String item: args){
			large = Integer.parseInt(item);
			if (large > biggest){
				biggest = large;
			}
			
		}
		
		System.out.println("Largest No: " + biggest);
	}
}
