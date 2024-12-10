package com.stringconcept;

final class Immutability{
    private Object obj;
    Immutability(Object obj){
        this.obj=obj;
    }
    public Immutability modify(Object obj){
        if(this.obj==obj){
            return this;
        }
        else{
            return  new Immutability(obj);
        }
    }
    public Object getI(){
        if(obj instanceof String){
            String s = (String)obj;
            return s;
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            return d;
        } else if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            return i;
        }
        return obj;
    }

}

public class ImmutableClass {
    public static void main(String[] args) {
        Immutability i1 = new Immutability(200);
        Immutability i2 = new Immutability(200);
        System.out.println(i1==i2);
        Immutability i4 =i2.modify(100); //  we do not assign to any reference that the 100 is not print
        System.out.println("I4 :"+i4.getI());
        System.out.println(i2.getI());  // O/P : 200
        Immutability i3 = new Immutability("Vishal");
        System.out.println(i3.getI());

    }
}
