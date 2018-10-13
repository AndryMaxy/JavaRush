package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws Exception {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws Exception {
        writeMessage(Dish.allDishesToString());
        List<Dish> list = new ArrayList<>();
        String s = "";
        boolean lel = false;
        while (!(s = readString()).equals("exit")) {
            for (int i = 0; i < Dish.values().length; i++) {
                if (Dish.values()[i].toString().equalsIgnoreCase(s)) {
                    list.add(Dish.values()[i]);
                    lel = true;
                }
            }
            if (!lel) {
                ConsoleHelper.writeMessage("Dish is not");
            }
            lel = false;
        }
        return list;
    }
}
