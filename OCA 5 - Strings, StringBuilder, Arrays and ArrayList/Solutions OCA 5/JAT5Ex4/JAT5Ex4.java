public class JAT5Ex4{
  public static void main(String[] args){
	String duke = "Java Duke";
    	
	// Question 1:
	char a = duke.charAt(2); // v
	System.out.println("The character at index position 2 is: " + a);
	
	// Question 2:
	duke = duke.concat(" Mascot");
	System.out.println("The new value stored in String 'duke' is " + duke);
	
	// Question 3:
	int length = duke.length();
	System.out.println("The length of String 'duke' is: " + length + " characters.");
	
	// Question 4:
	duke = duke.replace("Mascot", "Icon");
	System.out.println("The new value stored in String 'duke' is " + duke);
	
	// Question 5:
	duke = duke.substring(5,14);
	System.out.println("The new value stored in String 'duke' is " + duke);
 }
}