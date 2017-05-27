class JAT6Ex4 {
		public static void main(String[] args) {
		int noLoyaltyPointsEarned = 149;
		if(noLoyaltyPointsEarned < 150) {
			System.out.println("No Gift");
		} else if(noLoyaltyPointsEarned >= 151 && noLoyaltyPointsEarned <= 250) {
			System.out.println("35 Euro off your next shopping bill");
		} else if(noLoyaltyPointsEarned >= 251 && noLoyaltyPointsEarned <= 350) {
                        System.out.println("50 Euro off your next shopping bill");
                } else {
                        System.out.println("75 Euro off your next shopping bill");
                }
	}
}
