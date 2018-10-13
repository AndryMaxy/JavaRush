package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        String name = "";
        while (true) {
            s = reader.readLine();
            if (!(s.equals("exit"))){
                name = s;
                ReadThread readThread = new ReadThread(name);
                readThread.start();
                readThread.join();
            } else if (s.equals("exit")) break;
        }
        reader.close();
 /*       ReadThread readThread = new ReadThread(name);
        readThread.start();
        readThread.join();*/
      //  System.out.println(resultMap);
    }

    public static class ReadThread extends Thread {
        private String filename;

        public ReadThread(String fileName) {
            this.filename = fileName;
        }

        public void run() {

            try {
                FileInputStream in = new FileInputStream(filename);

                byte[] bytes = new byte[in.available()];
                int q = in.read(bytes);

                int count = 0;
                int max = 0;
                int b = 0;
                for (int i = 0; i < bytes.length; i++) {
                    for (int j = 0; j < bytes.length; j++) {
                        if (bytes[i] == bytes[j]) {
                            count++;
                        }
                    }
                    if (count > max) {
                        max = count;
                        b = bytes[i];
                      //  System.out.println(b);
                      //  System.out.println("count: " + count);
                    }
                    count = 0;
                }
                resultMap.put(filename,b);
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
