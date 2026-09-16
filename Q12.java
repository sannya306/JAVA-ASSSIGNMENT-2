class Vehicle {
    String regNo,brand;
    double rate;
    Vehicle(String r,String b,double rt){
        regNo=r;brand=b;rate=rt;
    }
    double calculateRent(){return rate;}
}
class Car extends Vehicle {
    Car(String r,String b,double rt){super(r,b,rt);}
    double calculateRent(){return rate*1.5;}
}
class Bike extends Vehicle {
    Bike(String r,String b,double rt){super(r,b,rt);}
    double calculateRent(){return rate*1.2;}
}
public class Q12 {
    public static void main(String[] args) {
        System.out.println(new Car("KA01AA1234","Toyota",1000)
                           .calculateRent());
        System.out.println(new Bike("KA05BB6789","Honda",500)
                           .calculateRent());
    }
}
public class Q11 {
    public static void main(String[] args) {
        Room r=new Room("A101","Block-B","Single");
        new Student("Ravi",101,"CSE",r).display();
    }
}
