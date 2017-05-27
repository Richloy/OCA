import java.io.IOException;

public class JAT6Ex25{
  public static void main(String[] args){
	new JAT6Ex25().methodA();
  }// main
  
  public void methodA(){
    try{
	  throw new IOException();
	}catch(IOException e){
      System.out.println("The IOException object thrown in methodA() has been caught in methodA().");
    }	
	  
  }// method
  
}// class



