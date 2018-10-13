package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {

        try {
            reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (s.equals("helicopter")) {
            result = new Helicopter();
        } else if (s.equals("plane")) {
            int c = Integer.parseInt(reader.readLine());
            result = new Plane(c);
        }
        reader.close();
        //add your code here - добавьте код тут
    }
}
