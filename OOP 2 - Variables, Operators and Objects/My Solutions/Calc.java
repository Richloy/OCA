import java.util.Scanner;

class Calc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		int total = a+b;
		System.out.println(total);
		in.close();
	}
}
