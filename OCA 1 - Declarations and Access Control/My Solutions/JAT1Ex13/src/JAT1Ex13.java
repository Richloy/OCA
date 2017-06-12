
import java.text.DecimalFormat;

public class JAT1Ex13 {

    public static void main(String[] args) {
        CurrentAccount one = new CurrentAccount("Billy", "Bonds", "3424S");
        CurrentAccount two = new CurrentAccount("Clare", "Taylor", "5441S");
        CurrentAccount three = new CurrentAccount("Anna", "Long", "6431S");
        
        one.makeLodgement(40);
        two.makeLodgement(100);
        three.makeLodgement(135);
        
        System.out.println(one);
        System.out.println("Withdrawl Request: 50");
        one.makeWithdrawl(50);
        System.out.println("Balance:\t" + one.getBalance() + "\n\n");
                
        System.out.println(two);
        System.out.println("Withdrawl Request: 600");
        two.makeWithdrawl(600);
        System.out.println("Balance:\t" + two.getBalance() + "\n\n");
                
        System.out.println(three);
        System.out.println("Withdrawl Request: 60");
        three.makeWithdrawl(60);
        System.out.println("Balance:\t" + three.getBalance() + "\n\n");
        
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Number of Acounts:\t" + CurrentAccount.noOfAccounts);
        System.out.println("Sum of Balances:\t" + df.format(CurrentAccount.totalSavings));
        System.out.println("Average Balance:\t" + df.format(CurrentAccount.totalSavings/CurrentAccount.noOfAccounts));
    }
    
}
