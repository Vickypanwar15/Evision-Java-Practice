package com.sept9.pratice;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class WriteDataToFIileWithStream {
    public static void main(String[] args)  {
        String[] words = {"kolkata","mumbai","manali","indore","dewas","nagda","himachal","Up"};
        String file ="D:\\New folder\\StreamData.txt";
        try(PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Path.of(file)))){
            Stream.of(words).forEach(pw::println);
        }
        catch (IOException io){
            io.printStackTrace();
        }
        System.out.println("Data saved to the file present at D:\\New folder\\StreamData.txt ");
    }
}
