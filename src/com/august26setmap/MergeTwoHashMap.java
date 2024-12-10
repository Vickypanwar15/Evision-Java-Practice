package com.august26setmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MergeTwoHashMap {


    public static void main(String[] args) {
        Map<String,Double> moviewithRating = new LinkedHashMap<>();
        moviewithRating.put("Bahubali",8.0);
        moviewithRating.put("Dangal",8.3);
        moviewithRating.put("Saaho",5.4);
        moviewithRating.put("Sultan",7.3);
        moviewithRating.put("Pushpa",7.6);

        for (Map.Entry<String,Double> hmap : moviewithRating.entrySet()){
            System.out.println(hmap.getKey()+"===="+hmap.getValue());
        }
        System.out.println("-----------------------------------------");

        Map<String,Double> movieswithBudget = new LinkedHashMap<>();
        movieswithBudget.put("Dangal",6.7);
        movieswithBudget.put("Pushpa",7.6);
        movieswithBudget.put("DeadPool",8.7);
        movieswithBudget.put("The Nun",4.5);
        System.out.println("-----------------------------------------");
        for (Map.Entry<String,Double> hmap : movieswithBudget.entrySet()){
            System.out.println(hmap.getKey()+"===="+hmap.getValue());
        }

        System.out.println("-----------------------------------------");
        for (Map.Entry<String,Double> hmap : movieswithBudget.entrySet()){
            moviewithRating.merge(hmap.getKey(),hmap.getValue(),Double::sum);
        }
        for (Map.Entry<String,Double> hmap : moviewithRating.entrySet()){
            System.out.println(hmap.getKey()+"===="+hmap.getValue());
        }
    }
}
