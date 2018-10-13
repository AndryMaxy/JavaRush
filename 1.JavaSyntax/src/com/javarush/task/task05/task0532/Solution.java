package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int maximum = 0;

            for (int i = 0; i < n; i++) {
                int k = Integer.parseInt(reader.readLine());
                if (i == 0)
                    maximum = k;
                if (maximum < k)
                     maximum = k;
            }
            //напишите тут ваш код
            System.out.println(maximum);
        }
    }
}