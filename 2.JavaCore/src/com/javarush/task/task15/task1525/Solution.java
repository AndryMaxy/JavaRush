package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {

        try {
  /*          BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
        //    InputStream in = new FileInputStream(Statics.FILE_NAME);
         //   String s = reader.readLine();
            String s = "";
            while ((s = reader.readLine()) != null) {
                lines.add(s);
            }*/
            lines = Files.readAllLines(Paths.get(Statics.FILE_NAME));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(lines);
    }
}
