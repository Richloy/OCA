public class JAT1Ex12{

  public static void main(String[] args){
    Car[] myCars = new Car[]{new Honda("Honda"),new Lada("Lada")};
  
    for(Car c:myCars){
	 System.out.println(c.getName());
	}
  }
}