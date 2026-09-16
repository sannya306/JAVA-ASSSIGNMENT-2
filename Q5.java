class Person {
    String name;
    int age;
    Person(String n,int a){name=n;age=a;}
}
class Doctor extends Person {
    String specialization;

    Doctor(String n,int a,String s){
        super(n,a); specialization=s;
    }
}
class Surgeon extends Doctor {
    String surgeryType;
    Surgeon(String n,int a,String s,String st){
        super(n,a,s); surgeryType=st;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(specialization);
        System.out.println(surgeryType);
    }
}
public class Q5 {
    public static void main(String[] args) {
        new Surgeon("John",40,"Cardiology","Heart Surgery").display();
    }
}
