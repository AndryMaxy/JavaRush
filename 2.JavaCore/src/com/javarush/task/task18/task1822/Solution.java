package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        //String s10 = "125";
        //int s = Integer.parseInt(s10);
        int s = Integer.parseInt(args[0]);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader read = new BufferedReader(new FileReader(reader.readLine()));
       // BufferedReader read = new BufferedReader(new FileReader("f:\\txt.txt"));

      //  FileInputStream in = new FileInputStream("f:\\txt.txt");
      //  FileInputStream in = new FileInputStream(reader.readLine());

      //  byte[] b = new byte[in.available()];
      //  int q = in.read(b);
        String s0 = "";

        while ((s0 = read.readLine()) != null) {
            String[] mas = s0.split(" ");
            if (mas[0].equals(String.valueOf(s))) {
                System.out.println(s0);
            }
        }
        read.close();
        reader.close();
/*
        String str = new String(b);
        String[] sss = str.split("\\n");
        //System.out.println(str);
        Pattern p = Pattern.compile(("\\bid " + s + " "));
        for (String stroka : sss) {
            Matcher m = p.matcher(stroka);
            if (m.find()) {
                System.out.println(stroka);
            }
        }
        reader.close();
        in.close();*/

    }
}
