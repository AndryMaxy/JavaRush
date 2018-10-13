package com.javarush.task.task07.task0712;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(i,reader.readLine());
        }

        int shortSt = list.get(0).length();
        int longSt = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < shortSt)
                shortSt = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > longSt)
                longSt = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == shortSt || list.get(i).length() == longSt) {
                System.out.println(list.get(i));
                break;
            }
  /*          if (list.get(i).length() == longSt)
                System.out.println(list.get(i));
            break;*/
        }
    }
}
