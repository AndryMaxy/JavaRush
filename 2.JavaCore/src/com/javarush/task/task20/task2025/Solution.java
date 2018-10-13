package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Collections;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        ArrayList<Long> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            Integer q = i;
            String s = q.toString();
            int lenght = s.length();
            int end = 0;
            double schet = 0;

            for (int j = 0; j < lenght; j++) {
                int n = s.charAt(j) - '0';
                schet = Math.pow(n,lenght);
                end += schet;
            }
            if (end == i) {
                list.add((long)i);
            }
        }
        long[] result = new long[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        long[] r = getNumbers(10L);
        for (long l : r) {
            System.out.println(l);
        }
    }
}
