package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = bufferedReader.readLine();
        String numb2 = bufferedReader.readLine();
        String numb3 = bufferedReader.readLine();

        int n1 = Integer.parseInt(numb1);
        int n2 = Integer.parseInt(numb2);
        int n3 = Integer.parseInt(numb3);

        if (n1 == n2 && n2 != n3)
            System.out.println("3");
        if (n2 == n3 && n3 != n1)
            System.out.println("1");
        if (n3 == n1 && n1 != n2)
            System.out.println("2");
    }
}
