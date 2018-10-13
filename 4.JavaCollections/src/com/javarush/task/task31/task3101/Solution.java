package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws Exception {

        File path = new File(args[0]);
        String absolutePath = args[1];

        File f2 = new File(args[1]);
        File f3 = new File(f2.getParent()+"/allFilesContent.txt");
        FileUtils.renameFile(f2,f3);

        ArrayList<File> l = new ArrayList<>();
        List<File> files = scanD(path,l);

        Collections.sort(files, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                String s1 = o1.getName();
                String s2 = o2.getName();
                return s1.compareTo(s2);
            }
        });
          System.out.println(files);

        BufferedReader in;
        BufferedWriter writer = new BufferedWriter(new FileWriter(f3));
        for (File s : files) {

            in = new BufferedReader(new FileReader(s));

            while (in.ready()) {
                String ss = in.readLine();
                writer.write(ss);
                writer.flush();
                writer.newLine();
            }
            in.close();
        }
        writer.close();
    }

    private static ArrayList<File> scanD(File path, ArrayList<File> list) {

        for (File file : path.listFiles()) {

            if (file.isDirectory()) {

                if (file.listFiles().length != 0) {
                    scanD(file,list);
                }

            } else {
                if (file.length() <= 50) {
                    list.add(file);
                }
            }
        }
        return list;
    }

}
