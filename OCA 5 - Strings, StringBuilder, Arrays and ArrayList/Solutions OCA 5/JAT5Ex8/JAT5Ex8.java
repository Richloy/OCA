public class JAT5Ex8{
  public static void main(String[] args){
   String aMessage = "   A message for you, Trudy   ";
   String trimmedMessage = aMessage.trim();
		
   // The position of the String, "Trudy" within the message.
   int i1 = trimmedMessage.indexOf("Trudy");
   System.out.println(i1); // 19  
   
   // The position of the first occurrence of the character ‘e’ within the message.
   int i2 = trimmedMessage.indexOf('e');
   System.out.println(i2); //3
        
   // The position of the first occurrence of the character ‘u’ 
   // within the message starting at index position 10.
   int i3 = trimmedMessage.indexOf('u',10);
   System.out.println(i3); //16
  }// main      
   
}// class