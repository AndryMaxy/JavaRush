package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    static {
        properties.put("kik","lel");
        properties.put("ma", "faka");
    }

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream in = new FileInputStream(reader.readLine());
        load(in);

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        Properties p = new Properties();
        if (properties != null) {
            properties.forEach((s1, s2) -> p.setProperty(s1, s2));
            p.store(writer, "kek");
            writer.close();
        }
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        Properties p = new Properties();
        p.load(inputStream);
        p.forEach((s1,s2) -> properties.put(String.valueOf(s1),String.valueOf(s2)));

    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
     //   solution.save(new FileOutputStream("f:\\new.txt"));
        solution.load(new FileInputStream("f:\\new.txt"));
        System.out.println(properties);
    }
}
