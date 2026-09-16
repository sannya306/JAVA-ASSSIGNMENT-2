class Course {
    String name,duration;
    Course(String n,String d){name=n;duration=d;}
}
class Student {
    String name;
    Course course;
    Student(String n,Course c){name=n;course=c;}
    void display(){
        System.out.println(name+" "+course.name+
                           " "+course.duration);
    }
}
class PremiumStudent extends Student {
    int discount;
    PremiumStudent(String n,Course c,int d){
        super(n,c);discount=d;
    }
    void display(){
        System.out.println(name+" "+course.name+
                           " "+course.duration+" "+discount+"%");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Course c=new Course("Java","3 months");
        new Student("Arjun",c).display();
        new PremiumStudent("Meena",c,20).display();
    }
}
