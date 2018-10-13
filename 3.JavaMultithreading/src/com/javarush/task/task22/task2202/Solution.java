package com.javarush.task.task22.task2202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
        if (string == null) {
            throw new TooShortStringException();
        }
        String s = "";
        Pattern p = Pattern.compile("(\\s)");
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()) {
           count += m.groupCount();
        }
        if (count < 4) {
            throw new TooShortStringException();
        }
     //   System.out.println(count);
        try {
            int i = string.indexOf(" ");
            int i2 = string.indexOf(" ",i+1);
            int i3 = string.indexOf(" ",i2+1);
            int i4 = string.indexOf(" ",i3+1);
            if (count > 4) {
                int i5 = string.indexOf(" ", i4 + 1);
                s = string.substring(i + 1, i5);
            } else {
                s = string.substring(i + 1);
            }
        } catch (Exception e) {
            throw new TooShortStringException();
        }
        return s;
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
