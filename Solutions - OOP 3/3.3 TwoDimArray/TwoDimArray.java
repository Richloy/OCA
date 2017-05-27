// Assignment 3.3 TwoDimArray

public class TwoDimArray {

	public static void main(String[] args) {
		String[][] country_colours = new String[2][2];
		country_colours[0][0] = "Ireland";
		country_colours[0][1] = "Green";
		country_colours[1][0] = "France";
		country_colours[1][1] = "Blue";
		
		for (int index = 0; index < country_colours.length; index++){
		 for (int element = 0; element < country_colours[index].length; element++){
		  System.out.print(country_colours[index][element] + "\t");
		 }
		  System.out.println();
		}
	}
}