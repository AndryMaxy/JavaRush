package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private String sex;
        private String address;
        private Human mother;
        private Human father;

        public Human() {

        }
        public Human(String name) {
            this.name = name;

        }
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, int age, String sex, String address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }
        public Human(String name, int age, String sex, String address, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.mother = mother;
        }
        public Human(String name, int age, String sex, String address, Human mother, Human father) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.mother = mother;
            this.father = father;
        }
        public Human(String name, int age, String sex, String address, Human mother, Human father, String names) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.mother = mother;
            this.father = father;
            this.name = names;
        }
        public Human(String name, int age, String sex, String address, Human mother, Human father, String names, int ages) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.mother = mother;
            this.father = father;
            this.name = names;
            this.age = ages;
        }
        public Human(String name, int age, String sex, String address, Human mother, Human father, String names, int ages, String addresss) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.mother = mother;
            this.father = father;
            this.name = names;
            this.age = ages;
            this.address = addresss;
        }
        // напишите тут ваши переменные и конструкторы
    }
}
