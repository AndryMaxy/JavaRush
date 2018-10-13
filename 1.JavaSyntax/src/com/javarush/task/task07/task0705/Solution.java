package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArr = new int[6];
        int[] smAr1 = new int[3];
        int[] smAr = new int[3];

        for (int i = 0; i < bigArr.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            bigArr[i] = Integer.parseInt(reader.readLine());

        }
        System.arraycopy(bigArr,3,smAr1,0,3);
        System.out.println(Arrays.toString(smAr1));
/*        for (int i = 0; i < smAr.length; i++)
            smAr[i] = bigArr[i];
        for (int i = 0; i < smAr1.length; i++) {
            //smAr1[i] = bigArr[i + 10];
            System.out.println(smAr1[i]);
        }*/


    }
}
