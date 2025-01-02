package com.inheritance;

class Person{
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void showDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
    }
    public Person(){

    }

    public void demoMethod(){
        System.out.println("Person class method called");
    }

    public void onlyParent(){
        System.out.println("this method is present in only person class");
    }

    public static void personMethod1(){
        System.out.println("Person class static method1");
    }
}
class Employee extends Person{
    int empId;
    double salary;
    String jobRole;

    public Employee(String name, int age, String address, int empId, double salary, String jobRole) {
        super(name, age, address);
        this.empId = empId;
        this.salary = salary;
        this.jobRole = jobRole;
    }
    public Employee(){

    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("empId:"+empId);
        System.out.println("Salary:"+salary);
        System.out.println("jobRole:"+jobRole);
    }
    public void demoMethod(){
        System.out.println("Employee class method called");
    }

    public void onlyChild(){
        System.out.println("this method is present in only employee class");
    }
    public static void personMethod1(){
        System.out.println("employee  class override static method1");
    }
}
public class InheritanceDemo {

    public static void main(String[] args) {

        Employee employee = new Employee("Vishal",22,"Indore",101,15000,"Java intern");
        employee.showDetails();
        employee.personMethod1();

//        Employee employee1 = (Employee) new Person();  Exception in thread "main" java.lang.ClassCastException
//        employee1.demoMethod();


        Person p = new Employee();
        p.demoMethod();//employee method called because parent amd employee have same signature method
        p.onlyParent();// method run sucessfully

//        p.onlyChild()  onlyChild method is not present in parent class that's why person object is unable to call this method
        Person person = new Person();
        person.onlyParent();
        Employee.personMethod1();
        Person.personMethod1();
        p.personMethod1();

    }
}
