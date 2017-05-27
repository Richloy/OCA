import java.util.Scanner;
import java.util.InputMismatchException;

public class JAT6Ex29{

  public static void main(String[] args){
    // Create a Scanner object
	Scanner input = new Scanner(System.in);
	
	String usersFavouriteFood;
	String usersFavouriteFoodTUC; 
	
	int sentinel = 1; // sentinel for loop
	
	UnhealthyFoods[] unhealthyFoods = UnhealthyFoods.values(); // enum to array.

    boolean foundUnhealthyFood = false; // a flag
	
	do{
 	 System.out.println("Enter the name of your favourite food.");
	 System.out.println("The program will determine whether it is considered an unhealthy food.");
	 System.out.print("Your entry: ");
	 usersFavouriteFood = input.nextLine(); 
	 usersFavouriteFoodTUC = usersFavouriteFood.toUpperCase(); // convert to uppercase to meet enum.
	 
	  // See if the user's entry is considered an unhealthy food, if so, throw an UnhealthyFoodException.
	  inner: for(UnhealthyFoods uf:unhealthyFoods){ // extract from the array.
	   if(usersFavouriteFoodTUC.equals(uf.toString())){ // toString() needs to be used here - NB.
          foundUnhealthyFood = true; // set the flag
		  break inner; // break the inner loop
       }
     }// for loop
	 
	 if(foundUnhealthyFood){  // evaluate the flag
	  try{
	   throw new UnhealthyFoodException();
	  }catch(UnhealthyFoodException e){
	   System.out.println(e.getMessage());
	  }// catch
	 }else{
	   System.out.println(usersFavouriteFood + " is not on the list of unhealthy foods.");
	 }
	 
	  try{
	   // prompt the user to go again,they could enter bad data. If so the program terminates.
	   System.out.print("Enter 1 to continue (any other no. to exit): "); 
	   sentinel = 0; // set by the program in case the user enters bad data.
	   sentinel = input.nextInt();
	   
	   // Push the Scanner on - read in the line break character.
	   input.nextLine();
	   
	   // reset the flag:
	   foundUnhealthyFood = false;
	   
	  }catch(InputMismatchException e){
	   System.out.println("Bad data entered. Program closing.");
	  }
	
	}while(sentinel == 1);

  }// main
}// class