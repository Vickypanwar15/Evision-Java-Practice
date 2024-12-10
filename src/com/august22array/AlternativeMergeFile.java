package com.august22array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AlternativeMergeFile {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("alternative_file.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("abc1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("xyz.txt"));
        String str1 = br1.readLine();
        String str2 = br2.readLine();
        while(str1!=null || str2!=null){
            pw.println(str1);

            pw.println(str2);
            str1 = br1.readLine();
            str2 = br2.readLine();
        }

        br1.close();
        br2.close();
        pw.close();
    }
}
