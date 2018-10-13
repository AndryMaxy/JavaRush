package com.javarush.task.task31.task3102;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        PriorityQueue<File> s = new PriorityQueue<>();
        Collections.addAll(s,new File(root).listFiles());
        while (!s.isEmpty()){
            if (s.peek().isDirectory()) {
                Collections.addAll(s,s.poll().listFiles());
            } else {
                list.add(s.poll().getCanonicalPath());
            }
        }
        return list;

    }

    public static void save(List<String> list) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("f:\\kek4.txt"));

        for (String l : list) {
            writer.write(l);
            writer.newLine();
        }
        writer.close();
    }

    public static List<String> getFileTree2(String root) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        Path path = Paths.get(root);

        Files.walkFileTree(path,new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                list.add(file.toAbsolutePath().toString());
                return super.visitFile(file, attrs);
            }
        });

        return list;
    }

    public static List<String> getFileTree3(String root) throws IOException {
        List<String> list = new ArrayList<>();

        Path path = Paths.get(root);

        list = Files.walk(Paths.get(root)).filter(Files::isRegularFile).map(Path::toString).collect(Collectors.toList());

        return list;
    }

    public static void main(String[] args) throws Exception {
 //       System.out.println(getFileTree("f:\\Доки"));
        save(getFileTree3("d:\\"));
    }

}
