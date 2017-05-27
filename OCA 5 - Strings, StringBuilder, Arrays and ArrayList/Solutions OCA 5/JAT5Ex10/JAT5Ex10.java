public class JAT5Ex10{
  public static void main(String[] args){
  
    // Create a StringBuilder object with the value: "John is a famous pop star"
    StringBuilder sb = new StringBuilder("John is a famous pop star");
  
    // Insert the String, "McCartney " after the word "John " in the StringBuilder.
	// Display the value stored in the StringBuilder object to the console.
	sb.insert(5,"McCartney ");
	System.out.println(sb.toString());
	
	// Append the String, " and former member of the Beatles group." to the existing StringBuilder.
	// Display the value stored in the StringBuilder object to the console.
	sb.append(" and former member of the Beatles group.");
	System.out.println(sb.toString());
	
	// Delete the String "pop" in the StringBuilder. Display the value stored in the StringBuilder object.
	sb.delete(27,31);
	System.out.println(sb.toString());
	
	// Reverse the contents of the StringBuilder and display the new value to the console.
	sb.reverse();
	System.out.println(sb.toString());
 }
}