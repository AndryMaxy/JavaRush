package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JAN 30 2018"));
    }

    public static boolean isDateOdd(String date) throws ParseException  {
        DateFormat df = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Date date0 = df.parse(date);
        String q = new SimpleDateFormat("D").format(date0);
        int w = Integer.parseInt(q);
        if (w % 2 != 0) {
            return true;
        } else return false;
    }
}
