package com.august22array;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f = new File("Demo.txt");  // 1st constructor to pass file name to create a new ile in current directory
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());
        f.delete();
        System.out.println(f.exists());

//        2nd construtor present in
        File f1 = new File("C:\\Users\\ftt\\OneDrive\\Major Project","demo.txt");
        f1.createNewFile();
        System.out.println(f1.exists());

        File f2 = new File("C:\\Users\\ftt\\OneDrive\\Major Project","AdvanceJava");
        boolean mkdir = f2.mkdir();

        File f3 = new File("C:\\Users\\ftt\\OneDrive\\Major Project","coreJava");
        System.out.println("Directory already present :"+f3.mkdir());
//        f2.delete();
//        f3.delete();
    }
};
