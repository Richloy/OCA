import java.io.IOException;

public class JAT6Ex24{
  public static void main(String[] args){
    try{
	  new JAT6Ex24().methodA();
	}catch(IOException e){
	  System.out.println("The IOException object thrown in methodA() has been caught in the main method.");
	}
  }// main
  
  public void methodA()throws IOException{
	throw new IOException();
  }// method
  
}// class



