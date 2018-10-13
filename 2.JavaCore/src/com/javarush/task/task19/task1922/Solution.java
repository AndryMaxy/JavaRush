package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();
      //  String file = "F:\\txt.txt";
        reader.close();
        BufferedReader r = new BufferedReader(new FileReader(file));

        String s = "";
        int count = 0;
        while ((s = r.readLine()) != null) {

            String[] split = s.split(" ");

            for (int i = 0; i < split.length; i++) {
                for (int j = 0; j < words.size(); j++) {
                    if (split[i].equals(words.get(j))) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.println(s);
            }
            count = 0;
        }
        r.close();
    }
}
