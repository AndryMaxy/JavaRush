package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    private String name;
    private int age;
    private String address;
    private int height;

    public static void main(String[] args) {

    }

    public Solution(String name) {
        this.name = name;
    }

    private Solution(int age) {
        this.age = age;
    }
    protected Solution(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Solution(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

}

