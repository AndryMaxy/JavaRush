package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {

        String fn = args[0];
     //   String fn = "F:\\txt.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fn));

        TreeMap<String, Double> map = new TreeMap<>();

        String s = "";

        Pattern p1 = Pattern.compile("(.+) (-*\\d*\\.*\\d+)");
        Matcher m;

        while ((s = reader.readLine()) != null) {
            m = p1.matcher(s);
            while (m.find()) {
                if (map.containsKey(m.group(1))) {
                    double d2 = Double.parseDouble(m.group(2));
                    double d3 = map.get(m.group(1)) + d2;
                    map.put(m.group(1),d3);
                } else {
                    double d = Double.parseDouble(m.group(2));
                    map.put(m.group(1),d);
                }

            }

        }
        reader.close();
        for (Map.Entry<String, Double> m1 : map.entrySet()) {
            System.out.println(m1.getKey() + " " + m1.getValue());
        }


    }
}
