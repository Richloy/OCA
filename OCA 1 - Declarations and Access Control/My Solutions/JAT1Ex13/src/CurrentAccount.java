public class CurrentAccount {
    
    public static int noOfAccounts;
    public static float totalSavings;
    public static float averageSavings;

    private String firstName;
    private String lastName;
    private String password;
    private float balance;
    
    public CurrentAccount(String fn, String ln, String pwd) {
        
        this.firstName = fn;
        this.lastName = ln;
        this.password = pwd;
        
        noOfAccounts++;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getBalance() {
        return balance;
    }
    
    public void makeLodgement(float amt) {
        this.balance += amt;
        totalSavings += amt;
    }
    
    public void makeWithdrawl(float amt) {
        
        if(amt > this.balance) {
            System.out.println("Insufficient Funds");
        } else {
            this.balance -= amt;
            totalSavings -= amt;
        }
    }
    
    @Override
    public String toString() {
        return "First Name:\t" + firstName +
                "\nLast Name:\t" + lastName +
                "\nPassword:\t" + password +
                "\nBalance:\t" + balance;
    }
}
