package com.javarush.task.task22.task2211;

import java.io.*;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
      //  String filename = "";
        String filename2 = args[1];

        InputStream in = new FileInputStream(filename);

        byte[] buf = new byte[in.available()];
        int q = in.read(buf);
        in.close();
        String s = new String(buf, "Windows-1251");
        buf = s.getBytes("UTF-8");

        OutputStream out = new FileOutputStream(filename2);
        out.write(buf);
        out.close();
    }
}
