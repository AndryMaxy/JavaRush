package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Solution l = null;
            l.getClass().getSimpleName();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] ar = new int[2];
            int k = ar[3];

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            InputStream in = new FileInputStream("ffd");

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String k = "hgh";
            int l =  Integer.parseInt(k);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] ar = new int[-2];
            for (int a : ar) System.out.println(a);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalArgumentException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object x = new Integer(0);
            System.out.println((String)x);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String x = "ff";
            System.out.println(x.charAt(5));

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
          throw new IOException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код

    }
}
