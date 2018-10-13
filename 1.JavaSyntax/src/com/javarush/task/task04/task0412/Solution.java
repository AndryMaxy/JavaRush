package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numb = bufferedReader.readLine();

        int num = Integer.parseInt(numb);

        int newnum = 0;

        if (num > 0) {
            newnum = num * 2;
            System.out.println(newnum);
        } if (num < 0) {
            newnum = num + 1;
            System.out.println(newnum);
        } if (num == 0)
            System.out.println(num);
    }

}