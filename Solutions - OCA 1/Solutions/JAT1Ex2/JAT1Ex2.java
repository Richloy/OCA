import static java.lang.System.out;

public class JAT1Ex2{

  public static void main(String[] args){
    	
	int maxValue = 0;

	  for (String s:args){
	   if(Integer.parseInt(s) > maxValue){
	     maxValue = Integer.parseInt(s);
	   }
	  }
	  
	out.println("Largest No. entered: " + maxValue);
  }
}