package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String maney = bufferedReader.readLine();
        int m = Integer.parseInt(maney);
        System.out.println("Я буду зарабатывать $"+ m + " в час");
    }
}
