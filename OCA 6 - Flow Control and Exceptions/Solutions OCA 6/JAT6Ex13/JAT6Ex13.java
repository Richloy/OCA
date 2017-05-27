public class JAT6Ex13{

  public static void main(String[] args){
  
    int goingUp=-1,goingDown=11;
	
	while(! (goingUp == goingDown)){	
      System.out.print("Going Up: " + ++goingUp + " - Going Down: " + --goingDown + "\n");
	
	  if(goingUp == goingDown){
	   break;
	  }// if
	   
	}// loop

  }// main

}// class