package com.javarush.task.task19.task1908;

/* 
Выделяем числа
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

        BufferedReader reader1 = new BufferedReader(new FileReader(f1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(f2));
        List<String> list = new ArrayList<>();
        ArrayList<String> gg = new ArrayList<>();
        list = reader1.lines().collect(Collectors.toList());
        reader1.close();
        String end = "";

        Pattern p = Pattern.compile("\\b\\d+\\b");
      //  Pattern p2 = Pattern.compile("\\D+");
        Matcher m;
     //   Matcher m2;
        boolean kek = true;
        for (String s : list) {
            String[] split = s.split(" ");
            for (int i = 0; i < split.length; i++) {
                m = p.matcher(split[i]);
               // m2 = p2.matcher(split[i]);
                while (m.find()) {
                    end += m.group() + " ";
                }
            }
        }
        String ender = end.trim();
        writer.write(ender);
        writer.close();
       // System.out.println(ender);
    }
}
/*
               for (int j = 0; j < split[i].length(); j++) {
        if (Character.isLetter(split[i].charAt(j))) {
            kek = false;
        }
    }
                if (kek) {
        end += split[i] + " ";
    }
    kek = true;
}*/
