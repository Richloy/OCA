public class JAT4Ex9{
   public static void main(String args[]){
     // Q1:
	 
	 int x = 3;
     int y = 20; 

     if ((x++>3) | (y-- < 20) && (x++ < y) ){
      System.out.println("The expression evaluates to true.");
     }else{
      System.out.println("The expression evaluates to false.");
     }
	 
	 System.out.println("The value of x is: " + x);
	 System.out.println("The value of y is: " + y);
	 
	 System.out.println("**********************************");
   
    // Q2:
   
    int a = 5;
    int b = 2;

    if ((a<30 ^ b<20) && (b < --a)){
      System.out.println("The expression evaluates to true.");
    }else{
	  System.out.println("The expression evaluates to false.");
	}

	System.out.println("The value of a is: " + a);
	System.out.println("The value of b is: " + b);

	System.out.println("**********************************");
	
	// Q3:
	
	int e = 3;
    int f = 2;

    if ((++e>--f ^ e < 4) | !(f < f--)){                                     
      System.out.println("The expression evaluates to true.");
    }else{
	  System.out.println("The expression evaluates to false.");
	}
	
	System.out.println("The value of e is: " + e);
	System.out.println("The value of f is: " + f);

  }
}

