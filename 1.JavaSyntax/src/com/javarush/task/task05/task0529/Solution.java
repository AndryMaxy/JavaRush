package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        int sum = 0;
        while (i < 5) {
            String numb = bufferedReader.readLine();
            if (numb.equals("сумма"))
                break;
            else {
                Integer n = Integer.parseInt(numb);
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
