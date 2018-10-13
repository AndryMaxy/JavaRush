package com.javarush.task.task06.task0622;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int q = Integer.parseInt(n);
        String n1 = reader.readLine();
        int q1 = Integer.parseInt(n1);
        String n2 = reader.readLine();
        int q2 = Integer.parseInt(n2);
        String n3 = reader.readLine();
        int q3 = Integer.parseInt(n3);
        String n4 = reader.readLine();
        int q4 = Integer.parseInt(n4);

        int w[] = {q,q1,q2,q3,q4};

        for (int i = 0; i < w.length - 1; i++) {
            for (int j = 0; j < w.length - 1; j++) {
                if (w[j]>w[j+1]) {
                    int tmp = w[j+1];
                    w[j+1] = w[j];
                    w[j] = tmp;
                }
            }
        }
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }
    }
}
