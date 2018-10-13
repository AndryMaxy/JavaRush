package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("мера"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("мера");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }
        int count = 0;
        for (String s : list2) {
            //  for (int i = 0; i < list2.size(); i++) {
            boolean p = /*list2.get(i)*/s.contains("р");
            boolean l = /*list2.get(i)*/s.contains("л");
            if (l && !p) {
                list.add(0,s);
              //  count += 1;
            }
            if (p && !l) {
                list.remove(s);
              //  count += 2;
            }
/*            if (count == 1)
                list.add(0,s);
            if (count == 2) {
                list.remove(s);
            }*/
            count = 0;
            }
/*        for (int i = 0; i < list.size(); i++) {
            char[] k = list.get(i).toCharArray();
            for (int j = 0; j < k.length; j++) {
                if (k[i] == 'р'){
                    String q = new String(k);
                    list.add(i,q);
                    list.remove(i);
                }
                else {
                    String q = new String(k);
                    list.add(i,q);
                }
            }
        }*/
        return list;
    }
}