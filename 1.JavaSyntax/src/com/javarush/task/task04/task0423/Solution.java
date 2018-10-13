package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        String numb = bufferedReader.readLine();

        int num = Integer.parseInt(numb);

        if (num>20)
            System.out.println("И 18-ти достаточно");
    }
}
