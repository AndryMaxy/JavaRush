package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(894));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int x = 1;
        int y = 0;

        y = y + x;

        x = x * 2;
        y = y + x;

        x = x * 2;
        y = y + x;

        x = x * 2;
        y = y + x;

        x = x * 2;
        y = y + x;
        return y;
    }
}