package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {

        String f1 = args[0];
        String f2 = args[1];

      //  String f1 = "F:\\txt.txt";
      //  String f2 = "F:\\txt1.txt";

        BufferedReader reader = new BufferedReader(new FileReader(f1));
        String s = "";

      //  Pattern p = Pattern.compile("([A-zА-я[^0-9]])* ([A-zА-я0-9])*");
        Pattern p = Pattern.compile("\\b[\\S]*[\\d]+[\\S]*\\b");
        Matcher m;
        BufferedWriter writer = new BufferedWriter(new FileWriter(f2));
        while ((s = reader.readLine()) != null) {

            m = p.matcher(s);
            while (m.find()) {
                writer.write(m.group() + " ");
            }


        }
        writer.close();
        reader.close();
    }
}
