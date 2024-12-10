package com.august22array;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
//        using this constructor if we run again and again content will be override in this constructor
        FileWriter file = new FileWriter("Demo.txt");
        String str = "While writing data by FileWriter compulsory we should insert line separator(\\n) \n" +
                "manually which is a bigger headache to the programmer";
        file.write(str);
        file.write("\n");
        char[] ch = {'V','I','S','H','A','L'};
        file.write("\n");
        file.write(ch);
        file.write("\n");
        file.write(100);

        file.flush();

        file.close();

//         this is append construtor when we run multiple time the content is append on the previous content
        FileWriter f2 = new FileWriter("AppendFile.txt",true);
        f2.write(str);
        char[] ch1 = {'a','e','i','o','u'};
        f2.write("\n");
        f2.write(ch1);
        f2.flush();
        f2.close();
    }

}
