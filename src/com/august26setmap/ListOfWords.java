package com.august26setmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListOfWords {
    public static Map<String,Integer> countOccuranceOfWords(List<String> list){
        Map<String,Integer> hmap = new LinkedHashMap<>();
        for (int i =0;i<list.size();i++){
            int count =0;
            for (int j=0;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                }
            }
            hmap.put(list.get(i),count);
        }
        return hmap;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Indore");
        list.add("Ujjain");
        list.add("Dewas");
        list.add("Indore");
        list.add("Goa");
        list.add("Dewas");
        list.add("Indore");
        list.add("Bhopal");
        list.add("Goa");

        System.out.println(list);
        Map<String,Integer> hmap = countOccuranceOfWords(list);
        for (Map.Entry<String,Integer> h:hmap.entrySet()){
            System.out.println(h.getKey()+"---->"+h.getValue());
        }

    }
}
