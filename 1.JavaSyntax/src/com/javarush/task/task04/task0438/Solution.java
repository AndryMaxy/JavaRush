package com.javarush.task.task04.task0438;

/* 
Рисуем линии
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int w = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("8");
            }
            System.out.println("8");
            w = 0;
        }
    }
}
