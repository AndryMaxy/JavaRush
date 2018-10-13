package com.javarush.task.task31.task3112;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url = new URL(urlString);

        InputStream stream = url.openStream();
        Path path = Files.createTempFile("tmp-", ".tmp");
        Files.copy(stream,path);
        String[] split = urlString.split("/");
        Path file = Paths.get(downloadDirectory + "/" + split[split.length-1]);
        Files.move(path, file);
        return file.toAbsolutePath();
    }
}
