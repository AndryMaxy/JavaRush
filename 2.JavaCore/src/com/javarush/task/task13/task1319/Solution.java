package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String l = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(l));
/*        writer.write(l);
        writer.newLine();
        writer.flush();*/

        while (true) {
            String k = reader.readLine();
            writer.write(k);
            writer.newLine();
            writer.flush();
            if (k.equals("exit")) break;
        }
        reader.close();
        writer.close();
    }
}
