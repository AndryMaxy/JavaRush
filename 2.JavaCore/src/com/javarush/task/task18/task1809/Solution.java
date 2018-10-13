package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream in = new FileInputStream(reader1.readLine());
        FileOutputStream out = new FileOutputStream(reader2.readLine());

        byte[] bytes = new byte[in.available()];

        for (int i = bytes.length -1; i >= 0 ; i--) {
            int data = in.read(bytes);
            System.out.println(bytes[i]);
            out.write(bytes[i]);
        }
        reader1.close();
        reader2.close();
        in.close();
        out.close();
    }
}
