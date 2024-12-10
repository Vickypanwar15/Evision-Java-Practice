package com.sept23;

import java.util.Comparator;
import java.util.List;

public class SortingOrderEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.addEmployees();
        System.out.println("Sorting by Employee name in ascending order");
        employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        System.out.println("Sorting by Employee Name in descending order");
        employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
    }
}
