package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String f = bufferedReader.readLine();
        String s = bufferedReader.readLine();
        String t = bufferedReader.readLine();
        String fr = bufferedReader.readLine();

        int ff = Integer.parseInt(f);
        int ss = Integer.parseInt(s);
        int tt = Integer.parseInt(t);
        int ft = Integer.parseInt(fr);


            if (ff >= ss && ff >= tt && ff >= ft)
                System.out.println(ff);
            else if (ss >= tt && ss >= ff && ss >= ft)
                System.out.println(ss);
            else if (tt >= ss && tt >= ff && tt >= ft)
                System.out.println(tt);
            else if (ft >= ss && ft >= ff && ft >= tt)
                System.out.println(ft);


    }
}

/*        int arr[] = {ff, ss, tt, ft};

        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max])
                    max = j;
            }
            int tmp = arr[max];
            arr[max] = arr[i];
            arr[i] = tmp;
        }

*//*        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[i+1]|| arr[i] == arr[i+2] || arr[i] == arr[i+3]) {
                    System.out.println(arr[i]);
                }
            }*//*
        System.out.println(arr[0]);
    }*/