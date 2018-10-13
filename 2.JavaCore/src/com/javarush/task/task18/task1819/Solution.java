package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader1.readLine();
        String f2 = reader2.readLine();

        FileInputStream in1 = new FileInputStream(f1);
        FileInputStream in2 = new FileInputStream(f2);

        byte[] b1 = new byte[in1.available()];
        byte[] b2 = new byte[in2.available()];

        int q1 = in1.read(b1);
        int q2 = in2.read(b2);

        FileOutputStream out = new FileOutputStream(f1);

        out.write(b2);
        out.write(b1);

        in1.close();
        in2.close();
        out.close();

    }
}
