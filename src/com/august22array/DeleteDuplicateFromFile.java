package com.august22array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteDuplicateFromFile {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader br1 = new BufferedReader(new FileReader("number_data.txt"));
            PrintWriter out = new PrintWriter("unique_number.txt");
            String target = br1.readLine();
            while (target != null) {
                boolean available = false;
                BufferedReader br2 = new BufferedReader(new FileReader("unique_number.txt"));
                String line = br2.readLine();
                while (line != null) {
                    if (target.equals(line)) {
                        available = true;
                        break;
                    }
                    line = br2.readLine();
                }
                if (available == false) {
                    out.println(target);
                    out.flush();
                }
                target = br1.readLine();
            }
        }
    }
}
