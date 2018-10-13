package com.javarush.task.task06.task0606;
import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String m = reader.readLine();
        int n = Integer.parseInt(m);

        int count = count(n);

        for (int i = 0; i < count; i++) {
            if (n % 2 == 0)
                even++;
            else odd++;
            n = n /10;

        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }

        public static int count(int number) {
            int count = (number == 0) ? 1 : 0;
            while (number != 0) {
                count++;
                number /= 10;
            }
            return count;
        }
 /*       char[] k = m.toCharArray();

        for (int i = 0; i < k.length; i++) {
            if (k[i] % 2 == 0)
                even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);*/

}
