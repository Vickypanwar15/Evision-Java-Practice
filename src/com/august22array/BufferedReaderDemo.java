package com.august22array;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\ftt\\OneDrive\\Documents\\chapter_2_project.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fr1 = new FileWriter("major_project_report.txt");
        BufferedWriter bw = new BufferedWriter(fr1);
        String str = br.readLine();
        while(str!=null){
            System.out.println(str);
            bw.write(str);
            bw.newLine();
            str = br.readLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
