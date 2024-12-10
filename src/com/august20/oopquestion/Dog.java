package com.august20.oopquestion;

public class Dog {
    private String name;
    private String breed;

    Dog(String name,String breed){
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name){
        this.name=name;
    }
    public void  setBreed(String breed){
        this.breed = breed;
    }
    public String getName(){
        return name;
    }
    public  String getBreed(){
        return  breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("ABC","German Shapherd");
        Dog d2 = new Dog("XYZ","Bull dog");
        System.out.println(d1);
        System.out.println(d2);

        d1.setName("Oskar");
        System.out.println(d1);
        d2.setBreed("Labrador");
        System.out.println("Name "+d1.getName()+"  :  "+"Breed :"+d1.getBreed());
        System.out.println("Name "+d2.getName()+"  :  "+"Breed :"+d2.getBreed());

    }
}
