package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.Arrays;

/*
Живем своим умом
*/
public class Solution extends Thread implements Thread.UncaughtExceptionHandler {
    private static  ArrayList<Throwable> throwables = new ArrayList<>();

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();

        throwables.add(e);
        tr(e);
        for (int i = throwables.size()-1; i >= 0 ; i--) {
            System.out.println(throwables.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Thread thread = new Thread(solution);
        thread.start();
        solution.uncaughtException(thread,new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }

    public static Throwable tr(Throwable e){
        if (e.getCause() == null) return e;
        throwables.add(e.getCause());
        return tr(e.getCause());
    }
}
