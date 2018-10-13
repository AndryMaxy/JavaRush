package com.javarush.task.task26.task2610;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue queue;

    public Consumer(BlockingQueue blockingQueue) {
        this.queue = blockingQueue;
    }

    @Override
    public void run() {
        try {
         //   int i = 0;
            while (true) {
               // queue.put(String.valueOf(i++));
                System.out.println(queue.take());
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }

    }
}
