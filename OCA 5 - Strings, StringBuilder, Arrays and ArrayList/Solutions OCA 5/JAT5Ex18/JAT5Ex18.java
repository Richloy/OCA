import java.util.ArrayList;

public class JAT5Ex18{
  public static void main(String[] args){
	ArrayList<CD> cds = new ArrayList<CD>();
	
	// Step 1:
	// add(element)
	cds.add(new CD("Rattle and Hum","U2","1988","Island Records"));
	cds.add(new CD("The Dark Side of the Moon","Pink Floyd", "1973","Capitol Records"));
	
	
	// Step 2:
	cds.add(1,new CD("The Very Best Of Fleetwood Mac", "Fleetwood Mac", "2002", "Warner Bros. Records"));
	
	// Step 3:
	// add(index, element)
	cds.add(2,new CD("Alanis Morissette: The Collection", "Alanis Morissette", "2005", "Maverick"));
		
	// Step 4:	
	// contains()
	System.out.println("Step 4:\n");
	if(cds.contains(new CD("The Very Best Of Fleetwood Mac", "Fleetwood Mac", "2002", "Warner Bros. Records"))){
	 System.out.println("The album, 'The Very Best of Fleetwood Mac', is already stored in the catalogue.");
	}else{
	 System.out.println("The album, 'The Very Best of Fleetwood Mac', is not stored in the catalogue.");
	}
	
	// Step 5:
	// get(index)
    System.out.println("Step 5:\n");
	System.out.println(cds.get(3));
	
	// Step 6:
	// remove object
	boolean foundCD = false;
    for(CD cd:cds){
	    int indexFound = cds.indexOf(new CD("The Very Best Of Fleetwood Mac", "Fleetwood Mac", "2002", "Warner Bros. Records"));
		if(indexFound != -1){
		 //System.out.println("Found CD at index position " + indexFound);
		 
		 // Remove it
		 //cds.remove(indexFound);  // working
		 cds.remove(new CD("The Very Best Of Fleetwood Mac", "Fleetwood Mac", "2002", "Warner Bros. Records"));
		 
		 foundCD = true;
		 break;
	    }		
	  }
	  if(foundCD == false){
	   System.out.println("That CD cannot be found.");
	  }
	  
	  // Step 7:
	  System.out.println("Step 7:\n");
	  System.out.println("The CD Catalogue contains: " + cds.size() + " cd's.");
	  
	  System.out.println("\nStep 8:");
	  System.out.println("\n**************CD Catalogue**************************");
	  
	  for(CD cd:cds){
	   System.out.println(cd);
	  }
	  
	  System.out.println("*****************************************************");
	  
	  
   }// main
}// class

class CD{
  private String name;
  private String artist;
  private String yearReleased;
  private String recordLabel;
  
  public CD(String name, String artist, String yearReleased, String recordLabel){
    this.name = name;
	this.artist = artist;
	this.yearReleased = yearReleased;
	this.recordLabel = recordLabel;
  }
  
  public void setName(String name){
   this.name = name;
  }
  
  public String getName(){
   return name;
  }
  
  public void setArtist(String artist){
   this.artist = artist;
  }
  
  public String getArtist(){
   return artist;
  }
  
  public void setYearReleased(String yearReleased){
   this.yearReleased = yearReleased;
  }
  
  public String getYearReleased(){
   return yearReleased;
  }
  
  @Override
  public boolean equals(Object o){
   if(o instanceof CD){
      CD cd = (CD) o;
	  if(this.name.equals(cd.name)){
	   return true;
	  }
   }
   return false;
  }
  
  public String toString(){
   return "Name: " + name + "\n" + "Artist: " + artist + "\n" + "Year Released: " + yearReleased +  "\n" + "Record Label: " + recordLabel +"\n";
  }
}

