package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int [] array = {n1,n2,n3};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                count++;
        }
        System.out.println(count);
/*        if (n1 > 0 && n2 > 0 && n3 > 0)
            System.out.println("3");
        else if (n1 > 0 && n2 > 0 && n3 < 0)
            System.out.println("2");
        else if (n1 > 0 && n2 > 0 && n3 < 0)
            System.out.println("2");*/

    }
}
