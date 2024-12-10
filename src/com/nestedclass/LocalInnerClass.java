package com.nestedclass;
class ShoppinCart{
    private String user;
    ShoppinCart(String user){
        this.user=user;
    }

    class Item{
        String name;
        double price;

        Item(String name,double price){
            this.name = name;
            this.price = price;
        }
        void displayItem(){
            System.out.println(user+" successfully added :"+name+" to the cart at Rs."+price);
        }

    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        ShoppinCart s = new ShoppinCart("Vishal");
        ShoppinCart.Item item = s.new Item("Vivo Smart Phone ",15600.00);
        item.displayItem();
    }
}
