package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream in = new FileInputStream("f:\\txt.txt");

        Pattern p = Pattern.compile("[A-z]");
        int count = 0;
        byte[] b = new byte[in.available()];
        int q = in.read(b);
        String w = new String(b);
        Integer i = Integer.parseInt(w);
        Matcher m = p.matcher(w);
        while (m.find()) {
            count++;
        }
        System.out.println(count);
        System.out.println(w);
        in.close();
    }
}
