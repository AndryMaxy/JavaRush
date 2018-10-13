package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        First t1 = new First();
        Second t2 = new Second();
        Third t3 = new Third();
        Fourth t4 = new Fourth();
        Fiveth t5 = new Fiveth();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);
        threads.add(t5);
    }

    public static void main(String[] args) {
/*        try {
            for (Thread t : threads) {
                t.start();
                t.join();
                System.out.println(t.isAlive());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public static class First extends Thread {

        public void run() {
            while (true){}
        }
    }

    public static class Second extends Thread {

        public void run() {
            Thread thread = new Thread();
            try {
                    Thread.sleep(0);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Third extends Thread {

        public void run() {
            Thread thread = new Thread();
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Fourth extends Thread implements Message {

        public void run() {
            while (!(isInterrupted())) {

            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Fiveth extends Thread {

        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String s = "";
            int k = 0;
            try {
                while (!((s = reader.readLine()).equals("N"))){
                    k += Integer.parseInt(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(k);
        }
    }

}