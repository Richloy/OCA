public class JAT5Ex5{
  public static void main(String[] args){
	String x = new String ("Java");
    x = x.concat(" Rules");
    System.out.println("x = " + x);
    x.toUpperCase();
    System.out.println("x = " + x);
    x.replace('a', 'X');
    System.out.println("x = " + x);
    x = x.concat(" Rules!"); 
    System.out.println("x = " + x);
 }
}