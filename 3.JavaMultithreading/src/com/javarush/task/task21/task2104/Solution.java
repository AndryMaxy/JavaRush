package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

 /*   public boolean equals(Object n) {
        if (n == this) return true;
        if (n == null || this.getClass() != n.getClass()) return false;
        Solution solution = (Solution) n;
        return first != null || first == solution.first && last != null || last == solution.last;
    }

    public int hashCode() {
        final int key = 31;
        int result = 1;
        result = key * result + ((first == null) ? 0 : first.hashCode());
        result = key * result + ((last == null) ? 0 : last.hashCode());
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (o instanceof Solution);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Objects.equals(first, solution.first) &&
                Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
