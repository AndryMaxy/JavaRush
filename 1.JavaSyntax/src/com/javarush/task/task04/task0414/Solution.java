package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        String sSum = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        int nSum = Integer.parseInt(sSum);

        System.out.print(name + " получает " + nSum + " через " + nAge + " лет.");//напишите тут ваш код
    }
}
