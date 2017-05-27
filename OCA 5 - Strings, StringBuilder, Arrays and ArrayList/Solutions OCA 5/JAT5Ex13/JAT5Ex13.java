public class JAT5Ex13{
  public static void main(String[] args){
	  int salesData[][] = new int[3][4]; // rows and columns
		
	  salesData[0][0] = 12000;
	  salesData[0][1] = 13000;
	  salesData[0][2] = 14000;
	  salesData[0][3] = 15000;
		
	  salesData[1][0] = 13000;
	  salesData[1][1] = 14000;
	  salesData[1][2] = 15000;
	  salesData[1][3] = 16000;
		
	  salesData[2][0] = 10000;
	  salesData[2][1] = 12000;
	  salesData[2][2] = 15000;
	  salesData[2][3] = 13000;
		
	  for(int i=0; i<salesData.length; i++){
	    System.out.println("Year " + (i+1));	
	   for(int j=0; j<salesData[i].length; j++){
	     if(j<3){
		  System.out.print(salesData[i][j] + " ");
		 }else{ 
		  System.out.println(salesData[i][j]);
		 } 
	   }// inner for
	    	
	  }// outer for
 }
}

