import java.util.Random;

class AdditionalEx {
	public static void main(String[] args) {
		Random generator = new Random();
		int x = generator.nextInt(10);
               // System.out.println(x);
		dayNumbers(x);
		country("Eire");
		countrySwitch("Scotland");
		stringArray();
		intArray();

	}

	public static void dayNumbers(int day) {

		if(day == 1) System.out.println("The day is Monday");
                if(day == 2) System.out.println("The day is Tuesday");
                if(day == 3) System.out.println("The day is Wednesday");
                if(day == 4) System.out.println("The day is Thursday");
                if(day == 5) System.out.println("The day is Friday");
                if(day == 6) System.out.println("The day is Saturday");
                if(day == 1) System.out.println("The day is Sunday");
                if(day < 1 || day > 7) System.out.println("The day is Invalid");
	}

	public static void country(String coun) {
		if(coun == "Eire") {
			System.out.println("Ireland");
		} else if(coun == "Scotland") {
			System.out.println("Scotland");
		} else {
			System.out.println("Country not found");
		}
	}

	public static void countrySwitch(String coun) {

		switch(coun){
			case "Eire":
				System.out.println("Ireland");
				break;
			case "Scotland":
				System.out.println("Scotland");
				break;
			default:
				System.out.println("Country not found");
				break;
		}
	}

	public static void stringArray() {
		String[] nameArray = {"Rich",  "Cat", "Dean", "Kayleigh", "Shannon", "Lola"};
		displayArray(nameArray);
	}

	public static void intArray() {
		int[] numArray = {1, 2, 3, 4, 5};
		displayArray(numArray);
	}

	public static void displayArray(String[] myArray) {
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

        public static void displayArray(int[] myArray) {
                for(int i = 0; i < myArray.length; i++) {
                        System.out.println(myArray[i]);
                }
        }

}
