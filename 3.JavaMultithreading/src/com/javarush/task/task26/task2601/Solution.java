package com.javarush.task.task26.task2601;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {

        Integer[] ar = {13,8,15,5,17};
        System.out.println(Arrays.toString(sort(ar)));


    }

    public static Integer[] sort(Integer[] array) {
        double median = 0;
        Arrays.sort(array);
        if(array.length % 2 == 0)
            median = ((double)array[array.length/2]+ (double)array[array.length/2 -1])/2;
        else
            median = (double) array[array.length/2];
        final double v = median;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        Collections.sort(list,Comparator.comparingDouble(x -> Math.abs(x - v)));
        array = new Integer[array.length];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
