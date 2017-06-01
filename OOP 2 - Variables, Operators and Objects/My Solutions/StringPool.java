class StringPool {
	public static void main(String[] args) {
		System.out.println("Method 1:\n");
       		method1();
		System.out.println("\n\nMethod 2:\n");
	        method2();
		System.out.println("\n\nMethod 3:\n");
	        method3();
	}
	public static void method1() {
		String myString1 = "Hello World";
		String myString2 = new String("Hello World");
		if(myString1 == myString2) {
			System.out.println("The Strings are the same");
		} else {
			System.out.println("The Strings are not the same");
		}
	}

        public static void method2() {
                String myString1 = "Hello World";
                String myString2 = new String("Hello World");
                if(myString1.equals(myString2)) {
                        System.out.println("The Strings are the same");
                } else {
                        System.out.println("The Strings are not the same");
                }
        }
        public static void method3() {
                String myString1 = "Hello World";
                String myString2 = "Hello World";
                if(myString1 == myString2) {
                        System.out.println("The Strings are the same");
                } else {
                        System.out.println("The Strings are not the same");
                }
        }
}
