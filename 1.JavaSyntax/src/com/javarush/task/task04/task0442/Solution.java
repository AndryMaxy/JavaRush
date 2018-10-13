package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (; ; ) {
            String numb1 = bufferedReader.readLine();
            int n1 = Integer.parseInt(numb1);
            sum += n1;
            if (n1 == -1)
                break;
            }
        System.out.println(sum);
        }

    }
