package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int aa = Integer.parseInt(a);
        String bb = reader.readLine();
        int b = Integer.parseInt(bb);

        int sum = aa + b;
        System.out.println("Sum = " + sum);
    }
}
