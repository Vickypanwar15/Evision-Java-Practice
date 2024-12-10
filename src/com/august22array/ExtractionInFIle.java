package com.august22array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

public class ExtractionInFIle {
    public static void main(String[] args) throws IOException {
        Collection c1 = new ArrayList();
        BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("extract.txt");
        String str1 = br1.readLine();
        while (str1!=null){
            boolean isAvailable = false;
            BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
            String str2 = br2 .readLine();
            while(str2!=null){
                if(str1.equals(str2)){
                    isAvailable = true;
                    break;
                }
                str2 = br2.readLine();
            }
            if (isAvailable == false){
                pw.println(str1);
                pw.flush();
            }
            str1 = br1.readLine();
        }
    }
}
