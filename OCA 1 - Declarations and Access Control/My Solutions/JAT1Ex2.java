import static java.lang.System.out;
import static  java.lang.Integer.parseInt;

public class JAT1Ex2 {
	public static void main(String[] args) {
		int maxValue = 0;
		for(String s: args){
			if(parseInt(s) > maxValue) {
				maxValue = parseInt(s);
			}
		}
		out.println(maxValue);
	}
}
