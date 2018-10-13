package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        Locale l = new Locale("en");
        Locale.setDefault(l);
        FileInputStream in = new FileInputStream(args[0]);
        DecimalFormat df = new DecimalFormat("#.##");
        byte[] ar = new byte[in.available()];

        int q = in.read(ar);
        int count = 0;
        String s = new String(ar);
        in.close();
        Pattern p = Pattern.compile("[ ]");
        Matcher m = p.matcher(s);

        while (m.find()) {
            count++;
        }

        //System.out.println(count);
        //System.out.println(s);
        //System.out.println(s.length());
        double d = (double) count / s.length() * 100;
        System.out.println(df.format(d));

    }
}
