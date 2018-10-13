package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
      //  long l = (long) 1234_564_890L;
        int x = (int) 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
      //  float f = (float) l++ + 10 + ++x - (float) m;
        //l = (long) f / 1000;
        double l = 5/3f;
        long k = 99999999999999L;
        char w = '\u1234';
        System.out.println(w);

    }
}