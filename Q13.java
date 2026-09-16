import java.util.*;
class Guest {
    String name,id;
    int age;
    Guest(String n,int a,String i){
        name=n;age=a;id=i;
    }
}
class Reservation {
    String id,room;
    List<Guest> guests=new ArrayList<>();
    Reservation(String i,String r){id=i;room=r;}
    void addGuest(Guest g){guests.add(g);}
    void display(){
        System.out.println(id+" "+room);
        for(Guest g:guests)
            System.out.println(g.name+" "+g.age+" "+g.id);
    }
}
public class Q13 {
    public static void main(String[] args) {
        Reservation r=new Reservation("R101","Deluxe");
        r.addGuest(new Guest("Amit",25,"ID123"));
        r.addGuest(new Guest("Sara",22,"ID456"));
        r.display();
    }
}
