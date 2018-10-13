package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String,String> hashMap = new HashMap<>();
        List<String> addresses = new ArrayList<String>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) break;

            String family = reader.readLine();
            if (family.isEmpty()) break;

            hashMap.put(town,family);
        }


        String unput = reader.readLine();
        if (hashMap.containsKey(unput))
            System.out.println(hashMap.get(unput));
/*        for (Map.Entry<String,String> map : hashMap.entrySet()) {
            if (map.getKey().equals(unput))
                System.out.println(map.getValue());
        }*/
      //  System.out.println(hashMap);

    }
}
