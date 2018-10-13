package com.javarush.task.task33.task3308;

import java.util.Arrays;
import java.util.List;

public class Shop {
    public Goods goods;
    public int count = 12;
    public double profit = 123.4;
    public String[] secretData = {"String1", "String2", "String3", "String4", "String5"};

    public static class Goods {
        private List<String> names = Arrays.asList("S1","S2");
    }

}
