public class JAT3Ex7{  
  
  public static void main(String[] args){
    Player p = new Player("John Henley");
	p = new JAT3Ex7().test(p); // assign the object reference returned by the method to p.
    System.out.println(p.getName()); // Mike Henley
  }	

  public Player test(Player p){
   return p = new Player("Mike Henley");
  }
}
