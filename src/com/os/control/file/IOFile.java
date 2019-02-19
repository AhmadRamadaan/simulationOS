package com.os.control.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class IOFile {

    public static void write(LinkedList<String> list, String file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-16");
            BufferedWriter bw = new BufferedWriter(osw);

            for (String line : list) {
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("There is IOException!" + e.getMessage());
        }
    }

    public static LinkedList<String> read(String filePath) {
        LinkedList<String> list = new LinkedList();
        String s = "";
        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-16");
            BufferedReader br = new BufferedReader(isr);
            while ((s = br.readLine()) != null) {
                list.add(s);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File not found !");
        }
        return list;
    }

}
