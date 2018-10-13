package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("f:\\txt.txt"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {

   /*     byte[] bytes = new byte[is.available()];
        int q = is.read(bytes);

        String s = new String(bytes);*/
        StringWriter sw = null;
        if (is != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            sw = new StringWriter();
            while ((line = reader.readLine()) != null) {
                sw.write(line);
               // System.out.println(line);
            }
            return sw;
        }
        return new StringWriter();
    }
}