package com.august22array;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile  {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Demo.txt");
        int i = fr.read();
        while(i!=-1){
            System.out.print((char)i);
            i=fr.read();
        }
        System.out.println();
        File f = new File("AppendFile.txt");
        FileReader fr1 = new FileReader(f);
        char[] ch = new char[(int)f.length()];
        fr1.read(ch);
        for(char ch1:ch){
            System.out.print(ch1);
        }
        fr1.close();
    }
}
