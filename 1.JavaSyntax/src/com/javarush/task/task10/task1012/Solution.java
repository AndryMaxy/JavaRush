package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }
        String[] ar = new String[10];
        for (int i = 0; i < 10; i++) {
            ar[i] = reader.readLine();
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < abcArray.length; i++) {
            hashMap.put(abcArray[i], 0);
        }
        String w = "";
        for (String a : ar) {
            w += a;
        }
        char[] c = w.toCharArray();

        int count = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j])
                    count++;
            }
            if (hashMap.containsKey(c[i])) {
                hashMap.put(c[i], count);
            }
            count = 0;
        }
        for (int i = 0; i < abcArray.length; i++) {
            for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
                if (map.getKey().equals(abcArray[i])) {
                    System.out.println(abcArray[i] + " " + map.getValue());
                }
            }
        }
    }
}