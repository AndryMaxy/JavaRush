package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream in = new FileInputStream(reader.readLine());
        ArrayList<Integer> w = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 256; i++) {
            map.put(i, 0);
        }

        while (in.available() > 0) {

            int b = in.read();
            w.add(b);
           // map.put(b,map.get(b)+1);
        }
/*        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            w.add(m.getValue());
        }*/
        int count = 0;
        int min = 0;
        for (int j = 0; j < w.size(); j++) {
            for (int k = 0; k < w.size(); k++) {
                if (!(w.get(j).equals(w.get(k)))) {
                    min = 1;
                } else {
                    count++;
                    min = min == 0 ? count : min;
                    min = count < min ? count : min;
                }
            }
            count = 0;
        }
/*        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1){
                System.out.print(m.getKey() + " ");
            }
        }*/
        System.out.println(w);
        System.out.println(min);
        in.close();
       // System.out.println(map.entrySet());
    }
}
