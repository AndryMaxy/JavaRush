package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    }
    
/*    static class MyException {
        public static void sc() {
            File file = new File("sdf");
            Scanner scanner = new Scanner(file);
        }
    }

    static class MyException2 extends MyException{
    }

    static class MyException3 {
        public static void n(){
            System.out.println(2/0);
        }
    }

    static class MyException4 extends MyException3{
    }
}*/
static class MyException extends IOException {

}

    static class MyException2 extends FileNotFoundException {
    }

    static class MyException3 extends NullPointerException {
    }

    static class MyException4 extends ArithmeticException{
    }
}
