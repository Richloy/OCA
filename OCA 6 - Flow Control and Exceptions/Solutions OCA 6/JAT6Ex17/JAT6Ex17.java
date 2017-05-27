
public class JAT6Ex17{
 
  public static void main(String[] args){  
     for(int i=0; i<10; i++){
	   for(int j=0; j<10; j++){
	      
		   if(i==5){
			 break;			 // or continue
		   }// if 
		   
		   System.out.print(i + "-" + j + " ");
	   }// inner
	   System.out.println();
	 
	 }// outer
   
  }// main

}// class

