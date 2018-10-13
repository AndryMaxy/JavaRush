package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Solution {
    public static void main(String[] args) throws Exception {
        String f1 = args[0];
        String f2 = args[1];
       // String f1 = "F:\\txt.txt";
       // String f2 = "F:\\txt1.txt";

        BufferedReader r = new BufferedReader(new FileReader(f1));
        String s = "";
        BufferedWriter w = new BufferedWriter(new FileWriter(f2));
        String str = "";
        while (r.ready()) {
            s = r.readLine();

            String[] split = s.split(" ");
            for (String ss : split) {
                if (ss.length() > 6) {
                    str += ss + ",";
                  //  w.write(ss + ",");
                }
            }
        }
        r.close();
        String new1 = str.substring(0,str.length()-1);
        String new2 = new1.replaceAll("\\.","");
        System.out.println(new2);
        w.write(new1);
        w.close();

    }
}
