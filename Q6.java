class Author {
    String name,email,gender;
    Author(String n,String e,String g){
        name=n;email=e;gender=g;
    }
}
class Book {
    String title;
    double price;
    Author author;
    Book(String t,double p,Author a){
        title=t;price=p;author=a;
    }
    void display(){
        System.out.println(title);
        System.out.println(price);
        System.out.println(author.name+" "+author.gender+
                           " "+author.email);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Author a=new Author("Joshua Bloch","jbloch@abc.com","M");
        new Book("Effective Java",550,a).display();
    }
}
