package com.cloning;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class CloneClass{

     int x;
     int y;

     public CloneClass(int x, int y) {
         this.x = x;
         this.y = y;
     }
     public CloneClass(CloneClass c1){
         this.x= c1.x;
         this.y=c1.y;
     }

 }

public class CloningDemo {
    public static void main(String[] args) {
        CloneClass c1 = new CloneClass(12,24);
        CloneClass c2 = c1;

        System.out.println("Hashcode of c1 "+c1);
        System.out.println("hashcode of c2"+c2);

        CloneClass c3 = new CloneClass(c1);
        System.out.println("Hashcode of c1 "+c1);
        System.out.println("hashcode of c3"+c3);
        System.out.println("-----------------------------");
        List<Integer> integerList = Arrays.asList(234,45,23,654,34,54);
        List<Integer> integerList1 = Arrays.asList(23,45,234,654,34,54);
        System.out.println(integerList1.equals(integerList));

        Set<Integer> set1 = Arrays.asList(234,45,23,654,34,54).stream().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.asList(23,45,234,654,34,54).stream().collect(Collectors.toSet());

        System.out.println("Set 1 and set 2 are:"+set1.equals(set2));

    }

}
