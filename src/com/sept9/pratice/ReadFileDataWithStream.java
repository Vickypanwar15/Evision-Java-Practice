package com.sept9.pratice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileDataWithStream {

    private  static List<String> filterandUpper(Stream<String> stream,int length){
        return  stream.filter(s -> s.length() == 5).map(s->s.toUpperCase()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String file = "D:\\New folder\\StreamData.txt";
        try(Stream<String> line = Files.lines(Paths.get(file))){

            List<String> filteredData = filterandUpper(line,5);
//            List<String> filter2 = line.filter(s -> s.length()>5).map(s -> s.toUpperCase()).collect(Collectors.toList());
            System.out.println("Filtered String with uppercase");
            System.out.println(filteredData);

//            System.out.println(filter2);
        }
        catch (IOException io){
            io.printStackTrace();
        }
    }
}
