package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String text = bufferedReader.readLine();
        String numb1 = bufferedReader.readLine();
        String numb2 = bufferedReader.readLine();
        int n1 = Integer.parseInt(numb1);
        int n2 = Integer.parseInt(numb2);
        System.out.println(text + " получает " + n1 + " через " + n2 + " лет.");
    }
}
