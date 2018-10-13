package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 1;
        int k = 1;

        while (i <= 10) {
            while (k <= 10) {
                System.out.print(i * k + " ");
                k++;
            }
            System.out.println();
            i++;
            k = 1;
        }

    }
}
