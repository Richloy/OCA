public class JAT3Ex4{  
  
  public static void main(String[] args){
	new JAT3Ex4().test1();
  }	

  public void test1(){
    int x = 10;
    test2(x);
	System.out.println(x); // 10 (x is passed by value).
  }
  
  public void test2(int x){
    x++;
  }
}
