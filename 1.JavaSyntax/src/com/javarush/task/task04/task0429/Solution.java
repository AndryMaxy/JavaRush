package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = bufferedReader.readLine();
        String numb2 = bufferedReader.readLine();
        String numb3 = bufferedReader.readLine();

        int n1 = Integer.parseInt(numb1);
        int n2 = Integer.parseInt(numb2);
        int n3 = Integer.parseInt(numb3);

        int [] array = {n1,n2,n3};
        int countplus = 0;
        int countminus = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                countplus++;
            if (array[i] < 0)
                countminus++;

        }
        System.out.println("количество отрицательных чисел: " + countminus);
        System.out.println("количество положительных чисел: " + countplus);

    }
}
