package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws Exception {

        String n1 = "F:\\b4.png";
        String n2 = "F:\\b5.png";

      //  String n1 = args[1];
      //  String n2 = args[2];

        switch ("-d") {
            case "-e" : ecoder(n1,n2); break;
            case "-d" : decoder(n1,n2); break;
        }

    }

    private static void ecoder(String name, String name2) throws Exception {
        FileInputStream in = new FileInputStream(name);

        byte[] bytes = new byte[in.available()];
        byte[] newBytes = new byte[bytes.length];
        int q = in.read(bytes);
        in.close();
        int k = 0;
        for (int i = bytes.length - 1; i >= 0; i--) {
            newBytes[k] = (byte)(bytes[i] + 1);
            k++;
        }
        FileOutputStream out = new FileOutputStream(name2);
        out.write(newBytes);
        out.close();
    }

    private static void decoder(String name, String name2) throws Exception {
        FileInputStream in = new FileInputStream(name);

        byte[] bytes = new byte[in.available()];
        byte[] newBytes = new byte[bytes.length];
        int q = in.read(bytes);
        in.close();
        int k = 0;
        for (int i = bytes.length - 1; i >= 0; i--) {
            newBytes[k] =(byte)(bytes[i] - 1);
            k++;
        }
        FileOutputStream out = new FileOutputStream(name2);
        out.write(newBytes);
        out.close();
    }

}
