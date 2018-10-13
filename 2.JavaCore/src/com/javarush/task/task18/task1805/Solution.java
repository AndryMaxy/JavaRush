package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        ArrayList<Integer> list2 = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        while (in.available() > 0) {
            int l = in.read();
            treeSet.add(l);
        }
        in.close();
/*        Collections.sort(list2);
        for (int i = 1; i < list2.size(); i++) {
            if (list2.get(i-1).equals(list2.get(i))) {
                list2.remove(i);
                i = 1;
            }
        }
        for (int i = 1; i < list2.size(); i++) {
            if (list2.get(i-1).equals(list2.get(i))) {
                list2.remove(i);
                i = 1;
            }
        }
        for (Integer i : list2) {
            System.out.print(i + " ");
        }*/
        for (Integer t : treeSet) {
            System.out.println(t);
        }


    }
}
