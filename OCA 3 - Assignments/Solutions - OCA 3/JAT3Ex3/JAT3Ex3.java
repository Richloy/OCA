public class JAT3Ex3{
	
  public static void main (String[] args){ 
	  int a = 65;
	  int b = a;
	  a = 3;
	  System.out.println(a); 
	  System.out.println(b);
	    
	  SuperDuper sd = new SuperDuper();
	  SuperDuper ds = new SuperDuper();
	  
	  if(sd == ds){
		System.out.println("Match");
	  }else{
		System.out.println("No Match");  
	  }
	  
	  SuperDuper superDuper = new SuperDuper();
	  sd = superDuper;                          
	  
	  if(sd == superDuper){
		System.out.println("Match");
	  }else{
		System.out.println("No Match");  
	  }
	  
	  ds = superDuper;                          
	  
	  if(sd == ds){
		System.out.println("Match");
	  }else{
		System.out.println("No Match");  
	  }
	  
	  System.out.println(sd == null);           
	  System.out.println(superDuper == null);
  }	
}

/*
An object is eligible for GC, once there are no more live references to the object.

I will refer to the line numbers in the question on the exercise sheet.

On Line 9, a SuperDuper object is created. The object reference variable is sd.

On Line 19 the object reference sd is made to point to a different object (created on Line 18).

This causes the object previously referenced to become eligible for garbage collection.
(Line 19 is the answer)

On Line 10, a SuperDuper object is created. The object reference is ds. 

On Line 27, the object reference ds is made to point to a different object (created on Line 18).

This causes the object previously referenced to become eligible for garbage collection.
(Line 27 is the answer)
*/