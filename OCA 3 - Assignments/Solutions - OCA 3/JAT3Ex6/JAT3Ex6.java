public class JAT3Ex6{  
  
  public static void main(String[] args){
    Player p = new Player("John Henley");
	new JAT3Ex6().test(p);
    System.out.println(p.getName()); // John Henley
  }	

  public void test(Player p){
    p = new Player("Mike Henley"); // only local variable p is assigned to a new object.
  }
}
