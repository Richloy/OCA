public class JAT2Ex6{

  public static void main(String[] args){
     Animal a = new Animal();     // Line 1
	 Horse h = new Horse();       // Line 2
	
	 Animal any = new Horse();    // Line 3
	 //Horse happy = a;             // Line 4 Compiler Error
	 
	 //Horse jack = (Horse) a;   // Line 5 Class Cast Exception
	 
	 // Horse hop = any;          // Line 6 Compiler Error
	 
	 // Horse hip = (Horse) any;     // Line 7 Compiles
	 
	 // Horse henny = (String) a;    // Line 8 Compiler error
	 
  }// main

}// class