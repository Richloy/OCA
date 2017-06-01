class TwoDimArray {
	public static void main(String[] args) {
		String[][] rugbyColours = new String[4][2];
		rugbyColours[0][0] = "Ireland";
                rugbyColours[0][1] = "Green";

		rugbyColours[1][0] = "England";
                rugbyColours[1][1] = "White";

		rugbyColours[2][0] = "Scotland";
                rugbyColours[2][1] = "Navy";

		rugbyColours[3][0] = "Wales";
                rugbyColours[3][1] = "Red";

		for(int row = 0; row < rugbyColours.length; row++) {
			for(int col = 0;  col < rugbyColours[0].length; col++) {
				System.out.println(rugbyColours[row][col]);
			}
			System.out.println("");
		}
	}
}
