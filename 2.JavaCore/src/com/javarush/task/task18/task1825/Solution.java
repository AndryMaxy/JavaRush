package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution{
    public static void main(String[] args)  throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //TreeSet<String> names = new TreeSet<>();
        ArrayList<String> names = new ArrayList<>();
        FileInputStream in;
        String s = "";
        String name = "";
        while (true) {
            s = reader.readLine();
            if (!(s.equals("end"))) {
                name = s;
                names.add(name);
            } else if (s.equals("end")) break;
        }
      //  int ind = names.get(0).lastIndexOf("\\")+1;
      //  String newS = names.get(0).substring(ind);
        int ind2 = names.get(0).indexOf(".part");
        String Ss = names.get(0).substring(0,ind2);
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.size(); j++) {
                int indx1 = names.get(i).indexOf("part") + 4;
                String ss1 = names.get(i).substring(indx1);
                int indx2 = names.get(j).indexOf("part") + 4;
                String ss2 = names.get(j).substring(indx2);
                System.out.println(ss2);
                int q1 = Integer.parseInt(ss1);
                int q2 = Integer.parseInt(ss2);
                if (q1 < q2) {
                    Collections.swap(names,i,j);
                }
            }
        }
        FileOutputStream out = new FileOutputStream(Ss);
        for (String ss : names) {
            in = new FileInputStream(ss);
            byte[] bytes = new byte[in.available()];
            int q = in.read(bytes);
            out.write(bytes);
            in.close();
            out.close();
        }

        System.out.println(Ss);
        System.out.println(names);
    }
}
