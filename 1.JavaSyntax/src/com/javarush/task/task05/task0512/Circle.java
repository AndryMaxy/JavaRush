package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    //напишите тут ваш код
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int weight) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = weight;
    }
    public void initialize(int centerX, int centerY, int radius, int weight, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = weight;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
