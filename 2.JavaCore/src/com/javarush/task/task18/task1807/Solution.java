package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        FileInputStream in = new FileInputStream(reader.readLine());
        reader.close();
        int code  = (int)',';
        int count = 0;
        while (in.available() > 0) {
            int q = in.read();
            if (q == code) {
                count++;
            }
        }
        in.close();
        System.out.println(count);
    }
}
