package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {

        String file = args[0];
     //   String file = "F:\\txt.txt";
        FileReader r = new FileReader(file);
        r.close();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String s = "";

        Pattern p = Pattern.compile("([А-Яа-яA-Za-z\\s\\-]+)\\s([0-9]{1,2}\\s[0-9]{1,2}\\s[0-9]{4})");
        Matcher m;

        SimpleDateFormat sdf = new SimpleDateFormat("d M yyyy", Locale.ENGLISH);

        while (reader.ready()) {
            s = reader.readLine();
            m = p.matcher(s);
            String s1 = s.replaceAll("\\d+","").trim();
         //   System.out.println(s1);
            while (m.find()) {
                Date date = sdf.parse(m.group(2));
                PEOPLE.add(new Person(s1,date));
             //   System.out.println(m.group(1));
            //    System.out.println(m.group(2));
            }
        }
        reader.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(file));
        String sss = reader2.readLine();
        reader2.close();
        for (Person person : PEOPLE) {
            System.out.println(person.getName());
            System.out.println(person.getBirthday());
        }


    }

}
