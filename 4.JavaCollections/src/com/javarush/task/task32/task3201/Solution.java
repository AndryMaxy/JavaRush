package com.javarush.task.task32.task3201;

import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws Exception {

        String filename = args[0];
        String numb = args[1];
        String txt = args[2];
        int n = Integer.parseInt(numb);

        RandomAccessFile file = new RandomAccessFile(filename, "w");


        if (file.length() < n) {
            file.seek(file.length());
            file.write(txt.getBytes());
        } else {
            file.seek(n);
            file.write(txt.getBytes());
        }
        file.close();
    }
}
