package com.august22array;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinitWriterDemo  {
    public static void main(String[] args) throws IOException {
        File f = new File("PrintWriter.txt");
        PrintWriter pw = new PrintWriter(f);
        pw.print(64489723);
        pw.println(false);
        pw.println('V');
        pw.println(5634569923472847274L);
        pw.flush();
        pw.close();
    }
}
