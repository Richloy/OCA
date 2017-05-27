public class JAT6Ex6{
  
  enum steakCooked {RARE, MEDIUM_RARE, WELL_DONE, MEDIUM}

  public static void main(String[] args){
    
  steakCooked sc = steakCooked.RARE;
   
   switch (sc){
     case RARE:
	   System.out.println("Steak served with a cool red centre.");
	   break;
	 case MEDIUM_RARE:
	   System.out.println("Your steak will be served with a hot red centre.");
	   break;
	 case WELL_DONE:
	   System.out.println("Brown and well cooked throughout.");
	   break;  
	 case MEDIUM:
	   System.out.println("Pink throughout.");
	   break;
	 default:
	   System.out.println("As you have not specified your choice, your steak will be served medium rare.");
   
   }// switch
	    
  }// main

}// class