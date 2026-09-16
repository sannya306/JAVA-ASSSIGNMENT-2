import java.util.*;
class Product {
    String name;
    double price;
    int qty;
    Product(String n,double p,int q) {
        name=n; price=p; qty=q;
    }
    double total(){return price*qty;}
}
class Order {
    String id;
    List<Product> products=new ArrayList<>();
    Order(String i){id=i;}
    void add(Product p){products.add(p);}
    double calculateTotal() {
        double t=0;
        for(Product p:products) t+=p.total();
        return t;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Order o=new Order("ORD101");
        o.add(new Product("Laptop",50000,1));
        o.add(new Product("Mouse",500,2));
        o.add(new Product("Keyboard",1500,1));
        System.out.println(o.calculateTotal());
    }
}
