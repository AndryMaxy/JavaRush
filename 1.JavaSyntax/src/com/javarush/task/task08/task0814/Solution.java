package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> neww = new HashSet<>();
            neww.add(2);
            neww.add(0);
            neww.add(3);
            neww.add(4);
            neww.add(11);
            neww.add(112);
            neww.add(13);
            neww.add(25);
            neww.add(29);
            neww.add(28);
            neww.add(1);
            neww.add(5);
            neww.add(40);
            neww.add(9);
            neww.add(6);
            neww.add(65);
            neww.add(7);
            neww.add(8);
            neww.add(1111);
            neww.add(15);
        return neww;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()) {
            int k = integerIterator.next();
            if (k > 10)
                integerIterator.remove();
        }

        return set;
    }

    public static void main(String[] args) {
        removeAllNumbersMoreThan10(createSet());
    }
}
