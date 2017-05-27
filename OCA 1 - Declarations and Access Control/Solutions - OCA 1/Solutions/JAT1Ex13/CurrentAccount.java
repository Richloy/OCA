public class CurrentAccount{
	
	// Class Variables
	public static int noOfSavingsAccounts;
	public static float totalAmountSaved;
	public static float averageAmountSaved;
	
	// Instance Variables
	private String firstName;
	private String lastName;
	private String password;
	private float balance;
	
	public CurrentAccount(String firstName, String lastName, String password){
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		
		// Update the static variable
		CurrentAccount.noOfSavingsAccounts++;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	public float getBalance(){
		return this.balance;
	}	
		
	public void makeLodgement(float amount){
		this.balance += amount;
		// Update the static variables
		CurrentAccount.totalAmountSaved += amount;		
	}
	
	public void makeWithdrawal(float amount){
		if(amount > this.balance){
		  System.out.println("Insufficient Funds");
		}
		else{
			this.balance -= amount;
			CurrentAccount.totalAmountSaved -= amount;	
		}
	}
	
	public static float getAverageSavingsAmount(){
		return CurrentAccount.totalAmountSaved / CurrentAccount.noOfSavingsAccounts;
	}
	
	public String toString(){
		return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" +
		"Password: " + password + "\n" + "Balance: " + balance;
	}
	
}