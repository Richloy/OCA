public class JAT1Ex15 {

    public static void main(String[] args) {

        MUSIC_FORMATS music = MUSIC_FORMATS.CD;
        
        MUSIC_FORMATS[] formats = MUSIC_FORMATS.values();
        
        for(MUSIC_FORMATS mf: formats) System.out.println(mf);
    }
    
}
