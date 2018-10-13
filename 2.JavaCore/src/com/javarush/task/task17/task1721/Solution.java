package com.javarush.task.task17.task1721;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String f1 = "";
            String f2 = "";

            f1 = reader.readLine();
            f2 = reader.readLine();

            BufferedReader r1 = null;
            BufferedReader r2 = null;

            r1 = new BufferedReader(new InputStreamReader(new FileInputStream(f1)));
            r2 = new BufferedReader(new InputStreamReader(new FileInputStream(f2)));

            allLines = r1.lines().collect(Collectors.toList());
            forRemoveLines = r2.lines().collect(Collectors.toList());

            reader.close();
            r1.close();
            r2.close();
            new Solution().joinData();
        } catch (Exception e) {}
    }

    public void joinData () throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}





 /*       boolean kek = false;
        for (String ss1 : allLines) {
            for (String ss2 : forRemoveLines) {
                if (!(ss2.equals(ss1))) {
                    kek = true;
                    throw new CorruptedDataException();
                }
                if (ss)
            }
        }
        if (kek) {
            for (String s : allLines) {
                allLines.remove(s);
            }
        }*/