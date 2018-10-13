package com.javarush.task.task27.task2712;


import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.kitchen.Order;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends Observable {
    final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder() {
        Order order = null;
        try {
            order = new Order(this);
            if (!order.isEmpty()) {
                new AdvertisementManager(order.getTotalCookingTime() * 60).processVideos();
                setChanged();
                notifyObservers(order);
                return order;
            } else return null;
        } catch (RuntimeException e) {
            logger.log(Level.INFO, "No video is available for the order " + order);
            return null;
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Tablet{number=" + number + "}";
    }
}
