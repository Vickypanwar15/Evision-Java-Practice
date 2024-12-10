package com.august20;
class Fruits{
    String name;
    int price;
    Fruits(){
        System.out.println("No argument constructor called");
    }
    Fruits(String name,int price){
        this.name = name;
        this.price=price;
    }
    Fruits(Fruits fruits){
        name = fruits.name;
        price = fruits.price;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class CopyConstructorDemo {
    public static void main(String[] args) {
    Fruits f1 = new Fruits("Apple",200);
    System.out.println(f1);
    Fruits f2 = new Fruits("Orange",150);
    System.out.println(f2);
    Fruits f3 = new Fruits(f2);
    System.out.println(f3);
    System.out.println(f2==f3);
    }
}
