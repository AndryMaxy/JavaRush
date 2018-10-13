package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.3," gf");
        labels.put(2.1,"g5");
        labels.put(2.8,"g6");
        labels.put(2.2,"g7");
        labels.put(2.4,"g4");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
