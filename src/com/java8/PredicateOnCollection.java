package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class  Employee  {
    private int empNo;
    private String name;
    private String dept;
    private double salary;

    public Employee(int empNo, String name, String dept,double salary) {
        this.empNo = empNo;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public  double getSalary(){
        return salary;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
       return "Emp No:"+empNo+" , "+"Name:"+name+" , "+"Department :"+dept+" , Salary :"+salary+"\n";
    }


}
class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1  = (Employee) o1;
        Employee e2 = (Employee) o2;
        String name1 = e1.getName();
        String name2 = e2.getName();
        return name1.compareTo(name2);
    }
}
public class PredicateOnCollection {

    public static void main(String[] args) {
        ArrayList<Employee> arrList = new ArrayList<>();
        arrList.add(new Employee(201,"Ajit","Testing",50000.00));
        arrList.add(new Employee(301,"Amit","Team",45000));
        arrList.add(new Employee(210,"Suraj","Finance",25500));
        arrList.add(new Employee(321,"Sumit","Backend",34500));
        arrList.add(new Employee(444,"Dipanshu","Testing",15000));
        arrList.add(new Employee(555,"Anupam","Backend",18000));
        arrList.add(new Employee(1001,"Deven","Intern",8000));
        arrList.add(new Employee(2001,"Arun","Intern",10000));
        arrList.add(new Employee(3001,"Manoj","Intern",4000));
        arrList.add(new Employee(4001,"Vishal","Intern",6000));

        Predicate<Employee> backend = employee -> employee.getDept().equals("Backend");
        Predicate<Employee> interns = employee -> employee.getDept().equals("Intern");
        Predicate<Employee> combine =  backend.and(interns);
        System.out.println("***** Before Predicate Results are *****");
        for (Employee e : arrList){
            System.out.println(e);
        }
        System.out.println("-----------------------------------------------");
        List<Employee> p1 = dptList(arrList,backend);
        System.out.println("***** After Predicate Results are *****");
        for (Employee e : p1){
            System.out.println(e);
        }

        List<Employee> internsData = dptList(arrList,interns);
        System.out.println("***** Interns Data  *****");
        Collections.sort(internsData,new MyComparator());
        for (Employee e : internsData){
            System.out.println(e);
        }
        List<Employee> combineData = dptList(arrList,backend.or(interns));
            System.out.println("***** Combine data  Data  *****");
            Collections.sort(combineData,new MyComparator());
            for (Employee e : combineData){
                System.out.println(e);
            }

        System.out.println("Employee data with sorting order based on employee Name");
         List<Employee> sortEmpNo =  arrList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        for (Employee e : sortEmpNo){
            System.out.println(e);
        }
        System.out.println("-------------- End Sorting Data ----------------------");

        System.out.println(" ********************* Group by department START ***************");
        arrList.stream().collect(Collectors.groupingBy(Employee::getDept)).forEach((dept,employee)->{
            System.out.println(dept+" :");
            System.out.println(employee);
        });
        System.out.println(" ********************* Group by department END ***************");

    }

    public static List<Employee> dptList(List<Employee> employees,Predicate<Employee> predicate){
        List<Employee> result = new ArrayList<Employee>();
        for (Employee employee : employees){
            if(predicate.test(employee)){
                result.add(employee);
            }
        }
        return result;
    }
}
