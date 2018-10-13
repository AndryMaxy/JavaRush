package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        int min = 0;
        while (in.available() > 0) {
            int q = in.read();

            min = min == 0 ? q : min;
            min = q < min ? q : min;
        }
        in.close();
        System.out.println(min);
    }
}
