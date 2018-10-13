package com.javarush.task.task26.task2603;

import java.util.Arrays;
import java.util.Comparator;

/*
Убежденному убеждать других не трудно
*/
public class Solution {

    public static void main(String[] args) {

    }

    public static class CustomizedComparator<T> implements Comparator<T>{
        private Comparator<T>[] comparators;

        public CustomizedComparator(Comparator<T>... comparators) {
            this.comparators = comparators;
        }

        @Override
        public int compare(T t1, T t2) {
            int result = 0;
            for (Comparator<T> t : comparators) {
                result = t.compare(t1, t2);
                if (result != 0) {
                    break;
                }
            }
            return result;
           // return Arrays.stream(comparators).reduce((tt1,tt2) -> 0,Comparator::thenComparing).compare(t1,t2);
        }
    }
}
