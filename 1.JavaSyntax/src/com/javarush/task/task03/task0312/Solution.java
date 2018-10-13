package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(6));
    }

    public static int convertToSeconds(int hour){
        int sec = hour * 3600;
        return sec;
    }
}
