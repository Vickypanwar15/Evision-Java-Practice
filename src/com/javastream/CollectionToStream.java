package com.javastream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

public class CollectionToStream {
    public  static <T> void getStream(ArrayList<T> list){
        Stream<T> streamList = list.stream();
        Iterator<T> itr = streamList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrlst = new ArrayList<>();
        arrlst.add("ABC");
        arrlst.add("Jenkins");
        arrlst.add("Git");
        arrlst.add("We service");
        getStream(arrlst);
    }
}
