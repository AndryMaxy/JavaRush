package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = bufferedReader.readLine();
        String numb2 = bufferedReader.readLine();

        int n1 = Integer.parseInt(numb1);
        int n2 = Integer.parseInt(numb2);

        if (n1 > 0 && n2 > 0)
            System.out.println("1");
        if (n1 < 0 && n2 > 0)
            System.out.println("2");
        if (n1 < 0 && n2 < 0)
            System.out.println("3");
        if (n1 > 0 && n2 < 0)
            System.out.println("4");
    }
}
