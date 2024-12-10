package com.sept23;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAndSortingByName {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.addEmployees();
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDept)).forEach((department,employee)->{
            System.out.println(department+" : ");
            employee.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
        });
    }
}
