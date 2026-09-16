class Room {
    String number,block,type;
    Room(String n,String b,String t){
        number=n;block=b;type=t;
    }
}
class Student {
    String name,course;
    int roll;
    Room room;
    Student(String n,int r,String c,Room rm){
        name=n;roll=r;course=c;room=rm;
    }
    void display(){
        System.out.println(name+" "+roll+" "+course);
        System.out.println(room.number+" "+room.block+" "+room.type);
    }
}
public class Q11 {
    public static void main(String[] args) {
        Room r=new Room("A101","Block-B","Single");
        new Student("Ravi",101,"CSE",r).display();
    }
}
