package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();
        int id;
        String name;

/*        while (true) {
            try {
                id = Integer.parseInt(reader.readLine());
                String k = String.valueOf(id);
                if (k.isEmpty()) break;
                name = reader.readLine();
            } catch (IOException e) {
                break;
            }
            hashMap.put(name,id);
        }*/

        while(true) {
            String w = reader.readLine();
            if (!(w.isEmpty())) {
            id = Integer.parseInt(w);
            name = reader.readLine();
            hashMap.put(name, id);
            } else break;
        }
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getValue() + " " + map.getKey());
        }
    }
}
