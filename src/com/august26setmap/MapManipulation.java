package com.august26setmap;

import java.util.*;

public class MapManipulation {

    public static void getEmployeeList(Map<String,Double> map,double salary){

        for(Map.Entry<String,Double> hm : map.entrySet()){
            if(hm.getValue()<salary){
                System.out.println(hm.getKey()+"----->"+hm.getValue());
            }
        }
    }
    public static Map<String,Double> sortByValue(Map<String,Double> hmap){
        List<Map.Entry<String,Double>> list = new LinkedList<>(hmap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String,Double> sortedList = new LinkedHashMap<>();
        for (Map.Entry<String,Double> h:list){
            sortedList.put(h.getKey(),h.getValue());
            if(h.getKey().equals("Sumit")){
                h.setValue(5555.55);
            }
        }
        return sortedList;
    }

    public static Map<String,Double> sortByKey(Map<String,Double> hmap){
        List<Map.Entry<String,Double>> list = new LinkedList<>(hmap.entrySet());
        list.sort(Map.Entry.comparingByKey());
        Map<String,Double> sortedmap = new LinkedHashMap<>();
        for (Map.Entry<String,Double> h:list){
            sortedmap.put(h.getKey(),h.getValue());
        }
        return  sortedmap;
    }

    public static void main(String[] args) {
        Map<String,Double> employee = new HashMap<>();
        employee.put("Avinash",26000.00);
        employee.put("Vikash",22000.00);
        employee.put("Vishwas",18500.00);
        employee.put("Sunny",19500.00);
        employee.put("Rahul",23600.00);
        employee.put("Sumit",14000.00);
        employee.put("Shivay",17000.00);
        System.out.println(employee);

        System.out.println("-------------------------------------");

        System.out.println("Employee Details where salary is less than 20000");
        getEmployeeList(employee,20000);
        System.out.println("-------------------------------------");

        Map<String,Double> sortMap = sortByValue(employee);
        System.out.println("Sorted map using value");
        for (Map.Entry<String,Double> h:sortMap.entrySet()){
            System.out.println(h.getKey()+"---->"+h.getValue());
        }
        System.out.println("-------------------------------------");
        Map<String,Double> sortMapByKey = sortByKey(employee);
        System.out.println("Sorted map using KEY");
        for (Map.Entry<String,Double> h:sortMapByKey.entrySet()){
            System.out.println(h.getKey()+"---->"+h.getValue());
        }

    }
}
