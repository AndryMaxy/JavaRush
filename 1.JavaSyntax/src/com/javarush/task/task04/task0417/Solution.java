package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String ff = bufferedReader.readLine();
        String ss = bufferedReader.readLine();
        String tt = bufferedReader.readLine();

        int f = Integer.parseInt(ff);
        int s = Integer.parseInt(ss);
        int t = Integer.parseInt(tt);

        if (f == s && s == t && t == f)
            System.out.print(f + " " + s + " " + t);
        else {
            if (f == s)
                System.out.print(f + " " + s);
            if (s == t)
                System.out.print(s + " " + t);
            if (t == f)
                System.out.print(t + " " + f);
        }
    }
}