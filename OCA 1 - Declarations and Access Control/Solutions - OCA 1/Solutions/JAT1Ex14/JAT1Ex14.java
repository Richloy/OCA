public class JAT1Ex14{
  enum Glasses {SUN,DRIVING,READING,SKIING};

  public static void main(String[] args){
	 Glasses myGlasses = Glasses.DRIVING;
	 
	 switch (myGlasses){
	   case SUN: System.out.println("Glasses for sunny weather"); break;
	   case DRIVING: System.out.println("Glasses for driving"); break;
	   case READING: System.out.println("Glasses for reading"); break;
	   case SKIING: System.out.println("Glasses for skiing"); break;
	 }
  }
}