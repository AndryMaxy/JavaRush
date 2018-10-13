package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Семёнов","Сергей");
        hashMap.put("Петров","Петя");
        hashMap.put("Серов","Сергей");
        hashMap.put("Саймон","Сергей");
        hashMap.put("Павлов","Сергей");
        hashMap.put("Павлов","Валера");
        hashMap.put("Печкин","Сергей");
        hashMap.put("Сумер","Андрей");
        hashMap.put("Дипер","Катя");
        hashMap.put("Кремов","Сергей");

        return hashMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
