package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, Exception {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            FileInputStream in = new FileInputStream(reader.readLine());

            if (in.available() < 1000) {
                reader.close();
                in.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
