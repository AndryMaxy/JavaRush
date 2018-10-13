package com.javarush.task.task22.task2212;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) {
            return false;
        }
        Pattern p = Pattern.compile("([\\+]\\d{1,2})?(?=(\\D*\\d){10})([\\(]\\d{3}[\\)])?(\\d+-){0,2}\\d+");
        Pattern pattern2 = Pattern.compile("(?=(\\D*\\d){10})\\d*(\\(\\d{3}\\))?((\\d+-\\d+){0,2})?\\d*" );
        Matcher m = p.matcher(telNumber);
        Matcher m2 = pattern2.matcher(telNumber);

        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(checkTelNumber("+380501-2-35464564567"));
        System.out.println(checkTelNumber("38050-1254654634-5"));
        System.out.println(checkTelNumber("0501236677688787"));

    }
}
