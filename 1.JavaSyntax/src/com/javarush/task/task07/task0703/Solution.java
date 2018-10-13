package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] strArr = new String[10];
        int[] intArr = new int[10];

        for (int i = 0; i < strArr.length; i++) {
            BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

            String l = reader.readLine();
            strArr[i] = l;
            intArr[i] = l.length();
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
