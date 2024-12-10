package com.august20.oopquestion;
 final class  Employee{
final String pancardNumber;
public Employee(String pancardNumber){
    this.pancardNumber = pancardNumber;
}
public String getPancardNumber(){
    return pancardNumber;
}
}
public class ImmutableDemo {
    public static void main(String[] args) {
        Employee e = new Employee("123ABC");
        System.out.println(e.getPancardNumber());
//        e = new Employee("342CVS");
        Employee e1 = new Employee("123ABC");
        System.out.println(e1.getPancardNumber());

        System.out.println(e==e1);
    }
}
