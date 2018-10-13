package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("Семёнов","Сергей");
        hashMap.put("Петров","Петя");
        hashMap.put("Серов","Сергей");
        hashMap.put("Саймон","Сергей");
        hashMap.put("Киркоров","Сергей");
        hashMap.put("Павлов","Валера");
        hashMap.put("Печкин","Сергей");
        hashMap.put("Сумер","Андрей");
        hashMap.put("Дипер","Катя");
        hashMap.put("Кремов","Сергей");

        return hashMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String,String> iter = iterator.next();
            if (iter.getValue().contains(name))
                count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String,String> iter = iterator.next();
            if (iter.getKey().equals(lastName))
                count++;
        }
        return count;
/*        int count = 0;
        for (HashMap.Entry key : map.entrySet()) {
            if (key.getKey().equals(lastName));
            count++;
        }
        return count;*/
    }

    public static void main(String[] args) {
        getCountTheSameFirstName(createMap(),"Сергей");
       getCountTheSameLastName(createMap(),"Петров");
    }
}
