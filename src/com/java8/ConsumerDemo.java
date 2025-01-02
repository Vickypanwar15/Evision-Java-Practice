package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerDemo {
    public static void main(String[] args) {
       /* consumer is a functional interface which take any type of input and don't return any value
         in consumer one abstract methods present the following its declaration we have
         to implement that method when we use the consumer
        void accept(T t)   it take any type of value as an argument*/

        Consumer<Integer> consume = a-> System.out.println("Value of a is :"+a);
        consume.accept(1000);

        Consumer<List<Integer>> list = list1 ->{
            for (int i =0;i<list1.size();i++){
                list1.set(i,3*list1.get(i));
            }
        };
        Consumer<List<Integer>> display = list2->{
            list2.stream().forEach( a -> System.out.print(a+" "));
        };
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(3001);
        lst.add(2002);
        lst.add(222);
        System.out.println("Normal list elements : "+lst);
//        use consumer to modify the list
        list.accept(lst);

//        we direct print the list with that and also we use second consumer to print the modify list
        System.out.println("Modify list elements : "+lst);

//        with the help of consumer to print list elements

        display.accept(lst);
        System.out.println();
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(201,"Ajit","Testing",50000.00));
        empList.add(new Employee(301,"Amit","Team",45000));
        empList.add(new Employee(210,"Suraj","Finance",25500));
        empList.add(new Employee(321,"Sumit","Backend",34500));
        empList.add(new Employee(444,"Dipanshu","Testing",15000));
        empList.add(new Employee(555,"Anupam","Backend",18000));
        empList.add(new Employee(1001,"Deven","Intern",8000));
        empList.add(new Employee(2001,"Arun","Intern",10000));
        empList.add(new Employee(3001,"Manoj","Intern",4000));
        empList.add(new Employee(4001,"Vishal","Intern",6000));

        System.out.println("********* Employee Details without modification **********");
        System.out.println(empList);

//        now we use consumer to modify the employee details if the salary of employee is < 10000 to change it 15000.
        Predicate<Employee> checkSalary =  employee -> employee.getDept().equals("Intern");

        Consumer<List<Employee>> modifyEmp = employees -> {
            for (int i =0;i<employees.size();i++){
                if(checkSalary.test(employees.get(i))){
                   employees.get(i).setSalary(22000);
                }
            }
        };
        System.out.println("********* Employee Details with  modification **********");
        modifyEmp.accept(empList);
        System.out.println(empList);

//        List<Employee> modifiedList = empList.stream().filter(checkSalary).toList();
//        System.out.println("filter list from employee using stream");
//        System.out.println(modifiedList);


    }
}
