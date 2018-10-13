package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("1",1);
        hashMap.put("2",2);
        hashMap.put("3",3);
        hashMap.put("4",4);
        hashMap.put("5",5);
        hashMap.put("6",600);
        hashMap.put("7",700);
        hashMap.put("8",800);
        hashMap.put("9",900);
        hashMap.put("10",1000);

        return hashMap;
    }

    public static void/* HashMap<String, Integer> */removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
/*        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> go = iterator.next();
            if (go.getValue() < 500) {
                iterator.remove();
            }
        }*/
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String,Integer> pair : copy.entrySet()) {
            if (pair.getValue().intValue() < 500) {
                map.remove(pair.getKey());
            }
        }
     //   return map;
    }

    public static void main(String[] args) {
        //System.out.println(removeItemFromMap(createMap()));
        removeItemFromMap(createMap());
    }
}