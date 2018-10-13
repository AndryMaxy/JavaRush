package com.javarush.task.task29.task2913;

import java.util.Random;
import java.util.StringJoiner;

/* 
Замена рекурсии
*/

public class Solution {
    private static int numberA;
    private static int numberB;

    public static String getAllNumbersBetween(int a, int b) {
        StringJoiner sj = new StringJoiner(",");
        String s = "";
        if (a > b) {
            int i = a;
            while (i >= b) {
                sj.add(String.valueOf(i));
               // s += i + " ";
                i--;
            }
            return sj.toString();
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            int i = a;
            while (i <= b) {
                sj.add(String.valueOf(i));
               // s += i + " ";
                i++;
            }
            return sj.toString();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt() % 1_000;
        numberB = random.nextInt() % 10_000;
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}