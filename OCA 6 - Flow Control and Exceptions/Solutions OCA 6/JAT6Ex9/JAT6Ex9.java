public class JAT6Ex9{

  public static void main(String[] args){
    byte[] myBytes = new byte[10];
	
	 // populate the array
	 int i=0;
	 
	 while(i<myBytes.length){
	   myBytes[i]= (byte)(++i);	 
	 }// loop
	 
	 // reset the counter
	 i=0;
	 
	 while(i<myBytes.length){
	   System.out.print(myBytes[i++] + " ");	 
	 }// loop
	 	 
  }// main

}// class