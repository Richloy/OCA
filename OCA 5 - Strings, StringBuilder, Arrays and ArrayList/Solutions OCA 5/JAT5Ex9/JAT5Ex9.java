public class JAT5Ex9{
  public static void main(String[] args){
  
    // Create a StringBuilder object with the value: "Learning Java is fun"
    StringBuilder sb = new StringBuilder("Learning Java is fun");
  
    // Append the following String to the StringBuilder object.
	// " and rewarding.". Print the value of the StringBuilder object to the console.
    sb.append( " and rewarding.");
	System.out.println(sb.toString());
  
    // Insert the String " programming ", after the word "Java" in the StringBuilder object.
    // Print the value of the StringBuilder object to the console.
    sb.insert(14,"programming ");
	System.out.println(sb.toString());
	
	// Delete the String "Java", from the StringBuilder object.
	// Print the value of the StringBuilder object to the console.
	sb.delete(9,14);
	System.out.println(sb.toString());
	
	// Reverse the value of the String stored in the StringBuilder object. 
	// Print the value of the StringBuilder object to the console.
	sb.reverse();
	System.out.println(sb);
	
	// Reverse the value again and call the toString() method of the StringBuilder object.
	sb.reverse();
	System.out.println(sb.toString());
 }
}