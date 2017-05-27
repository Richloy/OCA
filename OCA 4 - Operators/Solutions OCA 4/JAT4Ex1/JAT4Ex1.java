public class JAT4Ex1{

  public static void main(String[] args){
    int x = 10;
	int y = 12;
  
    System.out.println(x>y);
    System.out.println(x>=y);
	System.out.println(x<y);
	System.out.println(x<=y);
	System.out.println(x==y);
	System.out.println(x!=y);
	
	System.out.println("***********");
	
	boolean a = true;
	boolean b = false;
	
	System.out.println(10 == 10);
	System.out.println('c' == 'b');
	System.out.println(a == b);
	
	System.out.println("***********");
	
	Cat c = new Cat();
	c.name = "Whiskers";
	Cat d = new Cat();
	d.name = "Tom";
	
	System.out.println(c == d);
	System.out.println(c != d);
  }
}

class Cat{
 String name;
}