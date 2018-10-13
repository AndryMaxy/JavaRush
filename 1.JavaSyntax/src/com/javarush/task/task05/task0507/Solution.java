package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        double avr = 0;

        for (;;) {
            String numb = bufferedReader.readLine();
            int n = Integer.parseInt(numb);
            sum += n;
            avr++;
            if (n == -1) {
                sum++;
                avr--;
                break;
            }

        }
        System.out.println(sum/avr);

    }
}

