package com.august21;

import java.lang.reflect.Constructor;

class CompanyA implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String name = "Evision";
    String address="MR-9";
    int workingEmployee= 200;
    public CompanyA(String name,String address,int workingEmployee){
        this.name=name;
        this.address=address;
        this.workingEmployee = workingEmployee;
    }
    CompanyA(){
        System.out.println("CompanyA class constructor called");
    }
    public void showDetails(){
        System.out.println("Company Name:"+name);
        System.out.println("Company Address:"+address);
    }

    @Override
    public String toString() {
        return "Company Name:"+name+"\t" + "Address :"+address +"\t"+"Employee :"+workingEmployee;

    }
}


public class ToCreateObject {

    public static void main(String[] args) {
//        First way to create an object using new Keyword
        CompanyA a1 = new CompanyA("Amazon","Indore",30000);
        System.out.println(a1);
        try{
//        Second way to create an object using clone() method of object class

            CompanyA obj1 = (CompanyA)a1.clone();
            System.out.println(obj1);

//            Third way to create object using newInstance() method of Class class
            Class cls = Class.forName("com.august21.CompanyA");
            CompanyA obj2 = (CompanyA) cls.newInstance();
            System.out.println(obj2);

//            Fourth way to declare an object using newInstance method of Constructor class

            Constructor<CompanyA> cont = CompanyA.class.getDeclaredConstructor();
            CompanyA obj3 = cont.newInstance();
            System.out.println(obj3);

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
