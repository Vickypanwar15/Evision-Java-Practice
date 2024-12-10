package com.august12;

public class VariablesDemo {
    public int insvar;      //instance variable

    static int ans;         //static variable
    VariablesDemo(){
        ans++;
        insvar++;
    }

    public static void main(String[] args) {
        VariablesDemo d = new VariablesDemo();
        System.out.println("Static Variable:"+VariablesDemo.ans+"  :  "+"Instance Variable:"+d.insvar);
        VariablesDemo d1 = new VariablesDemo();
        System.out.println("Static Variable:"+VariablesDemo.ans+"  :  "+"Instance Variable:"+d.insvar);
        VariablesDemo d2 = new VariablesDemo();
        System.out.println("Static Variable:"+VariablesDemo.ans+"  :  "+"Instance Variable:"+d.insvar);
        int localvar=0;  //local variable
        System.out.println("local variable :"+localvar);
    }
}
