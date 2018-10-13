package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (!(isNumber(array[i]))) {
                int numb = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (isGreaterThan(array[numb], array[j])) {
                        numb = j;
                    }
                }
                String tmp = array[numb];
                array[numb] = array[i];
                array[i] = tmp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                int numb = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (isNumber(array[j])) {
                        int k = Integer.parseInt(array[numb]);
                        int l = Integer.parseInt(array[j]);
                        if (k < l) {
                            numb = j;
                        }
                    }
                }
                String tmp = array[numb];
                array[numb] = array[i];
                array[i] = tmp;
            }
        }
    }
    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
