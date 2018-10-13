package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses(){
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        Horse horse1 = new Horse("Flash", 3, 0);
        Horse horse2 = new Horse("Speedster", 3, 0);
        Horse horse3 = new Horse("Quick", 3, 0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
        game.run();
        game.printWinner();

    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public Horse getWinner(){
        double max = 0;
        for (Horse h : horses) {
            max = h.getDistance() > max ? h.getDistance() : max;
        }
        for (Horse h : horses) {
            if (h.getDistance() == max) {
                return h;
            }
        }
        return null;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public void print() {
        for (Horse h : horses) {
            h.print();
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void move() {
        for (Horse h : horses) {
            h.move();
        }
    }
}
