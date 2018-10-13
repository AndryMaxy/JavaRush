package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("vasa", 10, "str");
        Man man2 = new Man("vasa", 10, "str");
        Woman woman = new Woman("kata", 12, "stt");
        Woman woman2 = new Woman("kata", 12, "stt");
        System.out.println(man.name +" " + man.age +" " + man.address);
        System.out.println(woman.name +" " + woman.age +" " + woman.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        //напишите тут ваш код
    }
}
