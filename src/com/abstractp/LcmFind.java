package com.abstractp;

public class LcmFind
{
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int max=Math.max(a,b);
        while (true){
            if(max%a==0 && max%b==0){
                System.out.println(max);
                break;
            }
            max++;

        }
    }
}

