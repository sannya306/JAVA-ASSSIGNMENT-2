class Passport {
    String number,issue,expiry;
    Passport(String n,String i,String e){
        number=n;issue=i;expiry=e;
    }
}
class Citizen {
    String name,dob,address;
    Passport passport;
    Citizen(String n,String d,String a,Passport p){
        name=n;dob=d;address=a;passport=p;
    }
    void display(){
        System.out.println(name+" "+dob+" "+address);
        System.out.println(passport.number+" "+
                           passport.issue+" "+passport.expiry);
    }
}
public class Q15 {
    public static void main(String[] args) {
        Passport p=new Passport(
            "P123456","01-01-2020","01-01-2030");
        new Citizen("Ravi","01-01-1990","Delhi",p).display();
    }
}
