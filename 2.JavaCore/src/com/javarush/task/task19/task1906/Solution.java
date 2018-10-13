package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();
        FileReader r = new FileReader(f1);
        FileWriter w = new FileWriter(f2);

        int count = 0;
        while (r.ready()) {

            int q =r.read();
            count++;
            if (count % 2 == 0) {
                w.write(q);
            }
        }
        r.close();
        w.close();
    }
}
