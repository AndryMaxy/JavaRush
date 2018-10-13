package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
/*        for (StackTraceElement a : method1())
            System.out.println(a.getMethodName());*/
       int met = method1().length;
        System.out.println(met);
    }

    public static StackTraceElement[] method1() {
       // method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement1 : stackTraceElement)
            System.out.println(stackTraceElement1.getMethodName());
        return stackTraceElement;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement1 : stackTraceElement)
            System.out.println(stackTraceElement1.getMethodName());
        return stackTraceElement;
    }
}
