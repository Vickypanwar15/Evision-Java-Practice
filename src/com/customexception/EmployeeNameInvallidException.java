package com.customexception;

public class EmployeeNameInvallidException extends RuntimeException {
    public EmployeeNameInvallidException(){
        System.out.println(" Employee name not valid: “The employee name cannot be empty” ");
    }
}
