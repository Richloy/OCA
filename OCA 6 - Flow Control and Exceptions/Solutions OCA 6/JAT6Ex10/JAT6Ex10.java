public class JAT6Ex10{

  public static void main(String[] args){
    byte[][] myBytes = new byte[][] { {1,2,3,4,5},{6,7,8,9,10,11} };
	
	for(int i=0; i<myBytes.length; i++){
	  for(int j=0; j<myBytes[i].length; j++){
	    System.out.print(myBytes[i][j] + " ");
	  }// inner loop
	    System.out.println();
	}// outer loop
	
  }// main

}// class