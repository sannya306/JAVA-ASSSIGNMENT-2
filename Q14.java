class Account {
    private double balance;
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: "+amount);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn: "+amount);
        }
    }
    double getBalance(){return balance;}
}
public class Q14 {
    public static void main(String[] args) {
        Account a=new Account();
        a.deposit(1000);
        a.withdraw(500);
        System.out.println("Balance: "+a.getBalance());
    }
}
