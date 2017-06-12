public class JAT1Ex14 {
    
    public enum Glasses {SUN, READING, DRIVING, SKIING}
    
    public static void main(String[] args) {
        Glasses glasses = Glasses.DRIVING;
        
        switch(glasses){
            case SUN:
                System.out.println("Glasses for Sun");
                break;
            case READING:
                System.out.println("Glasses for Reading");
                break;
            case DRIVING:
                System.out.println("Glasses for Driving");
                break;
            case SKIING:
                System.out.println("Glasses for Skiing");
                break;
        }

    }
    
}
