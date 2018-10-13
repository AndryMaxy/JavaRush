package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream in = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < 256; i++) {
            map.put(i, 0);
        }

        while (in.available() > 0) {

            int b = in.read();
            map.put(b, map.get(b) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            max = m.getValue() > max ? m.getValue() : max;
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue().equals(max)) {
                System.out.print(m.getKey() + " ");
                // }
            }
            //System.out.println(max);
        }
        in.close();
    }
}
