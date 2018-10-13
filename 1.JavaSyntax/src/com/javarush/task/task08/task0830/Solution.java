package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

    public static void sort(String[] array) {
       // Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int numb = i;
            for (int j = i+1; j < array.length; j++) {
                if (isGreaterThan(array[numb],array[j])) {
                    numb = j;
                }
                    String tmp = array[numb];
                    array[numb] = array[i];
                    array[i] = tmp;
                }
            }
        }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}