
public class JAT6Ex19{
 
  public static void main(String[] args){  
     for(int i=0; i<10; i++){
	   for(int j=0; j<10; j++){
	      
		   if(j==5){
			 continue;
		   }// if 
		   
		   System.out.print(i + "-" + j + " ");
	   }// inner
	   System.out.println();
	 
	 }// outer
   
  }// main

}// class

