public class JAT2Ex7{
	
	public static void main(String[] args){
		
		   Tree tree = new Tree();        // Q1 - Compiles
		
	
		   //Oak o = new Tree();          // Q2 - no compile.
		
		
		   // Tree t = new Choppable();    // Q3 - no compile.
		
				
		  // Tree t2 = new Oak();           // Q4 - compiles
		   
		  //Choppable c = new Oak();       // Q5 - compiles   
		  
		  //System.out.println(t2.chop()); // Q6 - compiles and outputs: "Chopping oak wood."
		   
		   
		  // System.out.println(t2.fell()); // Q7 - no compile
		   
		  //Oak t3 = (Oak) t2;              // Q8 - Compiles
		  
		  // System.out.println(t3.fell());  // Q9 - Compiles
		
		  //Bicycle b1 = new Bicycle();      // Q10 - Compiles
		  // Tree t4 = b1;                  // Q11 - No Compiles
		
		   
		  // Oak t5 = (Oak) tree;           // Q12 - Compiles but results in a class cast exception.
		
		  Oak t6 = (String) tree;          // Q13 - Compiler error.
		
	}// main
	
	
}