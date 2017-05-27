class JAT6Ex3 {
	public static void main(String[] args) {
		int pointsWon = 14;
		if(pointsWon >= 65) System.out.println("The team has qualified for the Champions League");
		else if(pointsWon > 56 && pointsWon < 65) System.out.println("The team has qualified for the Europa League");
		else if(pointsWon > 49 && pointsWon < 57) System.out.println("The team has finished mid-table");
		else if(pointsWon > 39 && pointsWon < 50) System.out.println("The team has finished in the lower-half of the table but has avoided relegation");
		else if(pointsWon < 40) System.out.println("The team has been relegated");
	}
}
