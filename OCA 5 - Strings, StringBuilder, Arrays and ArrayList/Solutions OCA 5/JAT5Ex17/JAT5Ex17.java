import java.util.ArrayList;
import java.util.List;

public class JAT5Ex17{

   public static void main(String[] args){
     List<String> filmStars = new ArrayList<String>();  
     
	 // add (element)
	 filmStars.add("Elvis Presley");
	 filmStars.add("Marilyn Monroe");
	 filmStars.add("James Dean");
	 filmStars.add("Rita Davies");
	 
	 // add (index,element)
	 filmStars.add(2,"Cary Grant");
	 
	 // contains
	 System.out.println("Is Marilyn Monroe in the list? " + filmStars.contains("Marilyn Monroe"));
	 
	 // get(index)
	 System.out.println("At index position four of the list is: " + filmStars.get(4));
	 
	 // indexOf
	 System.out.println("James Dean is at index position: " + filmStars.indexOf("James Dean"));
	 
	 // remove(object)
	 filmStars.remove("Rita Davies");
	 
	 // size() method
	 System.out.println("\nPrinting the contents of the ArrayList: ");
	 for(int i=0; i<filmStars.size(); i++){
	   System.out.println(filmStars.get(i));
	 }
   }
}