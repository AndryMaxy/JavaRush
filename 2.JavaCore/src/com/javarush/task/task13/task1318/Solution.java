package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String k = reader.readLine();
     //   String l = "";
        InputStream inputStream = new FileInputStream(k);
   //     OutputStream outputStream = new OutputStream(l);
       // int data = 0;
   //     String q = "";
        while (inputStream.available() >0) {

            int data = inputStream.read();
         //   q += Integer.toString(data);
            System.out.write(data);
          //  outputStream.write(data);
        }
        inputStream.close();
     //   outputStream.close();
        reader.close();
      //  System.out.println(q);
    }
}