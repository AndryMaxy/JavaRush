package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/* 
Что внутри папки?
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Path> list = new ArrayList<>();
        String path = reader.readLine();
        reader.close();
        Path path1 = Paths.get(path);
        if (!(Files.isDirectory(path1))){
            System.out.println(path + " - не папка");
            return;
        } else {
            long w = 0;
            long q = Files.walk(path1).filter(Files::isDirectory).count()-1;
            list = Files.walk(path1).filter(Files::isRegularFile).collect(Collectors.toList());
            for (Path p : list) {
                w += Files.size(p);
            }
            System.out.println("Всего папок - " + q);
            System.out.println("Всего файлов - " + Files.walk(path1).filter(Files::isRegularFile).count());
            System.out.println("Общий размер - " +  w);
        }

    }
}
