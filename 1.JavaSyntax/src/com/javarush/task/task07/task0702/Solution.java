package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String  array[] = new String[10];
        for (int i = 0; i < 8; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String k = reader.readLine();
          //  int k = Integer.parseInt(reader.readLine());
            array[i] = k;
        }
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}