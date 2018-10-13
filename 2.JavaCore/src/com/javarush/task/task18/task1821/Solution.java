package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/


import java.io.FileInputStream;
import java.util.Arrays;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream in = new FileInputStream(args[0]);

        byte[] bytes = new byte[in.available()];
        TreeSet<Byte> m = new TreeSet<>();

        int q = in.read(bytes);

        Arrays.sort(bytes);
        for (int i = 0; i < bytes.length; i++) {
            m.add(bytes[i]);
        }
        int count = 0;
        for (byte b : m) {
            for (int j = 0; j < bytes.length; j++) {
                if (b == bytes[j]) {
                    count++;
                }
            }
            char c = (char) b;
            System.out.println(c + " " + count);
            count = 0;
        }

        in.close();
    }
}
