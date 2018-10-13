package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String f = bufferedReader.readLine();
        String s = bufferedReader.readLine();
        String t = bufferedReader.readLine();

        int ff = Integer.parseInt(f);
        int ss = Integer.parseInt(s);
        int tt = Integer.parseInt(t);

        if (ff+ss > tt && ss + tt > ff && ff + tt > ss) {
            System.out.println("Треугольник существует.");
        } else
            System.out.println("Треугольник не существует.");
    }
}