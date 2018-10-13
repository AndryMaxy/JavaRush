package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        //напишите тут ваш код
        HashMap<String,Integer> map = new HashMap<>();
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("M",Locale.ENGLISH);
/*
        map.put(df.parse("jan"), 1);
        map.put(df.parse("feb"), 2);
        map.put(df.parse("mar"), 3);
        map.put(df.parse("apr"), 4);
        map.put(df.parse("may"), 5);
        map.put(df.parse("jun"), 6);
        map.put(df.parse("jul"), 7);
        map.put(df.parse("aug"), 8);
        map.put(df.parse("sep"), 9);
        map.put(df.parse("oct"), 10);
        map.put(df.parse("nov"), 11);
        map.put(df.parse("dec"), 12);
*/

        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String month = reader.readLine();
/*        System.out.println(month);
        for (Map.Entry<String, Integer> go : map.entrySet()) {
            if (go.getKey().contains(month)){
                String k = go.getValue().toString();
                System.out.println(k);
                System.out.println("Month is " + k);
            }
        }*/
        System.out.println(month + " is  the " + map.get(month)+ " month");
    }
}
