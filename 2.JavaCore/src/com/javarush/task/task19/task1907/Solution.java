package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        Scanner scanner = new Scanner(new File(f1));
        reader.close();
        FileReader r = new FileReader(f1);
        String s = "";
        int n = 0;
        while (scanner.hasNext()) {
            s = scanner.next();
                    if (s.equals("world") || (s.equals("world,") || s.equals("world."))) {
                        n++;
            }
        }
        /*while (r.ready()) {

            char c;
            int q = r.read();
            s += (char)q;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'w' && s.charAt(i+1) == 'o' && s.charAt(i+2) == 'r' && s.charAt(i+3) == 'l' &&s.charAt(i+4) == 'd') {
                n++;
            }
        }*/
        r.close();
        scanner.close();
        System.out.println(n);
    }
}
