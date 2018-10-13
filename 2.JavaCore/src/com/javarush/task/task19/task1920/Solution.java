package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {

//        String file = args[0];
        String file = "F:\\txt.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        TreeMap<String, Double> map = new TreeMap<>();
        String s = "";

        Pattern p = Pattern.compile("(.+) (-*\\d*\\.*\\d*)");
        Matcher m;

        while ((s = reader.readLine()) != null) {

            m = p.matcher(s);

            while (m.find()) {
                if (map.containsKey(m.group(1))) {
                    double d = Double.parseDouble(m.group(2));
                    map.put(m.group(1),map.get(m.group(1))+d);
                } else {
                    double d = Double.parseDouble(m.group(2));
                    map.put(m.group(1),d);
                }
            }
        }
        reader.close();

        double max = 0;
        for (Map.Entry<String, Double> m2 : map.entrySet()) {
            max = m2.getValue() > max ? m2.getValue() : max;
        }
        Double dd = map.values().stream().max(Double::compareTo).get();
        map.entrySet().stream().filter(e -> e.getValue().equals(dd)).forEach(e -> System.out.println(e.getKey()));
       // System.out.println(dd);
      /*  for (Map.Entry<String, Double> m2 : map.entrySet()) {
            if (m2.getValue().equals(max)) {
                System.out.println(m2.getKey());
            }
        }*/
    }
}
