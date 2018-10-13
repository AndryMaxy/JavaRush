package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution s = new Solution();
        InnerClass i = s.new InnerClass();
        InnerClass i2 = s.new InnerClass();
        s.innerClasses[0] = i;
        s.innerClasses[1] = i2;
        Solution ss = new Solution();
        InnerClass i3 = ss.new InnerClass();
        InnerClass i4 = ss.new InnerClass();
        s.innerClasses[0] = i3;
        s.innerClasses[1] = i4;
        Solution[] kek = {s,ss};
        return kek;
    }

    public static void main(String[] args) {

    }
}
