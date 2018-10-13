package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        DrinkMaker d = new TeaMaker();
        d.makeDrink();
        DrinkMaker l = new LatteMaker();
        l.makeDrink();
    }
}
