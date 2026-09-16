class Employee {
    String name,id;
    double salary;
    Employee(String n,String i,double s) {
        name=n; id=i; salary=s;
    }
    double calculateSalary(){return salary;}
}
class Manager extends Employee {
    double bonus;
    Manager(String n,String i,double s,double b) {
        super(n,i,s);
        bonus=b;
    }
    double calculateSalary(){return salary+bonus;}
}
public class Q3 {
    public static void main(String[] args) {
        Employee e=new Employee("Ravi","E101",30000);
        Manager m=new Manager("Seema","M202",40000,5000);
        System.out.println(e.calculateSalary());
        System.out.println(m.calculateSalary());
    }
}
