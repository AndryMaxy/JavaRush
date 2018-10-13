package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String d = scanner.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);

        Date date = df.parse(d);
        DateFormat df2 = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        String date2 = df2.format(date).toUpperCase();
        System.out.println(date2);

    }
}
