package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
/*        URL url = new URL(s);
        System.out.println(url.getQuery());*/
        String[] g = s.split("\\?");
        ArrayList<String> list = new ArrayList<>();
        for (String l : g) {
            String[] gg = l.split("&");
            for (String y : gg) {
                String[] ggg = y.split("=");
                for (String yy : ggg)
                    list.add(yy);
            }
        }
        list.remove(0);
        if (list.size() > 3) list.remove(list.size() - 1);
        if (!(list.get(0).equals("obj"))) {
            list.remove(1);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals("obj")) {
                    System.out.print(list.get(j) + " ");
                    j++;
                } else System.out.print(list.get(j) + " ");
            }
            System.out.println();
            if (list.get(i).equals("obj")) {
                try {
                    double d0 = Double.parseDouble(list.get(i + 1));
                    alert(d0);
                    break;
                } catch (NumberFormatException e) {
                    alert(list.get(i + 1));
                    break;
                }
            }
            break;
        }
/*        if (list.get(0).equals("obj")) {
            try {
                double d0 = Double.parseDouble(list.get(1));
                alert(d0);
            } catch (NumberFormatException e) {
                alert(list.get(1));
            }
        }*/

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
