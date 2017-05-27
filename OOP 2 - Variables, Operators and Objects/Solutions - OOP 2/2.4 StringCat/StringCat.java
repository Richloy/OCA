// Assignment 2.4 StringCat
 
 public class StringCat{
	 
	public static void main(String[] args) {
		String message = "Hello ";
		message = message.concat("World");
		System.out.println(message);
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");	
		System.out.println(sb);		
	}
 }