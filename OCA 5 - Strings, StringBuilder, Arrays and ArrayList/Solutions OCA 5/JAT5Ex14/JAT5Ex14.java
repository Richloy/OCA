public class JAT5Ex14{
  public static void main(String[] args){
	 // Declare the 2D array
		float temps [][] = new float [2][12];
			
		// Populate the arrays
		temps[0][0] = 9.0f;
		temps[0][1] = 9.1f;
		temps[0][2] = 11.2f;
		temps[0][3] = 12.0f;
		temps[0][4] = 14.1f;
		temps[0][5] = 18.0f;
		temps[0][6] = 23.0f;
		temps[0][7] = 21.1f;
		temps[0][8] = 20.0f;
		temps[0][9] = 13.0f;
		temps[0][10] = 10.1f;
		temps[0][11] = 9.0f;
		
		temps[1][0] = 8.0f;
		temps[1][1] = 8.1f;
		temps[1][2] = 10.2f;
		temps[1][3] = 11.0f;
		temps[1][4] = 14.1f;
		temps[1][5] = 17.0f;
		temps[1][6] = 22.0f;
		temps[1][7] = 22.1f;
		temps[1][8] = 21.0f;
		temps[1][9] = 12.0f;
		temps[1][10] = 11.1f;
		temps[1][11] = 8.0f;
		
		// Part A:
		System.out.println("Part A\n");
		
		// Display the contents of the array
		for(int i=0; i<temps.length; i++){
		    System.out.println("Year " + (i+1));
			for(int j=0; j<temps[i].length; j++){
                if(j<11){			
				 System.out.print(temps[i][j] + " ");
				}else{
				 System.out.println(temps[i][j]);
				}
			}// loop
		}// loop
		
		// Part B:
		System.out.println("\nPart B\n");
		
		int year = 0;
		int month = -1;
		
		for(float[] oneD:temps){
		  System.out.println("Year " + ++year);
		  month = -1;
          for(float f:oneD){
		    month++;
			if(month<11){
			 System.out.print(f + " ");
			}else{
		    System.out.println(f);
			}
		  }// inner for loop
        }// outer for loop		
   }// main
}// class

