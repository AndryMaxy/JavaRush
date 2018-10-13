package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        String numb = bufferedReader.readLine();


        int num = Integer.parseInt(numb);

        if (num < 18)
            System.out.println("Подрасти еще");
    }
}
