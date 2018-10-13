package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();

        BufferedReader r = new BufferedReader(new FileReader(f1));
        List<String> list = new ArrayList<>();

        list = r.lines().collect(Collectors.toList());
        r.close();

        Pattern p0 = Pattern.compile("\\p{Punct}");
        Matcher m;
        String end = "";
        for (String s : list) {
            m = p0.matcher(s);
            while (m.find()) {
                end += m.replaceAll("");
               // System.out.println(m.group());
              //  System.out.println(m.start());
            }
        }
        BufferedWriter writer =new BufferedWriter(new  FileWriter(f2));
        writer.write(end);
        writer.close();
        System.out.println(end);

    }
}
