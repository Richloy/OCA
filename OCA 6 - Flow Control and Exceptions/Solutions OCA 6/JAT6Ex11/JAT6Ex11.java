public class JAT6Ex11{

  public static void main(String[] args){
    byte[][] myBytes = new byte[][] { {1,2,3,4,5},{6,7,8,9,10,11} };
	
	int i=0;
	int j=0;
	
	while(i<myBytes.length){
	  while(j<myBytes[i].length){
	   System.out.print(myBytes[i][j++] + " ");
	  }// inner loop
	   System.out.println();
	   i++;  // increment
	   j=0;  // reset 
	}//outer loop

  }// main

}// class