package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<>();
        ArrayList<FileInputStream> sList = new ArrayList<>();

        String resultFileName = args[0];

        for (int i = 1; i < args.length; i++) {
            s.add(args[i]);
        }
        Collections.sort(s);
        for (int i = 0; i < s.size(); i++) {
            sList.add(new FileInputStream(s.get(i)));
        }
        ZipInputStream in = new ZipInputStream(new SequenceInputStream(Collections.enumeration(sList)));

        OutputStream stream = new FileOutputStream(resultFileName,true);
        while (in.getNextEntry() != null) {

            byte[] buffer = new byte[1024];
            int q = 0;
            while ((q = in.read(buffer)) != -1) {
                stream.write(buffer, 0, q);
            }

        }
        stream.close();
        in.close();

    }


}