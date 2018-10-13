package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws Exception {
        this.tablet = tablet;
        dishes = ConsoleHelper.getAllDishesForOrder();
        ConsoleHelper.writeMessage(toString());
    }

    @Override
    public String toString() {
        if (dishes.size() != 0) {
            return String.format("Your order: %s of %s",dishes,tablet.toString());
        } else return "";
    }

    public int getTotalCookingTime() {
        int duration = 0;
        for (Dish d : dishes) {
            duration += d.getDuration();
        }
        return duration;
    }

    public boolean isEmpty(){
        return dishes.isEmpty();
    }
}
