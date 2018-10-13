package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String numb1 = bufferedReader.readLine();
        String numb2 = bufferedReader.readLine();
        String numb3 = bufferedReader.readLine();

        int n1 = Integer.parseInt(numb1);
        int n2 = Integer.parseInt(numb2);
        int n3 = Integer.parseInt(numb3);

        int [] k = {n1,n2,n3};

        Arrays.sort(k);
        System.out.println(k[1]);

        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }

/*        if (n1 >= n2 && n1 <= n3 || n1 >= n3 && n1 <= n2)
            System.out.println(n1);
        else if (n2 >= n1 && n2 <= n3 || n2 >= n3 && n2 <= n1)
            System.out.println(n2);
        else if (n3 >= n1 && n3 <= n2 || n3 >= n2 && n3 <= n1)
            System.out.println(n3);*/
    }
}
