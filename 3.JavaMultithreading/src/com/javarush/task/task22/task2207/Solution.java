package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String file = r.readLine();

        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        r.close();
        scanner.close();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                String sb = new StringBuilder(list.get(j)).reverse().toString();
                if (list.get(i).equals(sb) && !list2.contains(list.get(i))) {
                    list2.add(list.get(i));
                    Pair pair = new Pair();
                    pair.first = list.get(i);
                    pair.second = list.get(j);
                    result.add(pair);
                }
            }
        }
        for (Pair p : result) {
            System.out.println(p);
        }
    }


    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}

