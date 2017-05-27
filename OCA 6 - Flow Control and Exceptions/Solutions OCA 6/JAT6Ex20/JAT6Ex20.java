
public class JAT6Ex20{
 
  public static void main(String[] args){  
     
	 int i=0;
	 int j=0;
	 
	 while(i<10){
		 
	   while(j<10){	
         if(j==5){
		   j++;
		   continue;
		 }	   
		 System.out.print(i + "-" + j + " ");
         j++;		 
	   }// inner loop	 
	
	   j=0; // reset
	   i++; // increment
	 
	   System.out.println();
	 }// outer loop
   
  }// main

}// class

