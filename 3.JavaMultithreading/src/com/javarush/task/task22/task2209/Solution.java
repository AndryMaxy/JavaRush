package com.javarush.task.task22.task2209;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws Exception {
       // Scanner scanner = new Scanner(System.in);
        String fileName = "F:\\txt.txt";
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready())
        {
            String[] s = reader.readLine().split("\\s");
            Collections.addAll(list, s);
        }
        reader.close();
        String[] words = new String[list.size()];
        words = list.toArray(words);
        StringBuilder result = getLine(words);
        System.out.println(result.toString());
       // scanner.close();

    }

    public static StringBuilder getLine(String... words) {

        StringBuilder sb = new StringBuilder();

        if (words == null || words.length == 0) {
            return sb;
        }

        sb.append(words[0]);
        words[0] = "";

        if (words.length == 1) {
            return sb;
        }

        char strFirstChar = Character.toUpperCase(sb.charAt(0));
        char strLastChar = Character.toUpperCase(sb.charAt(sb.length() - 1));

        while (true) {
            int addedCount = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 0) {
                    if (firstChar(words[i]) == strLastChar) {
                        sb.append(" " + words[i]);
                        words[i] = "";
                        strLastChar = Character.toUpperCase(sb.charAt(sb.length() - 1));
                        addedCount++;
                    } else if (lastChar(words[i]) == strFirstChar) {
                        sb.insert(0, words[i] + " ");
                        words[i] = "";
                        strFirstChar = Character.toUpperCase(sb.charAt(0));
                        addedCount++;
                    }
                }
            }
            if (addedCount == 0) {
                break;
            }
        }

        for (String word : words) {
            if (word.length() > 0) {
                sb.append(" " + word);
            }
        }

        return sb;
    }

    /***************************************
     *
     ***************************************/


    public static char firstChar(String str) {
        return str.substring(0, 1).toUpperCase().charAt(0);
    }

    //-------------------------

    public static char lastChar(String str) {
        return str.substring(str.length() - 1).toUpperCase().charAt(0);
    }
}