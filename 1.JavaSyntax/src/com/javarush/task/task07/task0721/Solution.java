package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> intL = new ArrayList<>();

        int[] array2 = new int[20];

        int maximum;
        int minimum;

        for (int i = 0; i < 20; i++) {
            intL.add(Integer.parseInt(reader.readLine()));
        }

        Integer[] array = intL.toArray(new Integer[(intL.size())]);

        Arrays.sort(array);
        maximum = array[19];
        minimum = array[0];

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
