public class JAT5Ex16{
  public static void main(String[] args){
	long[] nos = new long[]{127L, 127, (byte) 127};
	
	Animal[] ans = new Animal[] {new Animal(), new Horse()};
    Horse[] hrs = {new Horse()}; 
	ans = hrs;
	
    byte twoD[][] = new byte[3][];
	byte twoE[][] = twoD;
	byte twoF[] = twoE[0];
	
   }
}

class Animal{}
class Horse extends Animal{}
