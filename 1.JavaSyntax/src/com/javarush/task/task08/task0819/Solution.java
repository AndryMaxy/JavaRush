package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        int count = 1;
        for (Cat cat : cats) {
                cats.remove(cat);
                break;
            }
        //напишите тут ваш код. step 3 - пункт 3
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet();
        for (int i = 0; i < 3; i++) {
            Cat cat = new Cat();
            set.add(cat);
        }

        //напишите тут ваш код. step 2 - пункт 2
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
    public static class Cat {

    }
    // step 1 - пункт 1
}
