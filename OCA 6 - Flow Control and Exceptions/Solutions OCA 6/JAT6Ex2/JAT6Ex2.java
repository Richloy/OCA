public class JAT6Ex2{
	public static void main(String[] args){
		float currentTemperature = 6.00f;     
		
		if(currentTemperature >=16){
		  System.out.println("The season is Summer.");	
		}else if(currentTemperature >=11 && currentTemperature <16){
		  System.out.println("The season is Spring.");	
		}else if(currentTemperature >= 7 && currentTemperature <11){
		  System.out.println("The season is Autumn.");	
		}else{
		  System.out.println("The season is Winter");	
		}
	}// main
}// class