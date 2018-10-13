package com.javarush.task.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.recursion(132);
    }

    public void recursion(int n) {
        if (n <= 1) return;
        int q = 2;
        while (q <= n) {
            if (n % q == 0) {
                if (q != n) {
                    System.out.print(q + " ");
                    recursion(n / q);
                } else {
                    System.out.println(q);
                }
                return;
            }
            q++;
        }
    }
}
