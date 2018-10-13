package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String,Cat> hashMap = new HashMap<>();
        hashMap.put("1",new Cat("1"));
        hashMap.put("2",new Cat("2"));
        hashMap.put("3",new Cat("3"));
        hashMap.put("4",new Cat("4"));
        hashMap.put("5",new Cat("5"));
        hashMap.put("6",new Cat("6"));
        hashMap.put("7",new Cat("7"));
        hashMap.put("8",new Cat("8"));
        hashMap.put("9",new Cat("9"));
        hashMap.put("10",new Cat("10"));
        return hashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String,Cat> m : map.entrySet())
            set.add(m.getValue());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
