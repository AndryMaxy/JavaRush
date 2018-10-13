package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());

    }

    public static ByteArrayOutputStream getPassword() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        int upC = 0;
        int lowC = 0;
        int numb = 0;
        for (int i = 0; i < 8; i++) {
            if (upC == 0) {
                outputStream.write(upC());
                upC++;
            }else if (lowC == 0) {
                outputStream.write(lowC());
                lowC++;
            }else if (numb == 0) {
                outputStream.write(numb());
                numb++;
            } else {
                double d = Math.random() * 3;
                if (d < 1) {
                    outputStream.write(upC());
                }
                if (d > 1 && d < 2) {
                    outputStream.write(lowC());
                }
                if (d > 2 && d < 3) {
                    outputStream.write(numb());
                }
            }
        }
        return outputStream;
    }

    public static byte upC() {
        byte uC = (byte) (65 + (Math.random() * 25));
        return uC;
    }
    public static byte lowC() {
        byte lC = (byte) (97 + (Math.random() * 25));
        return lC;
    }
    public static byte numb() {
        byte n = (byte) (48 + (Math.random() * 9));
        return n;
    }

}