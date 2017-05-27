public class JAT6Ex3{
  public static void main(String[] args){
	 int pointsWon = 14;
	 
	 if(pointsWon > 65){
		 System.out.println("The team has qualified for the Champions League.");
	 }else if (pointsWon >57 && pointsWon < 65){
		 System.out.println("The team has qualified for the Europa League.");
	 }else if (pointsWon >50 && pointsWon < 57){
	     System.out.println("The team has finished in mid-table.");
	 }else if (pointsWon >40 && pointsWon < 50){
		System.out.println("The team has finished in the lower-half of the table but has avoided relegation.");
	 }else{
		 System.out.println("The team has been relegated.");
	 }	
		 
  }// main	
}// class