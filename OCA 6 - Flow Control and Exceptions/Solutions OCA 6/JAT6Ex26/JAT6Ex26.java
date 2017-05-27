import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JAT6Ex26{
  public static void main(String[] args){
	new JAT6Ex26().readFromTextFile();
  }// main
  
  public void readFromTextFile(){
     // Create a reference to a File object
	 File file = new File("Java Blog.txt");
  
     // Declare FileReader and BufferedReader objects.
     FileReader fr = null;
	 BufferedReader br = null;
	 
	 try{
      // Create a FileReader object.
      fr = new FileReader(file);
	
	  // Create a BufferedReader object.
	  br = new BufferedReader(fr);
		   
	  // Read in the line of data from the text file.
	  String line = br.readLine();	
		   
	  // Print it to the console.
	  System.out.println(line);
	
    }catch(IOException e){
      System.out.println("Unable to read from the text file at this time.");
    }finally{
      try{
		fr.close();
		br.close();
	  } catch (IOException e) {
		e.printStackTrace();
	  }
    }// finally	
    
  }// method
  
}// class



