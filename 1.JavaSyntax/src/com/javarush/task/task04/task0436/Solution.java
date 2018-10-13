package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = bufferedReader.readLine();
        String numb2 = bufferedReader.readLine();

        int n1 = Integer.parseInt(numb1);
        int n2 = Integer.parseInt(numb2);

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
