package com.stringconcept;


public class StringConstuctorMethod {
    public static void main(String[] args) {
        String s1 = new String("Avinash");
        System.out.println(s1.length());
        String s2 = new String("Avinash");
        System.out.println(s1.equals(s2)); //true
        System.out.println("S1==S2 :"+(s1==s2)); //false

        String s3 = "Avinash";
        System.out.println("S2==S3 :"+(s2==s3)); //false
        s2.intern();
        System.out.println("S2==S3 :"+(s2==s2)); //true
        String s4;
        s4="Avinash";
        System.out.println("S3==S4 :"+(s3==s4));//true

//        String most important methods....
        String clgName ="Vikrant Group of Institutions Indore";
        System.out.println("Charater at 10:"+clgName.charAt(10));
        System.out.println("Length of String : "+clgName.length());
        System.out.println("UpperCase:"+clgName.toUpperCase());
        System.out.println("LowerCase:"+clgName.toLowerCase());
        System.out.println("Substring : "+clgName.substring(16));
        System.out.println("Substring from 6 to end:"+clgName.substring(6,clgName.length()));
        System.out.println("Index of t :"+clgName.indexOf('t'));
        System.out.println("Last index t :"+clgName.lastIndexOf('t'));
        System.out.println("Normal String : "+clgName);
        System.out.println("Replce t to Z : "+clgName.replace('t','Z')); //to replace all t present in strin to Z

        String s6 = s1.concat(" Sharma");
        System.out.println(s6);
        String s7  = "avinash sharma";
        System.out.println(s6.equals(s7)); //false
        System.out.println(s6.equalsIgnoreCase(s7)); //True

        byte[] b = {65,34,46,87,80,97,122};
        String arr = new String(b);
        System.out.println("Byte Array : "+arr);

        char[] ch = {'V','I','S','h','A','L'};
        String charArray = new String(ch);
        System.out.println(charArray);
        String trim = "  Raju Bhai    ";
        System.out.println(trim);
        System.out.println(trim.trim());  //remove the blank space from start and end not in begining

        StringBuffer sb = new StringBuffer("Akshay kumar");
//        String sb1 = new String(sb);
        String sb1 = sb.toString();
//        String sb1 = (String)sb;    it is not typecasting by this way
        StringBuilder sb2 = new StringBuilder("Akshay kumar");
        String sb3 = new String(sb2);
        System.out.println(sb3);
        System.out.println("Sb==sb2 :"+(sb.equals(sb2))); //false
        System.out.println("Sb1 :"+sb1+"\n"+"Sb2:"+sb3);
        System.out.println("Sb1==sb3 :"+(sb1.equals(sb3)));//true
        System.out.println("****Before Intern method*****");
        System.out.println("Hashcode sb1 :"+sb1.hashCode()+"\n"+"hashcode sb3:"+sb3.hashCode());

        System.out.println(sb1.intern());
        System.out.println(sb3.intern());
        System.out.println("Sb1==sb3 :"+(sb1==sb3));//false
        System.out.println("Hashcode sb1 :"+sb1.hashCode()+"\n"+"hashcode sb3:"+sb3.hashCode());
        System.out.println(sb1.intern()==sb3.intern()); //true

    }
}
