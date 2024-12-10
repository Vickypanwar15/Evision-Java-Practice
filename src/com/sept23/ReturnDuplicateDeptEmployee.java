package com.sept23;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReturnDuplicateDeptEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.addEmployees();
        List<String> departments = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).toList();
        System.out.println(departments);
    }
}
