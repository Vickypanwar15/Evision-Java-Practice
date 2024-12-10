package com.sept23;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAndSortByEmpNo {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.addEmployees();
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDept)).forEach((s, employees) -> {
            System.out.println(s+" : ");
            employees.stream().sorted(Comparator.comparingInt(Employee::getEmpNo)).forEach(System.out::println);
        });
    }
}
