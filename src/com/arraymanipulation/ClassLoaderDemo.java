package com.arraymanipulation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Home{
    static String city;
    String name;
    int length;
    int width;
    String address;

    static {
        city = "INDORE";
    }
    public Home(String name, int length, int width, String address) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.address = address;
    }

    public void getDetails(){

    }
    public void setDetails(){

    }

    @Override
    public String toString() {
        return "Home{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", address='" + address + '\'' +
                '}';
    }
}

public class ClassLoaderDemo {
    public static void main(String[] args) {
        Class<Home> obj = Home.class;
        Method[] methods = obj.getDeclaredMethods();
        System.out.println("Method present inside Home class");
        for(Method m : methods){
            System.out.println(m.getName());
        }
        System.out.println("Field present in Home class");
        Field[] fields = obj.getDeclaredFields();
        for (Field f : fields){
            System.out.println(f.getName());
        }

        System.out.println("Constructor present in Home class ");
        Constructor<?>[] constructor = obj.getDeclaredConstructors();
        for (Constructor c : constructor){
            System.out.println(c);
        }
        System.out.println("City :"+Home.city);
    }
}
