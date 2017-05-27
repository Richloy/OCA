public class JAT6Ex14{

  public static void main(String[] args){
  
    int goingUp=-1,goingDown=11;
	
	do{
      System.out.print("Going Up: " + ++goingUp + " - Going Down: " + --goingDown + "\n");
	}while(! (goingUp == goingDown)) ;
	
  }// main

}// class