package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        // Collections.sort(list);
        //System.out.println(list);
        /*int n = 1;
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            int a = list.get(i);
            int b = list.get(i + 1);
            if (a == b) {
                count++;
                if (i < list.size() - 2) {
                    int c = list.get(i + 2);
                    if (a != c) {
                        n = count;
                        count = 1;
                    }
                }
            }
            n = count > n ? count : n;*/

            int n = 1;
            int count = 1;
            for (int i = 1; i < list.size(); i++) {
                Integer a = list.get(i);
                Integer b = list.get(i - 1);
                if (a.equals(b)) {
                    count++;
                } else {
                    count = 1;
                }

                n = count > n ? count : n;
            }
            System.out.println(n);
        }
    }