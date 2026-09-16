import java.util.*;
class Professor {
    String name, employeeId, specialization;
    Professor(String n, String id, String s) {
        name=n; employeeId=id; specialization=s;
    }
    public String toString() {
        return name+" "+employeeId+" "+specialization;
    }
}
class Department {
    String deptName, hodName;
    List<Professor> professors = new ArrayList<>();
    Department(String d, String h) {
        deptName=d; hodName=h;
    }
    void addProfessor(Professor p) {
        professors.add(p);
    }
    public String toString() {
        return deptName+" "+hodName+" "+professors;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Department d=new Department("Computer Science","Dr. Mehta");
        d.addProfessor(new Professor("Arjun","P101","AI"));
        d.addProfessor(new Professor("Neha","P102","ML"));
        System.out.println(d);
    }
}
