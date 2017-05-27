public class JAT4Ex8{
   public static void main(String args[]){
      // Q1:   
      boolean x = false;
      int y = 6;

      if((x=true) & (++y==7)){
       System.out.println("Expression evaluates to true.");
      }else{
       System.out.println("Expression evaluates to false.");
      }
	  
	 // Q2:
     int z = 5;
     if(z++ > 5 ||  ++z > 6) z++;
     System.out.println("The value of z is: " + z);

	 // Q3:
	 int a = 2; 
     int b = a++;  
	 
     if(b++ > 1  | --a > 2){ 
	   --a; 
	   b--;
     }	   
     System.out.println("The value of a is: " + a);
     System.out.println("The value of b is: " + b); 
   }	
}