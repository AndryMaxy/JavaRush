package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = bufferedReader.readLine();

        int n1 = Integer.parseInt(numb1);

        if (n1 > 0 && n1 % 2 == 0)
            System.out.println("положительное четное число");
        if (n1 < 0 && n1 % 2 == 0)
            System.out.println("отрицательное четное число");
        if (n1 > 0 && n1 % 2 != 0)
            System.out.println("положительное нечетное число");
        if (n1 < 0 && n1 % 2 != 0)
            System.out.println("отрицательное нечетное число");
        if (n1 == 0)
            System.out.println("ноль");
    }
}
