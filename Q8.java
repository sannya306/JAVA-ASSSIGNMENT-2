abstract class Loan {
    double principal,time;
    Loan(double p,double t){principal=p;time=t;}
    abstract double calculateInterest();
}
class HomeLoan extends Loan {
    HomeLoan(double p,double t){super(p,t);}
    double calculateInterest(){return principal*8*time/100;}
}
class CarLoan extends Loan {
    CarLoan(double p,double t){super(p,t);}
    double calculateInterest(){return principal*10*time/100;}
}
public class Q8 {
    public static void main(String[] args) {
        System.out.println(new HomeLoan(500000,3).calculateInterest());
        System.out.println(new CarLoan(300000,5).calculateInterest());
    }
}
