package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(String filename) {
        try {
            fileWriter = new FileWriter(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public FileConsoleWriter(String filename, boolean append) {
        try {
            fileWriter = new FileWriter(filename, append);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FileConsoleWriter(File filename) {
        try {
            fileWriter = new FileWriter(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public FileConsoleWriter(File filename, boolean append) {
        try {
            fileWriter = new FileWriter(filename, append);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public FileConsoleWriter(FileDescriptor fd) {
        try {
            fileWriter = new FileWriter(fd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf,off,len);
        //System.out.println(String.format("%s %s %s",cbuf,off,len));
        for (int i = off; i < off+len; i++) {
            System.out.print(cbuf[i]);
        }
    }
    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }
    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }
    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
       // System.out.println(String.format("%s %s %s",str,off,len));
        System.out.println(str.substring(off, off+len));
       // System.out.println(str);
      //  System.out.println(off);
       // System.out.println(len);
    }
    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(cbuf);
    }
    public void close() throws IOException {
        fileWriter.close();
    }

}
