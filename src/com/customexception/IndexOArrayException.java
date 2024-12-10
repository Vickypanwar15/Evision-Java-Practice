package com.customexception;

public class IndexOArrayException {
    public static void main(String[] args) {
        int[] arr = {5,10,15,4,8,12,3,6,8,16};
        for(int i=0;i<=arr.length;i++){
            try{
                System.out.println(arr[i]);
            }
            catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Index is not present in array");
                System.out.println(exc);
            }
        }
        String name = "Anudip Foundation";
        for(int i =0;i<=name.length();i++){
            try{
                System.out.print(name.charAt(i)+" ");
            }
            catch (StringIndexOutOfBoundsException e){
                System.out.println();
                System.out.println("Index "+i+" is not available in name string");
                System.out.println(e);
            }
        }
    }
}
