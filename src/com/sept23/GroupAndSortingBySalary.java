package com.sept23;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAndSortingBySalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.addEmployees();
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDept)).forEach((department,employee)->{
            System.out.println(department+" : ");
            employee.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
        });

        System.out.println("Department wise average Salary  ");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)))
                .forEach((department,averageSalary)-> System.out.println(department+" : "+averageSalary));
    }
}
