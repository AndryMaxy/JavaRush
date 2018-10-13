package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 2;
        this.weight = 3;
        this.color = "color";
    }
    public Cat (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "color";
    }
    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }
    public Cat (int weight, String color, String  address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;

    }

    public static void main(String[] args) {

    }
}
