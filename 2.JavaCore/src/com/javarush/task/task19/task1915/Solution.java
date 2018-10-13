package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fname = reader.readLine();
        reader.close();
        PrintStream ps = System.out;

        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream pss = new PrintStream(ba);
        System.setOut(pss);

        testString.printSomething();

        String s = ba.toString();
        FileOutputStream out = new FileOutputStream(fname);
        out.write(s.getBytes());
        out.close();
        System.setOut(ps);
        System.out.println(s);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

