class Bools {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);

		boolean b3 = !(b1);
		System.out.println(b3);

		b3 = (b1 || b2);
		System.out.println(b3);

		String value = "false";
		boolean b4 = Boolean.parseBoolean(value);
		System.out.println(b4);

		System.out.println(b3 || b4);
	}
}
