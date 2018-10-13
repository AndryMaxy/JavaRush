package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = bufferedReader.readLine();
        String numb4 = bufferedReader.readLine();
        String numb3 = bufferedReader.readLine();
        String numb2 = bufferedReader.readLine();

        int n1 = Integer.parseInt(numb2);
        int n2 = Integer.parseInt(numb3);
        int n3 = Integer.parseInt(numb4);

        System.out.println("Меня зовут " + numb1 + ".");
        System.out.println("Я родился " + n1 + "." + n2 + "." + n3);
    }
}
