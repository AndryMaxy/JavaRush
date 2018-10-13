package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
/*
        printMatrix(2, 3, "8");
        printMatrix(1, 2);
        printMatrix(1);
        printMatrix(1, "s",1);
        printMatrix("s", 2,1);
        printMatrix("s", 77L,1);
        printMatrix("s",1, 76L);
        printMatrix("ss", 4,5);
        printMatrix("s", 2,1,2);
        printMatrix("s", 2,1,3,3);
        printMatrix("s", 2,1,3,3,3);
       // printMatrix("s", 2,1,3,3,3,4);
      //  printMatrix("s", 2,1,3,3,3,4,7);
*/

        printMatrix(new Solution());
        printMatrix("s");
        printMatrix((byte)1);
        printMatrix((short)298);
        printMatrix((int)35000);
        printMatrix((double)3.6d);
        printMatrix((float)3.5f);
        printMatrix((long)6L);
        printMatrix((char)'.');
        printMatrix(4>7);
    }

/*    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }*/
    public static void printMatrix(String s){
        System.out.println(s);
    }

    public static void printMatrix(Object s){
        System.out.println(s);
    }

    public static void printMatrix(char s){
        System.out.println(s);
    }

    public static void printMatrix(byte s){
        System.out.println(s);
    }

    public static void printMatrix(double s){
        System.out.println(s);
    }

    public static void printMatrix(float s){
        System.out.println(s);
    }

    public static void printMatrix(short s){
        System.out.println(s);
    }

    public static void printMatrix(int s){
        System.out.println(s);
    }

    public static void printMatrix(long s){
        System.out.println(s);
    }

    public static void printMatrix(boolean s){
        System.out.println(s);
    }

  /*  public static void printMatrix(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, Object value, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Object value, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Object value, long l, int n) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(long l, Integer m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Object value, int m, long n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Object value, int m, int n, int w) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
                System.out.print(w);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Object value, int m, Integer n, int w, int q) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
                System.out.print(w);
                System.out.print(q);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Object value, int m, int n, Integer w, int q, int t) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
                System.out.print(w);
                System.out.print(q);
                System.out.print(t);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Object value, int m, int n, short w, int q, int t, Integer u) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
                System.out.print(w);
                System.out.print(q);
                System.out.print(t);
                System.out.print(u);
            }
            System.out.println();
        }
    }
    public static void printMatrix(String value, String m, char n, float w, int q, double t, int u,int h) {
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
                System.out.print(w);
                System.out.print(q);
                System.out.print(t);
                System.out.print(u);
                System.out.print(h);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Object value, int m, int n, char w, byte q, boolean t, int u,Integer h) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
                System.out.print(w);
                System.out.print(q);
                System.out.print(t);
                System.out.print(u);
                System.out.print(h);
            }
            System.out.println();
        }
    }*/
}
