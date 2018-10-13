package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        //String name = "F:\\txt.txt";
        reader.close();
        BufferedReader r = new BufferedReader(new FileReader(name));
        String s = "";

        while (r.ready()) {
            ;

            StringBuilder sb = new StringBuilder(s = r.readLine()).reverse();
           // String ss = sb.reverse().toString().replaceAll("\\t","");
            System.out.println(sb);

        }
        r.close();
    }
}
