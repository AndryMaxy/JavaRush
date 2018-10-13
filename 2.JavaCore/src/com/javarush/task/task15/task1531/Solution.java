package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        String w = n >= 0 ? "" + 1 : "" + 0;
        BigInteger k = n >= 0 ? BigInteger.valueOf(1) : BigInteger.valueOf(0);
        for (int i = 1; i <= n; i++) {
            k = k.multiply(BigInteger.valueOf(i));
        }
        String s = k.toString();
      //  int q = s.indexOf(".");
       // String w = s.substring(0,q);
        return s;
    }
}
