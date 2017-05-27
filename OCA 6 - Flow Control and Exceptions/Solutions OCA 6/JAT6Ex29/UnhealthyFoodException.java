public class UnhealthyFoodException extends Exception{
  private String message;

  public UnhealthyFoodException(){
    message = "That's an unhealthy food!";
  }// constructor

  public String getMessage(){
   return message;
  }// method

}// class