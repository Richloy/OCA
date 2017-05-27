public class JAT6Ex12{

  public static void main(String[] args){
    
	for(int goingUp=0,goingDown=10; goingUp<10; goingUp++, goingDown--){
	  System.out.print("Going Up: " + goingUp + " - Going Down: " + goingDown + "\n");
	  if(goingUp == goingDown){
	   break;
	  }
	}// loop

  }// main

}// class