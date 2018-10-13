package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Семёнов", "Андрей");
        hashMap.put("Петров", "Петя");
        hashMap.put("Серов", "Андрей");
        hashMap.put("Саймон", "Сергей");
        hashMap.put("Киркоров", "Андрей");
        hashMap.put("Павлов", "Валера");
        hashMap.put("Печкин", "Сергей");
        hashMap.put("Сумер", "Андрей");
        hashMap.put("Дипер", "Катя");
        hashMap.put("Кремов", "Валера");
        String l = "kek";
        return hashMap;
    }

    public static void /*Map<String, String>*/ removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        ArrayList<String> SUC = new ArrayList<>();
        for (Map.Entry<String, String> o : copy.entrySet()) {
            SUC.add(o.getValue());
        }
     //   System.out.println(SUC);
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String s = "";
        for (int i = 0; i < SUC.size()-1; i++) {
            for (int j = i; j < SUC.size()-1; j++) {
                if (SUC.get(i).equals(SUC.get(j+1))){
                    s = SUC.get(i);
                   // removeItemFromMapByValue(map,s);
                }
            }
            removeItemFromMapByValue(map,s);
        }
       // System.out.println(s);
       // return map;
    }

        public static void removeItemFromMapByValue (Map < String, String > map, String value){
            HashMap<String, String> copy = new HashMap<String, String>(map);
            for (Map.Entry<String, String> pair : copy.entrySet()) {
                if (pair.getValue().equals(value))
                    map.remove(pair.getKey());
            }

        }

        public static void main (String[]args){
            removeTheFirstNameDuplicates(createMap());
        }
    }
