package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in1 = new FileInputStream(reader1.readLine());

        byte[] byt = new byte[in1.available()];
        int q = in1.read(byt);
        in1.close();

        String s = new String(byt);
        StringBuilder sb = new StringBuilder();

        Pattern p = Pattern.compile("((\\d+|-\\d+)\\.\\d*)|(\\d+|-\\d+)");
        Matcher m = p.matcher(s);

        long u = 0;
        double d = 0;
        int g = 0;
        while (m.find()) {
            String a = m.group();
            try {
                g = Integer.parseInt(a);
                sb.append(g + " ");
            } catch (Exception e) {
                d = Double.parseDouble(a);
                u = Math.round(d);
                sb.append(u + " ");
            }
        }
        String ss = new String(sb);
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader2.readLine()));
        writer.write(ss);
        writer.flush();
        writer.close();
    }
}
