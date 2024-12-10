package com.sept9.pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapToStreamConversion {

//    convert map to the stream
    public static <K,V> Stream<Map.Entry<K,V>> convertStream(Map m){
        return m.entrySet().stream();
    }

//    convert map key to the stream
    public  static <K,V> Stream<K> convertKeyStream(Map<K,V> m){
        return  m.keySet().stream();
    }

//    convert only map values to stream
    public static <K,V> Stream<V> convertValueStream(Map<K,V> m){
        return  m.values().stream();
    }
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<Integer,String>();
        student.put(1001,"Rahul");
        student.put(2012,"Avinash");
        student.put(1010,"Sumit");
        student.put(2010,"Jatin");

        System.out.println("Map Entry :"+student);

        Stream<Map.Entry<Integer,String>> stream = convertStream(student);
        System.out.println("Stream conversion :");
        stream.forEach(System.out::println);

        System.out.println("Key present in map convert to stream");
        Stream<Integer> keys = convertKeyStream(student);
        keys.forEach(key->System.out.print(key+" , "));

        System.out.println("Value present in map convert to stream");
        Stream<String> values = convertValueStream(student);
        values.forEach(value->System.out.print(value+" , "));

    }
}
