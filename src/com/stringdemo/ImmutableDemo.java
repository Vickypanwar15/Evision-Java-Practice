package com.stringdemo;

import java.util.Arrays;
import java.util.List;

final class  Immutable{
    private final int x;
    private final  List<String> list;

    public Immutable(int x, List<String> list) {
        this.x = x;
        this.list = list;
    }

    public int getX() {
        return x;
    }

    public List<String> getList() {
        return list;
    }
}

public class ImmutableDemo {
    public static void main(String[] args) {

        Immutable im = new Immutable(10, Arrays.asList("Ujjawal","Manish"));
        System.out.println(im.getX()+"-->"+im.getList());
        System.out.println("Hashcode"+im);
        im = new Immutable(20,Arrays.asList("Vishal"));
        System.out.println(im.getX()+"-->"+im.getList());

    }
}
