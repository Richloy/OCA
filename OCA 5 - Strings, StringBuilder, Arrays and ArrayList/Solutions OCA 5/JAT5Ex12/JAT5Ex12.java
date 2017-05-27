public class JAT5Ex12{
  public static void main(String[] args){
	Friend names[] = new Friend[] {new Friend("Sandy","Smith","0864545321","sandysmith@livemail.com"),new Friend("Ben","Jones","0864152412","jonesben@livemail.com")}; 
    System.out.println("The names of my friends are: \n");
	for(int i=0; i<names.length; i++){
	 System.out.println(names[i].toString());
	 System.out.println("");
	}
 }
}

class Friend{
  private String firstName;
  private String lastName;
  private String phoneNo;
  private String emailAddress;
  
  public Friend(String firstName, String lastName, String phoneNo, String emailAddress){
   this.firstName = firstName;
   this.lastName = lastName;
   this.phoneNo = phoneNo;
   this.emailAddress = emailAddress;
  }
  
  public String toString(){
   return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Phone No: " + phoneNo + "\n" + "Email Address: " + emailAddress;
  }
}