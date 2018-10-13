package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {

        StringBuilder data = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // String param = reader.readLine();
         String fn = reader.readLine();
      //  String fn = "f:\\txt.txt";
        reader.close();
        reader.close();
        BufferedReader read = new BufferedReader(new FileReader(fn));
 /*       String id = "19847";
        String pN = "Моз пляжные красные";
        String pr = "159.00";
        String qu = "12";*/
        String s = "";
        if (args[0].equals("-u")) {
    //    if (param.equals("u")) {
            String id = args[1];
            String pN = args[2];
            String pr = args[3];
            String qu = args[4];
            while ((s = read.readLine()) != null) {
                data.append(s).append(System.lineSeparator());
            }
            String ss = data.toString();
            read.close(); // + ".[A-z] | [А-я]"
            Pattern p = Pattern.compile("\\b"+id+"\\b"); //"\\d | \"\"." +
            Matcher m = p.matcher(ss);

            int ind = 0;
            while (m.find()) {
                //         System.out.println(m.group());
                ind = m.start();
                //    System.out.println(m.start());
            }
            while (id.length() < 8) {
                id += " ";
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
            String newDs0 = ss.substring(ind, ind+50);
            String newUs = ss.replaceAll(newDs0,id + pN + pr + qu);
            BufferedWriter writer = new BufferedWriter(new FileWriter(fn));
            System.out.println(newUs);
            writer.write(newUs);
            writer.flush();
            writer.close();
            read.close();

        } else if (args[0].equals("-d")) {
            String id = args[1];
            int idd = Integer.parseInt(id);
            while ((s = read.readLine()) != null) {
                String ss = s.substring(0,8).replaceAll(" ", "").trim();
                int numb = Integer.parseInt(ss);
                if (idd != numb) {
                    data.append(s).append(System.lineSeparator());
                }
            }
            read.close(); // + ".[A-z] | [А-я]"

            BufferedWriter writer = new BufferedWriter(new FileWriter(fn));
            writer.write(data.toString());
            writer.flush();
            writer.close();
            read.close();
        }
        read.close();
    }

}