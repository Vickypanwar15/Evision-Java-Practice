package com.sept23;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAndAverageSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.addEmployees();
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary))
        ).forEach((d,s)-> System.out.println(d+" : "+s));
    }
}
