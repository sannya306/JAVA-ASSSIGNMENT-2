abstract class Flight {
    String no, airline;
    double fare;
    Flight(String n,String a,double f) {
        no=n; airline=a; fare=f;
    }
    abstract double calculateFare();
}
class DomesticFlight extends Flight {
    DomesticFlight(String n,String a,double f){super(n,a,f);}
    double calculateFare(){return fare*1.10;}
}
class InternationalFlight extends Flight {
    InternationalFlight(String n,String a,double f){super(n,a,f);}
    double calculateFare(){return fare*1.25;}
}
public class Q2 {
    public static void main(String[] args) {
        Flight f1=new DomesticFlight("AI202","Air India",5000);
        Flight f2=new InternationalFlight("QF101","Qantas",20000);
        System.out.println(f1.calculateFare());
        System.out.println(f2.calculateFare());
    }
}
