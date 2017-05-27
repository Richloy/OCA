public class JAT3Ex9{
  static Y y;
  static X x; 
   
  public static void main(String[] args){
    Y y = new Y();
    X x = new X();
	x.y = new Y();
	
	x.y.b = 19;
	y.b = 66;	
  
    System.out.println("Output 1: " + y.b);
    System.out.println("Output 2: " + x.y.b);
	
    new JAT3Ex9().test1(y,x);
	
	System.out.println("Output 3: " + y.b);
    System.out.println("Output 4: " + x.y.b);
 
    y = y;
    x = x;
	y.b++;
	System.out.println("Output 5: " + y.b);
    System.out.println("Output 6: " + x.y.b);
  }
  
  public void test1(Y y, X x){
   x.y = y;   
   x.y.b = 124; 
   y.b = 100;   
  }
}