package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in1 = new FileInputStream(reader1.readLine());
        File file1 = new File("f:\\test1.mp4");
        file1.createNewFile();
        File file2 = new File("f:\\test2.mp4");
        file2.createNewFile();
        FileOutputStream out1 = new FileOutputStream(file1);
        FileOutputStream out2 = new FileOutputStream(file2);

        System.out.println(in1.available());
        if (in1.available() % 2 == 0 && in1.available() > 0) {
            byte[] b = new byte[in1.available()/2];
            byte[] b2 = new byte[in1.available()/2];
            int data = in1.read(b);
            out1.write(b);
            int data2 = in1.read(b2);
            out2.write(b2);
        } else if (in1.available() > 0){
            byte[] b = new byte[in1.available() / 2 + 1];
            byte[] b2 = new byte[in1.available() - b.length];
            int data = in1.read(b);
            out1.write(b);
            int data2 = in1.read(b2);
            out2.write(b2);
        }

/*        if (in1.available() % 2 == 0) {
            while (in1.available() > in1.available() / 2) {
                int data = in1.read();
                out1.write(data);
            }
            while (in1.available() > 0) {
                int data = in1.read();
                out2.write(data);
            }
        }
        if (in1.available() % 2 != 0) {
            while (in1.available() > (in1.available() / 2) + 1) {
                int data = in1.read();
                out1.write(data);
            }
            while (in1.available() > 0) {
                int data = in1.read();
                out2.write(data);
            }
        }*/
        reader1.close();
        in1.close();
        out1.close();
        out2.close();
    }
}
