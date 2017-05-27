import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	  // ArrayList to store the instruments in the orchestra
      ArrayList<Playable> orchestra = new ArrayList<Playable>();
      orchestra.add(new Violin("Violin", "Strings",2.34f));	  
      orchestra.add(new Clarinet("Clarinet", "Woodwind",1.45f));
      orchestra.add(new FrenchHorn("French Horn", "Brass",5.43f));
	       
	  // Create a MusicConductor Class
	  MusicConductor mc = new MusicConductor(); 
	  
	  // Iterate through the arraylist.
     
	  for(Playable p:orchestra){
		  System.out.println(mc.conductInstrument(p));
	  } 
	   
	}// main

}// class
