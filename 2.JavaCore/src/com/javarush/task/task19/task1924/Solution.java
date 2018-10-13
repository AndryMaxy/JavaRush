package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
       // String name = "F:\\txt.txt";
        reader.close();
        BufferedReader r = new BufferedReader(new FileReader(name));
        String s = "";

        while (r.ready()) {
            s = r.readLine();
            String[] split = s.split(" ");
            for (int i = 0; i < split.length; i++) {
                try {
                    int intt = Integer.parseInt(split[i]);
                    if (map.containsKey(intt)) {
                        split[i] = map.get(intt);
                    }
                } catch (Exception e) {}
            }
            for (String ss : split) {
                System.out.print(ss + " ");
            }
        }
        r.close();
    }
}
