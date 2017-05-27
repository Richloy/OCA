// Assignment 2.3 Bools

 public class Bools{
	 
  public static void main(String[] args) {
	boolean b1 = true;
	boolean b2 = false;
		
	System.out.println("b1 = " + b1 + "\nb2 = " + b2);
		
	boolean b3 = !b1;
	System.out.println("b3 reversed = " + b3);
		
	b3 = b1 || b2;
	System.out.println("b3 OR = " + b3);
		
	boolean b4 = Boolean.parseBoolean("true");
    System.out.println("b3 AND b4 = " + (b3 && b4));
  }
 }