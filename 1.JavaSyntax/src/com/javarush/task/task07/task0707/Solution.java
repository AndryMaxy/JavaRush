package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        String k = "fdsf";
        String l = "fdf";
        String m = "adfs";
        String n = "dasda";
        String b = "fsdf";

        list.add(k);
        list.add(l);
        list.add(m);
        list.add(n);
        list.add(b);

        System.out.println(list.size());

        for (String c : list) {
            System.out.println(c);
        }
    }
}
