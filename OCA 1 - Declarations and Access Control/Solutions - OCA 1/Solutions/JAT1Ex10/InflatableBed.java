public class InflatableBed implements Inflatable, Deflatable{
  float airAdded = 0;

  public void inflate(){
    // pump it up
	do{ 
	  System.out.println("Pumping Inflatable Bed..." + airAdded + "% air pressure.");
	  	  
	  if(airAdded == maxSetting){
	   System.out.println("The bed has been inflated.");
	   break;
	  }
	 airAdded += inflateFactor;
	
	}while(airAdded <= maxSetting);
  }
  
  public void deflate(){
    // deflate it	
	do{
	 System.out.println("Deflating Inflatable Bed..." + airAdded + "% air pressure.");
	 
	 if(airAdded == minSetting){
	   System.out.println("The bed has been deflated.");
	   break;
	 }
	 
	 airAdded -= deflateFactor;
	 
	}while(airAdded >= minSetting);
  }	
}