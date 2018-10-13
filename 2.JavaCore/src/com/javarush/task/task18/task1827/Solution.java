package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import com.sun.org.apache.bcel.internal.generic.NEW;
import javafx.beans.binding.StringBinding;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collector;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args.length != 0) {

     /*       String pN = "Шорты пляжные синие";
            String pr = "159.00";
            String qu = "12";*/

            String pN = args[1];
            String pr = args[2];
            String qu = args[3];
            StringBuilder data = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fn = reader.readLine();
            //   String fn = "f:\\txt.txt";
            BufferedReader read = new BufferedReader(new FileReader(fn));
            String s = "";
            while ((s = read.readLine()) != null) {
                data.append(s);
            }
            Integer id = getMaxId(fn);
            read.close();

            String idd = id.toString();
            while (idd.length() < 8) {
                idd += " ";
            }
            while (pN.length() < 30) {
                pN += " ";
            }
            while (pr.length() < 8) {
                pr += " ";
            }
            while (qu.length() < 4) {
                qu += " ";
            }
            String data2 = data.toString();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fn, true)));
            writer.write(System.lineSeparator() + idd + pN + pr + qu);
            writer.flush();
            writer.close();
            //    System.out.println(idd + productName + price + quantity);
        }
    }

    private static int getMaxId(String filename) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String line;
            int max_id = 0;
            while ((line = br.readLine()) != null) {
                int id = Integer.parseInt(line.substring(0, 8).trim());
                if (max_id < id) max_id = id;
            }
            br.close();
            return max_id+1;
        } catch (FileNotFoundException e) {
            return 0;
        }
    }
}
