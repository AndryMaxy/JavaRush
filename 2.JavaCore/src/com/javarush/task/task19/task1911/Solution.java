package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();


    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(b);
        System.setOut(ps);


        testString.printSomething();

        String s = b.toString().toUpperCase();

        System.setOut(printStream);

        System.out.println(s);
    }

    public static class TestString {


        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
