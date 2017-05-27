public class JAT3Ex5{  
  
  public static void main(String[] args){
    Player p = new Player("John Henley");
	new JAT3Ex5().test(p);
    System.out.println(p.getName());  // Mike Henley (pass by reference).
  }	

  public void test(Player p){
    p.setName("Mike Henley");
  }
}
