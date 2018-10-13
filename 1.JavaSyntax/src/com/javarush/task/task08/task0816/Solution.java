package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1983"));
        map.put("Stall", df.parse("JUNE 1 1982"));
        map.put("S", df.parse("JUNE 1 1981"));
        map.put("Stallon", df.parse("JUNE 1 1980"));
        map.put("St", df.parse("MAY 1 1980"));
        map.put("Sta", df.parse("JULY 1 1980"));
        map.put("Stal", df.parse("JUNE 1 1975"));
        map.put("Stally", df.parse("FEBRUARY 1 1998"));
        map.put("Stallo", df.parse("AUGUST 1 1980"));
        map.put("Stalle", df.parse("JUNE 1 1987"));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> iter = iterator.next();
            if (iter.getValue().getMonth() > 4 && iter.getValue().getMonth() < 8) {
                iterator.remove();
            }


/*
            for (HashMap.Entry<String, Date> date : map.entrySet()) {
                if (map.c("JUNE") || date.getValue().equals("JULY") || date.getValue().equals("AUGUST")) {
                    map.remove(date);
                }
            }*/

        }
    }

    public static void main(String[] args) {
     //   System.out.println(removeAllSummerPeople(createMap()));
    }
}
