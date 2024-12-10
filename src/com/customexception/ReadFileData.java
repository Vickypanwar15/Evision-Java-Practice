package com.customexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileData {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr;
       try {
          fr  = new FileReader("mergefile.txt");
          int ch = fr.read();
          while (ch!=-1){
              System.out.print((char)ch);
              ch= fr.read();
          }
       }
       catch (FileNotFoundException e){
           System.out.println("file is not present ");
       }
       catch (IOException i){
           System.out.println("Input output exception");
       }
    }
}
