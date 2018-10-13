package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = null;
        String s = "";
        while (true) {
            s = reader.readLine();
            try {
                in = new FileInputStream(s);
            } catch (FileNotFoundException e) {
                System.out.println(s);
                break;
            } in.close();
        }
        reader.close();
    }
}
