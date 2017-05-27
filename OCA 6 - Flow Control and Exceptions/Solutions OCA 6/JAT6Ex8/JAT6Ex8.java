public class JAT6Ex8{

  public static void main(String[] args){
    byte[] myBytes = new byte[10];
	
	 // populate the array
     for(int i=0; i<myBytes.length; i++){
	   myBytes[i]= (byte)(i+1);	
	 }// loop
	 
	 // display the contents of the array
	 for(int i=0; i<myBytes.length; i++){
	  System.out.print(myBytes[i]+ " ");
	 }// loop
	 
  }// main

}// class