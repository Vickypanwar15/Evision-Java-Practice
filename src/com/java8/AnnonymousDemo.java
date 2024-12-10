package com.java8;
interface  Operation{
    public void square(int num);
    public void cube(int num);
    public  void factorial(int num);
}
@FunctionalInterface
interface  A{
    public void show();
}
public class AnnonymousDemo {
    public static void main(String[] args) {
        Operation op1 = new Operation() {
            @Override
            public void square(int num) {
                System.out.println("Square of :"+num+" is :"+num*num);
            }

            @Override
            public void cube(int num) {
                System.out.println("Cube of :"+num+" is :"+num*num*num);

            }
            @Override
            public void factorial(int num) {
                int fact=1;
                for(int i=1;i<=num;i++){
                    fact *=i;
                }
                System.out.println("Factorial of :"+num+" is :"+fact);
            }
        };
        op1.cube(12);
        op1.factorial(5);
        op1.square(12);

        A a = ()->{
            System.out.println("A interface Show method");
        };
        a.show();
    }
}
