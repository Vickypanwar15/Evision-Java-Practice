package com.august22array;

import java.io.*;

public class MergedTwoFiles {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("mergefile.txt"));
        BufferedReader br = new BufferedReader(new FileReader("abc1.txt"));
        String str = br.readLine();
        while(str!=null){
            bw.write(str);
            bw.newLine();
            str = br.readLine();
        }
        BufferedReader br1 = new BufferedReader(new FileReader("xyz.txt"));
        String str1 = br1.readLine();
        while(str1!=null){
            bw.write(str1);
            bw.newLine();
            str1 = br1.readLine();
        }

        bw.close();
        br.close();
        br1.close();
    }
}
