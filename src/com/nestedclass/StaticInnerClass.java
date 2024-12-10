package com.nestedclass;
class University{
    static class Departments{
        String deptName;
        Departments(String deptName){
            this.deptName=deptName;
        }
        void showDepartment(){
            System.out.println("Department :"+deptName);
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        University.Departments csDept = new University.Departments("Computer Science");
        csDept.showDepartment();
        University.Departments mechnical = new University.Departments("Mechanical Engineer");
        mechnical.showDepartment();
    }
}
