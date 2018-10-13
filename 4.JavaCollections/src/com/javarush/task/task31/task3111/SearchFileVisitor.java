package com.javarush.task.task31.task3111;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length

        String contentIn = new String(content);
        String name = file.getFileName().toString();

        boolean max = true;
        if (maxSize != 0 && content.length > maxSize) {
            max = false;
        }

        boolean min = true;

        if (minSize != 0 && content.length < minSize) {
            min = false;
        }

        boolean pC = true;
        if (partOfContent != null && !contentIn.contains(partOfContent)) {
            pC = false;
        }

        boolean pN = true;
        if (partOfName != null && !name.contains(partOfName)) {
            pN = false;
        }

        if (pC && pN && max && min) {
            foundFiles.add(file);
        }



        return super.visitFile(file, attrs);
    }
}
