package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

        String end = "";
        for (String s : list) {
            end += s.replaceAll("\\.","!");
        }
        System.out.println(end);
        BufferedWriter writer = new BufferedWriter(new FileWriter(f2));
        writer.write(end);
        writer.close();
    }
}
