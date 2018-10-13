package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        Integer w = 0;
        short q = 0;
        Double k = 0.0;

/*        try {
            while ((s = reader.readLine()) != "exit") {
                if (s.contains(".")) {
                    Double k = Double.parseDouble(s);
                    print(k);
                } else if ((q = Short.parseShort(s)) > 0 && q < 128) {
                    print(q);
                } else if ((w = Integer.parseInt(s)) <= 0 || w >= 128) {
                    print(w);
                } else print(s);
            }
        } catch (IOException e) {
            System.out.println("kek");
        }*/

        while (true) {
            s = reader.readLine();
            if (s.equals("exit")) break;
             try {
                if (s.contains(".")) {
                    k = Double.parseDouble(s);
                    print(k);
                } else if ((w = Integer.parseInt(s)) <= 0 || w >= 128) {
                    print(w);
                } else if ((q = Short.parseShort(s)) > 0 && q < 128) {
                    print(q);
                }
            } catch (Exception e) {
                print(s);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}