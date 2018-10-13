package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numb = bufferedReader.readLine();
        String numb2 = bufferedReader.readLine();

        int num = Integer.parseInt(numb);
        int num2 = Integer.parseInt(numb2);

        if (num < num2)
            System.out.println(num);
        if (num2 < num)
            System.out.println(num2);
        if (num == num2)
            System.out.println(num);
    }
}