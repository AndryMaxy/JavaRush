package com.javarush.task.task22.task2203;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) {
            throw new TooShortStringException();
        }
        Pattern p = Pattern.compile("(\\t)");
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()) {
            count += m.groupCount();
        }
        if (count < 2) {
            throw new TooShortStringException();
        }
        int i1 = string.indexOf("\t");
        int i2 = string.indexOf("\t",i1+1);
        return string.substring(i1+1,i2);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
