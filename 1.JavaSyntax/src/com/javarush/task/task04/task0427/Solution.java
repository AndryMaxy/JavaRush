package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = bufferedReader.readLine();

        int n1 = Integer.parseInt(numb1);

        if (n1 > 0 && n1 < 10 && n1 % 2 == 0)
            System.out.println("четное однозначное число");
        if (n1 > 0 && n1 < 10 && n1 % 2 != 0)
            System.out.println("нечетное однозначное число");
        if (n1 > 9 && n1 < 100 && n1 % 2 == 0)
            System.out.println("четное двузначное число");
        if (n1 > 9 && n1 < 100 && n1 % 2 != 0)
            System.out.println("нечетное двузначное число");
        if (n1 > 99 && n1 < 1000 && n1 % 2 == 0)
            System.out.println("четное трехзначное число");
        if (n1 > 99 && n1 < 1000 && n1 % 2 != 0)
            System.out.println("нечетное трехзначное число");
    }
}
