package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }
    public static int max (int a, int b) {
        int min = 0;
        if (a > b) {
            min = a;
        } else min = b;
        return min;
    }
    public static long max (long a, long b) {
        long min = 0;
        if (a > b) {
            min = a;
        } else min = b;
        return min;
    }
    public static double max (double a, double b) {
        double min = 0;
        if (a > b) {
            min = a;
        } else min = b;
        return min;
    }
    //Напишите тут ваши методы
}
