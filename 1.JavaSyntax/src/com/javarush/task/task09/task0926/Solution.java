package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Collections;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,};
        int[] c = {1,2,3,4};
        int[] d = {1,2,3,4,5,6,7};
        int[] e = {};
        Collections.addAll(list,a);
        Collections.addAll(list,b);
        Collections.addAll(list,c);
        Collections.addAll(list,d);
        Collections.addAll(list,e);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
