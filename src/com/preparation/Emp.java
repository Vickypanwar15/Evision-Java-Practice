package com.preparation;

import java.util.Objects;

public class Emp {
    int id;
    String name;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Emp emp = (Emp) o;
//        return id == emp.id && Objects.equals(name, emp.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Emp e1 = new Emp(1,"qwer");
        Emp e2 = new Emp(1,"qwer");
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode()+" : "+e2.hashCode());

        System.out.println(e1.hashCode()==e2.hashCode());
    }
}
