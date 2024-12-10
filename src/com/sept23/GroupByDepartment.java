package com.sept23;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.addEmployees();
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDept)).forEach((department,employee)->{
            System.out.println(department+" : ");
            System.out.println(employee);
        });
    }
}
