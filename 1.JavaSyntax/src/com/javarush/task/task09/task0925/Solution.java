package com.javarush.task.task09.task0925;

/* 
Статики не на своем месте
*/

public class Solution {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
        char k = (char) 11111;
        int l = 1 / k;
        System.out.println(k);

        int q = 12;
        byte w = (byte) q;
        System.out.println(q + "    " + w);
        float f = 1000000000000000.0548f;
        long i = (long)( f * f);
        System.out.println(i);
    }


    public int getA() {
        return A;
    }

}
