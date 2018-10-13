package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if (month <= 2 || month == 12)
            System.out.println("зима");
        if (3 <= month && month <= 5)
            System.out.println("весна");
        if (6 <= month && month <= 8)
            System.out.println("лето");
        if (9 <= month && month <= 11)
            System.out.println("осень");
    }
}