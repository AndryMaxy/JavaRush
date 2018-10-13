package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out1 = new FileOutputStream(reader1.readLine());
        //FileInputStream in1 = new FileInputStream(reader1.readLine());
        FileInputStream in2 = new FileInputStream(reader2.readLine());
        FileInputStream in3 = new FileInputStream(reader3.readLine());



        byte[] b1 = new byte[in2.available()];
        byte[] b2 = new byte[in3.available()];

        int q1 = in2.read(b1);
        int q2 = in3.read(b2);

        out1.write(b1);
        out1.write(b2);

        in2.close();
        in3.close();
        out1.close();

    }
}
