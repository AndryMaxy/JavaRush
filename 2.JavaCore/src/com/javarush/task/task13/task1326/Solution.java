package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        ArrayList<Integer> list = new ArrayList<>();
        String s = "";
        while ((s = in.readLine()) != null) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        for (Integer l : list) {
            if (l % 2 == 0)
                System.out.println(l);
        }
        in.close();
    }
}
