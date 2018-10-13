package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream p = System.out;

        ByteArrayOutputStream b = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(b);
        System.setOut(ps);

        testString.printSomething();

        String s = b.toString();
        System.setOut(p);
        Pattern top = Pattern.compile("(\\d+) ([-+*]) (\\d+)");
        Matcher topM = top.matcher(s);
        int result = 0;
        while (topM.find()) {
            int z = Integer.parseInt(topM.group(1));
            String x = topM.group(2);
            int c = Integer.parseInt(topM.group(3));
            switch (x) {
                case "+":
                    result = z + c;
                    break;
                case "-":
                    result = z - c;
                    break;
                case "*":
                    result = z * c;
                    break;
            }
        }
        System.out.print(s + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("333 * 6 = ");
        }
    }
}

