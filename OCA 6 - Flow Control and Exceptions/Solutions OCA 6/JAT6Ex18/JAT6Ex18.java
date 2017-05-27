
public class JAT6Ex18{
 
  public static void main(String[] args){  
     
	 int i=0;
	 int j=0;
	 
	 while(i<10){
		 
	   while(j<10){	
         if(i==5){
		   break;
		 }	   
		 System.out.print(i + "-" + j++ + " ");		   
	   }// inner loop	 
	
	   j=0;
       i++;	
	   System.out.println();
	 }// outer loop
   
  }// main

}// class

