package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws Exception {
        String filename = args[0];
        String numb = args[1];
        String txt = args[2];
        int n = Integer.parseInt(numb);
        int len = txt.length();

        RandomAccessFile randomAccessFile = new RandomAccessFile(filename, "rw");

        randomAccessFile.seek(n);
        byte[] bytes = new byte[len];
        randomAccessFile.read(bytes,0,len);
        String text = new String(bytes);
        if (txt.equals(text)) {
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write("true".getBytes());
        } else {
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write("false".getBytes());
        }
        randomAccessFile.close();
    }
}
