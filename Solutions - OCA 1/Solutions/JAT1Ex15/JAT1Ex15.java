public class JAT1Ex15{

  public static void main(String[] args){
    MUSIC_FORMATS format = MUSIC_FORMATS.CD;
  
    MUSIC_FORMATS[] formats = format.values();
	
	for(MUSIC_FORMATS mfo:formats){
	  System.out.println(mfo);
	}
  }
}