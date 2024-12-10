package com.java8;
public interface Interf {
   default  void display(){
       System.out.println("display method inside interface");
   }

    public static void main(String[] args) {
        System.out.println("Call main direct in interface ");
        Interf i = new Interf() {
            @Override
            public void display() {
                Interf.super.display();
            }
        };
    }
}
