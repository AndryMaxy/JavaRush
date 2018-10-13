package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            int max = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
                    int tmp = array[max];
                    array[max] = array[i];
                    array[i]=tmp;
        }

/*        Arrays.sort(array);
        int [] newar = new int[20];

        int count = 0;

        for (int i = array.length; i >= 0; i--) {
            newar[count] = array[i];
            count++;
        }*/
    }
}
