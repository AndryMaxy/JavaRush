package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int q = 10;
        int w = 1;

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("8");
            }
            System.out.println();
            w++;
        }
    }
}
