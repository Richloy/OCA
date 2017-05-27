public class JAT4Ex5{
  public static void main(String[] args){
      int a = 5;
	  a--;
	  
	  System.out.println("The value of a is " + a);  
	  
	  int v = 0;
	  v = ++a;
	  System.out.println("The value of v is " + v);    
	  System.out.println("The value of a is " + a);    
	  
	  int y = 0;
	  y = a++;
	  System.out.println("The value of y is " + y);     
	  System.out.println("The value of a is " + a);   
	  
	  int x = 0;
	  x = a--;
	  System.out.println("The value of x is " + x);    
	  System.out.println("The value of a is " + a);  
	  
	  int r = 0;                                     
	  r = --a;                                        
      System.out.println("The value of r is " + r);   
	  System.out.println("The value of a is " + a);   
	  
	  final int h = r--;
	  System.out.println("The value of h is " + h); 
	  System.out.println("The value of r is " + r); 
  }
}