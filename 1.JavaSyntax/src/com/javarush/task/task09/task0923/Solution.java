package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] k = str.toCharArray();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> cons = new ArrayList<>();

        for (int i = 0; i < k.length; i++) {
            if (k[i] != ' ' && isVowel(k[i])) {
                    vowel.add(k[i]);
            } else if (k[i] != ' ' && !(isVowel(k[i]))) {
                cons.add(k[i]);
            }
        }
        for (Character f : vowel) {
            System.out.print(f + " ");
        }
        System.out.println("");
        for (Character s : cons) {
            System.out.print(s + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}