package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread s1 = new SpecialThread();
        list.add(new Thread(s1));
        SpecialThread s2 = new SpecialThread();
        list.add(new Thread(s2));
        SpecialThread s3 = new SpecialThread();
        list.add(new Thread(s3));
        SpecialThread s4 = new SpecialThread();
        list.add(new Thread(s4));
        SpecialThread s5 = new SpecialThread();
        list.add(new Thread(s5));
        System.out.println(list);
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
